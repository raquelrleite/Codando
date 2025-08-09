package linkedlist;

import java.util.LinkedList;

public class ListaLigada {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Jesus"); // Vai na ordem
        list.add("Raquel");

        list.push("Fernandinho"); // Push começa debaixo pra cima, tudo o que colocar por último, vai primeiro
        list.addLast("Paula"); // Coloca em último
        list.addFirst("Nivea"); // Coloca em 1º
        //list.pop(); // Remove o último
        list.offer("Gabriela"); //Vai ainda depois do last
       // list.poll(); //Remove o primeiro
        list.add(2,"Cacau");
        list.remove("Cacau"); // ou 2
      System.out.println(list);

    }
}
