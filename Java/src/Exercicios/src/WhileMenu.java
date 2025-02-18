import java.util.Scanner;

public class WhileMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int opcao = 0;
        while (opcao != 3) {
            System.out.println();
            /*System.out.println("""
                1. Calcular imposto
                2. Depositar salário
                3. Sair""");*/
            System.out.println();

            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();

            input.close();
        }
    }
}
