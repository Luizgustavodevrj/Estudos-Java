package estruturas.condicionais;

// Aula 20 - Estruturas Condicionais - Parte 1 - If


public class If {
    public static void main(String[] args) {
        int idade = 19;

        if (idade >= 18){
            System.out.println(idade + " anos é Maior de idade");
        } else{
            System.out.println(idade + " anos é Menor de idade");
        }

        boolean isMaiorDeIdade = idade >= 18;

        if (isMaiorDeIdade) { // Se true
            System.out.println(idade + " anos é Maior de idade");
        } else{
            System.out.println(idade + " anos é Menor de idade");
        }


        System.out.println("===========");
        if (!isMaiorDeIdade){
            System.out.println(idade + " anos é Menor de idade");
        }

    }
}
