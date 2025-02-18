package exercicios;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibaFicha(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
    int calcularIdade(int anoAtual){
        return anoAtual - ano;
    }
}

class Maoin{
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "BMW";
        carro.ano = 1992;
        carro.cor = "Preto";

        carro.exibaFicha();
        System.out.println("Idade: " + carro.calcularIdade(2024) + " anos");
    }
}
