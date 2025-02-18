import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        // WHILE se usa, quando não se sabe previamente a quantidade de repetições que será realizada.
        // Repete o bloco de comandos, enquanto uma condição for verdadeira

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
           x = sc.nextInt();

        }

        System.out.println(soma);


        ///////////

        int senha  = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Access Denied!");
            senha = sc.nextInt();
        }
        System.out.println("Granted Access!");

        sc.close();
    }
}
