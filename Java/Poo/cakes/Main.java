package cakes;
public class Main {
    public static void main(String[] args) {

    // Começar com o nome da outra classe
    // Criar um nome único para a instância de classe, mou pode manter o mesmo
    // Nome da outra classe de novo.
    Cake cake = new Cake();

    // Nome da classe + o atributo que quer imprimir
        System.out.println(cake.flavor);
        System.out.println(cake.filling);
        System.out.println(cake.top);

        // Chamar os métodos
        cake.turnOn();
        cake.bake();
        cake.turnOff();
    }
}
