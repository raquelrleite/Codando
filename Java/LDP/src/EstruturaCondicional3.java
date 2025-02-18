import java.util.Scanner;

public class EstruturaCondicional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* int x = sc.nextInt();

        if (x == 8) {
            System.out.println("Bom dia!");
        }
        if (x == 14) {
            System.out.println("Boa tarde!");
        }
        if (x == 20) {
            System.out.println("Boa noite!");
        }
        else {
            System.out.println("Hora inválida! Tente novamente mais tarde.");
        }

        sc.close(); */

        System.out.println("Que horas são agora?");
        int hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else if ( hora < 18) {
            System.out.println("Boa tarde!");
            }
        else {
            System.out.println("Boa noite!");
            }
        }
    }
