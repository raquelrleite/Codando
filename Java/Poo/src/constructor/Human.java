package constructor;

public class Human {
// Construtor = método especial que é chamado quando um objeto é criado (instância)

        //7. Atributos da classe Human
        String name;
        int age;
        double weight;


        //8. dentro do construtor vamos atribuir todos esses valores para cada uma das variaveis
        Human/*Atributos de humano, produto, carro, etc*/
        (String name, int age, double weight) {//Isso é um constructor
                // Atribui os valores recebidos aos atributos da classe

                //9. fingir que this é o nome do objeto. ex: human.name = name;
               this.name = name;
               this.age = age;
               this.weight =  weight;

               /*
               THIS se refere ao objeto atual dentro de uma classe.
               Ele é usado para acessar variáveis de instância e métodos da classe atual.
                Isso ajuda a distinguir entre variáveis locais e variáveis de instância quando elas têm o mesmo nome.
                */
        }

        //Criar um método e lá no main que vamos definir quem é
        void eat () {
                System.out.println(this.name+" is eating");
        }
}
