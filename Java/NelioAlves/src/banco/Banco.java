package banco;

import java.util.Scanner;

public class Banco {
    private int accountNumber;
    private String nameAccHolder;
    private double deposit;
    private double balance;

    void accountData(){
        System.out.println("Account " + this.accountNumber + ", Holder: " + this.nameAccHolder + ", Balance: $" + this.balance);
    }

    void deposit(Scanner sc){
        System.out.print("Enter a deposit value: ");
        setDeposit(sc.nextDouble());
        setBalance(getDeposit() + getBalance());
    }

    void withdraw(Scanner sc){
        System.out.print("Enter a withdraw value: ");
        setDeposit(sc.nextDouble());
        double taxWithdraw = 5.00;
        setBalance(getBalance() - getDeposit() - taxWithdraw);
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String getNameAccHolder() {
        return nameAccHolder;
    }

    public void setNameAccHolder(String nameAccHolder) {
        this.nameAccHolder = nameAccHolder;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double inicialDeposit) {
        this.deposit = inicialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
