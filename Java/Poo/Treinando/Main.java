package Treinando;

public class Main {
    public static void main(String[] args) {

        Tvs tvs = new Tvs("LG", 50, 10.500);

        System.out.println("Marca: " + tvs.marca + "\nPolegadas: " + tvs.polegadas);

        tvs.ligar();
        tvs.desligar();

    }
}
