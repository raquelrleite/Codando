import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, media;
        String aproveitamento;

        System.out.println("------------------------------");
        System.out.println("  ESCOLA HIGH SCHOOL MUSICAL  ");
        System.out.println("------------------------------");

        System.out.print("Primeira nota: ");
        n1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        n2 = sc.nextDouble();
        media = (n1 + n2) / 2;
        System.out.printf("Media: %.1f%n", media);

        if (media >= 9) {
            aproveitamento = "A";
        } else if (media >= 8) {
            aproveitamento = "B";
        } else if (media >= 7) {
            aproveitamento = "C";
        } else if (media >= 6) {
            aproveitamento = "D";
        } else  {
            aproveitamento = "E";
        }

        System.out.printf("Aproveitamento: %s", aproveitamento);
    }
}
