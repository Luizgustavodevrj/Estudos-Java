package poo.exclasses.um.funcionalidades;

public class Carro {
    // Atributos
    public String nome;
    public String modelo;
    public int ano;

    // Construtor
    public Carro(String nome, String modelo, int ano){
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Metodos
    public void exibeNomeModelo(){
        System.out.println(nome + " " + modelo);
    }

    public void exibeAno(){
        System.out.println("Ano: " + ano);
    }

}
