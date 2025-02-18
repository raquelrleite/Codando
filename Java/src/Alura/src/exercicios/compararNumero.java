package exercicios;

import java.util.Scanner;

public class compararNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = sc.nextInt();

        if (numero1 == numero2){
            System.out.println("Números iguais");
        }else if (numero1 > numero2){
            System.out.printf("%d é maior", numero1);
        } else{
            System.out.printf("%d é maior", numero2);
        }
    }
}
