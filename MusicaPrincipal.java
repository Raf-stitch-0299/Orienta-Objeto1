public class MusicaPrincipal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.Musica = "Opera de meias";
        minhaMusica.Artista = "VMZ";
        minhaMusica.anoLancamento = 2025;

        minhaMusica.ExibirFixaMusical();
        minhaMusica.avaliaM(5.0);
        minhaMusica.avaliaM(4.9);
        minhaMusica.avaliaM(4.7);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);


    }
}
