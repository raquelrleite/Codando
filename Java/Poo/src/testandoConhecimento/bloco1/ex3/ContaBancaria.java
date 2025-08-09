package testandoConhecimento.bloco1.ex3;

public class ContaBancaria {
    double saldoAtual = 0;
    double valor = 0;


    void sacar(double valor){
        if (valor > saldoAtual){
            System.out.println("Saldo insuficiente.");
        } else{
            System.out.println("Valor sacado: R$ " + valor);
            System.out.println("Saldo atual: R$ " + (saldoAtual -= valor));
            System.out.println("Saldo anterior: " + (saldoAtual + valor));
        }
    }

   void depositar(double valor){
        System.out.println("Valor depositado: R$ " + valor);
        saldoAtual += valor;
}
   double saldoAtual(){
       System.out.println("Saldo atual: R$ " + saldoAtual);
        return saldoAtual;

    }

}
