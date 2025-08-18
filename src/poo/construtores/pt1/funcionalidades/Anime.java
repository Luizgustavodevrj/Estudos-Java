package poo.construtores.pt1.funcionalidades;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    // Construtor
    public Anime(String nome, String tipo, int episodios, String genero){ // Executado primeiro
        this.nome = nome;
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }


}
