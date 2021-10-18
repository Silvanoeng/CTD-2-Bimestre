package Aula20Mesa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto refrigerante = new Produto("refrigerante de laranja", 5.00);
        Produto cuscuz = new Produto("flocos de milho", 2.50);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(refrigerante);
        System.out.println(carrinho);

        carrinho.adicionarProduto(cuscuz);



    }
}
