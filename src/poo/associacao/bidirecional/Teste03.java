package poo.associacao.bidirecional;

import poo.associacao.bidirecional.funcionalidades.Jogador;
import poo.associacao.bidirecional.funcionalidades.Time;

public class Teste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Santos");
        Jogador[] jogadores = {jogador, jogador1};

        jogador.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("-------Jogador-------");
        jogador.imprime();
        System.out.println("-------Time----------");
        time.imprime();
    }
}
/*
* 1 time pode ter mais jogadores
* 1 jogador pode ter um time
* */