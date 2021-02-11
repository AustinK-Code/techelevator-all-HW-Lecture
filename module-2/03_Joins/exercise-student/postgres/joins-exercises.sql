-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
SELECT film.title
FROM film
INNER JOIN film_actor ON film.film_id = film_actor.film_id
INNER JOIN actor ON actor.actor_id = film_actor.actor_id
WHERE actor.first_name ILIKE 'Nick'
AND actor.last_name ILIKE 'Stallone';
-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
SELECT film.title
FROM film
INNER JOIN film_actor ON film.film_id = film_actor.film_id
INNER JOIN actor ON actor.actor_id = film_actor.actor_id
WHERE actor.first_name ILIKE 'RITA'
AND actor.last_name ILIKE 'REYNOLDS';
-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
SELECT film.title
FROM film
INNER JOIN film_actor ON film.film_id = film_actor.film_id
INNER JOIN actor ON actor.actor_id = film_actor.actor_id
WHERE actor.first_name ILIKE 'JUDY' OR actor.first_name ILIKE 'RIVER'
AND actor.last_name ILIKE 'DEAN';
-- 4. All of the the ‘Documentary’ films
-- (68 rows)
SELECT film.title
FROM film
INNER JOIN film_category ON film.film_id = film_category.film_id
INNER JOIN category ON film_category.category_id = category.category_id
WHERE category.name ILIKE 'DOCUMENTARY';
-- 5. All of the ‘Comedy’ films
-- (58 rows)
SELECT film.title
FROM film
INNER JOIN film_category ON film.film_id = film_category.film_id
INNER JOIN category ON film_category.category_id = category.category_id
WHERE category.name ILIKE 'comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
SELECT film.title
FROM film
INNER JOIN film_category ON film.film_id = film_category.film_id
INNER JOIN category ON film_category.category_id = category.category_id
WHERE category.name ILIKE 'children' AND film.rating ILIKE 'G';
-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
SELECT film.title
FROM film
INNER JOIN film_category ON film.film_id = film_category.film_id
INNER JOIN category ON film_category.category_id = category.category_id
WHERE category.name ILIKE 'family' AND film.length < 120 AND film.rating ILIKE 'G';
-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
SELECT film.title
FROM film
INNER JOIN film_actor ON film.film_id = film_actor.film_id
INNER JOIN actor ON actor.actor_id = film_actor.actor_id
WHERE actor.first_name ILIKE 'matthew'
AND actor.last_name ILIKE 'leigh'
AND film.rating ILIKE 'G';

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
SELECT film.title
FROM film
INNER JOIN film_category ON film.film_id = film_category.film_id
INNER JOIN category ON film_category.category_id = category.category_id
WHERE category.name ILIKE 'sci-fi'
AND film.release_year = 2006;

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
SELECT film.title
FROM film
INNER JOIN film_actor ON film.film_id = film_actor.film_id
INNER JOIN actor ON actor.actor_id = film_actor.actor_id
INNER JOIN film_category ON film.film_id = film_category.film_id
INNER JOIN category ON film_category.category_id = category.category_id
WHERE actor.first_name ILIKE 'nick'
AND actor.last_name ILIKE 'stallone'
AND category.name ILIKE 'action';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
SELECT address, city, district, country
FROM store
INNER JOIN address ON store.address_id = address.address_id
INNER JOIN city ON city.city_id = address.city_id
INNER JOIN country ON city.country_id = country.country_id;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
SELECT store.store_id, address, first_name || ' ' || last_name AS manager_name
FROM store
INNER JOIN address ON store.address_id = address.address_id
INNER JOIN staff ON store.store_id = store.store_id
WHERE manager_staff_id = staff_id;

