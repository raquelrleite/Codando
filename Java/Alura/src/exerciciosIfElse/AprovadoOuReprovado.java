package exerciciosIfElse;

import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double media = 0;

        System.out.println("Digite suas notas para descobrir a média.\n");
        System.out.print("1ª Nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("2ª Nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("3ª Nota: ");
        double nota3 = sc.nextDouble();

        soma = nota1 + nota2 + nota3;
        media = soma / 3;

       if(media >= 7.0){
            System.out.printf("O estudante teve média %.1f e foi aprovado.", media);
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.printf("O estudante teve média %.1f e está de recuperação.", media);
        } else {
            System.out.printf("O estudante teve média %.1f e foi reprovado.", media);
        }
    }
}
