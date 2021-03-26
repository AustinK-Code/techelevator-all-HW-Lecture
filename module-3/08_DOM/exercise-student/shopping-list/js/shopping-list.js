// add pageTitle
//
const pageTitle = 'My Shopping List'
// add groceries
const groceries =['milk',
'sugar',
'ribs',
'ketchup',
'avacado',
'cookies',
'burgers',
'buns',
'potato',
'baked beans'
]

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  document.querySelector('#title').innerText = pageTitle
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
/*function displayGroceries() {    *****this didnt pass the test so I had to redo it
  const ul = document.querySelector('ul')
  groceries.forEach((item) => {
    const li = document.createElement('li')
    li.innerText = item.name
    ul.appendChild(li)
  })}*/
  function displayGroceries() {
    const groceryList = document.getElementById('groceries');
    groceries.forEach(grocery => {
      const listItem = document.createElement('li');
      listItem.innerText = grocery;
      groceryList.appendChild(listItem);
    });
  }

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
 function markCompleted() {
  const groceryList = document.getElementById('groceries');
  groceryListItems = groceryList.getElementsByTagName('li');
  for (let i = 0; i < groceryListItems.length; i++) {
    item = groceryListItems[i];
    item.classList.add('completed');
  }
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
