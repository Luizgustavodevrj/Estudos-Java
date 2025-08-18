package poo.metodos.partedois;
import poo.metodos.partedois.funcionalidades.Calculadora;
// Aula 45 - Poo - Parte 2 - Metodos - Parametros
// public void nomeFuncao(parametros){}
// obj.nomeFuncao(argumentos);
// Por conveção de boas práticas não é recomendado usar metodos com mais de dois parâmetros, é melhor dividir

public class Teste {
    public static void main(String[] args) {
        Calculadora obj = new Calculadora();
        obj.subtraiDoisNumeros(1, 2);
        obj.somaDoisNumeros(1, 2);
    }
}
