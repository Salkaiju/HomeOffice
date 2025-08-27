package ClassesSala;

public abstract class Sala {
private String nome;
private String descricao;
private int anoCriacao;
private boolean explorada;

public Sala(String nome, String descricao, int anoCriacao){
    this.nome = nome;
    this.descricao = descricao;
    this.anoCriacao = anoCriacao;
  }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public boolean isExplorada() {
        return explorada;
    }

    public void setExplorada(boolean explorada) {
        this.explorada = explorada;
    }

    public void primeiraVisita(Visitante visitante) {
        if (!isExplorada()) {
            System.out.println("Você recebeu 2 exp por explorar uma sala nova!");
            setExplorada(true);
        }
    }

    public abstract void exibirConteudo(Visitante visitante);
    public abstract void exibirInfo();
    public abstract void quiz();
}
