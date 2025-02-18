import java.util.Scanner;

public class SwitchCase4 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        switch (x) { //(expressão)
            case 1:
                dia = "Domingo";
                break; //Break é obrigatório.
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sabádo";
                break;
            default: // Igual o else
                dia = "Valor inválido.";
                break;
        }
        System.out.print("Dia da Semana: " + dia);
        sc.close();
    }
}
