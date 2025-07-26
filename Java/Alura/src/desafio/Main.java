package desafio;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast podcast = new Podcast();

        podcast.setTitulo("Java e POO");
        podcast.setHost("Alura");
        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(minhaMusica);

















    }
}
