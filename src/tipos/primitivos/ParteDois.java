package tipos.primitivos;

// Aula 2 - Parte 2 - Declaração e tamanho em memória

public class ParteDois {
    public static void main(String[] args) {
       int idade = 10; // 4 bytes
       long numeroGrande = 100000; // 8 bytes
       double salarioDouble = 2000; // 8 bytes
       float salarioFloat = 2500; // 4 bytes
       byte idadeByte = 10; // -128 a 127
       short idadeShort = 10; // 2 bytes
       boolean verdadeiro = true; // 1 bit
       boolean falso = true; // 1 bit
       char caracter = 'h'; // 2 bytes (se colocar numero, traduz para tabela ascii)

        System.out.println(caracter);


    }
}
