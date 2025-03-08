package arrayOfObjects;

public class Main {
    public static void main(String[] args) {
        // Declarar os arrays
        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];

        // Digita o nome da classe + dar um nome pro array

        // TIRA ESSE **
        Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("Hot Dog");

        /* E COLOCA ESSE **
        Food[] refrigerator = {food1, food2, food3};
         */
        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        System.out.println(refrigerator[1].name);

    }
}
