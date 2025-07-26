package exerciciosForWhile;

import java.util.Scanner;

public class ContadorDeDegraus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i < 6; i++) {
            System.out.println("Subindo o degrau " + (i));
        }
        System.out.println("Você chegou ao topo!");
    }
}
