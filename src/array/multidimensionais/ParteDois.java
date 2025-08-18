package array.multidimensionais;

// Aula 37 - Arrays Multidimensionais - Parte 2 - Foreach

public class ParteDois {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 21;
        dias[0][1] = 22;
        dias[0][2] = 23;

        dias[1][0] = 24;
        dias[1][1] = 25;
        dias[1][2] = 26;

        dias[2][0] = 27;
        dias[2][1] = 28;
        dias[2][2] = 29;

        /* Acessando
        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        */

        for(int []arrBase:dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }

    }
}
