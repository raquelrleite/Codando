package exercicios.ex2a2;

/*Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.*/

public class IdadePessoa {
    private String name;
    private int idade;


    public void verificarIdade(){
        if (idade >= 18) {
            System.out.println(name + " é maior de idade");
        } else{
                System.out.println(name + " é menor de idade");
            }
        }

    public void imprimir() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
