package screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public Serie(String nome, int anoDeLancamento, int duracaoEmMinutos, int temporadas, int episodiosPorTemporada, boolean ativa, int minutosPorEpisodio, boolean incluidoNoPlano) {
        this.setNome(nome);
        this.setAnoDeLancamento(anoDeLancamento);
        this.setDuracaoEmMinutos(duracaoEmMinutos);
        this.setTemporadas(temporadas);
        this.setEpisodiosPorTemporada(episodiosPorTemporada);
        this.setAtiva(ativa);
        this.setMinutosPorEpisodio(minutosPorEpisodio);
        this.setIncluidoNoPlano(incluidoNoPlano);
    }

    @Override
    public String toString() {
        return
                "Nome: " + getNome() +
                        " (" + getAnoDeLancamento() + ")\n" +
                        "Temporadas: " + temporadas + "\n" +
                        "Episódios por temporada: " + episodiosPorTemporada + "\n" +
                        "Minutos por episódio: " + minutosPorEpisodio + "\n" +
                        "Ativa: " + (ativa ? "Sim" : "Não") + "\n" +
                        "Duração em minutos: " + getDuracaoEmMinutos() + "\n" +
                        "Incluído no plano: " + (isIncluidoNoPlano() ? "Sim" : "Não");
    }
}