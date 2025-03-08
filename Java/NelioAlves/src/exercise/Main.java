class Carro {
    // Classe que representa um Carro
        // Atributos (características do carro)
        String marca;
        String modelo;
        int ano;

        // Método (ação do carro)
        void exibirInformacoes() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Criando um objeto da classe Carro
            Carro meuCarro = new Carro();

            // Definindo valores para os atributos
            meuCarro.marca = "Toyota";
            meuCarro.modelo = "Corolla";
            meuCarro.ano = 2022;

            // Chamando um método do objeto
            meuCarro.exibirInformacoes();
        }
    }
