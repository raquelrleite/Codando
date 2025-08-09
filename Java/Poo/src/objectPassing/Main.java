package objectPassing;
//Pass arguments into objects

public class  Main {
    public static void main(String[] args) {

        //Send some cars to garage
        // criar instancias
        Garage garage = new Garage();
        Car car = new Car("BMW");
        Car car2 = new Car("Volvo");

        garage.park(car2);
    }
}
