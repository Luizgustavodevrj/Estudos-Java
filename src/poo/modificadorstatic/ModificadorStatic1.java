package poo.modificadorstatic;
import poo.modificadorstatic.funcionalidades.Carro;

// Aula 61 - Poo - Parte 1 - Modificador Static
// Os objetos sao independentes, se mudar um, nao muda todos, por isso usar modificador static que afete a instancia
// static afeta todos objetos
// Static faz o atributo pertencer a classe

public class ModificadorStatic1 {
    public static void main(String[] args) {
        Carro car1 = new Carro("BMW", 280);
        Carro car2 = new Carro("Fiat", 120);
        Carro car3 = new Carro("Mercedes", 275);
        Carro.velocidadeLimite = 180; // Afeta todos objetos da classe, é mais visivel do que usar ao static

        car1.imprime();
        car2.imprime();
        car3.imprime();

    }
}
