package estatico;

public class Main {
    // static = modificador.
    // Quando um elemento static é criado na memória com uma posição X, todos os objetos dessa classe vai ter a mesma posição na memória

    public static void main(String[] args) {

        Car car = new Car("Meg");
        Car car2 = new Car("Nino");

        System.out.println(Car.numberOfFriends);

    }
}
