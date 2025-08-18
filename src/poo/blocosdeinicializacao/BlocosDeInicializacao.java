package poo.blocosdeinicializacao;


// Aula 60 - Poo - Parte 1 - Blocos de inicializaço

import poo.blocosdeinicializacao.funcionalidades.Anime;

public class BlocosDeInicializacao {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.println(anime.getEpisodios());
        System.out.println(anime.getNome());
    }
}
