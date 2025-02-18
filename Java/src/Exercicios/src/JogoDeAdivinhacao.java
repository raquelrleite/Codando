import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        /*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("    JOGO DE ADIVINHAÇÃO     ");

        int numeroAleatorio = new Random()/*Cria uma instância*/.nextInt(10); // gera um número aleatório entre 0 e 100
        int tentativa = 5;

        for (int i = 1; i <= tentativa; i++ ) {
            System.out.println();
            System.out.print("Digite um número entre 0 e 10: ");
            int numeroDigitado = sc.nextInt();
            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número em " + i + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else if (numeroDigitado > numeroAleatorio) {
                System.out.println("O número digitado é maior que o número gerado.");
            } else {
                System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroAleatorio);
            }
        }
    }
}

