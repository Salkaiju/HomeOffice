package HomeOfficeDia26;

import HomeOfficeDia26.SubClasses.SalaCuriosidades;
import HomeOfficeDia26.SubClasses.SalaFundadores;
import HomeOfficeDia26.SubClasses.SalaVersoes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Visitantes dados = new Visitantes();
        dados.ficha();

        Sala sala = new Sala();
        sala.explorarSala();
        int escolha = leitura.nextInt();

        switch (escolha) {
            case 1:
                SalaCuriosidades sala1 = new SalaCuriosidades();
                sala1.setNome("Sala de Curiosidades");
                sala1.setDescricao("Aqui vocâ aprenderá algumas curiosidades sobre java");
                sala1.setAnoCiacao(2025);
                sala1.exibirConteudo();
                break;
            case 2:
                SalaFundadores sala2 = new SalaFundadores();
                sala2.setNome("Sala dos fundadores");
                sala2.setDescricao("Aqui você conhecerá os nomes por trás da linguagem de programação mais famosa do mundo.");
                sala2.setAnoCiacao(2025);
                sala2.exibirConteudo();
                break;
            case 3:
                SalaVersoes sala3 = new SalaVersoes();
                sala3.setNome("Sala das versões");
                sala3.setDescricao("Aqui você conhecerá as versões anteriores e atuais da linguagem do java");
                sala3.setAnoCiacao(2025);
                sala3.exibirConteudo();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
