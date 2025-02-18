package exercicios;

import java.util.Scanner;
public class ex1Celsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha o tipo de conversão ('C' para Celsius e 'F' para Fahrenheit): ");

        String tipo = sc.next();

        if (tipo.equalsIgnoreCase("C")){
            System.out.print("Temperatura: ");
            int celsius = sc.nextInt();
            System.out.print("A temperatura em Fahrenheit é: ");
            int conversao = (int) ((celsius * 1.8) + 32);
            System.out.print(conversao);

        } else if (tipo.equalsIgnoreCase("F")){
            System.out.print("Temperatura: ");
            int fahrenheit = sc.nextInt();
            System.out.print("A temperatura em Celsius: ");
            int conversao = (int) ((fahrenheit -32) *5/9);
            System.out.print(conversao);

        } else {
            System.out.println("Valor inválido.");
        }

        sc.close();
    }
}
