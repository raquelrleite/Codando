package array;

public class ArrayMultidimensionais {
    public static void main(String[] args) {


        int [][] teste = {{1, 2}, {3,4,5},{6,7,8,9,10,11}};

        for (int[] i : teste){
            System.out.println();
            for(int num : i){
                System.out.print(num + " ");
            }
        }
    }
}
