package poo.metodosestaticos.funcionalidades;

// Atributos estáticos são o mesmo para todos os objetos que serão instanciados

public class Calculadora {
    private static double pi = 3.1415;

    public int triplicar (int num){
        return num * 3;
    }

    public static int somar (int numA, int numB){
        return numA + numB;
    }

    public static double calcularAreaQuadrado(double lado){
        return lado * lado;
    }

    public static double calcularAreaCirculo(double raio){
        return pi * raio * raio; // So pode usar variaveis estaticas, pq metodos estaticos nao referenciam; E se precisarem usar outros metodos, eles precisam tbm ser estaticos
    }


}
