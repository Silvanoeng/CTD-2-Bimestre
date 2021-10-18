
let n = 0;
let carta1 = 100;
let carta2 = 155;
let resto1;
let resto2;
let divisor = 1


if (carta1==1||carta2==1){
    n=1;
    divisor=1;
}
if (carta1 > carta2 || carta1==carta2){
    for (i=carta2; i > 1; i--){
        n++;
        resto1 = carta1%i;
        resto2 = carta2%i;
        if (resto1 == 0 && resto2 == 0){
            divisor=i;
            i=0;
        }
    }
}
if (carta2 > carta1) {
    for (let i = carta1; i > 1; i--) {
        n++;
        resto1 = carta1%i;
        resto2 = carta2%i;
        if (resto1 == 0 && resto2 == 0) {
            divisor = i;
            i = 0;
        }
    }
}
console.log("Devem ter " + divisor + " cartas, cada pilha.")
console.log("Foi feito " + n + " rodadas.")