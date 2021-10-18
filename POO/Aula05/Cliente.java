package Aula05;

public class Cliente {

    private int numeroCliente;
    private String nome;
    private double divida;

    Cliente(int numeroCliente, String nome){
        this.numeroCliente=numeroCliente;
        this.nome=nome;
        this.divida=0;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public double getDivida() {
        return divida;
    }

    public double aumentarDivida(double valor) {
        this.divida= divida + valor;
        return this.divida;
    }
    public String pagarDivida(){
        this.divida = 0;
        return "A divida foi paga";
    }
}
