package Nprimo;

import java.util.Scanner;


public class Nprimo {
   public static String Nprimo(int numero) {
       String resposta;
       if(numero!=2 && numero%2==0 || numero==1){
           resposta="não é primo";
       }else if (numero==2||numero==3){
           resposta="é primo";
       }else {
           int contador=0;
           for(int i=1;i<numero;i+=2){
               if (numero%i==0){
                   contador++;
               }
           }
           if (contador>1){
               resposta="não é primo";
           }else {resposta="é primo";
           }
       }
       return resposta;
   }

    public static void main(String[] args) {
        // write your code here
        Scanner analise;
        analise = new Scanner(System.in);
        int numeroAnalisado;
        System.out.println("Digite um número, para consultar se ele é primo?");
        numeroAnalisado= analise.nextInt();
        System.out.println("O número " +numeroAnalisado+ " " +Nprimo(numeroAnalisado));

    }
}
