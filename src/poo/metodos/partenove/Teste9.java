package poo.metodos.partenove;

// Aula 52 - Poo - Parte 9 - Metodos - varargs


import poo.metodos.partenove.funcionalidades9.Calculadora9;

public class Teste9 {
    public static void main(String[] args) {
        Calculadora9 obj = new Calculadora9();
        int[] arr = {1, 2, 3, 4, 5};
        obj.somaArray(arr); // PASSANDO ARRAY
        obj.somaVarArgs(1, 2, 3, 4, 5); // PASSANDO VARIOS NUMEROS QUE TRANSFORMA EM, ARRAYS
    }
}
