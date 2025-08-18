package zoopcursoemvideo.exemplopraticocomobjetos;

// Aula 5 - Exemplo prático com objeto

import zoopcursoemvideo.exemplopraticocomobjetos.funcionalidades.Conta;

public class App {
    public static void main(String[] args) {
        Conta conta = new Conta(2121, "cc", "Luiz Gustavo Gomes da Silva");
        conta.imprimeInformacoes();
        conta.abrirConta();
        conta.imprimeInformacoes();
        conta.depositar(20);
        conta.imprimeInformacoes();
        conta.sacar(25);
        conta.imprimeInformacoes();
        conta.pagarMensalidade();
        conta.imprimeInformacoes();
        conta.fecharConta();
        conta.sacar(33);
        conta.imprimeInformacoes();
        conta.fecharConta();
        conta.imprimeInformacoes();
    }
}
