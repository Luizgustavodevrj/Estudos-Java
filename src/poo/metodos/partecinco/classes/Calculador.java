package poo.metodos.partecinco.classes;

// Aula 48 - Poo - Parte 5 - Metodos - Parametro tipos primitivos

public class Calculador {
    public void somaDoisNumeros(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public void subtraiDoisNumeros(int num1, int num2){
        System.out.println(num2 - num1);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return (int)(num2 / num1);
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Num1: " + numero1 + "Num2: " + numero2);
    }
}
