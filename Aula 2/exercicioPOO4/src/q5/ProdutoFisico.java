package q5;

public class ProdutoFisico implements Calculavel{

    public double preco;

    @Override
    public double calcularPrecoFinal() {
        return preco;
    }
}
