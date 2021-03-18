function checkTheCheckBoxAndEnterText(){
    const cb = document.querySelector('div input')
    cb.checked = true
    cb.checked=truecb.nextElementSibling.value = event.target.innerText
}


const pushMeButton = document.getElementById('button-one')
pushMeButton.addEventListener('click',checkTheCheckBoxAndEnterText)