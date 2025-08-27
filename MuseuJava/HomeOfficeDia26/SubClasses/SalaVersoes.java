package HomeOfficeDia26.SubClasses;

import HomeOfficeDia26.Sala;

public class SalaVersoes extends Sala {

    @Override
    public void exibirConteudo() {
        System.out.println("Seja bem-vindo(a) à " + getNome());
        System.out.println(getDescricao());
        System.out.println("Ano de criação: " + getAnoCiacao());
        System.out.println("""
                As versões do Java mais relevantes são as versões LTS (Long Term Support), que recebem suporte por mais 
                tempo e são recomendadas para uso em projetos sérios, como a Java 8, Java 11, Java 17 e a mais recente, 
                Java 21. Existem também versões não LTS lançadas a cada seis meses, como as versões 18 a 24, que têm suporte 
                mais curto e não são indicadas para projetos com ciclo de vida longo.
                """);
    }
}
