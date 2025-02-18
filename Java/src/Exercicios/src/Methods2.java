public class Methods2 {
    public static void main(String[] args) {

        int resultado = soma(5, 3); // Chamando o método soma e armazenando o resultado
        System.out.println("O resultado da soma é: " + resultado);
    }


    // se for retornar valor, não precisa usar void, mas precisa declarar o tipo do valor. ex: int soma
    static int soma(int a, int b) { //Criando o método e armazenando argumentos
        int soma = a + b;
        return soma; // Retorna o resultado da soma
    }
}

