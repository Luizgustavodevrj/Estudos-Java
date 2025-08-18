package zoopcursoemvideo.classeseobjetos;

// Aula 2 - Classes e Objetos

import zoopcursoemvideo.classeseobjetos.funcionalidades.Caneta;

public class App {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.tampada = false;
        caneta1.status();

        System.out.println("===================");

        Caneta caneta2 = new Caneta();
        caneta2.cor = "Amarela";
        caneta2.ponta = 0.3f;
        caneta2.tampada = true;
        caneta2.status();

    }
}
