package ClassesSala;

import java.util.Scanner;

public class SalaVersoes extends Sala {
    private final Scanner scan = new Scanner(System.in);

    public SalaVersoes() {
        super("Sala das Versões", "Veja curiosidades sobre as versões do Java", 1995);
    }

    @Override
    public void exibirConteudo(Visitante visitante) {
        int opcao;
        do {
            System.out.println("\n=== " + getNome() + " ===");
            System.out.println("O que gostaria de fazer aqui?");
            System.out.println("1 - Exibir informações sobre a sala.");
            System.out.println("2 - Curiosidades sobre versões do Java.");
            System.out.println("0 - Sair da sala");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> exibirInfo();
                case 2 -> mostrarVersoes();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);
    }

    private void mostrarVersoes() {
        int opcao;
        do {
            System.out.println("""
                === VERSÕES DO JAVA ===
                Escolha uma opção para saber mais:

                1 - Java 1.0
                2 - Java 5 (Tiger)
                3 - Java 8
                4 - Java 17 (LTS)
                0 - Parar de ver versões

                Digite sua opção:
                """);

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> System.out.println("\nJava 1.0 (1996) foi a primeira versão oficial, trazendo as bases da linguagem e da JVM.");
                case 2 -> System.out.println("\nJava 5 (2004), também chamada Tiger, trouxe generics, annotations e enums.");
                case 3 -> System.out.println("\nJava 8 (2014) introduziu lambdas, streams e a nova API de datas (java.time).");
                case 4 -> System.out.println("\nJava 17 (2021) é uma versão LTS (Long Term Support), usada em muitas empresas por estabilidade e suporte prolongado.");
                case 0 -> System.out.println("\nSaindo do menu de versões...");
                default -> System.out.println("\nOpção inválida! Tente novamente.");
            }

        } while (opcao != 0);
    }

    @Override
    public void exibirInfo() {
        System.out.println("\n=== INFORMAÇÕES DA SALA ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Ano de criação: " + getAnoCriacao());
    }
}