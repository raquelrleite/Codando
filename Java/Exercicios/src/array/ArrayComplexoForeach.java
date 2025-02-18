package array;

public class ArrayComplexoForeach { // Array Multidimensionais com FOREACH
    public static void main(String[] args) {

        //int[][] dias = new int[3][1];
        int[][] dias = {{4, 5}, {6, 7, 8}, {9}};


                //variável de referêncio
        for (int[] subArray : dias) { //Para cada sub-array dia em dias
            for (int numero : subArray) {
                System.out.println(numero);
            }
        }

    }
}
/*
Primeira iteração do primeiro loop:

subArray é {4, 5}
O segundo loop itera sobre {4, 5}:
numero é 4 → Imprime 4
numero é 5 → Imprime 5
Segunda iteração do primeiro loop:

subArray é {6, 7, 8}
O segundo loop itera sobre {6, 7, 8}:
numero é 6 → Imprime 6
numero é 7 → Imprime 7
numero é 8 → Imprime 8
Terceira iteração do primeiro loop:

subArray é {9}
O segundo loop itera sobre {9}:
numero é 9 → Imprime 9
 */