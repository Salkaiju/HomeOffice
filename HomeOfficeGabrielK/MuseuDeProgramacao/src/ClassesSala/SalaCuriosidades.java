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
            System.out.println("0 - Sair da sala");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> exibirInfo();
                case 2 -> mostrarCuriosidades();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Erro.");
            }

        } while (opcao != 0);

    }

    private void mostrarCuriosidades() {
        int opcao = 0;

        do {
            System.out.println("""
                === CURIOSIDADES SOBRE JAVA ===
                Escolha uma opção para descobrir uma curiosidade:

                1 - Origem do nome Java
                2 - Criador da linguagem
                3 - Primeiro nome do Java
                4 - Escreva uma vez, rode em qualquer lugar
                5 - Java e Android
                6 - Java não tem ponteiros explícitos
                7 - JVM, JRE e JDK: qual a diferença?
                8 - Java é case sensitive
                9 - A versão mais usada no mundo
                10 - O mascote do Java
                0 - Parar de ver curiosidades

                Digite sua opção:
                """);

            opcao = scan.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("\nO nome **Java** veio do café! Os criadores estavam tomando café da ilha de Java, na Indonésia, e decidiram homenageá-lo.");
                case 2 -> System.out.println("\nA linguagem Java foi criada por **James Gosling** em 1991, na empresa **Sun Microsystems**.");
                case 3 -> System.out.println("\nAntes de se chamar Java, a linguagem era conhecida como **Oak** (carvalho), por causa de uma árvore próxima ao escritório.");
                case 4 -> System.out.println("\nO slogan oficial do Java é **'Write Once, Run Anywhere'** — ou seja, escreva uma vez, rode em qualquer plataforma!");
                case 5 -> System.out.println("\nMais de **70% dos aplicativos Android** são desenvolvidos em **Java**! Ele foi a principal linguagem do Android por anos.");
                case 6 -> System.out.println("\nDiferente de C e C++, **Java não permite ponteiros explícitos**. Isso ajuda a prevenir falhas de segurança e bugs de memória.");
                case 7 -> System.out.println("\n**JVM**: Máquina Virtual do Java (executa o código).\n**JRE**: Ambiente de execução do Java.\n**JDK**: Kit de desenvolvimento do Java, inclui compilador e ferramentas.");
                case 8 -> System.out.println("\nJava é **case sensitive**, ou seja: `Nome` e `nome` são considerados variáveis diferentes!");
                case 9 -> System.out.println("\nApesar de novas versões saírem todo ano, o **Java 8** ainda é uma das versões mais usadas no mundo até hoje.");
                case 10 -> System.out.println("\nO mascote oficial do Java se chama **Duke**! Ele foi criado por Joe Palrang, que também trabalhou em animações da DreamWorks.");
                case 0 -> System.out.println("\nSaindo do menu de curiosidades... Até a próxima!");
                default -> System.out.println("\nOpção inválida! Tente novamente.");
            }

        } while (opcao != 0);
    }

    }
