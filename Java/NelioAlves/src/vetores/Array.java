package exercise;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;


        System.out.print("Digite a quantidade de produtos: ");
        int n = sc.nextInt();

        double[] valores = new double[n];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Nome do produto: ");
            sc.next();
            String nome = sc.nextLine();
            System.out.print("Digite o valor: ");
            valores[i] = sc.nextDouble();
        }


        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        double media = soma / n;
        System.out.printf("Média de valores: %.3f", media);
    }
}

