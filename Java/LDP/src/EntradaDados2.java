import java.util.Locale;
import java.util.Scanner;

public class EntradaDados2 {
    public static void main(String[] args) {

        /*Locale.setDefault(Locale.US); // COLOCAR VALOR COM PONTO
        Scanner texto = new Scanner(System.in);

        System.out.print("Entre com seu nome: ");
        String nome = texto.nextLine();

        System.out.print("Entre com sua idade: ");
        int idade = texto.nextInt(); texto.nextLine();  //nextInt() não consome a quebra de linha deixada pelo Enter, e isso interfere na leitura da linha seguinte. Para corrigir isso, você pode adicionar um texto.nextLine()

        System.out.print("Entre com sua profissão: ");
        String profissao = texto.nextLine();

        System.out.print("Entre com seu salário: ");
        double salario = texto.nextDouble(); texto.nextLine();

        System.out.print("Entre com seu hobbie: ");
        String hobbie = texto.nextLine();

        System.out.print("Entre com sua inicial: ");
        char inicial = texto.next().charAt(0);

        System.out.printf("Bem-vindo (a), %s! Você tem %d anos, é %s, tem um salário de R$%.2f e gosta de %s nas horas vagas. Letra favorida é: %c", nome, idade, profissao, salario, hobbie, inicial); */

        Scanner texto = new Scanner(System.in);


        // VÁRIOS INPUT DE UMA VEZ
        String x;
        int y;
        double z;
        x = texto.next();
        y = texto.nextInt();
        z = texto.nextDouble();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
