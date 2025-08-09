package testandoConhecimento.bloco1.ex2;

public class Produto {
    String nome;
    double valor;
    double valorFinal;


    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    double desconto(){
        double desconto = valor * 0.10;
        return valorFinal = valor - desconto;

    }
}
