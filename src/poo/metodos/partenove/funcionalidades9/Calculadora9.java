package poo.metodos.partenove.funcionalidades9;

// Aula 52 - Poo - Parte 9 - Metodos - varargs

public class Calculadora9 {
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma+=num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){ // Não pode ter parametros na frente do varargs(pode ser o ultimo)
        int soma = 0;
        for(int num: numeros){
            soma+=num;
        }
        System.out.println(soma);
    }

}
