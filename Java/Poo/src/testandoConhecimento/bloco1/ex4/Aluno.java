package testandoConhecimento.bloco1.ex4;

public class Aluno {
    double somaNotas;

    void resultadoMedia(){
        if (somaNotas >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    void calculoMedia(double n1, double n2, double n3){
        somaNotas = n1 + n2 + n3;
        somaNotas = somaNotas / 3;
        System.out.println("Nota final: " + somaNotas);
    }
}
