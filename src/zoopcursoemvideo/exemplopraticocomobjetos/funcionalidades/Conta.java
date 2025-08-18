package zoopcursoemvideo.exemplopraticocomobjetos.funcionalidades;

/*
 Conta de banco
 -> + numero da conta
 -> # tipo (corrrente ou poupança - CC/CP)
 -> - nome da conta
 -> - saldo
 -> - status (aberto ou fechado - boolean)

 abrirConta() - Mudar o status da conta pra True/Que tipo de conta/Se for conta corrente ele ganha 50$ e  conta poupança ganha 150$/
 fecharConta() - Nao pode fechar a conta se estiver devendo/ Nao pode ter dinheiro na conta, tem que sacar/mudar status pra False
 depositar() - Ela tem que estar com status verdadeiro
 sacar() -  Tem que ter saldo
 pagarMensalidade() - Conta corrente sera retirado 12$ reais da conta e Conta poupança paga 20$ /
*/

import java.util.Objects;

public class Conta {
    public int numConta;
    protected String tipo;
    private String nome;
    private double saldo = 0;
    private boolean status = false;

    // Construtores
    public Conta(int numConta, String tipo, String nome) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.nome = nome;
    }

    // Getters and Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Funções
    public void imprimeInformacoes(){
        if (Objects.equals(getTipo(), "cc") || Objects.equals(getTipo(), "CC")){
            System.out.println("Conta corrente");
        } else{
            System.out.println("Conta poupança");
        }
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Nome: " + getNome());
        System.out.println("Saldo: R$ " + getSaldo());
        if (isStatus()) {
            System.out.println("Status: " + " Aberto!");
        } else {
            System.out.println("Status: " + " Fechado!");
        }
    }

    public void abrirConta(){
        setStatus(true);
        setTipo(this.tipo);
        if(Objects.equals(getTipo(), "CC") || Objects.equals(getTipo(), "cc")){
            setSaldo(50.00);
            System.out.println("Conta corrente criada!!!");
        } else{
            setSaldo(150.00);
            System.out.println("Conta poupança criada!!!");
        }
    }

    public void fecharConta() {
        if(this.saldo < 0){
            System.out.println("NÃO PODE FECHAR POIS ESTA DEVENDO!!!");
        } else if(this.saldo > 0){
            System.out.println("NÃO PODE FECHAR CONTA POIS ESTA COM CONTA EM DEBITO!!!");
        } else{
            setStatus(false);
            System.out.println("Conta desativada!!!");
        }
    }

    public void depositar(double valor){
        if (isStatus()) {
            setSaldo(getSaldo() + valor);
            System.out.println("Valor de " + valor + " depositado de sua conta!!!");
        } else{
            System.out.println("ERROR!!!");
        }
    }

    public void sacar(double valor){
        if (getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Valor de " + valor + " sacado de sua conta!!!");
        } else{
            System.out.println("Valor a ser sacado é menor que o saldo!!!");
        }
    }

    public void pagarMensalidade() {
        // Conta corrente sera retirado 12$ reais da conta e Conta poupança paga 20$
        if ((Objects.equals(getTipo(), "CC")) || (Objects.equals(getTipo(), "cc"))){
            setSaldo(getSaldo() - 12.00);
            System.out.println("-R$ 12.00");
            System.out.println("Mensalidade paga!!!");
        } else{
            setSaldo(getSaldo() - 20.00);
            System.out.println("-R$ 20.00");
            System.out.println("Mensalidade paga!!!");
        }
    }

}
