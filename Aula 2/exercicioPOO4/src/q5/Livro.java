package q5;

public class Livro implements Calculavel{
    public double preco;
    @Override
    public double calcularPrecoFinal() {
        return preco*0.9;
    }
}
