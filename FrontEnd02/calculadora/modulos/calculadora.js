let dividir = require("./modulos/dividir")
let somar = require("./modulos/somar")
let sub = require("./modulos/sub")
let multiplicacao = require("./modulos/multiplicacao")
class Calculadora{
    constructor(n1, n2){
        this.n1 = n1;
        this.n2 = n2;
        this.calcular = (oper) =>{
            switch(oper){
                case "+":
                    console.log(somar(this.n1, this.n2))
                    break;
                case "-":
                    console.log(sub(this.n1, this.n2))
                    break;
                case "/":
                    console.log(dividir(this.n1, this.n2))
                    break;
                case "*":
                    console.log(multiplicacao(this.n1, this.n2))
                    break;
                default:
                    console.log("Operação inválida")
                    break;
            }
        }
    }
}
let minhaConta = new Calculadora(5,6)
minhaConta.calcular("+")