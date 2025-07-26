package exercicioInstanceOf;

import java.util.ArrayList;

public class ArrayLista {
    public static void main(String[] args) {
        ArrayList<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Java");
        listaDeStrings.add("Python");
        listaDeStrings.add("C#");

        for(String item : listaDeStrings){
            System.out.println(item);
        }
    }
}