package vetores;

import java.util.Scanner;

public class Ex5MaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] valor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            valor[i] = sc.nextInt();
        }
    }
}
