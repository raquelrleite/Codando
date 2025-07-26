package exercicioInstanceOf;

public class Cachorro extends Animal {
    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }

    // Sobrescrevendo o método da classe Animal
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late: Au au!");
    }
}
