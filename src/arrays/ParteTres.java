package arrays;

// Aula 34 - Arrays (Vetores) - Parte 3 -

public class ParteTres {
    public static void main(String[] args) {
        String[] nomes = new String[3]; // Criando array de tres posicoes
        nomes[0] = "Luiz";
        nomes[1] = "Gustavo";
        nomes[2] = "Gomes da Silva Oliveira";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        nomes = new String[5]; // A String inicial morre e se cria outro do 0

    }
}
