package model;

public class Produto {

    protected int id;
    protected double preco, quantidade;
    protected String nome;
    protected String fornecedor;
    protected String tipo;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public Produto(int id, double preco, String nome, String fornecedor, double quantidade, String tipo) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public Produto(int id, double quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(int id) {
        this.id = id;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public int getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
