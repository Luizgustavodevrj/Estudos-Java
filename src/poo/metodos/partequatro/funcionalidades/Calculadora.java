package poo.metodos.partequatro.funcionalidades;
// Aula 47 - Poo - Parte 4 - Metodos - Retorno pt2

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
