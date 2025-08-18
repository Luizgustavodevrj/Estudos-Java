package zoopcursoemvideo.getsetconstrutor;

// Aula 4 -  Construtores, getters and setters

import zoopcursoemvideo.getsetconstrutor.funcionalidades.Caneta;

public class App {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.setModelo("Bic dourado");
        caneta.setPonta(0.5);
        System.out.println(caneta.getModelo());
        System.out.println(caneta.getPonta());
    }
}
