package poo.introducaoclasses.teste;

// Aula 39 - Poo - Parte 1 - Introducao a classes

import poo.introducaoclasses.Pessoa;

public class Teste1 {
    public static void main(String[] args) {
        Pessoa estudante = new Pessoa(); // Criando objeto
        estudante.nome = "Luiz"; // Variavel tipo reference, se printar so ela, ela retorna endereço de memoria
        estudante.idade = 20;
        estudante.sexo =  'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
