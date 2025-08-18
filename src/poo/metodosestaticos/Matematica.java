package poo.metodosestaticos;
import poo.metodosestaticos.funcionalidades.Calculadora;

public class Matematica {
    public static void main(String[] args) {
        Calculadora matematica = new Calculadora(); // Pra utilizar os metodos, PRECISA criar um objeto, por isso usar o modificador static
        System.out.println(matematica.triplicar(3));

        //  Não precisa instanciar, ja pode usar o metodo estatico direto pela classe. Ja da acesso direto aos metodos(estaticos)
        System.out.println(Calculadora.calcularAreaCirculo(2));

    }


}
