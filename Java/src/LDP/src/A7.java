import java.util.Scanner;

public class A7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i += 2) {
            System.out.println(i);
        }

        // OU

        for (int i=1; i<=x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
