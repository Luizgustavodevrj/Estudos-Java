package poo.metodosestaticos;

// Aula 62 - Poo - Parte 1 - Metodos estaticos

import poo.metodosestaticos.funcionalidades.Carro;

public class MetodosEstaticos1 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180); // Alterou todos mesmo sendo instanciados individualmente
        Carro car1 = new Carro("BMW", 280);
        Carro car2 = new Carro("Fiat", 120);
        Carro car3 = new Carro("Mercedes", 275);
        Carro.velocidadeLimite = 180;

        car1.imprime();
        car2.imprime();
        car3.imprime();
    }
}
