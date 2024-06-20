package model;

public class ContaCorrente extends Conta {
    private double chequeEspecial = 500;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void sacar(double valor) {
        if (valor > this.saldo + chequeEspecial) {
            throw new IllegalArgumentException("Saldo insuficiente mesmo com cheque especial.");
        } else {
            if (valor > this.saldo) {
                chequeEspecial -= (valor - this.saldo);
                this.saldo = 0;
            } else {
                this.saldo -= valor;
            }
        }
    }

    public void imprimirExtrato() {
        System.out.println("===Extrato ContaCorrente===");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return "ContaCorrente [cliente=" + cliente.getNome() + ", numeroConta=" + numeroConta + ", saldo=" + saldo
                + "]";
    }

}