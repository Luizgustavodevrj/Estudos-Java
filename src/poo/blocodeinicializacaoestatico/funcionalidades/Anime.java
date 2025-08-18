package poo.blocodeinicializacaoestatico.funcionalidades;

public class Anime {
    private String nome;
    private static int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    static {
        System.out.println("Dentro do bloco de inicializacao de instancia"); // Executado todas as vezes que cria um objeto
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio: episodios){
            System.out.println(episodio + " ");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
