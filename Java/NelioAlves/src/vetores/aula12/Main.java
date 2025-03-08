package vetores.aula12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        Quarto[] quarto = new Quarto[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            System.out.println();

            quarto[room] = new Quarto(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (quarto[i] != null) {
                System.out.println(quarto[i].room + ": " + quarto[i].name + ", " + quarto[i].email);
            }
        }

        sc.close();
    }
}
