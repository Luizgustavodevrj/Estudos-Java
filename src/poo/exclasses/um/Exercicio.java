package poo.exclasses.um;
import poo.exclasses.um.funcionalidades.Carro;

// Aula 42 - Poo - Parte 1 - Exercicio classes

// Crie um classe Carro com os atributos
// Nome, modelo e ano
// Criar dois metodos que imprima seus valores

public class Exercicio {
    public static void main(String[] args) {
        Carro obj = new Carro("Fiat", "Uno", 2014);

        obj.exibeNomeModelo();
        obj.exibeAno();
    }
}
