package arrays;

// Aula 33 - Arrays (Vetores) - Parte 2 -

// Valores padroes
//byte, short, int, long, float e double - Iniciam com 0
// Char - \u0000
// boolean false
// String null

public class ParteDois {
    public static void main(String[] args) {
        int[] vIdades = new int[3];  // Variavel é do tipo reference (Objeto em memoria) = Sao inicializados com valores padroes
        vIdades[0] = 21;
        vIdades[1] = 15;
        vIdades[2] = 18;

        for (int i = 0; i < 3; i++)System.out.println(vIdades[i]);

    }
}
