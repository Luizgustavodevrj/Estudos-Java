package poo.metodos.parteseis;

// Aula 49 - Poo - Parte 6 - Metodos - Parametro tipos de referencia

import poo.metodos.parteseis.funcionalidades6.Calculadora6;

public class Teste6 {
    public static void main(String[] args) {
        Calculadora6 obj = new Calculadora6();
        obj.a = 0;
        obj.b = 2;
        obj.alteraDoisNumeros(obj); // Passar objeto como argumento vc esta passando a referencia onde o obj esta guardado
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
    // A e B sao variaveis que estao fazendo referencia ao mesmo objeto
}
