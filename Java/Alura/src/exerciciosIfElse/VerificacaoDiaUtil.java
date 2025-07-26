package exerciciosIfElse;

import java.util.Scanner;

public class VerificacaoDiaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = sc.nextLine();


        if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")){
            System.out.printf("%s é um dia útil.", dia);
        } else {
            System.out.printf("%s não é um dia útil.", dia);
        }

        sc.close();
    }
}
