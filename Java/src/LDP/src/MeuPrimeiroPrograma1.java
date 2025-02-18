import java.util.Locale;

public class MeuPrimeiroPrograma1{ // Nome da classe.
    public static void main(String[] args) { // Declaração de função

        System.out.println("Hello World!"); // LN quebra de linha ao final do texto.

        // DECLARAÇÃO DE VARIÁVEIS
        char sexo ='F'; // Um caracter
        int idade = 17; // Número inteiro
        double altura = 1.72; // Ponto flutuante/decimal
        String nome = "Raquel"; // Texto

        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos. Sou do sexo " + sexo + ", e tenho " + altura + " de altura." );

        int y = 35;
        int x = 97;
        System.out.println(x + y);

        double z = 20.4589;
        Locale.setDefault(Locale.US);
        // Importando a forma de decimal do US, com ponto.
        
        System.out.printf("%.2f \n", z); // printf = saída formatada, serve para chamar a váriavel.
        // %.(quantidade desejada, números depois do ponto)float / %n ou \n = QUEBRA DE LINHA

        // CONCATENAR VÁRIOS ELEMENTOS
        System.out.printf("Resultado = %.1f metros%n", z);
        // Número formatado + metros + quebra de linha + variável Z
        System.out.printf("%s tem %d anos e ganha R$ %.3f", nome, idade, z);
        // Declaração de especificadores de printf e variáveis




    }
}

