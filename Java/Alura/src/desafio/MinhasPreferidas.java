package desafio;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " está em #1 em 10 países!");
        } else{
            System.out.println(audio.getTitulo() + " está #1 no Brasil.");
        }
    }
}
