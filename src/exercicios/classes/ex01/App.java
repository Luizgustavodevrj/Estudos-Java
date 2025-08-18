package exercicios.classes.ex01;

import exercicios.classes.ex01.funcionalidades.Aluno;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("-------ALUNO-------");

        System.out.println("Qual seu nome? ");
        String nome = scan.nextLine();

        System.out.println("Qual sua matricula? ");
        int mtr = scan.nextInt();

        System.out.println("Qual sua nota 1? ");
        double n1 = scan.nextDouble();

        System.out.println("Qual sua nota 2? ");
        double n2 = scan.nextDouble();

        System.out.println("Qual sua nota no trabalho? ");
        double nTrabalho = scan.nextDouble();

        Aluno aluno = new Aluno(mtr, nome, n1, n2, nTrabalho);

        double media = aluno.media();
        double provaFinal = aluno.provaFinal();

        if(aluno.situacao() == 0){
            System.out.println("Aprovado!");
            System.out.println("Media: " + media);
        } else{
            System.out.println("Prova Final!");
            System.out.println("Media: " + media);
            System.out.println("Você " + nome + " precisa de " + provaFinal + " para fazer a prova final");
        }



    }
}
