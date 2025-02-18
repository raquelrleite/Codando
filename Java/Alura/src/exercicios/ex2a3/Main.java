package exercicios.ex2a3;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Iphone 14");
        produto.setPreco(16000);


        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getPreco());
        produto.aplicarDesconto(15);

    }
}
