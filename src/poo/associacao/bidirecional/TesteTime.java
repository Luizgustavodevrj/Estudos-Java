package poo.associacao.bidirecional;
// Aula 67 - Poo - Associação - Parte 4 - Associação bidirecional
import poo.associacao.bidirecional.funcionalidades.Jogador;
import poo.associacao.bidirecional.funcionalidades.Time;

public class TesteTime {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");

        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
