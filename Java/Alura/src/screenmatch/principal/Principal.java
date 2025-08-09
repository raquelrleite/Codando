package screenmatch.principal;

import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {

        Filme oPoderosoChefao = new Filme("O poderoso Chefão",1970,180, true );
        System.out.println(oPoderosoChefao);

        /*oPoderosoChefao.setNome("O poderoso Chefão");
        oPoderosoChefao.setAnoDeLancamento(1970);
        oPoderosoChefao.setDuracaoEmMinutos(180);
        oPoderosoChefao.exibeFichaTecnica();*/

        oPoderosoChefao.avalia(8);
        oPoderosoChefao.avalia(5);
        oPoderosoChefao.avalia(10);
        //        System.out.println("Total de avaliações: " + oPoderosoChefao.getTotalDeAvaliacoes());

        //        System.out.println(oPoderosoChefao.pegaMedia());

        System.out.println();

        Serie lost = new Serie("Lost",2000, 6000, 10, 8, false, 48, true);
        System.out.println(lost);

        System.out.println();

        Filme twilight = new Filme("Twilight", 1800, 220, true);
        //        twilight.exibeFichaTecnica();
        System.out.println(twilight);

        System.out.println();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(oPoderosoChefao);
        calculadora.inclui(twilight);
        calculadora.inclui(lost);

        System.out.printf("Tempo para maratonar: %d minutos.", calculadora.getTempoTotal());
        System.out.println("\n");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(oPoderosoChefao);
        System.out.println();

        Episodio episodio = new Episodio();
        episodio.setNome("Piloto");
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(457);

        FiltroRecomendacao filtro1 = new FiltroRecomendacao();
        filtro1.filtra(episodio);

        System.out.println();

        Serie aliceInBoderland = new Serie("Alice in Boderland",2016, 610, 3, 8, true, 60, true);
        aliceInBoderland.avalia(9.2);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(twilight);
        listaDeFilmes.add(oPoderosoChefao);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("1º filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println("/////");
        System.out.println("Lista de filmes: " + listaDeFilmes); // Funcionou por conta do ToString, imprime normal
        System.out.println("/////");
        System.out.println();

        Collections.sort(listaDeFilmes);

        System.out.println("Ordenando de A-Z: " + listaDeFilmes);
        System.out.println();
        listaDeFilmes.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Ordenando por ano: " + listaDeFilmes);
        System.out.println();
    }
}
