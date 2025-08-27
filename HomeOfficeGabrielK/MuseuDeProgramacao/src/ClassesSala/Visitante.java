package ClassesSala;

public class Visitante {
    private String nome;
    private int idade;

    public void exibirSala(Sala sala){
        System.out.println(getNome() + " está explorando " + sala.getNome());
    }

    public String getNome() {
        return nome;
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

    public void exibirCaracteristicas(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }

}
