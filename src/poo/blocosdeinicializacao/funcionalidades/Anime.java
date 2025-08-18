package poo.blocosdeinicializacao.funcionalidades;

// Aula 60 - Poo - Parte 1 - Blocos de inicializaço
// Pode inicializar os valores dentro dos construtores

/*
✅ O que é um bloco de inicialização de instância em Java?
É um bloco de código entre chaves {} fora de qualquer método ou construtor, que roda toda vez que um objeto da classe é criado.
*/

/*
 🧠 Por que usar?
Às vezes você quer inicializar alguma coisa para todos os objetos, mas não quer repetir esse código em todos os construtores.
*/



public class Anime {
    private String nome;
    private int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    {
        System.out.println("Dentro do bloco de inicializacao de instancia"); // Executado todas as vezes que cria um objeto
    }

    // 1 - Alocado espaco em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicializacao é executado
    // 4 - Construtor é executado

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio: this.episodios){
            System.out.println(episodio + " ");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return this.episodios;
    }
}
