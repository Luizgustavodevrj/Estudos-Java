package zoopcursoemvideo.encapsulamento;

import zoopcursoemvideo.encapsulamento.funcionalidades.ControleRemoto;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.abrirMenu();
        c.maisVolume();
        c.maisVolume();
        c.abrirMenu();
    }
}
