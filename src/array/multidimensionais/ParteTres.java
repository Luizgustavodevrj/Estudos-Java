package array.multidimensionais;

// Aula 38 - Arrays Multidimensionais - Parte 3 - Inicialização
// Array do array pai o valor padrao é Nul

public class ParteTres {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        int[][] arr = new int[3][];

        // Outra forma de inicializar
        int[] arr1 = {1,2,3};
        array[2] = arr1;

        // Inicializando o array do array pai
        array[0] = new int[2];
        array[1] = new int[] {3, 2, 1};


        // Outra forma
        int[][] arr2 = {{0, 0}, {1,2}, {3,4}};


        for(int []paraCada: array){
            for(int forEach: paraCada){
                System.out.println(forEach);
            };
        }
    }
}
