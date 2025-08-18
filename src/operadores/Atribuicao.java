package operadores;

//  Aula 18 - Operadores - Parte 5 - Atribuicao

// = += -= /= %=
// ++ (mais um)
// --

public class Atribuicao {
    public static void main(String[] args) {
        double bonus = 1800;
        bonus *= 2;
        System.out.println(bonus);
        bonus += 1000;
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

        int cont = 0;
        System.out.println("Contador: " + cont++);
        System.out.println("Contador: " + cont);

        int i = 0;
        System.out.println("I: " + ++i);
    }
}
