package estruturas.condicionais;

// Aula 26 - Estruturas Condicionais - Parte 7 - Switch - Exercicio

// Dado os valores de 1 a 7, imprima se é dia util ou final de semana

public class Ex1 {
    public static void main(String[] args) {
        int dia = 2;
        // Char, int, byte, short, enum, String
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
            default:
                System.out.println("Dia invalido!");
        }
    }
}
