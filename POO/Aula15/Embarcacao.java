package POO.Aula15;

public abstract class Embarcacao {
    private float precoBase;
    private float valorAdicional;
    private double anoFabricacao;
    private double comprimento;
    private Capitao capitao;

    public Embarcacao(float precoBase, float valorAdicional, double anoFabricacao, double comprimento,
                      Capitao capitao) {
        this.precoBase = precoBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacao = anoFabricacao;
        this.comprimento = comprimento;
        this.capitao = capitao;
    }

    public float calcularAluguel(){
        return (anoFabricacao>= 2020) ? precoBase + valorAdicional : precoBase;
    }

    public void valorAluguel() {
        System.out.printf("O valor do aluguel é %.2f .%n", calcularAluguel());
    }
}
