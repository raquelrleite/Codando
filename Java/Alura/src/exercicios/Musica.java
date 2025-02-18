package exercicios;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int numAvaliacoes;

    void exibaFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);

    }


    void avaliar(double nota) {
        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaAvaliacoes / numAvaliacoes;
    }
}
class Mainm {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "É Ele";
        musica.artista = "Drops INA";
        musica.anoLancamento = 2024;
        musica.avaliar(5);
        musica.avaliar(4);
        musica.avaliar(3.5);


        musica.exibaFichaTecnica();
        System.out.println("Avaliações: " + musica.pegaMedia());

    }
}