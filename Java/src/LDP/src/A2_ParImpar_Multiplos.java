import java.util.Scanner;

public class A2_ParImpar_Multiplos { // PAR OU ÍMPAR
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("ÍMPAR");
        }

        //////////////////////////////

        int a = sc.nextInt();
        int b = sc.nextInt();
        // MÚLTIPLOS
        if (a % b == 0 || b % a ==0) {
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}
