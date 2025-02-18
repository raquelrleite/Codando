package array;

public class ArraysMultiplicacao {
    public static void main(String[] args) {


        // Array estático, tem um tamanho fixo definido de inicio.
        // Após o inicio não tem como mudar o tamanho
        int[] v1 = new int[9];
        int[] v2 = new int[9];
        int[] v3 = new int[9];

        for (int i = 0; i < v1.length; i++) {
            v1[i] = i + 1; // start from 1, not 0
            System.out.print(v1[i] + " ");
        }
        System.out.println(); // add a newline for readability
        
        for (int i = 0; i < v2.length; i++) {
            v2[i] = i + 1; // start from 1, not 0
            System.out.print(v2[i] + " ");
        }
        System.out.println(); // add a newline for readability

        for (int i = 0; i < v3.length; i++) {
            v3[i] = v1[i] * v2[i];
            System.out.print(v3[i] + " ");
        }
    }
}



   /* for (int i = 0; i < 5; i++) { // int = 0 pq o array começa com 0
            // i < 5 pq o array termina em 5, da pra usar o nome do array .lenth
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            num[i] = input.nextInt();
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.print(num[j] + " ");
        } */