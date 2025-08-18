package estruturas.de.repeticao;

// Aula 31 - Estruturas de repetição - Parte 5 - Continue
// Contrario do break

/*
Ele não executa o resto da lógica que estaria depois.
Volta para o início do laço e vai para o próximo número.
 */

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // pula o resto da repetição quando i for 3
            }
            System.out.println("Número: " + i);
        }
    }
}
