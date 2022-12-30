package model;
public class Remedio extends Produto {

    protected boolean precisaReceita;
    protected int quantidade;

    public Remedio(boolean precisaReceita, int quantidade, int id, double preco, String nome, String fornecedor) {
        super(id, preco, nome, fornecedor);
        this.precisaReceita = precisaReceita;
        this.quantidade = quantidade;
    }

    public boolean isPrecisaReceita() {
        return precisaReceita;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Remedio(int quantidade, String nome) {
        super(nome);
        this.quantidade = quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
