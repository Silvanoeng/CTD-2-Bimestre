package Aula06;


public class ExCachorro {
    public static void main(String[] args) {

        System.out.println("Cão 01");

        CachorroAdocao cao01 = new CachorroAdocao();

        cao01.avaliacaoCao();

        System.out.println("Cão 02");

        CachorroAdocao cao02 = new CachorroAdocao("Vira-Lata",2018,5.1,true);

        cao02.avaliacaoCao();

        cao02.avaliacaoAdocao();

        cao02.saberIdade(2021);
    }
}
