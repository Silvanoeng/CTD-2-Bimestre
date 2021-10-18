package Aula23Mesa;

import java.util.ArrayList;

public class Programa implements Modulo{
    private ArrayList<Modulo> listaModulos;

    public Programa(){
        this.listaModulos = new ArrayList<>();
    }
public void addModulos(Modulo modulo){
        this.listaModulos.add(modulo);
}

    @Override
    public double calcularValor() {
        double valorCurso = 0.0;
        for(Modulo modulo : listaModulos){
            valorCurso += modulo.calcularValor();
        }
        valorCurso = valorCurso * 0.8;
        return valorCurso;
    }
}
