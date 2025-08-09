package instanceOf;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro());
        veiculos.add(new Carro());
        veiculos.add(new Moto());
        veiculos.add(new Moto());

        Veiculo veiculo = new Carro(); // Upcasting de Carro
        Veiculo veiculo2 = new Moto(); //Upcasting de Moto

       for(Veiculo ve : veiculos) {
           ve.mover();

       }
        System.out.println();

       // Usar INSTANCEOF se for MAIS de um tipo de downcasting, se tivesse apenas um veículo, o downcasting seria desse jeito.

        Moto moto = (Moto) veiculo2; // Downcasting de Moto
        moto.acelerar();

        System.out.println();

       if (veiculo instanceof Carro carro) {
           carro.abrirPorta();
       } else if (veiculo instanceof Moto moto1) {
           moto1.empinar();
       }
    }

}
