package Aula23Mesa;

public class Principal {
    public static void main(String[] args) {
        Curso frontEnd = new Curso(16, 2, 1000.0);
        Curso backEnd = new Curso(20, 2, 900.0);
        Programa fullStack = new Programa();
        fullStack.addModulos(frontEnd);
        fullStack.addModulos(backEnd);
        System.out.printf("O curso de FrontEnd tem o valor de R$ %.2f.\n" , frontEnd.calcularValor());
        System.out.printf("O curso de BackEnd tem o valor de R$ %.2f.\n" , backEnd.calcularValor());
        System.out.printf("%s %.2f.","Já no curso FullStack, temos um descondo de 20%, ficando com o valor de R$ " , fullStack.calcularValor());

    }
}
