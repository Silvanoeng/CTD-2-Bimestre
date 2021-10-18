package Aula06;

import java.time.LocalDate;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Date data= new Date();
        Impressora impressoraEscritorio = new Impressora("epon", "wifi", LocalDate.of(2021,8,20));
        impressoraEscritorio.setFolhasDisponiveis(100);
        impressoraEscritorio.imprimir("Ola mundo!");
        System.out.println(impressoraEscritorio.getFolhasDisponiveis());

    }
}
