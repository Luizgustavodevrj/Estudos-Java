package estruturas.condicionais;
import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero a: ");
        double numA = scanner.nextDouble();

        System.out.print("Digite um numero B: ");
        double numB = scanner.nextDouble();

        System.out.println("1 - Adiçao");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.println("Qual sua escolha? ");
        int i = scanner.nextInt();

        double result;

        if (i == 1) {
            result = numA + numB;
        } else if (i == 2) {
            result = numA - numB;
        } else if (i == 3) {
            result = numA * numB;
        } else {
            result = numA / (double) numB;
        }

        System.out.println("Resultado: " + result);
    }
}
