package Aula20Mesa;

public class Pagando implements Estado {

    private Carrinho carrinho;

    public Pagando(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        System.out.println("Não é possível adicionar mais produtos, retorne uma etapa");
    }

    @Override
    public void cancelar() {
        carrinho.setListaDeProdutos(null);
        carrinho.setEstado(new Vazio(carrinho));
    }

    @Override
    public void retornar() {
        carrinho.setEstado(new Carregando(carrinho));
    }

    @Override
    public void proximo() {
        carrinho.setEstado(new Fechado(carrinho));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() ;
    }
}
