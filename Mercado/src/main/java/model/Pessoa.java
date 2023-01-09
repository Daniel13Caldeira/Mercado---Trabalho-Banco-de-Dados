package model;
public abstract class Pessoa {

    protected String nome, cpf, senha;
    protected Endereco endereco;

    public Pessoa(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, Endereco endereco, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.senha = senha;
    }

    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(String cpf, Endereco endereco) {
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

}
