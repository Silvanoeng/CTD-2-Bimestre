package Aula05;

import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        for (int comandoMenu = 2; comandoMenu > 1; comandoMenu++) {
            System.out.println("###################################################################");
            System.out.println("##                           Menu                                ##");
            System.out.println("##    Para Cadastrar(1)                     Para Sair(0)         ##");
            System.out.println("###################################################################");
            comandoMenu = menu.nextInt();
            if (comandoMenu != 0) {

                int idCliente;
                String nomeCliente;

                System.out.println("Digite o id do cliente:");
                idCliente = menu.nextInt();
//                System.out.println("Digite o nome do cliente:");
                nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");

                Aula05.Cliente cliente = new Aula05.Cliente(idCliente, nomeCliente);
                System.out.println(cliente.getNome() + " " + cliente.getDivida());

                int dividaCliente = 0;
                System.out.println("Digite o valor da divida de "+ nomeCliente+ ":");
                dividaCliente = menu.nextInt();
                cliente.aumentarDivida(dividaCliente);
                System.out.println(cliente.getDivida());
            } else if (comandoMenu == 0){
                System.out.println("Programa finalizado.");
            }
        }
    }
}




//        Cliente cliente = new Cliente(6, "Silvano");
//        System.out.println(cliente.getNome() + " " + cliente.getDivida());
//        cliente.aumentarDivida(500);
//        System.out.println(cliente.getDivida());

//        UsuarioJogo jogador01 = new UsuarioJogo("Silvano", "SAP");
//        System.out.println("Jogador " + jogador01.getNome() + " seu nick é: " + jogador01.getNickName());
//        jogador01.aumentarPontuacao(500);
//        System.out.println(jogador01.getNickName() + " você tem "+ jogador01.getPontuacao()+ " pontos, você está no nivel: "+jogador01.getNivel());
//
//        UsuarioJogo jogador02 = new UsuarioJogo("Marina", "MSA");
//        System.out.println("Jogador " + jogador02.getNome() + " seu nick é: " + jogador02.getNickName());
//        jogador02.aumentarPontuacao(600);
//        System.out.println(jogador02.getNickName() + " você tem "+ jogador02.getPontuacao()+ " pontos, você está no nivel: "+jogador02.getNivel());
//        jogador02.aumentarPontuacao(90);
//        System.out.println(jogador02.getNickName() + " você tem "+ jogador02.getPontuacao()+ " pontos, você está no nivel: "+jogador02.getNivel());
//        jogador02.aumentarPontuacao(200);
//        System.out.println(jogador02.getNickName() + " você tem "+ jogador02.getPontuacao()+ " pontos, você está no nivel: "+jogador02.getNivel());

//    }
//}
