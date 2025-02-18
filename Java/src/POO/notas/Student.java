import notas.Nota;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Nota nota = new Nota();
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your name? ");
        nota.name = sc.nextLine();

        System.out.print("Grade 1: ");
        nota.nota1 = sc.nextDouble();

        System.out.print("Grade 2: ");
        nota.nota2 = sc.nextDouble();

        System.out.print("Grade 3: ");
        nota.nota3 = sc.nextDouble();


        System.out.println(nota);

        if (nota.notaFinal() >= 60) {
            System.out.println("PASS!");
        } else {
            System.out.println("FAILED!");
            System.out.printf("MISSING %.2f POINTS.", nota.missingPoints());
        }
    }
}