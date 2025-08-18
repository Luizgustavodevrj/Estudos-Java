package poo.modificadorstatic.funcionalidades;

// Aula 61 - Poo - Parte 1 - Modificador Static
// Os objetos sao independentes, se mudar um, nao muda todos, por isso usar modificador static que afete a instancia
// static afeta todos objetos
public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250; // Pertence ao carro tipo meta-dado

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-------------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade maxima: " + this.velocidadeMaxima + " Km/H");
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite + " Km/H"); // Nao deve ser usado com this. pois é estatico
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
