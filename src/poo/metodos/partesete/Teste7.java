package poo.metodos.partesete;

// Aula 50 - Poo - Parte 7 - Metodos - Parametro tipos de referencia pt2
// NAO RECOMENDADO POIS MUDA TUDO, MELHOR CRIAR COPIAS COM VARIAVEIS AUXILIARES

import poo.metodos.partesete.funcionalidades7.Calculadora7;

public class Teste7 {
    public static void main(String[] args) {
        Calculadora7 obj = new Calculadora7();
        obj.num1 = 0;
        obj.num2 = 2;
        obj.alteraDoisNumeros(obj); // Passar objeto como argumento vc esta passando a referencia onde o OBJETO esta guardado
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
