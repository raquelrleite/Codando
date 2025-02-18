package array;

public class ex2 {
    public static void main(String[] args) {
        //Crie uma matriz 2D de strings com 2 linhas e 3 colunas.
        //Inicialize a matriz com valores de sua escolha.
        //Modifique o valor do elemento na posição [1][2].

        String[][] matriz = new String[2][3];
        //ou
        String[][] letras = {
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"}
        };

       letras[1][2] = "Novo";

        matriz[0][0] = "42";
        matriz[0][1] = "94";
        matriz [0][2] = "1";

        matriz[1][0] = "68";
        matriz[1][1] = "107";
        matriz[1][2] = "25";

        for (String[] i : matriz){
            System.out.println("----");
            for (String num: i){
                System.out.println(num + " ");
            }
        }

        for (String[] i : letras){
            System.out.println("----");
            for (String num: i){
                System.out.println(num + " ");
            }
        }
    }
}
