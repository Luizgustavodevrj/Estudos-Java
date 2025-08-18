package poo.metodos.parteseis.funcionalidades6;
// Aula 49 - Poo - Parte 6 - Metodos - Parametro tipos de referencia

public class Calculadora6 {
    public int a;
    public int b;

    public void alteraDoisNumeros(Calculadora6 obj){
        obj.a = 99;
        obj.b = 33;
        System.out.println("Num1: " + obj.a + "Num2: " + obj.b);
    }
}
