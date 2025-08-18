package poo.metodos.partesete.funcionalidades7;
// Aula 50 - Poo - Parte 7 - Metodos - Parametro tipos de referencia pt2



public class Calculadora7 {
    public int num1;
    public int num2;

    public void alteraDoisNumeros(Calculadora7 obj){
        obj.num1 = 99;
        obj.num1 = 33;
        System.out.println("Num1: " + obj.num1 + "Num2: " + obj.num2);
    }
}

