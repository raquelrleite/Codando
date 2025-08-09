package testandoConhecimento.bloco1.ex3;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.depositar(150);
        System.out.println();
        conta1.saldoAtual();
        System.out.println();
        conta1.sacar(50);
        System.out.println();
        conta1.depositar(400);
        System.out.println();
        conta1.saldoAtual();
        System.out.println();
        conta1.sacar(200);



    }
}
