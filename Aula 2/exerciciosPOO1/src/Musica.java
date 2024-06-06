public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double somaAvaliacao;
    int numAvaliacoes;


    void exibirFichaTecnica(){
        System.out.println("Título: " +titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Média de avaliações: " + obterMediaAvaliacoes());
    }

    void avaliarMusica(double nota){
        somaAvaliacao += nota;
        numAvaliacoes++;
    }

    double obterMediaAvaliacoes(){
        if (numAvaliacoes == 0){
            return 0;
        }
        return somaAvaliacao/numAvaliacoes;
    }
}
