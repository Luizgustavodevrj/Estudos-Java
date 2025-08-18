package poo.associacao.bidirecional.funcionalidades;
// Aula 67 - Poo - Associação - Parte 4 - Associação bidirecional

public class Jogador {
    private String nome;
    private Time time; // So pode ter um time

    public void imprime(){
        System.out.println(this.nome);
        if(time != null){
            System.out.println(time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() { // Retorna objeto time
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
