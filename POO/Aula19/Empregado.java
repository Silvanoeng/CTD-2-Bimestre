package Aula19;

public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String arquivo;

    public Empregado() {
    }

    public Empregado(String nome, String sobrenome, String arquivo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.arquivo = arquivo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getArquivo() {
        return arquivo;
    }

    public abstract Double calcularSalario();

}