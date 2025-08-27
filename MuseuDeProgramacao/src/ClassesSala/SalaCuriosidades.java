package ClassesSala;

import java.util.Scanner;

public class SalaCuriosidades extends Sala{
    private final Scanner scan = new Scanner(System.in);

    public SalaCuriosidades() {
        super("Sala de Curiosidades"
                , "Veja curiosidades sobre o java."
                , 2000);
    }

    @Override
    public void exibirConteudo(Visitante visitante) {
        int opcao;
        do {
            System.out.println("\n=== " + getNome() + " ===");
            System.out.println("O que gostaria de fazer aqui?");
            System.out.println("1 - Exibir informações sobre a sala.");
            System.out.println("2 - Curiosidades.");
            System.out.println("3 - Quiz das curiosidades.");
            System.out.println("0 - Sair da sala");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> exibirInfo();
                case 2 -> mostrarCuriosidades();
                case 3 -> quiz();
                case 0 -> System.out.println("você saiu da sala de curiosidades.");
                default -> System.out.println("Erro.");
            }

        } while (opcao != 0);

    }

    private void mostrarCuriosidades(){
        int opcao = 0;
        do {
            System.out.println("Qual curiosidade gostaria de saber?\n" +
                    "1-\n" +
                    "2-\n" +
                    "3-\n" +
                    "4-\n" +
                    "5-\n" +
                    "6-\n" +
                    "7-\n" +
                    "8-\n" +
                    "9-\n" +
                    "10-\n" +
                    "0-Parar de ver curiosidades");
            opcao = scan.nextInt();
        } while (opcao != 0);
    }

    @Override
    public void exibirInfo() {
        System.out.println("\nSala: " + getNome() + "\n" +
                "Descrição: " + getDescricao() + "\n" +
                "Ano de Criação: " + getAnoCriacao());
    }

    @Override
    public void quiz() {
        System.out.println("Começaremos com o quiz das curiosidades de Java!");
    }
}
