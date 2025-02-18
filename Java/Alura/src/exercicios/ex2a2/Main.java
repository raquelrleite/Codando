package exercicios.ex2a2;

public class Main {
    public static void main(String[] args) {

        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setIdade(20);
        pessoa.setName("Raquel");

        pessoa.imprimir();
        pessoa.verificarIdade();

    }
}
