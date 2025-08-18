package poo.construtores.pt2.funcionalidades;
// Aula 59 - Poo - Parte 2 - Construtores (Sobrecarga de construtores)
// This precisa ser a primeira linha do construtor
public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String studio;

    // Construtor
    public Anime(String nome, String tipo, int episodios, String genero){ // Executado primeiro
        this();
        this.nome = nome;
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String studio){
        this(nome, tipo, episodios, genero); // Chamando o 2 construtor
        this.studio = studio;
    }

    public Anime(){

    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }

}
