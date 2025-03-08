package vetores.ex10;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        double media;

        Aluno[] aluno = new Aluno[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "º aluno: ");
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            sc.nextLine();

            aluno[i] = new Aluno(nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            media = (aluno[i].nota1 + aluno[i].nota2) / 2;
            if (media >= 6.0){
                System.out.println(aluno[i].nome);
            }
        }
        sc.close();
    }
}
