package exercicios;

import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("par");
        } else{
            System.out.println("impar");
        }
    }
}
