import q2.Animal;
import q2.Cachorro;
import q4.Produto;
import q5.Circulo;
import q5.Forma;
import q5.Quadrado;
import q6.ContaBancaria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------\nQuestão 1");

        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Item 1");
        listaString.add("Item 2");
        listaString.add("Item 3");

        for (String item : listaString){
            System.out.println(item);
        }

        System.out.println("---------------------\nQuestão 2");

        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;

        System.out.println("---------------------\nQuestão 3");

        Cachorro newCachorro = new Cachorro();
        if (newCachorro instanceof Animal) {
            Animal animal1 = (Animal) newCachorro;
        }

        System.out.println("---------------------\nQuestão 4");

        Produto produto1 = new Produto("Biscoito", 4);
        Produto produto2 = new Produto("Bolacha", 7);
        Produto produto3 = new Produto("Creme", 10);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaDePrecos = 0;

        for (Produto item : listaProdutos){
            somaDePrecos += item.getPreco();
        }

        double media = somaDePrecos/listaProdutos.size();

        System.out.println("Média de preço dos produtos: " + media);


        System.out.println("---------------------\nQuestão 5");

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        Circulo circulo = new Circulo(3);
        Quadrado quadrado = new Quadrado(10, 5);

        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);

        for (Forma item : listaDeFormas){
            System.out.println(item.calcularArea());
        }

        System.out.println("---------------------\nQuestão 6");

        ContaBancaria contaBancaria1 = new ContaBancaria(1, 500);
        ContaBancaria contaBancaria2 = new ContaBancaria(2, 100);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(contaBancaria1);
        listaDeContas.add(contaBancaria2);

        double maiorSaldo = 0;
        ContaBancaria contaComMaiorSaldo = null;

        for (ContaBancaria conta : listaDeContas){
            if (conta.getSaldo() > maiorSaldo){
                maiorSaldo = conta.getSaldo();
                contaComMaiorSaldo = conta;
            }
        }

        System.out.println(contaComMaiorSaldo);



    }
}