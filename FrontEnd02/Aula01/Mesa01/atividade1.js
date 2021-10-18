// // let notas = [8, 9, 10, 7]

// // let somanotas = notas.reduce(function(acum, valorAtual) {
// //     console.log(acum + "+" + valorAtual)
// //     return acum + valorAtual
// // });

// // let media = somanotas/notas.length
// // console.log(somanotas)
// // console.log(media)


// Utilizando a função console.log informe a nota que o aluno teve em cada um dos bimestres e por fim sua nota final.
// Por exemplo: “Parabéns pela conclusão do primeiro bimestre. Sua nota foi: 8.”;
// Após mostrar a nota final, crie uma estrutura de decisão que informe se o aluno foi aprovado ou não,
// sendo a média da escola 7.
// Por fim, comente as etapas do código.


// let notas = [8, 9, 10, 7]

// let somanotas = notas.reduce(function(acum, valorAtual) {
//     console.log("Sua nota foi: ")
//     console.log(acum + valorAtual)
//     return acum + valorAtual
// });

// let media = somanotas/notas.length
// console.log(somanotas)
// console.log(media)

let atendimentoPersonalizado = confirm("Deseja um atendimento personalizado?")

if(atendimentoPersonalizado){
let nome = prompt("Por favor insira seu nome");
alert("Damos as boas-vindas ao nosso site "+nome+". Muito obrigado pela sua visita!Estamos à sua disposição! ?");
}else{
alert("Obrigado por se conectar.")
}
