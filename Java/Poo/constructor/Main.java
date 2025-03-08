package constructor;

// Classe principal que contém o método main para execução do programa
public class Main {
    public static void main(String[] args) {

        // Criar instância do objeto Human com argumentos para o construtor

        Human human /* esse é o objeto*/ = new Human("Aelin", 18, 50);
                                            // Human() 1. É o construtor

        //2. Quando criar uma instancia dessa classe, ele vai chamar o construtor, assim como em método

        //5. Passar argumentos para o construtor nos da a habilidade de criar diferentes objetos, com diferentes atributos.
        //6. Como por exemplo: Human2("Rowan", 120, 80)
        //7. Mas para isso precisamos atribuir esses valores aos atributos da classe

        // Criar outra instância do objeto Human com diferentes argumentos para o construtor

        Human human2 = new Human("Rowan", 120, 80);

        //Imprime nome do construtor + o que quero
        System.out.println(human2.name);


        // definir quem é + metodo
        human2.eat();

    }
}
