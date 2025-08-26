package HomeOfficeDia26.SubClasses;

import HomeOfficeDia26.Sala;

public class SalaCuriosidades extends Sala {

    @Override
    public void exibirConteudo() {
        System.out.println("Seja bem-vindo(a) à " + getNome());
        System.out.println(getDescricao());
        System.out.println("Esta sala foi criada no ano de " + getAnoCiacao());
        System.out.println("""
                Por que seu nome é Java?
                O nome "Java" foi escolhido em referência ao café da ilha de Java, na Indonésia, que era o tipo de café 
                que a equipe de desenvolvimento consumia muito durante o processo de criação da linguagem. A ideia original 
                era usar o nome "Oak" (Carvalho), mas esse nome já era propriedade de outra empresa, então a equipe buscou 
                uma nova inspiração no nome da bebida que tanto os acompanhava.
                """);
    }
}
