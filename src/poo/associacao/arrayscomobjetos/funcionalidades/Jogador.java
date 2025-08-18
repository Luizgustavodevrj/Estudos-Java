package poo.associacao.arrayscomobjetos.funcionalidades;

// Aula 64 - Poo - Associação - Parte 1 - Arrays com objeto

import poo.associacao.unidimensionalumparamontes.funcionalidades.Time;

public class Jogador {
    private String nome;

    public void imprime(){
        System.out.println(this.nome);
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTime(Time time) {
    }
}
