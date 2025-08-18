package tipos.primitivos;
import java.util.Scanner;

// Crie variaveis para campos descritos abaixo entre <> e imprima:
//Eu <nome>, morando no <endereço>, confirmo que recebi o salario de <salario, da data <data>

public class ParteCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite seu salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // consumir a quebra de linha pendentescanner.nextLine();

        System.out.print("Digite a data recebida: ");
        String data = scanner.nextLine();

        System.out.println("Eu " + nome + ", morando na Rua " + endereco + ", confirmo que recebi o salario de " +  salario + ", na data " + data);

    }
}
