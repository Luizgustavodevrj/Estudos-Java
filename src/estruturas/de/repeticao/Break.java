package estruturas.de.repeticao;

// Aula 29 - Estruturas de repetição - Parte 3 - Break

public class Break {
    public static void main(String[] args) {
        int num = 10;

        for (int i = 0; i <= num; i++){
            if (i <= 50){
                System.out.println(i);
            } else{
                break;
            }
        }

    }
}
