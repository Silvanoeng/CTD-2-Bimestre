package NumeroRomano;

import java.util.Scanner;

public class NumeroRomano {
    public static int Nromano(String numero) {
        boolean teste= false;
        int valor0 = 0;
        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;
        int contador = 0;
        for(int e =0;e < numero.length();e++) {
            char letra = numero.charAt(e);
            switch (letra) {
                case 'I':
                    valor3 = 1;
                    break;
                case 'V':
                    valor3 = 5;
                    contador += 2;
                    break;
                case 'X':
                    valor3 = 10;
                    break;
                case 'L':
                    valor3 = 50;
                    contador += 2;
                    break;
                case 'C':
                    valor3 = 100;
                    break;
                case 'D':
                    valor3 = 500;
                    contador += 2;
                    break;
                case 'M':
                    valor3 = 1000;
                    break;
            }
            if (valor0 == 0) {
                valor2 = valor3;
                valor0 = valor3;
            } else if (valor3 == valor2) {
                valor1 = valor3;
                valor0 += valor3;
                contador++;
            } else if (valor3 < valor2) {
                valor0 += valor3;
                valor1 = 0;
                valor2 = valor3;
                contador = 0;
            } else if (valor3 > valor2 && valor2 == valor1||valor3 > valor2*10||valor3==10 && valor2==5 ||valor3 == 50 && valor2 == 5||valor3 == 500 && valor2 == 50) {
                teste = true;
            } else {
                valor0 += (valor3) - (valor2 + valor2);
            }
            if (contador > 2) {
                teste = true;
            }
        }
        if(teste) {
            valor0 = 9999;
            return valor0;
        }else{
            return valor0;
        }
    }
    public static void main(String[] args) {
        // write your code here
        Scanner analise;
        analise = new Scanner(System.in);
        String numeroAnalisado;
        System.out.println("Digite um número romano de I a MM, para ser convertido:");
        numeroAnalisado= analise.nextLine();
        if (Nromano(numeroAnalisado)==9999) {
            System.out.println("Por favor confira o número digitado.");
        }else{
            System.out.println("O número é " + Nromano(numeroAnalisado));
        }
    }
}
