package estruturas.de.repeticao;

// Aula 28 - Estruturas de Repetição - Parte 2 - Exercicio For

public class ExercicioFor {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 ate 1000
        int num = 1000;
        int cont;

        for (cont = 0; cont <= num; cont++) {
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
        }
    }

}
