package exercicios;

public class ScreenMatch {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        double media = (9.8 + 6.9 + 10.0) /3;
        int classificacao = (int) media /2;
        System.out.println("Nota: " + classificacao);

        boolean incluidoNoPlano = true;
        System.out.println("Incluído no plano: " + incluidoNoPlano);

        String sinopse = """
        Thirty years of service leads Maverick to train a group of elite
        TOPGUN graduates to prepare for a high-profile mission while Maverick battles his past demons.""";
        System.out.println("Sinopse: " + sinopse);
    }
}
