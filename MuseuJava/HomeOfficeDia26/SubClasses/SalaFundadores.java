package HomeOfficeDia26.SubClasses;

import HomeOfficeDia26.Sala;

public class SalaFundadores extends Sala {
    @Override
    public void exibirConteudo() {
        System.out.println("Seja bem-vindo(a) à " + getNome());
        System.out.println(getDescricao());
        System.out.println("Esta sala foi criada no ano de " + getAnoCiacao());
        System.out.println("""
    Os fundadores da linguagem Java são James Gosling, Patrick Naughton, e Mike Sheridan, que faziam parte da equipa 
    "Green Team" da Sun Microsystems. O projeto, iniciado em 1991, visava criar uma nova tecnologia para dispositivos 
    eletrónicos, mas o desenvolvimento da linguagem de programação que se tornaria o Java foi a consequência mais importante.
    """);
    }
}
