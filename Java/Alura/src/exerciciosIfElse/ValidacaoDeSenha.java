package exerciciosIfElse;

import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 4002;

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        if (senha == senhaCorreta){
            System.out.println("Acesso permitido!");
        } else{
            System.out.println("Acesso negado!");
        }


    }
}
