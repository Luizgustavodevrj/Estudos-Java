package poo.associacao.unidimensionalumparamontes;

// Aula 65 - Poo - Associação - Parte 2 - Associação unidirecional um para muitos


import poo.associacao.arrayscomobjetos.funcionalidades.Jogador;

public class teste {
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





/*
Jogador 1 -- 1 Personagem (Um jogador pode ter um personagem)
Time 1 --> N jogador (Um time pode ter muitos jogadores) A seta indica que a relação é unidirecional (SO a classe time conhece a classe jogador)
Jogador N -- 1 Time
Estudante N -- N Curso
*/