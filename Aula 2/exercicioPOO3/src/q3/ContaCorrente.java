package q3;

public class ContaCorrente extends ContaBancaria{

    public void cobrarTarifaMensal(){
        saldo -= 10;
        System.out.println("Foi descontado 10 reais da sua conta! Saldo atual: R$ "+this.saldo);
    }
}
