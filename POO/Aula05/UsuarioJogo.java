package Aula05;

public class UsuarioJogo {
    private String nome;
    private String nickName;
    private int pontuacao;
    private int nivel;

    UsuarioJogo(String nome, String nickName){
        this.nome = nome;
        this.nickName = nickName;
        this.pontuacao=0;
        this.nivel=0;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getNickName() {
        return nickName;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public int getNivel() {
        return nivel;
    }
    public int aumentarPontuacao(int valor){
        this.pontuacao+= valor;
        int pontoNivel = this.pontuacao/100;
        if(this.nivel<pontoNivel){
            for (int i=this.nivel; i< pontoNivel;i++){
                this.subirNivel();
                this.bonus();
            }
        }
        return this.pontuacao;
    }
    public int subirNivel(){
        this.nivel++;
        return this.nivel;
    }
    public int bonus(){
        this.pontuacao += this.nivel*2;
        return this.pontuacao;
    }
}
