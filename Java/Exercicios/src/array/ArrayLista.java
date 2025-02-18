package array;

import java.util.ArrayList;

public class ArrayLista {
    // Resizable array
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>(); // Cria lista de String

        // Adiciona valor a lista
        food.add("Pizza");
        food.add("Chocolate");
        food.add("Bolo");

        // food.set(1, "Brigadeiro"); // Muda valor pra 1
        // food.remove(2); // Remove valor 2
        // food.clear(); // Limpa tudo

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i)); //Acessa elemento i
        }
    }
}






