package exercicios;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Tabela do "+  numero + ":");
        for (int i = 1; i <= 10; i++) {
            int multiplicar = numero * i;
            System.out.println(numero + " * " + i + " = " + multiplicar);
        }
    }
}
