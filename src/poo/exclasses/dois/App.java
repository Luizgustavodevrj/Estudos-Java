package poo.exclasses.dois;

import poo.exclasses.dois.funcionalidades.Data;

public class App {
    public static void main(String[] args) {
        Data data = new Data("14/01/2016");
        data.imprime();
        System.out.println("Dia: " + data.getDia());
        System.out.println("Mes: " + data.getMes());
        System.out.println("Ano: " + data.getAno());
        data.isBissexto();


    }
}
