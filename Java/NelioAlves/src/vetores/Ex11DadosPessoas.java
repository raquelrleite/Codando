package vetores;

import java.util.Scanner;

public class Ex11DadosPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double alturaMulheres;
        int qtdMulheres = 0;
        int qtdHomens = 0;

        System.out.print("Quantos pessoas serão digitados? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];



        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i+1) + "º pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.print("Genêro da " + (i+1) + "º pessoa: ");
            genero[i] = sc.next().charAt(0);

            if (genero[i] == 'F') {
                soma = altura[i];
                qtdMulheres++;
                soma += altura[i];
            } else {
                qtdHomens++;
            }
        }

        double menorAltura = altura[0];
        double maiorAltura = altura[0];


        for (int i = 0; i < n; i++) {
            if (altura[i] < menorAltura){
                menorAltura = altura[i];
            }
            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
        }

        alturaMulheres = soma / qtdMulheres;


        System.out.println("Menor altura = " + menorAltura);

        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f", alturaMulheres);
        System.out.println("Número de homens = " + qtdHomens);
    }
}
