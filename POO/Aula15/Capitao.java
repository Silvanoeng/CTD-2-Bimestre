package POO.Aula15;

public class Capitao {

        private String nome;
        private String sobrenome;
        private int registroNav;

    public Capitao(String nome, String sobrenome, int registroNav) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.registroNav = registroNav;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getRegistroNav() {
        return registroNav;
    }

    public void setRegistroNav(int registroNav) {
        this.registroNav = registroNav;
    }
}

