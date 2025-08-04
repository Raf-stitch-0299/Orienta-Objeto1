//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Sherek";
        meuFilme.anoDeLancamento = 2001;
        meuFilme.duracaoEmMinutos = 89;

        Filme meuFilme2 = new Filme();
        meuFilme2.nome = "Sherek 2";
        meuFilme2.anoDeLancamento = 2004;
        meuFilme2.duracaoEmMinutos = 90;


        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        meuFilme2.exibirFichaTecnica();
        meuFilme2.avalia(8);
        meuFilme2.avalia(9);
        meuFilme2.avalia(6);
        System.out.println(meuFilme2.somaDasAvaliacoes);
        System.out.println(meuFilme2.totalDeAvaliacoes);
        System.out.println(meuFilme2.pegaMedia());



    }
}