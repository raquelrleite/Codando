package exercicios;

import java.util.Random;
import java.util.Scanner;
public class jogoAdvinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroGerado = new Random().nextInt(10);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 10: ");
            tentativas++;
            numeroDigitado = sc.nextInt();
            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou!");
                break;
            } else {
                System.out.println("Que pena, não foi dessa vez.");
            }
        }
        System.out.println("O número gerado era: " + numeroGerado);
    }
}
