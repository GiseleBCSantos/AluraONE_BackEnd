public class Pessoa {
    public String nome;
    public int idade;

    @Override
    public String toString() {
        return this.nome + " - " + this.idade + " anos.";
    }
}
