package poo.sobrecargademetodos;
import poo.sobrecargademetodos.funcionalidaes.Anime;
// Aula 57 - Poo - Parte 1 - Sobrecarga de metodos
// Criar metodos com nomes iguais com funcoes diferentes


public class SobrecargaDeMetodos {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Demon Slayer", "TV", 30, "Ação");
        anime.imprime();

    }
}
