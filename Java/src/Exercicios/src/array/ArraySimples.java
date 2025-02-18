package array;

public class ArraySimples {
    public static void main(String[] args) {

        //Criar array simples
        int[] idades = new int[3];


       // É a mesma coisa que o array.ArraySimples, mas já inicializa com tamanhos e valores
        idades = new int[]{4, 32, 16, 19};

        // atribuit valor
        idades [0] = 33;
        idades [1] = 36;
        idades [2] = 34;

        //imprimir um de cada vez ou usar FOR pra imprimir tudo
        System.out.println(idades[2]);


    }
}