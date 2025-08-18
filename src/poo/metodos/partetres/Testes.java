package poo.metodos.partetres;

import poo.metodos.partetres.funcionalidades.Calculadora;

// Aula 46 - Poo - Parte 3 - Metodos - Retorno pt1
public class Testes {
    public static void main(String[] args) {
        Calculadora obj = new Calculadora();
        double var;

        obj.subtraiDoisNumeros(1, 2);
        obj.somaDoisNumeros(1, 2);
        var = obj.divideDoisNumeros(1, 0);
        System.out.println(var);
    }
}
