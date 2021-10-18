package Aula20Mesa;

public class Carregando implements Estado {

    private Carrinho carrinho;

    public Carregando(Carrinho carrinho) {
        this.carrinho = carrinho;
    }


    @Override
    public void adicionarProduto(Produto produto) {
        carrinho.getListaDeProdutos().add(produto);
    }

    @Override
    public void cancelar() {
        carrinho.setListaDeProdutos(null);
        carrinho.setEstado(new Vazio(carrinho));
    }

    @Override
    public void retornar() {
        carrinho.setListaDeProdutos(null);
        carrinho.setEstado(new Vazio(carrinho));
    }

    @Override
    public void proximo() {
        carrinho.setEstado(new Pagando(carrinho));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() ;
    }
}
