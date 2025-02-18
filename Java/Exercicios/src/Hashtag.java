import java.util.Scanner;

public class Hashtag {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o seu sexo? ");
        char sexo = input.next().charAt(0);    // ler um caractere do usuário em Java

        System.out.print("Qual a sua idade? ");
        int idade = input.nextInt();

        if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento obrigatório.");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Deseja se alistar?");
        } else {
            System.out.println("Alistamento não permitido.");
        }

        input.close();
    }
}