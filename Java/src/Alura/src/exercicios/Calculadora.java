package exercicios;

import java.util.Scanner;

//Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
public class Calculadora {

    void calculaDobro(int numero) {
        int resultado = numero * 2;
        System.out.println("O dobro de " + numero + " é: "+ resultado);

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite um número para descobrir o dobro: ");
        int numero = sc.nextInt();
        calc.calculaDobro(numero);
    }
}
