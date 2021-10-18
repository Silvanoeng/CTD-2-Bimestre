let body = document.querySelector('body');
let h1 = document.querySelector('h1');
let li = document.querySelectorAll('li');

function trocarCor() {
    body.classList.toggle('noite');
    h1.classList.toggle('noite');
    for (i = 0; i < li.length; i++) {
        li[i].classList.toggle('noite');
    }
}



