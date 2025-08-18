package poo.leituradedadospeloteclado.Ex;

// Aula 69 - Poo - Leitura de dados - Parte 2 - Leitura de dados Exercicio

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua pergunta: ");
        String pergunta = input.nextLine();

        if(pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        } else{
            System.out.println("Não");
        }


    }
}
