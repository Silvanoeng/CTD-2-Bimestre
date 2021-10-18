package Aula20;

public class Triste implements Estado{

   private Tamagochi t;

    public Triste() {
        this.t = t;
    }

    @Override
    public void come() {
        System.out.println("Beep Beep - vomitando");
    }

    @Override
    public void bebe() {
        System.out.println("Beep, Beep, Beep - pisca");
    }

    @Override
    public void carinho() {
        System.out.println("Cut cut - feliz");
        t.setEstado(new Feliz(t));
    }
}
