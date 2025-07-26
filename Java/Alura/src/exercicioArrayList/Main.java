package exercicioArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();



        pessoa1.setNome("Helena");
        pessoa1.setIdade(4);

        pessoa2.setNome("Alice");
        pessoa2.setIdade(1);

        pessoa3.setNome("Ana");
        pessoa3.setIdade(5);

        pessoa4.setNome("Meg");
        pessoa4.setIdade(8);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1); listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3); listaDePessoas.add(pessoa4);


        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        System.out.println("1º pessoa: " + listaDePessoas.get(0).getNome());

        System.out.println(listaDePessoas);
    }
}
