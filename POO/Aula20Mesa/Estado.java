package Aula20Mesa;

public interface Estado {

    void adicionarProduto(Produto produto);
    void cancelar();
    void retornar();
    void proximo();
}
