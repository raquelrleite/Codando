package exercicios.ex2a1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setConta(40028922);
        conta.setSaldo(4500);
        conta.titular = "Raquel R Leite";

        System.out.println("Número da Conta: "+ conta.getConta());
        System.out.println("Títular: "+ conta.titular);
        System.out.println("Saldo: "+ conta.getSaldo());

        conta.setSaldo(20000);

        System.out.println("Novo saldo: "+ conta.getSaldo());

    }
}
