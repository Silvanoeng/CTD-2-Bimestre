package Aula20Mesa;

import java.util.ArrayList;

public class Carrinho {

    private Estado estado;
    private ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public ArrayList<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public Carrinho() {
        setEstado(new Vazio(this));
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void adicionarProduto(Produto produto) {
        getEstado().adicionarProduto(produto);
    }

    public void cancelar() {
        getEstado().cancelar();
    }

    public void retornar() {
        getEstado().retornar();
    }

    public void proximo() {
        getEstado().proximo();
    }

    @Override
    public String toString() {
        String statusCarrinho = "\nEstado do carrinho: " + this.getEstado() + "\n" + "itens: \n";
        for (Produto produto : listaDeProdutos) {
            statusCarrinho += produto.getDescricao() + "\n";
        }
        return statusCarrinho;
    }
}
