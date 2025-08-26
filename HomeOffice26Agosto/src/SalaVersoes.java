public class SalaVersoes extends Sala{
    @Override
    public void explorarSala() {
        String versoes= """
                Java 1.0 (1996) → Primeira versão oficial. Foco em portabilidade ("Write once, run anywhere").
                
                Java 5 (2004) → Grande atualização. Introduziu generics, annotations, enum, varargs e o loop for-each.
                
                Java 8 (2014) → Revolução moderna. Adicionou lambda expressions, Streams API, Optional, Date/Time API (java.time).
                
                Java 17 (2021, LTS) → Versão de suporte de longo prazo. Trouxe sealed classes, pattern matching, melhorias em switch, e removendo recursos obsoletos.
                """;
    setNome("Sala das versões");
    setDescricao("Essa sala mostra um pouco sobre as principais versões da linguagem java");
    setAnoDeCriacao(2025);
        System.out.println(getNome());
        System.out.println(getDescricao());
        System.out.println(getAnoDeCriacao());
        System.out.println(versoes);
    }
}


//mostra as principais versões do Java (Java 1.0, 5, 8, 17...).