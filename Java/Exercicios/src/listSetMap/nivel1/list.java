package listSetMap.nivel1;

/*1. List — Armazenar e acessar elementos

Crie uma List<String> chamada nomes e adicione os nomes "Ana", "Bruno", "Carla", "Daniel".

Imprima o primeiro e o último nome da lista.

Depois, substitua o nome "Carla" por "Carlos".*/

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Daniel");

        System.out.println(nomes.get(0)+ " e " + nomes.get(3));

        System.out.println("//////////");

        int posicao = nomes.indexOf("Carla");  // Procura o índice da Carla na lista

        if (posicao != -1) {                   // Se encontrou (índice diferente de -1)
            nomes.set(posicao, "Carlos");      // Substitui na posição encontrada
        }



        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
