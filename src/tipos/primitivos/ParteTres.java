package tipos.primitivos;

// Aula 11 - Parte 3 - Casting (forçar entrada de um valor)
// CASTING nao é um uso tao recomendado

public class ParteTres {
    public static void main(String[] args) {
        int idade = (int) 1000000000000000L;  // forçando a ser long
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F; // especificar que é float pq se nao ele vai entender que é double
        float salarioF = (float) 2500.0;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = true;
        char caracter = 'h';

    }
}