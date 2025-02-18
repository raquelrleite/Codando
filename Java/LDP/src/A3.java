import java.util.Scanner;

public class A3 {
    public static void main(String[] args) { // MENU LANCHONETE
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int qtd = sc.nextInt();
        double total;

        if (code == 1) {
            total = qtd * 4.0;
        }
        else if (code == 2) {
            total = qtd * 4.5;
        }
        else if (code == 3) {
            total = qtd * 5.0;
        }
        else if (code == 4) {
            total = qtd * 2.0;
        }
        else {
            total = qtd * 1.5;
        }

        System.out.printf("Total: R$ %.2f", total);
        sc.close();
    }
}
