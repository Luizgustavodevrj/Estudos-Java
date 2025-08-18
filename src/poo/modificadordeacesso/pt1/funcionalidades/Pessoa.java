package poo.modificadordeacesso.pt1.funcionalidades;
// Aula 54 - Poo - Parte 1 - Modificador de acesso private, get e set

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