-- 13. The first and last name of the top ten customers ranked by number of rentals
-- (#1 should be “ELEANOR HUNT�? with 46 rentals, #10 should have 39 rentals)
SELECT (customer.first_name|| ' ' ||customer.last_name) AS name, COUNT(rental_id) AS rentals
FROM customer
INNER JOIN rental ON customer.customer_id = rental.customer_id
GROUP BY name
ORDER BY rentals DESC
LIMIT 10;
-- 14. The first and last name of the top ten customers ranked by dollars spent
-- (#1 should be “KARL SEAL�? with 221.55 spent, #10 should be “ANA BRADLEY�? with 174.66 spent)
SELECT customer.first_name, customer.last_name, SUM(payment.amount) AS total_payment
FROM customer
JOIN payment ON payment.customer_id = customer.customer_id
GROUP BY customer.first_name, customer.last_name
ORDER BY total_payment desc
LIMIT 10;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that while a customer has only one primary store, they may rent from either store.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)
SELECT store.store_id, address.address,COUNT(payment.payment_id),SUM(payment.amount), AVG(payment.amount)
FROM store
JOIN address ON address.address_id = store.address_id
JOIN inventory ON inventory.store_id = store.store_id
JOIN rental ON rental.inventory_id = inventory.inventory_id
JOIN payment ON payment.rental_id = rental.rental_id
GROUP BY store.store_id, address.address;

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD�? with 34 rentals and #10 should have 31 rentals)
SELECT film.title, COUNT(rental.*) AS top_rentals
FROM film
JOIN inventory ON inventory.film_id = film.film_id
JOIN rental ON rental.inventory_id = inventory.inventory_id
GROUP BY film.title
ORDER BY top_rentals desc
LIMIT 10;

-- 17. The top five film categories by number of rentals
-- (#1 should be “Sports�? with 1179 rentals and #5 should be “Family�? with 1096 rentals)
SELECT category.name, COUNT(rental.*) AS top_rental_category
FROM film
JOIN inventory ON inventory.film_id = film.film_id
JOIN rental ON rental.inventory_id = inventory.inventory_id
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON category.category_id = film_category.category_id
GROUP BY category.name
ORDER BY top_rental_category desc
LIMIT 5;
-- 18. The top five Action film titles by number of rentals
-- (#1 should have 30 rentals and #5 should have 28 rentals)
SELECT film.title, COUNT(rental.*) AS topRental
FROM film
JOIN inventory ON inventory.film_id = film.film_id
JOIN rental ON rental.inventory_id = inventory.inventory_id
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON category.category_id = film_category.category_id
WHERE category.name = 'Action'
GROUP BY film.title
ORDER BY topRental desc
LIMIT 5;
-- 19. The top 10 actors ranked by number of rentals of films starring that actor
-- (#1 should be “GINA DEGENERES�? with 753 rentals and #10 should be “SEAN GUINESS�? with 599 rentals)
SELECT actor.first_name, actor.last_name, COUNT(rental.*) AS top_rental
FROM actor
JOIN film_actor ON film_actor.actor_id = actor.actor_id
JOIN film ON film.film_id = film_actor.film_id
JOIN inventory ON inventory.film_id = film.film_id
JOIN rental ON rental.inventory_id = inventory.inventory_id
GROUP BY actor.actor_id, actor.first_name, actor.last_name
ORDER BY top_rental desc
LIMIT 10;

-- 20. The top 5 “Comedy�? actors ranked by number of rentals of films in the “Comedy�? category starring that actor
-- (#1 should have 87 rentals and #5 should have 72 rentals)
SELECT actor.first_name, actor.last_name, COUNT(rental.*) AS top_rental
FROM actor
JOIN film_actor ON film_actor.actor_id = actor.actor_id
JOIN film ON film.film_id = film_actor.film_id
JOIN inventory ON inventory.film_id = film.film_id
JOIN rental ON rental.inventory_id = inventory.inventory_id
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON category.category_id = film_category.category_id
WHERE category.name = 'Comedy'
GROUP BY actor.actor_id, actor.first_name, actor.last_name
ORDER BY top_rental desc
LIMIT 5;