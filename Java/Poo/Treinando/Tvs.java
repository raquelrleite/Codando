package Treinando;

//FAZER ESTE PRIMEIRO

public class Tvs {

    String marca;
    int polegadas;
    double peso;

    Tvs(String marca, int polegadas, double peso){
        this.marca = marca;
        this.polegadas = polegadas;
        this.peso = peso;
    }

    void ligar(){
        System.out.println("Ligar TV");
    }

    void desligar(){
        System.out.println("Desligar TV");
    }

}

