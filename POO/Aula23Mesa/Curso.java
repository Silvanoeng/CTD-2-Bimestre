package Aula23Mesa;

public class Curso implements  Modulo{
   private int cargaHoraria;
   private int tempoMeses;
   private double valorHora;

    public Curso(int cargaHoraria, int tempoMeses, double valorHora) {
        this.cargaHoraria = cargaHoraria;
        this.tempoMeses = tempoMeses;
        this.valorHora = valorHora;
    }


    @Override
    public double calcularValor() {
        double valor = cargaHoraria*tempoMeses*valorHora;
        return valor;
    }
}
