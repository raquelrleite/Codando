import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o dia da semana? ");
        int dia = input.nextInt();

//        if (dia == 1) {
//            System.out.println("Domingo");
//        } else if (dia == 2) {
//            System.out.println("Segunda-feira");
//        } else if (dia == 3) {
//            System.out.println("Terça-feira");
//        } else if (dia == 4) {
//            System.out.println("Quarta-feira");
//        } else if (dia == 5) {
//            System.out.println("Quinta-feira");
//        } else if (dia == 6) {
//            System.out.println("Sexta-feira");
//        } else if (dia == 7) {
//            System.out.println("Sábado");
//        } else


        switch(dia){
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido.");
        }

        input.close();


    }
}
