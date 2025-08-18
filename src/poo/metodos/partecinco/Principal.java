package poo.metodos.partecinco;
// Aula 48 - Poo - Parte 5 - Metodos - Parametro tipos primitivos
// Os parametros passados pros metodos sao "copias"
import poo.metodos.partecinco.classes.Calculador;
public class Principal {
    public static void main(String[] args) {
        Calculador obj = new Calculador();
        int a=0;
        int b=2;
        obj.alteraDoisNumeros(a, b);
    }
}
