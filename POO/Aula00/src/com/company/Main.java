package com.company;

public class Main {

    static void callNames(String fname, String sname, String dnascimento) {
        System.out.println(fname.charAt(0) + " " + sname.charAt(0));
        System.out.println(dnascimento);
    }

    public static void main(String[] args) {

        callNames("Silvano", "Araujo", "25/01/1986");

        String nome = "Gustavo";
        String sobrenome = "Barretto";
        String dataNascimento = "05/06/2001";
        System.out.println(nome.charAt(0) + " " + sobrenome.charAt(0));

    }


}
