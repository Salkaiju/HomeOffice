package HomeOfficeDia26;

import java.util.Scanner;

public class Visitantes extends Sala{
    private String nome;
    private String idade;
    Scanner leia = new Scanner(System.in);


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void ficha() {
        System.out.println("Informe seu nome");
        String nome = leia.nextLine();
        System.out.println("Informe sua idade");
        int idade = leia.nextInt();
    }
}
