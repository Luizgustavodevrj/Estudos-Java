package poo.metodos.parteoito;

// Aula 51 - Poo - Parte 8 - Metodos - Referencia this

import poo.metodos.parteoito.funcionalidades8.Calculadora8;

public class Teste8 {
    public static void main(String[] args) {
        Calculadora8 obj = new Calculadora8();
        obj.num1 = 0;
        obj.num2 = 2;

        Calculadora8 obj1 = new Calculadora8();
        obj1.num1 = 3;
        obj1.num2 = 4;

        //obj.alteraDoisNumeros(num1, num2);

        System.out.println(obj.num1);
        System.out.println(obj.num2);

    }
}
