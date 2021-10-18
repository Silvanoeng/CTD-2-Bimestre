package POO.Aula15;

public class Iate extends Embarcacao implements Comparar{
    private String nome;
    private int numCabines;

    public Iate(String nome, float precoBase, float valorAdicional, double anoFabricacao, double comprimento, int numCabines, Capitao capitao) {
        super(precoBase, valorAdicional, anoFabricacao, comprimento, capitao);
        this.nome=nome;
        this.numCabines=numCabines;
    }

    public String getNome() {
        return nome;
    }

    public int getNumCabines() {
        return numCabines;
    }
    @Override
    public void comparar (Iate iate) {
            if (this.numCabines == iate.getNumCabines())
                System.out.println("Os iates são iguais");
            else if(this.numCabines > iate.getNumCabines())
                System.out.println("O iate "+ getNome() + " é mais luxuoso que o iate "+ iate.getNome()+".");
            else
                System.out.println("O iate "+ iate.getNome() + " é mais luxuoso que o iate "+ getNome()+".");
    }

}
