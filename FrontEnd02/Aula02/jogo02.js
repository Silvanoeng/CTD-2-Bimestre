
let pontoUsuario = 0
let pontoUniverso = 0
let maoUsuario = 0

for (i = 0; i < 3; i++) {
    for (e = 0; e < 2; e++) {
        maoUsuario = prompt("Digite um número entre (1) pedra, (2) papel e (3) tesoura")
        maoUsuario == "1" || maoUsuario == "2" || maoUsuario == "3" ? e = 1 : e = 0
    }
    let nomeUsu
    let nomeMaq
    function nomeMao(tipo) {
        switch (tipo) {
            case 1: return "pedra";
            case 2: return "papel";
            case 3: return "tesoura";
        }
    }
    maoUsuario = parseInt(maoUsuario)
    let maoMaquina = parseInt(Math.random() * 3 + 1)
    nomeUsu = nomeMao(maoUsuario)
    nomeMaq = nomeMao(maoMaquina)
    alert("Você jogou " + nomeUsu + " e a maquina " + nomeMaq)
    function jogada(a, b) {
        if (a==b){
            return pontoUniverso += 1
        }
        else if (a != 1 && (a-1) == b) {
            return pontoUsuario += 1
        }
        else if (a == 1 && b == 3) {
            return pontoUsuario += 1
        } 
    }
    jogada(maoUsuario, maoMaquina)
}
let res
switch (pontoUniverso) {
    case 3:
        alert("Você não ganho e nem perdeu!")
        break;
    case 2:
        res = pontoUsuario == 1 ? "Você ganhou o jogo!" : "Você perdeu o jogo!";
        alert(res)
        break;
    case 1:
        res = pontoUsuario == 2 ? "Você ganhou o jogo!" : pontoUsuario == 1 ? "Você não ganho e nem perdeu!" : "Você perdeu o jogo!";;
        alert(res)
        break;
    case 0:
        res = pontoUsuario > 1 ? "Você ganhou o jogo!" : "Você perdeu o jogo!";
        alert(res)
        break;
}

