package ClassesSala;

import java.util.Scanner;

public class SalaFundadores extends Sala {
    private final Scanner scan = new Scanner(System.in);

    public SalaFundadores() {
        super("Sala dos Fundadores", "Veja sobre os Fundadores de Java", 1995);
    }

    @Override
    public void exibirConteudo(Visitante visitante) {
        int opcao;
        do {
            System.out.println("\n=== " + getNome() + " ===");
            System.out.println("O que gostaria de fazer aqui?");
            System.out.println("1 - Exibir informações sobre a sala.");
            System.out.println("2 - Curiosidades sobre os fundadores.");
            System.out.println("0 - Sair da sala");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> exibirInfo();
                case 2 -> sobreFundadores();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Erro. Tente novamente.");
            }

        } while (opcao != 0);
    }

    public void sobreFundadores() {
        int opcao;
        do {
            System.out.println("""
                === FUNDADORES DO JAVA ===
                Escolha uma opção para saber mais:

                1 - James Gosling
                2 - Mike Sheridan
                3 - Patrick Naughton
                0 - Parar de ver curiosidades

                Digite sua opção:
                """);

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> System.out.println("\nJames Gosling é conhecido como o 'pai do Java'. Ele liderou o desenvolvimento da linguagem na Sun Microsystems em 1991.");
                case 2 -> System.out.println("\nMike Sheridan foi parte da equipe inicial de desenvolvimento do Java, contribuindo para o design da linguagem.");
                case 3 -> System.out.println("\nPatrick Naughton também participou da equipe de criação do Java, ajudando no desenvolvimento das primeiras versões e da filosofia 'Write Once, Run Anywhere'.");
                case 0 -> System.out.println("\nSaindo do menu sobre fundadores...");
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