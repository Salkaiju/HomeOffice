import java.util.Scanner;

public class Visitante extends Sala{
    private String nome;
    private int idade;

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
 public void dadosVisitantes(){
     Scanner scan = new Scanner(System.in);
     System.out.println("Digite seu nome");
     setNome(scan.next());
     System.out.println("olá " +getNome() + " digite sua idade");
     setIdade(scan.nextInt());
 }
}

