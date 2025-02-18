package vetores;

import java.util.Scanner;

public class Ex9MaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pessoas você irá digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[n];
        int[] idade = new int[n];

        int maioridade;
        String nomeVelho;


        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1)+ "º pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();
            }

        maioridade = idade[0];
        nomeVelho = nome[0];


        for (int i = 0; i < n ; i++) {
            if (idade[i] > maioridade){
                maioridade = idade[i];
                nomeVelho = nome[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomeVelho);
        }
}
