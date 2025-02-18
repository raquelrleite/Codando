import java.util.Scanner;

public class A8_ParImpar_Multiplos {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;
        char resposta;

        do {
            System.out.println("Você vai digitar a temperatura em qual escala? (C/F)");
            char unidade = sc.next().charAt(0);
            if (unidade == 'F') {
                System.out.println("Digite a temperatura em Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.printf("Temperatura equivalente em Celsius: %.1f%n", celsius);
            } else {
                System.out.println("Digite a temperatura em Celsius: ");
                celsius = sc.nextDouble();
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("Temperatura equivalente em Fahrenheit: %.1f%n", fahrenheit);
            }

            System.out.println("Deseja repetir? (S/N)");
            resposta = sc.next().charAt(0);
        } while (resposta == 'S');
        sc.close();

        ///////////////////////////////////////////////////////////////////////////

        System.out.println("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("Higher: " + n1);
        }
        else if (n2 > n3 && n2 > n1) {
            System.out.println("Higher: " + n2);
        }
        else {
            System.out.println("Higher: " + n3);
        }
    }
}

