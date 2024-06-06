import q1.ModeloCarro;
import q2.Cachorro;
import q2.Gato;
import q3.ContaCorrente;
import q4.GeradorPrimo;
import q4.NumerosPrimos;
import q4.VerificadorPrimo;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------\n\tQuestão 1");

        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.setNomeModelo("Ford");
        modeloCarro.setPrecoMedioAno1(50000);
        modeloCarro.setPrecoMedioAno2(55000);
        modeloCarro.setPrecoMedioAno3(70000);

        modeloCarro.exibirMenorEMaiorPreco();

        System.out.println("----------------------------\n\tQuestão 2");

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        System.out.println("----------------------------\n\tQuestão 3");

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setTitular("Joao");
        contaCorrente.depositar(100);
        contaCorrente.sacar(200);
        contaCorrente.sacar(20);
        contaCorrente.cobrarTarifaMensal();

        System.out.println("----------------------------\n\tQuestão 4");

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        System.out.println(numerosPrimos.verificarPrimalidade(13));
        numerosPrimos.listarPrimos(5);

        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        verificadorPrimo.verificarSeEhPrimo(6);

        GeradorPrimo geradorPrimo = new GeradorPrimo();
        System.out.println(geradorPrimo.gerarProximoPrimo(11));

    }
}