package poo.coesao;

// Aula 41 - Poo - Parte 1 - Coesão

// As classes nao estao misturando o proposito delas existindo, elas estao coesas

public class ParteUm { // Classe estudante
        public String nome;
        public int idade;
        public char sexo;

        public String nomeProfessor;
        public int idadeProfessor;
        public char sexoProfessor;
}
// Isso ta "errado", professor deveria estar separado da classe Estudante
// Tambem usar psvm é de baixa coesao, pode usar mas nao é coeso, ate mesmo para testes
//O mais correto seria criar uma classe para o teste especifico