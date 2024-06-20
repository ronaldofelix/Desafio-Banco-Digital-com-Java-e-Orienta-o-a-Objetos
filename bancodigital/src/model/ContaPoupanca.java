package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("===Extrato ContaPoupança===");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return "ContaPoucança [cliente=" + cliente.getNome() + ", numeroConta=" + numeroConta + ", saldo=" + saldo
                + "]";
    }

}