package POO.Aula15;

public class Principal {
    public static void main(String[] args) {

        Capitao capitao1 = new Capitao("Fernando", "Carvalho", 123456);
        Capitao capitao2 = new Capitao("Silvano", "Araujo", 654321);
        Capitao capitao3 = new Capitao("Leonardo", "Martins", 526341);
        Capitao capitao4 = new Capitao("Duyllyan", "Carvalho", 416352);

        Veleiro veleiro1 = new Veleiro( 500f, 100f, 2019, 500, 3, capitao1);
        Veleiro veleiro2 = new Veleiro( 600f, 150f, 2020, 700, 6, capitao2);
        Veleiro veleiro3 = new Veleiro( 800f, 250f, 2019, 800, 2, capitao3);
        Veleiro veleiro4 = new Veleiro( 900f, 350f, 2020, 900, 6, capitao4);
        Iate iate4 = new Iate( "Safira",500f, 100f, 2019, 500, 2, capitao1);
        Iate iate2 = new Iate( "Blue",600f, 150f, 2020, 700, 6, capitao2);
        Iate iate3 = new Iate( "Tor", 800f, 250f, 2019, 800, 2, capitao3);
        Iate iate1 = new Iate( "Poseidon", 900f, 350f, 2020, 900, 5, capitao4);

        System.out.println("Veleiro 1");
        veleiro1.avaliar();
        veleiro1.valorAluguel();

        System.out.println("Veleiro 2");
        veleiro2.avaliar();
        veleiro2.valorAluguel();

        System.out.println("Veleiro 3");
        veleiro3.avaliar();
        veleiro3.valorAluguel();

        System.out.println("Veleiro 4");
        veleiro4.avaliar();
        veleiro4.valorAluguel();


        iate1.comparar(iate2);

        System.out.println("Iate 1");
        iate1.valorAluguel();

        System.out.println("Iate 2");
        iate2.valorAluguel();

        iate3.comparar(iate4);

        System.out.println("Iate 3");
        iate3.valorAluguel();

        System.out.println("Iate 4");
        iate4.valorAluguel();

    }

}
