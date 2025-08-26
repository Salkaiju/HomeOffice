import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Visitante visitante = new Visitante();
        SalaFundadores fundadores = new SalaFundadores();
        SalaVersoes versoes = new SalaVersoes();
        SalaCuriosidades curiosidades = new SalaCuriosidades();
        visitante.dadosVisitantes();
        while (true) {
            System.out.println("Qual sala bocê quer visitar, " + visitante.getNome() + "?");
            System.out.println("1- Sala dos fundadores");
            System.out.println("2- Sala das principais versões do java");
            System.out.println("3- Sala das curiosidades");
            System.out.println("4- Sair");
            int escolha = scan.nextInt();
            if (escolha == 1) {
                fundadores.explorarSala();
            } else if (escolha == 2) {
                versoes.explorarSala();
            } else if (escolha == 3) {
                curiosidades.explorarSala();
            } else {
                System.out.println("Volte sempre");
                break;
            }
        }
    }
}