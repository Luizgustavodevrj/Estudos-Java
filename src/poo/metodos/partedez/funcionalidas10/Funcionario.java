package poo.metodos.partedez.funcionalidas10;

/*
 *  Crie uma classe Funcionario com os seguintes atributos
 *  Nome
 *  Idade
 *  Salario // Tres salarios devem ser guardados
 *
 *  Crie dois metodos
 *
 *  1. Para imprimir os dados
 *  2. Para tirar a media dos salarios e imprimir o resultado
 * */

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeDados(){
        this.nome = nome;

        System.out.println("================================");
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Idade do funcionario: " + idade);
        System.out.println("Salario: ");
        for (double v : salario) {
            System.out.println(v);
        }
        System.out.println("\n================================");
    }

    public void imprimeMedia(){
        double media;
        double soma=0;
        for (double v : salario) {
            soma+=v;
        }
        media = soma/ salario.length;
        System.out.println("Media de salario: " + media);
    }

}
