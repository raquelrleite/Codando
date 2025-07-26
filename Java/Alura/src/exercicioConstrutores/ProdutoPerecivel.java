package exercicioConstrutores;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return
                "Nome: " + getNome() + "\n" +
                "Preço: " + getPreco() + "\n" +
                "Quantidade: " + getQuantidade() + "\n" +
                "Data de Validade: " + dataValidade;
    }
}
