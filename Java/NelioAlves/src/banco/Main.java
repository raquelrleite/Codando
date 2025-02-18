package banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.print("Enter account number: ");
        banco.setAccountNumber(sc.nextInt());

        System.out.print("Enter account holder: ");
        sc.nextLine(); // Limpa o buffer do Scanner
        banco.setNameAccHolder(sc.nextLine());

        System.out.print("Is there an inicial deposit (y/n)? ");
        String answer = sc.nextLine();

        if (answer.equals("y")){
            System.out.print("Enter inicial deposit value: ");
            banco.setDeposit(sc.nextDouble());
            banco.setBalance(banco.getDeposit());
            System.out.println();
        } else {
            System.out.println();
        }

        System.out.println("Account data:");
        banco.accountData();
        System.out.println();

        banco.deposit(sc);
        System.out.println("Updated account data: ");
        banco.accountData();

        System.out.println();
        banco.withdraw(sc);
        System.out.println("Updated account data: ");
        banco.accountData();

        sc.close();
    }
}
