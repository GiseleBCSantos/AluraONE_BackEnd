package q5;

public class Quadrado implements Forma{
    private double altura;
    private double largura;

    public Quadrado(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    @Override
    public double calcularArea() {
        return this.getAltura() * this.getLargura();
    }
}
