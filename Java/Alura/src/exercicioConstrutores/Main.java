package exercicioConstrutores;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produto cremeFacial = new Produto("Creme Facial", 38.50, 2);
        Produto batom = new Produto("Batom vermelho", 24.99, 5);
        Produto esmalte = new Produto("Kit de esmaltes", 128.99, 30);

        ArrayList<Produto> listaDeObjetos = new ArrayList<>();

        listaDeObjetos.add(cremeFacial);
        listaDeObjetos.add(batom);
        listaDeObjetos.add(esmalte);

        System.out.println("Tamanho da lista de objetos: " + listaDeObjetos.size());

        System.out.println(listaDeObjetos.get(1));
        System.out.println(listaDeObjetos);

        System.out.println();

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite",4.99, 2, "15/08/2025" );
        System.out.println(produtoPerecivel);
    }
}
