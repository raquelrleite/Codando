package vetores;

import java.util.Scanner;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 - Imprimir todos os elementos do vetor
 - Mostrar na tela a soma e a média dos elementos do vetor */

public class Ex2SomaVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int n = sc.nextInt();

        double soma = 0;
        double media;

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("Valores = ");

        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
            soma += vetor[i];
        }
            media = soma / n;
        System.out.println();
        System.out.println("Soma = " + soma);
        System.out.println("Média = " + media);

        sc.close();
    }
}
