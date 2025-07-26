package exerciciosIfElse;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo: R$ ");
        int valor = sc.nextInt();


        if (valor >= 1000 && valor <= 5000){
            System.out.printf("O valor %d, está dentro do intervalo permitido para empréstimo.", valor);
        } else {
            System.out.printf("O valor %d, NÃO está dentro do intervalo permitido para empréstimo.", valor);

        }
    }
}
