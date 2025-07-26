package screenmatch.modelos;

import screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano) {
        this.setNome(nome);
        this.setAnoDeLancamento(anoDeLancamento);
        this.setDuracaoEmMinutos(duracaoEmMinutos);
        this.setIncluidoNoPlano(incluidoNoPlano);
    }


    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                " (" + getAnoDeLancamento() + ")\n" +
                "Duração em minutos: " + getDuracaoEmMinutos() + "\n" +
                "Incluído no plano: " + (isIncluidoNoPlano() ? "Sim" : "Não");
    }

}
