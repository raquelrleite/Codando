package listSetMap.nivel2;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (int i = 0; i < numeros.size(); i++) {
            int valorAtual = numeros.get(i);       // pega o valor atual
            numeros.set(i, valorAtual * 2);// substitui pelo dobro
        }
    }
}
