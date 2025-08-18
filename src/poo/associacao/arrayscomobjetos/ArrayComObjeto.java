package poo.associacao.arrayscomobjetos;

// Aula 64 - Poo - Associação - Parte 1 - Arrays com objeto

import poo.associacao.arrayscomobjetos.funcionalidades.Jogador;

public class ArrayComObjeto {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Messi");

        Jogador[] vJjogadores = {jogador1, jogador2, jogador3}; // Fazendo referencia a objetos

        for (Jogador jogador : vJjogadores){
            jogador.imprime();
        }
    }
}
