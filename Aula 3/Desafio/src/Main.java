import br.com.alura.aplicacaoCompras.CartaoDeCredito;
import br.com.alura.aplicacaoCompras.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0){
            System.out.println("Digite o nome do produto: ");
            String nome = leitura.next();

            System.out.println("Digite o preço do produto: ");
            double preco = leitura.nextDouble();

            Compra compra = new Compra(nome, preco);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("1 - Continuar\n0 - Sair");;
                sair = leitura.nextInt();
            }
            else{
                System.out.println("Compra não realizada! Saldo insuficiente.");
                sair = 0;
            }
        }

        System.out.println("\n*******************");
        System.out.println("COMPRAS REALIZADAS: \n");
        Collections.sort(cartao.getCompras());

        for (Compra compra : cartao.getCompras()){
            System.out.println(compra.getNome() + " - " + compra.getPreco());
        }
        System.out.println("\n*******************");

        System.out.println("\nSaldo do cartão: " + cartao.getSaldo());
    }
}