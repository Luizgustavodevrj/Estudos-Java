package arrays;

// Aula 35 - Arrays (Vetores) - Parte 4 - ForEach
// for(tipo do array nomeVariable:array){}
// Ele não acessa os indices

public class ParteQuatro {
    public static void main(String[] args) {
        int[] arr1 = new int[3]; // Uma forma de inicializar (com 0)
        int[] arr2 = {1, 2, 3}; // Outra forma de se iniciar
        int[] arr3 = new int[]{1,2,3}; // Outra forma

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        for (int i:arr2){ // Variable local
            System.out.println(i);
        }

        /*
        * int i = arr3[0];
        * sout(i);
        * i = arr3[1];
        * sout(i)
        * i = arr3[2];
        * sout(i)
        * */

    }
}
