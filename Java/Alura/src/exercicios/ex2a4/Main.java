package exercicios.ex2a4;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Blue");
        aluno.setNota1(7);
        aluno.setNota2(10);
        aluno.setNota3(8);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());
    }
}
