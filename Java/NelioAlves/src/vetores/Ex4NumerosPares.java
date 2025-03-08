package vetores;

import java.util.Scanner;

public class Ex4NumerosPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] numero = new int[n];
        int contador = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numero[i] = sc.nextInt();

        }

        System.out.println("Numeros pares: ");

        for (int i = 0; i < n; i++) {
            if (numero[i] % 2 == 0){
                contador++;
                System.out.print(numero[i] + " ");
            }
        }

        System.out.println("\nQuantidade de pares: " + contador);
    }
}
