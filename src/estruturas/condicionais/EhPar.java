package estruturas.condicionais;
import java.util.Scanner;

public class EhPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();


        if (num % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É impar");
        }

    }
}
