//criando as tags por JS
let form = document.createElement('form');
let inputName = document.createElement('input');
let inputPassword = document.createElement('input');
let inputEmail = document.createElement('input');

inputName.setAttribute('type','text');
inputPassword.setAttribute('type','password');
inputEmail.setAttribute('type','email');

//Atribuir as tags
document.body.appendChild(form);
form.appendChild(inputName);
form.appendChild(inputPassword);
form.appendChild(inputEmail);

//disable
inputName.addEventListener('keyup', function(){
    inputName.setAttribute('disabled','disabled')
});

form.addEventListener('keyup', function(){
    inputName.disabled = false;
});

inputPassword.addEventListener('keyup', function(){
    inputName.setAttribute('disabled','disabled')
});



// Construa um formulário, usando javascript, com no mínimo três campos de input e 
// esses campos de input terão comportamentos a decorrer de algumas condições. 
// Construa esses inputs de uma forma que quando forem preenchidos com algum conteúdo, 
// os campos receberão a propriedade “disabled”, mas quando o mouse estiver acima desse 
// campo ele vai perder essa propriedade possibilitando a modificação do conteúdo pelo usuário. 
// Quando o mouse sair do input e o mesmo tiver preenchido, ele receberá a propriedade disabled novamente.
