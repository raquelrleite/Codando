package exercise;

import java.util.Scanner;

public class ArrayUnidimensional_Altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;


        System.out.print("Digite um número: ");
        int n = sc.nextInt();

       double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura " + (i+1) + ": ");
            alturas[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            soma += alturas[i];
        }
        double media = soma / n;
        System.out.printf("Média de altura: %.2f", media);
    }
}
