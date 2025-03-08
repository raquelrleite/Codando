package cakes;

public class Cake {

    String flavor = "Chocolate";
    String filling = "Prestígio";
    String top = "Brigadeiro";
    int weight = 2;
    double price = 199.99;

    void turnOn(){
        System.out.println("Oven ON");
    }

    void bake(){
        System.out.println("You're baking the cake. Hmm... I can already smell it!");
    }

    void turnOff(){
        System.out.println("Oven OFF");
    }
}
