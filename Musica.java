public class Musica {

    String Musica;
    String Artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void ExibirFixaMusical(){

        System.out.println( "Nome da musica: " + Musica);
        System.out.println( "Artista : "   + Artista);
        System.out.println( "Ano de lançamento: " + anoLancamento );
    }


    void avaliaM(double nota){
        somaDasAvaliacoes += nota;
        numAvaliacoes ++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / numAvaliacoes;
    }

}
