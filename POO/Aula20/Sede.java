package Aula20;

public class Sede implements Estado{

    private Tamagochi t;

    public Sede() {
        this.t = t;
    }

    @Override
    public void come() {
        System.out.println("To com sede");

    }

    @Override
    public void bebe() {
        System.out.println("Vlw fera");
        t.setEstado(new Feliz(t));
    }

    @Override
    public void carinho() {
        System.out.println("Vlw fera 2");

    }
}
