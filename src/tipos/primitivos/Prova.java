package tipos.primitivos;
import java.util.Scanner;

// So um teste

public class Prova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite numero a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite numero b: ");
        double b = scanner.nextDouble();

        double media = (a + b) / 2;

        System.out.println("A media é: "+ media);
    }
}
