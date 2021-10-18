let n1 = parseInt(prompt("Escolha o primeiro valor: "));
let n2 = parseInt(prompt("Escolha o segundo valor: "));
let oper = prompt("Escolha a operação: ");

import {somar} from './modulos/somar.js'
import {restarNumeros} from './modulos/sub.js'
import {multiplicacao} from './modulos/multiplicacao.js'
import {dividir} from './modulos/dividir.js'

class Calculadora {

  constructor(num1, num2) {

    this.num1 = num1;
    this.num2 = num2;

    this.calcular = oper => {

      switch (oper) {

        case "+": return alert("Resultado: " + somar(this.num1, this.num2));
        case "-": return alert("Resultado: " + restarNumeros(this.num1, this.num2));
        case "*": return alert("Resultado: " + multiplicacao(this.num1, this.num2));
        case "/": return alert("Resultado: " + dividir(this.num1, this.num2));
        default: alert("Digite uma opção válida!");

      }
    }
  }
}

let calc = new Calculadora(n1,n2);
calc.calcular(oper);