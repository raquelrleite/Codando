package classesAbstratas;

public class Fusca extends Carro implements CoisasDeCarro {

    @Override
    public void correr(){
        System.out.println("O fusca está correndo.");
    }

    @Override
    public void acelerar() {
        System.out.println("Fusca acelerando.");
    }
}
