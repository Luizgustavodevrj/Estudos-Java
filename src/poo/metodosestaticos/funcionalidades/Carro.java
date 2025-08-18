package poo.metodosestaticos.funcionalidades;

// Nao pode acessar nenhuma variavel nao estatica, dentro dos metodos estaticos
// This nao existe em metodos estaticos ( PQ pode ter a possibilidade de nao existir um objeto em memoria)
// Metodo estaticos

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250; // Pertence ao carro tipo meta-dado

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("-------------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade maxima: " + this.velocidadeMaxima + " Km/H");
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite + " Km/H");
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite; // This, se refere ao objeto/instancia, no metodo estatico nao existe this. Por isso usar Carro.
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
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
/*
* Use um método estático quando:

Ele não depende dos atributos do objeto.

Ele realiza uma ação genérica, como um cálculo ou utilidade.
* */

/*
*
* Tipo de método	Precisa criar objeto?	Pode usar this?	Exemplo de uso
Estático (static)	❌ Não	                ❌ Não	         Classe.metodo()
Normal (instância)	✅ Sim	                ✅ Sim           objeto.metodo()
*
* */