package q3;

public class ContaBancaria {
    String titular;
    double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Valor depositado com sucesso! Saldo disponível: R$ "+this.saldo);
    }

    public void sacar(double valor){
        if (valor > this.saldo){
            System.out.println("Não foi possivel realizar o saque! Valor indicado maior do que o disponível. Saldo disponível: R$ "+this.saldo);
        }
        else{
            this.saldo -= valor;
            System.out.println("Valor sacado com sucesso! Saldo disponível: R$ "+this.saldo);
        }
    }
}
