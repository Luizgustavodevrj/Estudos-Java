package estruturas.condicionais;

// Aula 22 - Estruturas Condicionais - Parte 3 - Else

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 6000;

        String mensagemDoar = "Vou doar 500 reais";
        String mensagemNaoDoar = "Nao vou poder";
        String resultado;

        if (salario > 5000) {
            resultado = mensagemDoar;
        } else{
            resultado = mensagemNaoDoar;
        }

        System.out.println(resultado);

        // Ternario (condicao) ? verdadeiro : falso;
        resultado = (salario > 7000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
