package ClassesSala;

public class Visitante {
    private String nome;
    private int idade;
    private int exp;
    private int expToUp = 4;
    private int level;

    public void exibirSala(Sala sala){
        System.out.println("Exploração.");
    }

    public int getExpToUp() {
        return expToUp;
    }

    public void setExpToUp(int expToUp) {
        this.expToUp = expToUp;
    }

    public String getNome() {
        return nome;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void upar(){
        level++;
        setExpToUp((int) (expToUp * 1.5));
    }
}
