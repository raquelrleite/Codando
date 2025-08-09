package screenmatch.principal;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

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

        for (Titulo item: listaDeAssistidos) {
            System.out.println(item.getNome());
            //Deu erro pq tem AliceInBorderland que não é um filme, então preciso usar instanceof
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
                System.out.println();

            }
        }
    }
}
