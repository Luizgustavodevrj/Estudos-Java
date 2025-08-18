package poo.associacao.unidimensionalumparamontes;

import poo.associacao.arrayscomobjetos.funcionalidades.Jogador;
import poo.associacao.unidimensionalumparamontes.funcionalidades.Time;

public class TesteTime {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");

        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
