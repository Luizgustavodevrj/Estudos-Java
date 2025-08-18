package poo.modificadordeacesso.pt2;

// Aula 55 - Poo - Parte 2 - Modificador de acesso private, get e set

import poo.modificadordeacesso.pt2.funcionalidades.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa obj = new Pessoa();
        String name;
        obj.setNome("Luiz");
        obj.setIdade(12);
        obj.imprime();

        name = obj.getNome();
        System.out.println(name);

        int idade = obj.getIdade();
        System.out.println(idade);
    }
}
