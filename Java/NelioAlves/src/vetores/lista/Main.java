package vetores.lista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> food = new ArrayList<>(); //Não aceita tipos primitivos, só referência

        //Adicionar valores
        food.add("Pizza");
        food.add("Parmegiana");
        food.add("Chocolate");

        food.set(0, "Morango"); // Substui Pizza por Morango
        food.remove(2); // Remove Chocolate
        food.clear(); // Limpa a List

        for (String x : food){ // Imprime
            System.out.println(x);
        }
    }

}
