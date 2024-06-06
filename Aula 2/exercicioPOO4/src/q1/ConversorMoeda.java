package q1;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * 5;
    }


}
