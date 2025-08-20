package zoopcursoemvideo.agregacao.funcionalidades;

import java.util.Objects;

public class Luta {
    private Lutador desafiado; // Tipo abstrato de dados
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Construtor

    public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }

    // Getters and Setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int ro) {
        this.rounds = ro;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean ap) {
        this.aprovada = ap;
    }

    // Metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if((Objects.equals(l1.getCategoria(), l2.getCategoria())) && (l1 != l2)){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if(this.aprovada){
            desafiado.apresentar();
            desafiante.apresentar();
            int vencendor = (int) (Math.random() * 3);

            switch (vencendor){
                case 0:
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                case 1:
                    System.out.println(desafiado.getNome() + " ganhou!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                case 2:
                    System.out.println(desafiante.getNome() + " ganhou!");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
            }


        } else{
            System.out.println("Luta não pode acontecer!");
        }
    }
}
