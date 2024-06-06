package br.com.alura.aplicacaoMusica.modelos;

public class MinhasPreferidas {

    public void incluir(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + "É considerado sucesso absoluto e preferido por todos.");
        }
        else{
            System.out.println(audio.getTitulo() + "É um dos que todo mundo está curtindo.");
        }
    }
}
