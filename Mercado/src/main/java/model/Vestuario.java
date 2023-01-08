package model;
public class Vestuario extends Produto {

    protected String tamanho;

    public Vestuario(int id, double preco, String nome, String fornecedor, String tamanho, double quantidade) {
        super(id, preco, nome, fornecedor, quantidade);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

}
