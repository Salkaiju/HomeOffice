public class SalaFundadores extends Sala {
    @Override
    public void explorarSala() {
        String fundadores = """
                James Gosling é um cientista da computação canadense, conhecido como o "pai da linguagem Java".
                 Ele criou o Java em meados da década de 1990 enquanto trabalhava na Sun Microsystems, uma empresa 
                 de tecnologia americana fundada em 1982.
                
                A Sun foi muito importante no mercado de servidores, sistemas Unix (Solaris), estações de trabalho 
                e principalmente por lançar o Java, que se tornou uma das linguagens mais usadas do mundo. Em 2010, 
                a Sun foi comprada pela Oracle Corporation.
                """;
        setNome("Sala dos fundadores");
        setDescricao("Essa sala conta um pouco sobre os criadores da linguagem Java.");
        setAnoDeCriacao(2025);
        System.out.println(getNome());
        System.out.println(getDescricao());
        System.out.println(getAnoDeCriacao());
        System.out.println(fundadores);
    }
}




//fala sobre James Gosling e Sun Microsystems.