// let maoUsuario = prompt("Digite um número entre (1) pedra, (2) papel e (3) tesoura")

// let maoMaquina = parseInt(Math.random()*3+1)


// if (maoUsuario == 1){
//     if (maoMaquina == 1){
//         console.log("Empate!")
//     }
//     else if (maoMaquina == 2){
//         console.log("Perdeu!")
//     }
//     else if (maoMaquina == 3){
//         console.log("Ganhou!")
//     }
// }
// if (maoUsuario == 2){
//     if (maoMaquina == 2){
//         console.log("Empate!")
//     }
//     else if (maoMaquina == 3){
//         console.log("Perdeu!")
//     }
//     else if (maoMaquina == 1){
//         console.log("Ganhou!")
//     }
// }
// if (maoUsuario == 3){
//     if (maoMaquina == 3){
//         console.log("Empate!")
//     }
//     else if (maoMaquina == 1){
//         console.log("Perdeu!")
//     }
//     else if (maoMaquina == 2){
//         console.log("Ganhou!")
//     }
// }
let pontoUsuario = 2
let resultado = pontoUsuario > 2 ? "Você ganhou o jogo!" : "Você perdeu o jogo!";
console.log(resultado)