// Método é um bloco de código que é executado quando chamado

public class Methods { //Classe chamada Methods
    public //método pode ser acessado de qualquer outra classe
    static
    void //retorno do método, indicando que ele não retorna nenhum valor

    main(String[] args) { //é o ponto de entrada do programa Java. É aqui que o programa começa a ser executado.

        String name = "Raquel";
        int age = 24;

        hello(name, age); // chama o método hello() passando a variável name  e age como argumento.
    // It can be called as many times I want
    }

    // se não retornar valor, usa void e não precisa declarar o tipo
    static void hello(String name, int age) { //Parâmetro do método, que espera receber uma variável do tipo String chamada "name" e int chamad age
        System.out.println("Hello, World! I'm "+ name + " and I'm " + age + " years old.");

    }
}
