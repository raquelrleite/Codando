package vetores;

import java.util.Scanner;

public class Ex5MaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double maiorValor;
        int posicaoMaiorValor;

        double[] valor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            valor[i] = sc.nextInt();
        }

        maiorValor = valor[0];
        posicaoMaiorValor = 0;

        for (int i = 0; i <n; i++) {
            if (valor[i] > maiorValor){
                maiorValor = valor[i];
                posicaoMaiorValor = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f\n", maiorValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicaoMaiorValor);

        sc.close();


    }
}
