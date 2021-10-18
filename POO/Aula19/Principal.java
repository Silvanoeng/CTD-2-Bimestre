package Aula19;

public class Principal {
    public static void main(String[] args) {
        Empresa dh = new Empresa("555666");

        EmpregadoFactory factory = EmpregadoFactory.getInstance();
        Empregado nome =factory.criarEmpregado("R");
        nome.setNome("Edu");
        dh.addEmpregado(nome);
        dh.addEmpregado(factory.criarEmpregado("c"));
        dh.addEmpregado(factory.criarEmpregado("c"));

        System.out.println(dh.getListaEmpregados());
    }
}
