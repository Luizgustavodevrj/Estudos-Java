package arrays;

// Aula 32 - Arrays (Vetores) - Parte 1 -
// Arrays sao considerados objetos


public class ParteUm {
    public static void main(String[] args) {
        int[] vIdades = new int[3];  // Variavel é do tipo reference (Objeto em memoria) = Sao inicializados com valores padroes
        vIdades[0] = 21;
        vIdades[1] = 15;
        vIdades[2] = 18;

        for (int i = 0; i < 3; i++){
            System.out.println(vIdades[i]);
        }
    }
}
