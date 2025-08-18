package poo.metodos.partetres.funcionalidades;

// Aula 46 - Poo - Parte 3 - Metodos - Retorno pt1

public class Calculadora {
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

}
