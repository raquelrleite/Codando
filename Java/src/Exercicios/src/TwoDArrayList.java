import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        // 2D ArrayList is a dynamic list of list. Is a list of separate lists

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>(); // criando listas de String

        // Adicionando algumas listas de strings à lista principal
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("bread loaf");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("flour");
        produceList.add("sugar");
        produceList.add("salt");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("water");
        drinkList.add("mango juice");
        drinkList.add("coke");


        // Adicionando as listas na lista principal
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList); // Imprime todas as listas em ordem

        System.out.println(groceryList.get(2)); // Imprime só a lista 3
                                    //lista   //coluna
        System.out.println(groceryList.get(0).get(2)); // Imprime só o item 3 da lista 1


        //        for (int i = 0; i < produceList.size(); i++) {
        //            System.out.println(produceList.get(i));
        //        }
        //        System.out.println();
        //        for (int i = 0; i < bakeryList.size(); i++) {
        //            System.out.println(bakeryList.get(i));
        //        }
        //        System.out.println();
        //        for (int i = 0; i < drinkList.size(); i++) {
        //            System.out.println(drinkList.get(i));
        //        }
    }
}
