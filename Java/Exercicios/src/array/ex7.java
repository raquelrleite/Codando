package array;

public class ex7 {
    public static void main(String[] args) {
        //Crie duas matrizes 2D de inteiros, A (2x3) e B (3x2).
        //Inicialize as matrizes com valores de sua escolha.
        //Escreva um método para multiplicar as duas matrizes e retornar o resultado.

        int[][] a = {
                {134, 54, 19},
                {87, 69, 24}
        };

        int[][] b = {
                {827, 130},
                {28, 82},
                {50, 36}
        };

        int[][] resultado = new int[2][2];

       for(int i = 0; i < resultado.length; i++){
           for (int j = 0; j < resultado.length; j++){
               resultado[i][j] += 0;
               for (int k = 0; k <3; k++){
                   resultado[i][j] += a[i][j] * b[k][j];
               }
           }
       }
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado.length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
