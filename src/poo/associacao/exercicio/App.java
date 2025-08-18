package poo.associacao.exercicio;

// Aula 70 - Poo - Associação - Parte 5 - Exercise

import poo.associacao.exercicio.funcionalidades.Aluno;
import poo.associacao.exercicio.funcionalidades.Local;
import poo.associacao.exercicio.funcionalidades.Professor;
import poo.associacao.exercicio.funcionalidades.Seminario;

public class App {
    public static void main(String[] args) {
        // Pré-cadastro
        Local local = new Local("Rua Maracanã, 101");
        Aluno aluno = new Aluno("Luiz Gustavo", 20);
        Professor professor = new Professor("Jones", "Historia");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Historia do Comunismo", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();


    }
}

/*
Crie um sistema que gerencia seminários

O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado

Um aluno poderia estar em apenas um seminários
Um seminário poderá ter nenhum ou vários alunos
Um professor poderá ter vários seminários
Um seminário deve ter um local

Campos básicos(Excluindo relacionamento)
Seminário: título
Aluno: nome e idade
professor: nome e especialidade
local: endereço
*/

