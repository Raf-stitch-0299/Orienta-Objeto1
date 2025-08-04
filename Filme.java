public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    void exibirFichaTecnica(){
        System.out.println( "Nome do Filme: " +  nome);
        System.out.println( "Ano de lançamento: " + anoDeLancamento);
        System.out.println( "Duração em minutos: " + duracaoEmMinutos);

    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}