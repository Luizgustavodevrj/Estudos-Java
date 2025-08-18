package arrays;
import java.util.Scanner;
// Pegar dados do teclado e por em um array simples


public class Teste01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] notas = new int[2];

        for (int i = 0; i < notas.length; i++) {
            System.out.print(i + ")Digite sua nota: ");
            int nota = scanner.nextInt();
            notas[i] = nota;
        }



        for (int nota : notas) {
            System.out.println(nota);
        }

        int media = (notas[0] + notas[1]) / 2;
        System.out.println(media);

    }
}
