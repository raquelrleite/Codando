import java.util.Scanner;

public class WhileImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;

        System.out.print("Digite um número: ");
        int numero = input.nextInt();


        while (i < numero){
            if (i % 2 != 0)
                System.out.println(i);
                i += 1;
        }
    }
}
