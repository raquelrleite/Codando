package exercicios;

import java.util.Scanner;

public class positivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if(numero > 0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}
