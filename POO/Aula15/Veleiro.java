package POO.Aula15;

public class Veleiro extends Embarcacao implements Avaliar{
    private int numMastros;

    public Veleiro(float precoBase, float valorAdicional, double anoFabricacao, double comprimento, int numMastros, Capitao capitao) {
        super(precoBase, valorAdicional, anoFabricacao, comprimento, capitao);
        this.numMastros = numMastros;
    }

    public int getNumMastros() {
        return this.numMastros;
    }

    @Override
    public void avaliar() {

        if(this.numMastros > 4){
            System.out.println("É um grande veleiro.");
        } else{
            System.out.println("Não é um grande veleiro.");
        }
    }
}
