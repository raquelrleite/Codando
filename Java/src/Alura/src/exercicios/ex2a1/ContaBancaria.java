package exercicios.ex2a1;

/*Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.*/

public class ContaBancaria {
    private int conta;
    private double saldo;
    public String titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
}
