import java.util.Locale;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender );
        System.out.println();
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);

        //////////////////////////////////////////////////////////

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("Largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.print("Comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.print("Metro Quadrado: ");
        double mQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * mQuadrado;

        System.out.printf("O tamanho da área é: %.2f \n", area); // Chama a variável area e designa 2 números depois do ponto

        System.out.printf("O preço do metro quadrado é: %.2f", preco);

        sc.close();


    }
}
