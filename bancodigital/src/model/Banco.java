package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<Conta>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void imprimirContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public void sacar(int numeroConta, TipoConta tipoConta, double valor) {
        Conta conta = acessarConta(numeroConta, tipoConta);
        conta.sacar(valor);
    }

    public void depositar(int numeroConta, TipoConta tipoConta, double valor) {
        Conta conta = acessarConta(numeroConta, tipoConta);
        conta.depositar(valor);
    }

    public void transferir(int numeroContaOrigem, TipoConta tipoContaOrigem, int numeroContaDestino,
            TipoConta tipoContaDestino, double valor) {
        Conta contaOrigem = acessarConta(numeroContaOrigem, tipoContaOrigem);
        Conta contaDestino = acessarConta(numeroContaDestino, tipoContaDestino);
        contaOrigem.transferencia(valor, contaDestino);
    }

    public void criarConta(Conta conta) {
        this.contas.add(conta);
        System.out.println("Conta criada com sucesso");
    }

    public Conta acessarConta(int numeroConta, TipoConta tipoConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta && verificaTipoConta(conta, tipoConta)) {
                return conta;
            }
        }
        throw new IllegalArgumentException(
                "Conta não encontrada: " + numeroConta + " do tipo " + tipoConta);
    }

    private boolean verificaTipoConta(Conta conta, TipoConta tipoConta) {
        if (tipoConta == TipoConta.CONTA_CORRENTE && conta instanceof ContaCorrente) {
            return true;
        } else if (tipoConta == TipoConta.CONTA_POUPANCA && conta instanceof ContaPoupanca) {
            return true;
        }
        return false;
    }
}