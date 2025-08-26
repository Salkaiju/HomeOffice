public class SalaCuriosidades extends Sala{
    @Override
    public void explorarSala() {
        String curiosidades = """
                O java foi criado em 1995 por James Gosling na Sun Microsystems.
                
                O nome original era Oak (carvalho), mas já existia uma linguagem com esse nome → virou Java, inspirado no café da ilha de Java.
                
                O mascote oficial é o Duke, criado para representar um assistente amigável.
                
                O slogan famoso era: “Write once, run anywhere” (escreva uma vez, rode em qualquer lugar).
                
                Grandes plataformas como Minecraft, Android (na base), e sistemas bancários usam Java intensivamente.
                """;
        setNome("Sala das curiosidades");
        setDescricao("Essa sala fala sobre algumas curiosidades sobre a linguagem Java");
        setAnoDeCriacao(2025);
        System.out.println(getNome());
        System.out.println(getDescricao());
        System.out.println(getAnoDeCriacao());
        System.out.println(curiosidades);
    }
}


//exibe fatos curiosos (ex: por que o nome Java?).