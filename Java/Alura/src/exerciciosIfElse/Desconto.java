package exerciciosIfElse;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        double desconto = (valor * 10) / 100;

        if (valor >= 100){
            System.out.println("Desconto de 10% aplicado.");
            System.out.printf("Novo valor: R$ %.2f", desconto);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.printf("Valor total: R$ %.2f", valor);
            
        }
    }
}
