package array;

import java.util.Scanner;
// Imprimir 5 valores para o usuário, em ordem crescente e decrescente
public class ArraysTreinando {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[5];
        // ou  int[] num = [2,4,8,16];

        /*
        // ORDEM CRESCENTE
        for (int i = 0; i < 5; i++) { // int = 0 pq o array começa com 0
            // i < 5 pq o array termina em 5, da pra usar o nome do array .lenth
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            num[i] = input.nextInt();
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.print(num[j] + " ");
        }
        */

        /*
        // ORDEM DECRESCENTE
        for (int i = num.length -1; i >= 0; i--) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            num[i] = input.nextInt();
        }
        System.out.println();
        for (int j = num.length -1; j >= 0; j--) {
            System.out.print(num[j] + " ");
        }
         */

        //MELHORADO
        num[0] = 25;
        num[1] = 55;
        num[2] = 44;
        num[3] = 420;
        num[4] = 988;

        for (int n : num) {
            System.out.println(n);
        }
    }
}

