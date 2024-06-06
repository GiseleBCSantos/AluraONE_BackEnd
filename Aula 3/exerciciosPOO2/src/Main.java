import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------\nQuestão 1");

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Petisco", 5.10, 1);
        Produto produto2 = new Produto("Alvejante", 10, 1);
        Produto produto3 = new Produto("Coxão mole", 55, 2);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista: "+ listaDeProdutos.size());
        System.out.println("Primeiro item da lista: "+ listaDeProdutos.get(0).getNome());

        System.out.println("--------------------------\nQuestão 2");

        for (Produto produto : listaDeProdutos){
            System.out.println("Nome: " + produto.getNome());
        }

        System.out.println("--------------------------\nQuestão 4");
        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Arroz", 15, 10, "09/06/2024");
        System.out.println(produtoPerecivel1);

    }
}
















