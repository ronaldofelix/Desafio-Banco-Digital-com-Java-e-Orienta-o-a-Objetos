package model;

public class Cliente {

    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void getNome() {
        return this.nome;
    }

    public void getCpf() {
        return this.cpf;
    }

    public String setNome(String nome) {
        this.nome = nome;
    }

    public String setCpf(String cpf) {
        this.cpf = cpf;
    }

    


}