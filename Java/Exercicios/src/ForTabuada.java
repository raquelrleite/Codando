public class ForTabuada {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
                                          // condição                        // incrementar
             // i(inicilização) igual a 0; ENQUANTO i for menor ou igual a 50; ir de 2 em 2;
       /* for (int i = 0; i <= 50; i += 2){
            System.out.println(i);
        }

        for (int y = 15; y <= 200 ; y++) {
            System.out.println(y);
        }*/

        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                int tabuada = i * j;
                System.out.println(i + " * " + j + " = " + tabuada);
            }
        }
    }
}