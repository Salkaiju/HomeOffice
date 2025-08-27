package Principal;

import ClassesSala.Sala;
import ClassesSala.Visitante;
import ClassesSala.SalaCuriosidades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Visitante visitor = new Visitante();
        SalaCuriosidades salaCuriosidades = new SalaCuriosidades();

        int opcao;

        System.out.print("Digite o seu nome: ");
        visitor.setNome(scan.nextLine());
        System.out.print("Digite a sua idade: ");
        visitor.setIdade(scan.nextInt());

        do {
            System.out.println("\n=== " + "Salão Principal do Museu" + " ===");
            System.out.println("O que gostaria de fazer aqui?");
            System.out.println("1 - Ir á sala das Curiosidades.");
            System.out.println("2 - ir á sala dos Fundadores..");
            System.out.println("3 - ir á sala das Versões.");
            System.out.println("4 - Ver suas características.");
            System.out.println("0 - Sair do museu.");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> salaCuriosidades.exibirConteudo(visitor);
                case 2 -> System.out.println("");
                case 3 -> System.out.println("");
                case 4 -> System.out.println("");
                case 0 -> System.out.println("Volte logo!");
                default -> System.out.println("Erro.");
            }

        } while(opcao != 0);
        scan.close();
    }
  }
