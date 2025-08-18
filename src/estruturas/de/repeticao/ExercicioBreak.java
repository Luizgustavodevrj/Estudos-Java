package estruturas.de.repeticao;

// Aula 30 - Estruturas de repetição - Parte 4 - Exercicio Break

// Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
// Condicao valorParcela >= 1000

public class ExercicioBreak {
    public static void main(String[] args) {
        double valorTotal = 50000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " - R$ " + valorParcela);
        }
    }
}
