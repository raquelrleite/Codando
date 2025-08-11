package listSetMap.contaBancaria;

public class Conta {
    private String numeroDaConta;
    private String titularDaConta;
    protected double saldo;

    public Conta(String numeroDaConta, String titularDaConta, double valor) {
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
        this.saldo = valor;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Valor depositado: " + valor);
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    // Agora o sacar retorna boolean para indicar sucesso ou falha
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque");
            return false;
        } else if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Valor sacado: " + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {  // tenta sacar da conta atual
            destino.depositar(valor); // deposita na conta destino
            return true; // sucesso
        }
        return false; // saldo insuficiente ou valor inválido
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitularDaConta() {
        return titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
