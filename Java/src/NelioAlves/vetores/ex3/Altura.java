package vetores.ex3;

import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            pessoa[i] = new Pessoa(nome, idade, altura);

            soma += altura;

            if (pessoa[i].idade < 16) {
                contador++;
            }
        }

        double media = soma / n;

        double porcentagem = ((double) contador / n) * 100;

        System.out.printf("Altura média: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.0f%%\n", porcentagem);

        for (int i = 0; i < n; i++) {
            if (pessoa[i].idade < 16) {
                System.out.println(pessoa[i].nome);
            }
        }

        sc.close();


    }
}
