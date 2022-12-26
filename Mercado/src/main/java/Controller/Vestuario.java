package Controller;

public class Vestuario extends Produto {

    protected String tamanho;
    protected int quantidade;

    public Vestuario(int id, double preco, String nome, String fornecedor, String tamanho, int quantidade) {
        super(id, preco, nome, fornecedor);
        this.quantidade = quantidade;
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
