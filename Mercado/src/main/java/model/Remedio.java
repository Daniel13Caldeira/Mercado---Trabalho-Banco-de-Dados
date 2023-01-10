package model;

public class Remedio extends Produto {

    protected boolean precisaReceita;
    protected String validade;

    public Remedio(boolean precisaReceita, int id, double preco, String nome, String fornecedor, String validade, double quantidade) {
        super(id, preco, nome, fornecedor, quantidade,"Remédio");
        this.precisaReceita = precisaReceita;
        this.validade = validade;
    }
    public Remedio(boolean precisaReceita,double preco, String nome, String fornecedor, String validade, double quantidade) {
        super(preco, nome, fornecedor, quantidade,"Remédio");
        this.precisaReceita = precisaReceita;
        this.validade = validade;
    }

    public Remedio(int id, double quantidade) {
        super(id, quantidade);
    }

    public Remedio(int id) {
        super(id);
    }

    public String getValidade() {
        return validade;
    }

    public boolean isPrecisaReceita() {
        return precisaReceita;
    }

    public Remedio(int quantidade, String nome) {
        super(nome);
        this.quantidade = quantidade;
    }
}
