package q6;

public class Servico implements Vendavel{
    public double precoUnitario;

    @Override
    public double calcularPrecoTotal(int quantidadeComprada) {
        if (quantidadeComprada > 10){
            return quantidadeComprada*precoUnitario * 0.8;
        }
        else if (quantidadeComprada > 5){
            return quantidadeComprada*precoUnitario * 0.9;
        }
        return quantidadeComprada*precoUnitario;
    }
}
