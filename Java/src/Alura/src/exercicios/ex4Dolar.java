package exercicios;

import java.util.Scanner;

public class ex4Dolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dolar = 5.51;
        double reais = 0.18;

        System.out.print("Dólar ou Real? (D/R): ");
        String tipo = sc.next();

        if(tipo.equalsIgnoreCase("D")){
            System.out.print("Valor: $");
            double valor = sc.nextDouble();
            double conversao = (valor * reais);
            System.out.printf("$%.2f ↔ R$%.2f", valor, conversao);
        } else if(tipo.equalsIgnoreCase("R")){
            System.out.print("Valor: R$");
            double valor = sc.nextDouble();
            double conversao = (valor * dolar);
            System.out.printf("R$%.2f ↔ $%.2f", valor, conversao);
        }else{
            System.out.println("Valor inválido.");
        }


        sc.close();
    }
}
