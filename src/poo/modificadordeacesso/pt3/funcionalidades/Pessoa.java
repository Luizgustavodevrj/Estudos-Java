package poo.modificadordeacesso.pt3.funcionalidades;
// Aula 56 - Poo - Parte 3 - Modificador de acesso private, get e set
// EXISTEM VALORES QUE SAO APENAS PARA LEITURA E DEVE SER ACESSADO APENAS PELO OBJETO
public class Pessoa {
    private String nome;
    private int idade; // Torna privado, so acessado dentro da classe mae

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
