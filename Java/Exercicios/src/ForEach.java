import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {

        // Se usa para iterar (percorrer) sobre elem. de arrays ou objetos

        int[] idades = {4, 32, 16, 19};

        /*
        // FOR SIMPLES
        for (int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }
        */


        // FOR EACH
        for (int i : idades) {
            System.out.println("Idade: " + i);
        }



    }
}
