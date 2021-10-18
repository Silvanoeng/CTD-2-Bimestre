
let pontoUsuario = 0


for (i = 0; i < 3; i++) {
    let maoUsuario = prompt("Digite um número entre (1) pedra, (2) papel e (3) tesoura")
    // let maoUsuario = parseInt(Math.random() * 3 + 1)
    let maoMaquina = parseInt(Math.random() * 3 + 1)

    switch (maoUsuario) {
        case "1":
            if (maoMaquina == 1) {
                console.log("Empate!")
                
            }
            else if (maoMaquina == 2) {
                console.log("Perdeu!")
                
            }
            else if (maoMaquina == 3) {
                console.log("Ganhou!")
                pontoUsuario += 1
            }
            break;
        case "2":
            if (maoMaquina == 2) {
                console.log("Empate!")
                
            }
            else if (maoMaquina == 3) {
                console.log("Perdeu!")
                
            }
            else if (maoMaquina == 1) {
                console.log("Ganhou!")
                pontoUsuario += 1
            }
            break;

        case "3":
            if (maoMaquina == 3) {
                console.log("Empate!")
                
            }
            else if (maoMaquina == 1) {
                console.log("Perdeu!")
                
            }
            else if (maoMaquina == 2) {
                console.log("Ganhou!")
                pontoUsuario += 1
            }
            break;
    }
}
let resultado
resultado = pontoUsuario > 2 ? "Você ganhou o jogo!" : "Você perdeu o jogo!";
console.log(resultado)
