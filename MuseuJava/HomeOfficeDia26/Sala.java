package HomeOfficeDia26;

import HomeOfficeDia26.SubClasses.SalaCuriosidades;

import java.util.Scanner;

public class Sala {
    private String nome;
    private String descricao;
    private int anoCiacao;
    Scanner leitura = new Scanner(System.in);

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

    public int getAnoCiacao() {
        return anoCiacao;
    }

    public void setAnoCiacao(int anoCiacao) {
        this.anoCiacao = anoCiacao;
    }

    public void exibirConteudo () {
        return;
    }

    public void explorarSala() {
        System.out.println("Escolha a sala que você deseja explorar");
        System.out.println("""
                Salas:
                1 - Curiosidades
                2 - Fundadores
                3 - Versões
                """);

    }
}
