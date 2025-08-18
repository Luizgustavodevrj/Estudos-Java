package operadores;

// Aula 17 - Operadores - Parte 3 - Logicos And

// E - &&
// OU - ||
// NEGAÇÃO - !

public class LogicosAnd {
    public static void main(String[] args) {
        int idade = 17;
        boolean podeVotar = idade >= 16 && idade <= 65;
        System.out.println("Pode votar ou nao : " + podeVotar);
    }
}
