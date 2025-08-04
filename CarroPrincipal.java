public class CarroPrincipal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Uno com Escada";
        meuCarro.ano = 2023;
        meuCarro.cor = "Branco";

        meuCarro.exibeFichaCarro();


        System.out.println("Idade do carro: "
                + meuCarro.calculaIdade() + " anos");
    }
}
