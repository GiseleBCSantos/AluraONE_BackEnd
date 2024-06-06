package q1;

public class Carro {
    private String nomeModelo;
    private double precoMedioAno1;
    private double precoMedioAno2;
    private double precoMedioAno3;

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getPrecoMedioAno1() {
        return precoMedioAno1;
    }

    public void setPrecoMedioAno1(double precoMedioAno1) {
        this.precoMedioAno1 = precoMedioAno1;
    }

    public double getPrecoMedioAno2() {
        return precoMedioAno2;
    }

    public void setPrecoMedioAno2(double precoMedioAno2) {
        this.precoMedioAno2 = precoMedioAno2;
    }

    public double getPrecoMedioAno3() {
        return precoMedioAno3;
    }

    public void setPrecoMedioAno3(double precoMedioAno3) {
        this.precoMedioAno3 = precoMedioAno3;
    }

    public void exibirMenorEMaiorPreco(){

        System.out.println("Maior preço: "+ calcularMaiorPreco());
        System.out.println("Menor preço: "+ calcularMenorPreco());

    }

    double calcularMaiorPreco(){
        if (getPrecoMedioAno1() > getPrecoMedioAno2() && getPrecoMedioAno1() > getPrecoMedioAno3()){
            return getPrecoMedioAno1();
        }
        else if (getPrecoMedioAno2() > getPrecoMedioAno1() && getPrecoMedioAno2() > getPrecoMedioAno3()){
            return getPrecoMedioAno2();
        }
        else{
            return getPrecoMedioAno3();
        }
    }

    double calcularMenorPreco(){
        if (getPrecoMedioAno1() < getPrecoMedioAno2() && getPrecoMedioAno1() < getPrecoMedioAno3()){
            return getPrecoMedioAno1();
        }
        else if (getPrecoMedioAno2() < getPrecoMedioAno1() && getPrecoMedioAno2() < getPrecoMedioAno3()){
            return getPrecoMedioAno2();
        }
        else{
            return getPrecoMedioAno3();
        }
    }
}





















