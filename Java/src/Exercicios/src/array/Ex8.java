package array;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha, coluna;

        System.out.println("Quantas linhas terá a matriz? ");
        linha = sc.nextInt();
        System.out.println("Quantas colunas terá a matriz? ");
        coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++){
            int[]linhas = matriz[i];
            for (int j = 0; j < coluna; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
               linhas[j] = sc.nextInt();
            }
        }

        System.out.println("Matriz digitada: ");
        for (int[] linhas : matriz) {
            for (int valor : linhas) {
                System.out.print(valor + " ");
            }
        }
    }
}
