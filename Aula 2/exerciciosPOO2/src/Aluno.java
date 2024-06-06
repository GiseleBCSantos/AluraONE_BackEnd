public class Aluno {
    private String nome;
    private double somaNotas;
    private int quantidadeProvas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSomaNotas() {
        return somaNotas;
    }

    public void setSomaNotas(double somaNotas) {
        this.somaNotas = somaNotas;
    }

    public int getQuantidadeProvas() {
        return quantidadeProvas;
    }

    public void setQuantidadeProvas(int quantidadeProvas) {
        this.quantidadeProvas = quantidadeProvas;
    }

    double calcularMedia(){
        return somaNotas/quantidadeProvas;
    }
}
