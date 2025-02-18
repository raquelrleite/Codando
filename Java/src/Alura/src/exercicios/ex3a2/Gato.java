package exercicios.ex3a2;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau, miau!!");
    }

    public void arranharMoveis(){
        System.out.println("Anhando os móveis");
    }
}
