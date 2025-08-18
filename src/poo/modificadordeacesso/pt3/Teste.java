package poo.modificadordeacesso.pt3;
import poo.modificadordeacesso.pt3.funcionalidades.Pessoa;

// Aula 56 - Poo - Parte 3 - Modificador de acesso private, get e set
// EXISTEM VALORES QUE SAO APENAS PARA LEITURA E DEVE SER ACESSADO APENAS PELO OBJETO
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
