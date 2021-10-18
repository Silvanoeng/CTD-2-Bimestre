package Aula20Mesa;

public class Fechado implements Estado {

    private Carrinho carrinho;

    public Fechado(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        System.out.println("Carrinho fechado");
    }

    @Override
    public void cancelar() {
        System.out.println("Carrinho fechado");
    }

    @Override
    public void retornar() {
        System.out.println("Carrinho fechado");
    }

    @Override
    public void proximo() {
        carrinho.setEstado(new Vazio(carrinho));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() ;
    }
}
