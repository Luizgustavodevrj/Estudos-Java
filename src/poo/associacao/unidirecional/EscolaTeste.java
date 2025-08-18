package poo.associacao.unidirecional;

// Aula 66 - Poo - Associação - Parte 3 - Associação unidirecional

// Uma escola pode ter muitos professores mas um professor pode ter uma escola

import poo.associacao.unidirecional.funcionalidades.Escola;
import poo.associacao.unidirecional.funcionalidades.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("Cutrim");
        Escola escola = new Escola("Iserj");

        escola.imprime();
    }
}
