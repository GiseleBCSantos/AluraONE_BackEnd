import q1.ConversorMoeda;
import q2.CalculadoraSalaRetangular;
import q3.Tabuada;
import q3.TabuadaMultiplicacao;
import q4.ConversorTemperaturaPadrao;
import q5.Livro;
import q5.ProdutoFisico;
import q6.Produto;
import q6.Servico;

import java.io.Serial;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------\nQ1");
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        double valorEmReal = conversorMoeda.converterDolarParaReal(410);
        System.out.println(valorEmReal);

        System.out.println("---------------\nQ2");
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        double area = calculadoraSalaRetangular.calcularArea(12.5,50);
        double perimetro = calculadoraSalaRetangular.calcularPerimetro(12.5,50);
        System.out.println(area);
        System.out.println(perimetro);

        System.out.println("---------------\nQ3");

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(5);

        System.out.println("---------------\nQ4");

        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        System.out.println(conversorTemperaturaPadrao.celsiusParaFahrenheit(32));
        System.out.println(conversorTemperaturaPadrao.fahrenheitParaCelsius(80));

        System.out.println("---------------\nQ5");

        Livro livro = new Livro();
        livro.preco = 50;
        System.out.println(livro.calcularPrecoFinal());

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.preco = 100;
        System.out.println(produtoFisico.calcularPrecoFinal());

        System.out.println("---------------\nQ6");
        Produto produto = new Produto();
        produto.precoUnitario = 10;
        System.out.println(produto.calcularPrecoTotal(10));

        Servico servico = new Servico();
        servico.precoUnitario = 100;
        System.out.println(servico.calcularPrecoTotal(10));


    }
}


























