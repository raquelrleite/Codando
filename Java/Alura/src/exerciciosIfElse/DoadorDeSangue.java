package exerciciosIfElse;

import java.util.Scanner;

public class DoadorDeSangue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do doador: ");
        int idade = sc.nextInt();
        System.out.print("Digite o peso do doador: ");
        double peso = sc.nextDouble();


        if ((idade >= 18 && idade <= 65 && peso >= 50)){
            System.out.println("O doador é compatível.");
        } else if (idade < 18 || idade > 65) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
        } else {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve pesar no minimo 50kg.");
        }

    }
}
