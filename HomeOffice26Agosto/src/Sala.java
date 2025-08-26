public class Sala {
    private String nome;
    private String descricao;
    private int anoDeCriacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }
    public void explorarSala(){
    setNome("Sala");
    setAnoDeCriacao(2000);
    setDescricao("blablabla");
    }
}
