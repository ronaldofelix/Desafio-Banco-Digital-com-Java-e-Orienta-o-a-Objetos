package model;

public enum TipoConta {
    CONTA_CORRENTE("ContaCorrente"),
    CONTA_POUPANCA("ContaPoupanca");

    private String tipoConta;

    private TipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

}
