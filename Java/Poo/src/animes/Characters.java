// Importa a classe Anime do pacote animes
import animes.Anime;
import java.util.Scanner;

// Classe principal chamada Characters
public class Characters {
    public static void main(String[] args) {

        // Cria uma instância da classe Anime chamada a1
        Anime a1 = new Anime();

        // Atribui valores aos campos da instância a1
        a1.name = "Naruto Uzumaki";
        a1.age = 16;
        a1.country = "País do Fogo";
        a1.animeName = "Naruto Shippuden";

        // Imprime informações do personagem a1
        System.out.println("Anime: " + a1.animeName);
        System.out.println("Nome: " + a1.name);
        System.out.println("Idade: " + a1.age);
        System.out.println("País: " + a1.country);
        System.out.println("");

        // Cria uma segunda instância da classe Anime chamada a2
        Anime a2 = new Anime();

        // Atribui valores aos campos da instância a2
        a2.name = "Yuji Itadori";
        a2.age = 15;
        a2.country = "Japão";
        a2.animeName = "Jujutsu Kaisen";

        // Imprime informações do personagem a2
        System.out.println("Anime: " + a2.animeName);
        System.out.println("Nome: " + a2.name);
        System.out.println("Idade: " + a2.age);
        System.out.println("País: " + a2.country);
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual personagem você escolhe? ");
        String personagem = sc.next();
        sc.close();

        // Verifica qual personagem foi escolhido e executa a técnica correspondente
        if ("Naruto".equals(personagem)) {
            a1.rasengan();
        } else if ("Itadori".equals(personagem)) {
            a2.maldicao();
        } else {
            System.out.println("Personagem não reconhecido.");
        }
    }
}

