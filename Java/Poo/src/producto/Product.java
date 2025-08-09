package producto;

// A classe Product representa um produto com atributos básicos como nome, preço e quantidade.
public class Product {

    // Variáveis de instância para armazenar o nome, preço e quantidade do produto
    public String name;
    public double price;
    public int quantity;

    // Calcula e retorna o valor total do produto em estoque.

    public double TotalValueInStock() {

        return price * quantity;
    }

    // Adiciona uma quantidade especificada do produto ao estoque atual.
    public void AddProducts(int quantity) {

        this.quantity += quantity;
    }

    // Remove uma quantidade especificada do produto do estoque atual.
    public void RemoveProducts(int quantity) {

        this.quantity -= quantity;
    }

    /* Ele é chamado implicitamente quando você tenta converter um objeto da classe
    Product para uma representação de string. Este método retorna uma string que
    representa o estado atual do objeto.*/

    public String toString() {
        return name
                + ", R$ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " unidades. Total: R$"
                + String.format("%.2f", TotalValueInStock());
    }
}
