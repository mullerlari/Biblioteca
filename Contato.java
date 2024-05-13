public class Contato {

    private String nome;
    private String sobrenome;
    public Contato(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
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
    public String imprimir(){
        return "Livro emprestado para: \nNome: " + nome + " sobrenome: " + sobrenome;
    }


}