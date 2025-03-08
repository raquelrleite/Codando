package vetores;

/* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

import java.util.Scanner;

public class Ex1Negativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();


        while (quantidade > 10){
            System.out.println("Digite um número até 10.");
            System.out.println();
            System.out.print("Digite a quantidade: ");
            quantidade = sc.nextInt();
        }

        int[] numeros = new int[quantidade];

        System.out.println();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("Números negativos:");

        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }

        sc.close();

    }
}
