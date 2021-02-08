-- SELECT ... FROM
-- Selecting the names for all countries


SELECT name
FROM country;


-- Selecting the name and population of all countries


SELECT name, population --db visualizer is not perfect and is generic for all databases, so some things are highlighted when they are not
FROM country;

-- Selecting all columns from the city table


SELECT *
FROM city;

-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio


SELECT name, district
FROM city 
WHERE district = 'Ohio';

SELECT name, district
FROM city
WHERE district ILIKE 'OHIO';--Case insensitive compare

--all cities in a sitrict that start with an O
SELECT name, district
FROM city
WHERE district ILIKE 'OHIO';-- Case sensitive starts with capitol 0

SELECT name, district
FROM city
WHERE district Like '%x%';--case sensitive contains the letter x



-- Selecting countries that gained independence in the year 1776


SELECT name, indepyear
FROM country
WHERE indepyear = 1776 OR indepyear = 1901;

SELECT name, indepyear
FROM country
WHERE indepyear IN(1776, 1901)

-- Selecting countries that gained independence between the year 1776 and 1901

SELECT name, indepyear
FROM country
WHERE indepyear BETWEEN 1776 AND 1901;


-- Selecting countries not in Asia
SELECT name , continent
FROM country
WHERE continent != 'Asia';



-- Selecting countries that do not have an independence year
SELECT name, indepyear
FROM country
WHERE indepyear IS NULL;

-- Selecting countries that do have an independence year
SELECT name, indepyear
FROM country
WHERE indepyear IS ! NULL;


-- Selecting countries that have a population greater than 5 million
SELECT name, population
FROM country
WHERE population > '5000000';


-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000
SELECT name, district, population
FROM city
WHERE district = 'Ohio'
   AND population > 400000;

-- Selecting country names on the continent North America or South America
SELECT name, continent, country
FROM country
WHERE continent LIKE '%America';



SELECT name, continent
FROM country
WHERE continent = 'North America'
   OR continent = 'South America';



-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword

SELECT name, population , lifeexpectancy , surfacearea, population/surfacearea AS Pop_Per_Area--USE AS TO RENAME COLUMS
FROM country;

-- HOW MANY DIFFERENT DISTRICS ARE IN MY STUFF
SELECT DISTINCT district 
FROM city;

-- The name and population of all cities in the USA with a population of greater than 1 million people
SELECT name, population
FROM city
WHERE population > 1000000;

-- The name and population of all cities in China with a population of greater than 1 million people
SELECT name, countrycode, population
FROM city
WHERE countrycode = 'CHN' AND population > 1000000;

-- The name and region of all countries in North or South America
SELECT name, region 
FROM country 
WHERE region = 'North America'
   OR region = 'South America';
  
-- The name, continent, and head of state of all countries whose form of government is a monarchy
SELECT name, continent, headofstate
FROM country 
WHERE governmentform = 'Monarchy';

-- The name, country code, and population of all cities with a population less than one thousand people


-- The name and region of all countries in North or South America except for countries in the Caribbean

-- The name, population, and GNP of all countries with a GNP greater than $1 trillion dollars and a population of less than 1 billion people

-- The name and population of all cities in Texas that have a population of greater than 1 million people

-- The name and average life expectancy of all countries in southern regions

-- The name and average life expectancy of all countries in southern regions for which an average life expectancy has been provided (i.e. not equal to null)

-- The name, continent, GNP, and average life expectancy of all countries in Africa or Asia that have an average life expectancy of at least 70 years and a GNP between $1 million and $100 million dollars

