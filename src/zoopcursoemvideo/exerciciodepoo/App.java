package zoopcursoemvideo.exerciciodepoo;

import zoopcursoemvideo.exerciciodepoo.funcionalidades.Livro;
import zoopcursoemvideo.exerciciodepoo.funcionalidades.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Luiz", 20, "Macho masculo");
        Livro l = new Livro("A menina que roubava livros", "Desconhecido", 300, p);


        p.fazerAnivers();
        l.abrir();
        l.avancarPagina();
        System.out.println(l.detalhes());
        l.avancarPagina();
        System.out.println(l.detalhes());
        l.avancarPagina();
        System.out.println(l.detalhes());
        l.folhear(100);
        System.out.println(l.detalhes());
        l.folhear(150);
        System.out.println(l.detalhes());
        l.folhear(400);
        System.out.println(l.detalhes());



    }
}
