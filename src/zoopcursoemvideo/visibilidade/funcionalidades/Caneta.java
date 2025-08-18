package zoopcursoemvideo.visibilidade.funcionalidades;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean lampada;
    public boolean tampada;

    public void status() {
        System.out.println("Uma caneta " + this.cor);
        if (this.tampada == true) {
            System.out.println("Esta tampada? Sim");
        } else{
            System.out.println("Esta tampada? Não");
        }
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo: "  + this.modelo);
    }

    public void rabiscar() {
        System.out.println("Rabiscando");
    }

    public void tampar() {
        this.tampada = true;
        System.out.println("Tampando a caneta");
    }

    public void destampar() {
        this.tampada = false;
        System.out.println("Destampando a caneta");
    }
}
