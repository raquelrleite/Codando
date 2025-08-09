package instanceOf;

public class Moto extends Veiculo{

    public void acelerar(){
        System.out.println("Acelerar");
    }

    public void empinar(){
        System.out.println("VRUMMM VRUMM ZUZUZUU");
    }
    @Override
    public void mover() {
        System.out.println("Moto correndo");
    }
}