package Principal;

import ClassesSala.SalaFundadores;
import ClassesSala.SalaVersoes;
import ClassesSala.Visitante;
import ClassesSala.SalaCuriosidades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Visitante visitor = new Visitante();
        SalaCuriosidades salaCuriosidades = new SalaCuriosidades();
        SalaFundadores salaFundadores = new SalaFundadores();
        SalaVersoes salaVersoes = new SalaVersoes();

        int opcao;

        System.out.print("Digite o seu nome: ");
        visitor.setNome(scan.nextLine());
        System.out.print("Digite a sua idade: ");
        visitor.setIdade(scan.nextInt());

        do {
            System.out.print("""
        === Salão Principal do Museu ===
        O que gostaria de fazer aqui?
        1 - Ir á sala das Curiosidades.
        2 - Ir á sala dos Fundadores.
        3 - Ir á sala das Versões.
        4 - Ver suas características.
        0 - Sair do museu.
        Escolha: """);
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> {
                    visitor.exibirSala(salaCuriosidades);
                salaCuriosidades.exibirConteudo(visitor);
                }
                case 2 -> {
                    visitor.exibirSala(salaCuriosidades);
                    salaFundadores.exibirConteudo(visitor);
                }
                case 3 -> {
                    visitor.exibirSala(salaCuriosidades);
                    salaVersoes.exibirConteudo(visitor);
                }
                case 4 -> {
                    visitor.exibirCaracteristicas();
                }
                case 0 -> {
                    System.out.println("Saindo... Volte sempre!");
                }
                default -> System.out.println("Erro.");
            }

        } while(opcao != 0);
        scan.close();
    }
  }
