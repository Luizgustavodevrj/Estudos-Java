package estruturas.de.repeticao;

// Aula 27 - Estruturas de Repetição - Parte 1 -While, DO While, For

public class WhileDoWhileFor {
    public static void main(String[] args) {
        int contador = 0;
        int cont = 0;

        // While
        while (contador < 10){ // Se resultador for True
            System.out.println(contador);
            contador++;
        }

        // Do while
        do {
            System.out.println(cont);
            cont++;
        } while (cont < 10);

        // For
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
