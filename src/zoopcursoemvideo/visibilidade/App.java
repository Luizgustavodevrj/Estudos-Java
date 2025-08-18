package zoopcursoemvideo.visibilidade;

// Aula 3 - Mudando a visibilidade

import zoopcursoemvideo.visibilidade.funcionalidades.Caneta;

public class App {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Cristal";
        caneta1.status();
        caneta1.cor = "red";

    }
}
