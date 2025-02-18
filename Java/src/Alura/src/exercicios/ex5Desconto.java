package exercicios;
public class ex5Desconto {
    public static void main(String[] args) {

        double precoOriginal = 1500;
        double percentualDesconto = 10;
        double desconto = precoOriginal * (percentualDesconto / 100);
        double novoPreco = precoOriginal - desconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);

    }
}