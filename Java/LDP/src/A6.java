import java.util.Scanner;

public class A6 {
    // ESTRUTURA REPETIÇÃO FOR
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma, divisivel, nulo, i, v, par;
        double media;

        soma = 0;
        divisivel = 0;
        nulo = 0;
        par = 0;

        for (i = 1; i < 5; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            v = sc.nextInt();
            soma += v;
            if (v % 5 == 0) {
                divisivel += 1;
            } else if (v == 0) {
                nulo += 1;
            } else if (v % 2 == 0) {
                par += v;
            }
        }

        media = soma / 5.0;
        System.out.printf("A soma entre os valores é de: %d%n", soma);
        System.out.printf("A média dos valores é de: %.2f%n", media);
        System.out.printf("Valores divisíveis por 5: %d%n", divisivel);
        System.out.printf("Valores nulos: %d%n", nulo);
        System.out.printf("A soma dos pares é: %d%n", par);

    }
}
