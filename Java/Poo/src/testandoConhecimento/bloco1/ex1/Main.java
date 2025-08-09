package testandoConhecimento.bloco1.ex1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jeff", 19);

        if(p1.idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
