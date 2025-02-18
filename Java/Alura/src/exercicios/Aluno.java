package exercicios;

public class Aluno {
    String nome;
    int idade;


    void exibaInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);

    }
}

class Aluni {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Naruto";
        aluno.idade = 15;

        aluno.exibaInformacoes();
    }
}
