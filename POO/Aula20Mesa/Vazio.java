package Aula20Mesa;

public class Vazio implements Estado {

    private Carrinho carrinho;

    public Vazio(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        carrinho.getListaDeProdutos().add(produto);
        carrinho.setEstado(new Carregando(carrinho));
    }

    @Override
    public void cancelar() {
        System.out.println("Carrinho vazio");
    }

    @Override
    public void retornar() {
        System.out.println("Carrinho vazio");
    }

    @Override
    public void proximo() {
        System.out.println("Carrinho vazio");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() ;
    }
}
