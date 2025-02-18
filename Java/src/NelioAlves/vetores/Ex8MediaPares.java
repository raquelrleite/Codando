package vetores;

import java.util.Scanner;

public class Ex8MediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.print("Quantos elementos terá o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0){
                contador++;
                soma += vetor[i];
            }
        }

        double media = soma / contador;

        if(contador > 0){
            System.out.println("MEDIA DOS PARES = " + media);
        } else{
            System.out.println("NENHUM NÚMERO PAR");
        }

        sc.close();
    }
}
