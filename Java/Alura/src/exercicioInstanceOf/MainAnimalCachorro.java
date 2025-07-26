package exercicioInstanceOf;

public class MainAnimalCachorro {
    public static void main(String[] args) {

        // Cria um objeto da classe Cachorro
        Cachorro meuCachorro = new Cachorro();

        // Faz o cachorro latir
        meuCachorro.fazerSom(); // Saída: O cachorro late: Au au!
        meuCachorro.abanarRabo(); // Saída: O cachorro está abanando o rabo.

        // Fazendo **upcasting**: Cachorro → Animal
        Animal animal = (Animal) meuCachorro;

        // Mesmo sendo um "animal", ele ainda sabe latir (polimorfismo)
        animal.fazerSom(); // Saída: O cachorro late: Au au!

        // animal.abanarRabo(); // ❌ ERRO! Porque a referência é do tipo Animal
    }
}