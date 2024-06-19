package model;

public interface ContaInterface {

    void depositar(double valor);

    void sacar(double valor);

    void transferencia(double valor, Conta contaDestino);

    void imprimirExtrato();

}