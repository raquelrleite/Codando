package screenmatch.principal;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

    Filme oPoderosoChefao = new Filme("O poderoso Chefão",1970,180, true );
    oPoderosoChefao.avalia(7);

    Filme twilight = new Filme("Twilight", 2010, 220, true);
    twilight.avalia(8);

    Serie lost = new Serie("Lost",2000, 6000, 10, 8, false, 48, true);
    lost.avalia(7);

    Serie aliceInBoderland = new Serie("Alice in Boderland",2016, 610, 3, 8, true, 60, true);
    aliceInBoderland.avalia(10);

    ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(twilight);
        listaDeAssistidos.add(oPoderosoChefao);
        listaDeAssistidos.add(lost);
        listaDeAssistidos.add(aliceInBoderland);

        //Para cada item que esta dentro da listaDeAssistidos (lista do tipo Titulo) ... imprima o item
        for (Titulo item: listaDeAssistidos) {
            System.out.println(item.getNome());
            //Deu erro pq tem AliceInBorderland que não é um filme, então preciso usar instanceof
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
                System.out.println();
                /*
                O que está acontecendo aqui:
                item instanceof Filme → isso pergunta:

                "Esse item é um filme?"

                Se sim, então a variável filme é criada automaticamente, e você pode usar coisas específicas de filme, como getClassificacao().

                Por que precisa desse instanceof?
                Porque nem todo item da lista é um filme — pode ser uma série! E se você tentar chamar um método que só existe em filmes, vai dar erro. Então você checa antes.
                (Repare que Lost e Alice não têm classificação, porque são séries.)

                */
            }

        }
    }
}
