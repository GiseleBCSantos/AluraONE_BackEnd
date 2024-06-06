import java.io.IOException;
import java.util.Scanner;
import java.io.Console;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int operacao = 1;
        String textoMenu = """
                
                Operações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                >>""";

        double saldo = 0;
        double valorOperacao = 0;

        while (operacao < 4 && operacao > 0){
            System.out.println(textoMenu);
            operacao = leitura.nextInt();

            if (operacao == 1){
                System.out.println("O saldo atual é: R$ " + saldo);
            }
            else if (operacao == 2) {
                System.out.println("Informe o valor que irá receber: ");
                valorOperacao = leitura.nextDouble();
                saldo += valorOperacao;
                System.out.println("Valor recebido com sucesso!\nSaldo atual: R$ " + saldo);
            }
            else if (operacao == 3) {
                System.out.println("Informe o valor que irá transferir: ");
                valorOperacao = leitura.nextDouble();
                if (valorOperacao > saldo) {
                    System.out.println("Você não possui saldo suficiente!");
                }
                else {
                    saldo -= valorOperacao;
                    System.out.println("Valor transferido com sucesso!\nSaldo atual: R$ " + saldo);
                }
            }
            else{
                System.out.println("Programa encerrado com sucesso.");
            }
        }
    }

}
