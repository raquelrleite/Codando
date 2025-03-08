public class Human {
    // 1️⃣ Primeiro, declaramos os atributos da classe
    String name;
    int age;
    double weight;

    // 2️⃣ Depois, criamos um construtor para inicializar esses atributos
    public Human(String name, int age, double weight) {
        this.name = name;  // "this.name" se refere ao atributo da classe
        this.age = age;
        this.weight = weight;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Weight: " + weight;

    }
}
