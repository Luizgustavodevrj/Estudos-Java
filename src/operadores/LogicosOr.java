package operadores;

//  Aula 18 - Operadores - Parte 4 - Logicos Or
//

/// / E - &&
/// / OU - ||
/// / NEGAÇÃO - !

public class LogicosOr {
    public static void main(String[] args) {
        int jogador = 7;

        boolean isBom = jogador == 10 || jogador == 7 || jogador == 11;
        System.out.println(isBom);
    }
}
