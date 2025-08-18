package poo.metodos.partedez;

// Aula 53 - Poo - Parte 10 - Metodos - Exercicio

/*
*  Crie uma classe Funcionario com os seguintes atributos
*  Nome
*  Idade
*  Salario // Tres salarios devem ser guardados
*
*  Crie dois metodos
*
*  1. Para imprimir os dados
*  2. Para tirar a media dos salarios e imprimir o resultado
* */

import poo.metodos.partedez.funcionalidas10.Funcionario;

public class Teste10 {
    public static void main(String[] args) {
        Funcionario luiz = new Funcionario();
        luiz.idade = 20;
        luiz.nome = "Luiz Gustavo Gomes da Silva Oliveira";
        luiz.salario = new double[]{1200, 1250, 1300};
        luiz.imprimeDados();
        luiz.imprimeMedia();
    }
}
