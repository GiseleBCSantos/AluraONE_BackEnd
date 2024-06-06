package q6;

public class Produto implements Vendavel{
    public double precoUnitario;

    @Override
    public double calcularPrecoTotal(int quantidadeComprada) {
        if (quantidadeComprada > 50){
            return quantidadeComprada*precoUnitario * 0.8;
        }
        else if (quantidadeComprada > 25){
            return quantidadeComprada*precoUnitario * 0.9;
        }
        else if (quantidadeComprada > 10){
            return quantidadeComprada*precoUnitario * 0.95;
        }
        return quantidadeComprada*precoUnitario;
    }
}
