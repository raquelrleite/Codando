package vetores;

import java.util.Scanner;

public class Ex7AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

       double media = soma / n;

        System.out.println("MEDIA DO VETOR = " + media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < n; i++) {
            if (vetor[i] < media){
                System.out.println(vetor[i]);
            }

        }
    }
}
