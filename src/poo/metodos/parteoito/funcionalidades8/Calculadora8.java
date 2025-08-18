package poo.metodos.parteoito.funcionalidades8;

// Aula 51 - Poo - Parte 8 - Metodos - Referencia this

public class Calculadora8 {
    public int num1;
    public int num2;

    public void alteraDoisNumeros(Calculadora8 obj){
        obj.num1 = 9;
        obj.num2 = 7;
        System.out.println("Num1: " + this.num1 + "Num2: " + this.num2);
    }
}
