package instanceOf;

public class Carro extends instanceOf.Veiculo {


    public void abrirPorta(){
        System.out.println("Abrir porta");
    }

    @Override
    public void mover() {
        System.out.println("Carro andando");
    }
}