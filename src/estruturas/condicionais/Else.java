package estruturas.condicionais;

// Aula 21 - Estruturas Condicionais - Parte 2 - Else

public class Else {
    public static void main(String[] args) {
        int idade = 21;

        if (idade >= 17 && idade <= 20){
            System.out.println("Sub - 20");
        } else if (idade > 20) {
            System.out.println("Profissional");
        } else{
            System.out.println("Juvenil");
        }
    }
}
