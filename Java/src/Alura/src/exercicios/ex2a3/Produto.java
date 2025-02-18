package exercicios.ex2a3;

/*Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.*/

public class Produto {
    private String nome;
    private double preco;


    public void aplicarDesconto(double percentual){
        double precoComDesconto = preco * (1 - percentual /100);
        System.out.println("Preço com desconto: " + precoComDesconto);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
