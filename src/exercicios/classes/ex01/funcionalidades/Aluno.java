package exercicios.classes.ex01.funcionalidades;

/*
Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto
dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de
trabalho
*/

// media -> Calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
// final -> Calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)


public class Aluno {
    public int matricula;
    public String nome;
    public double nota1;
    public double nota2;
    public double trabalho;

    public Aluno(int matricula, String nome, double nota1, double nota2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }

    public double media(){
        return ((this.nota1 * 2.5) + (this.nota2 * 2.5) + (this.trabalho * 2.0)) /7;
    }

    public double provaFinal(){
        double notaFinal = media();
        double restante = 6.0 - notaFinal;
        double resultado;

        if (notaFinal <= 5.9){
            resultado =  restante;
        } else{
            resultado =  0;
        }

        return resultado;
    }

    public int situacao(){
        if (media() >= 6.0){
            return 0;
        } else{
            return 1;
        }
    }

}
