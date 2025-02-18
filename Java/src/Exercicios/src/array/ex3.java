package array;

public class ex3 {
    public static void main(String[] args) {
        //Crie uma matriz 2D de doubles com 4 linhas e 4 colunas.
        //Inicialize a matriz com valores de sua escolha.
        //Use loops for aninhados para imprimir todos os elementos da matriz.

        double[][] numeros = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        for (double[] numero : numeros){
            for (double valor : numero){
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
