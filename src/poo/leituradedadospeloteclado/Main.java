package poo.leituradedadospeloteclado;

// Aula 68 - Poo - Leitura de dados - Parte 1 - Leitura de dados pelo teclado

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite algo: ");
        String num = entrada.nextLine();
        System.out.println(num);
    }
}
