package poo.construtores.pt2;

import poo.construtores.pt2.funcionalidades.Anime;
// Aula 59 - Poo - Parte 2 - Construtores
// Nao da pra chamar construtores dentro de outros metodos
public class Teste {
    public static void main(String[] args) {
        Anime anime = new Anime("Demon Slayer", "TV", 30, "Ação", "Gibly");
        anime.imprime();

    }
}
