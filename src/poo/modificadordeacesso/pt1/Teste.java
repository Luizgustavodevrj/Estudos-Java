package poo.modificadordeacesso.pt1;
import poo.modificadordeacesso.pt1.funcionalidades.Pessoa;
// Aula 54 - Poo - Parte 1 - Modificador de acesso private, get e set

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
