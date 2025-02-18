package exercicios;

import java.util.Scanner;

public class desafioConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("********************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println();

        System.out.print("Nome:             ");
        String name = sc.nextLine();
        System.out.print("Tipo conta:       ");
        String tipo = sc.nextLine();
        System.out.print("Saldo inicial:    ");
        double saldo = sc.nextDouble();
        double totalSaldo = saldo;

        System.out.println("********************************************");

        int opcao = 0;
        while (opcao != 4){
            System.out.println("""
                    
                    """);
            System.out.println("Operações");
            System.out.println("""
                
                """);
            System.out.println("""
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("O saldo atual é R$ " + totalSaldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double recebeSaldo = sc.nextDouble();
                    totalSaldo += recebeSaldo;
                    System.out.println("Saldo atualizado R$ " + totalSaldo);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    double transfereSaldo = sc.nextDouble();
                    if (transfereSaldo > totalSaldo){
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        totalSaldo -= transfereSaldo;
                        System.out.println("Saldo atualizado R$ " + totalSaldo);
                    }
                    break;
                case 4:
                    break;
                default:
                System.out.println("Opção inválida");
            }
        }
    }
}