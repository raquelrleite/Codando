import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2;

        do {
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            int divisao = n1/ n2;
            if (divisao % 2 == 0){
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
        }
        while(n1 != 0 && n2 != 0);
    }
}
