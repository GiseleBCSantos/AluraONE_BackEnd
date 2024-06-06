public class Main {
    public static void main(String[] args) {

        System.out.println("Teste classe Pessoa.");
        Pessoa pessoa = new Pessoa();
        pessoa.exibirSaudacao();

        System.out.println("-------------------------------------");

        System.out.println("Teste classe Calculadora.");
        Calculadora calculadora = new Calculadora();
        double numeroDobrado = calculadora.dobrarNumero(2);
        System.out.println(numeroDobrado);

        System.out.println("-------------------------------------");

        System.out.println("Teste classe Musica");
        Musica musica = new Musica();
        musica.titulo = "Titulo musica";
        musica.artista = "Artista musica";
        musica.anoDeLancamento = 2023;
        musica.exibirFichaTecnica();
        musica.avaliarMusica(10);
        musica.avaliarMusica(9);
        musica.exibirFichaTecnica();

        System.out.println("-------------------------------------");

        System.out.println("Teste classe Carro");
        Carro carro = new Carro();
        carro.modelo = "Modelo carro";
        carro.cor = "Branco";
        carro.ano = 2020;
        carro.exibirFichaTecnica();
        int idadeCarro = carro.calcularIdade();
        System.out.println(idadeCarro);

        System.out.println("-------------------------------------");

        System.out.println("Teste classe Aluno");
        Aluno aluno = new Aluno();
        aluno.nome = "Nome aluno";
        aluno.idade = 15;
        aluno.exibirInformacoes();

    }
}