import java.util.Scanner;

public class For6 {
    public static void main (String[] args){
        // FOR repete um bloco de comandos para um certo intervalo de valores
        // Quando se sabe previamente a quantidade de repetições, ou o intervalo de valores

        Scanner sc = new Scanner(System.in);

        /*  for (inicialização; condição; incremento) {
           comando }   */


        // inicio: executada apenas uma vez, no início do loop.
        // condição: determina se o loop deve continuar ou não. Enquanto a condição for verdadeira, o loop continuará a ser executado.
        // incremento: executada após cada iteração do loop e é geralmente usada para incrementar ou decrementar a variável de controle.

        /* for (int count = 100; count >=1; count--) {
            System.out.println(count);
        } // conta de 100 a 1

       for (int count = 1; count <= 100; count++) {
            System.out.println(count);
        } // conta de 1 a 100 */

        System.out.print("Digite o valor limite para o loop: ");

        int limite = sc.nextInt();

        sc.close();
        for (int i = 10; i <= limite; i += 10) {
            System.out.println(i);
        }



    }
}