package composition;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Corolla", 2024, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);
    }
}
