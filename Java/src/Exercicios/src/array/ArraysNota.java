package array;

import java.util.Scanner;

public class ArraysNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notas = new double[4]; //4 posições

        System.out.println("Digite a 1º nota: ");
        notas[0] = input.nextDouble();
        System.out.println("Digite a 2º nota: ");
        notas[1] = input.nextDouble();
        System.out.println("Digite a 3º nota: ");
        notas[2] = input.nextDouble();
        System.out.println("Digite a 4º nota: ");
        notas[3] = input.nextDouble();

        double soma = notas[0] + notas[1] + notas[2] + notas[3];
        double media = soma / 4;

        System.out.println("Sua média é: "+ media);


    }
}
