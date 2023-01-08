package model;
public class ProdutoPerecivel extends Produto {

    private String validade;

    public ProdutoPerecivel(String validade, int id, double preco, String nome, String fornecedor, double quantidade) {
        super(id, preco, nome, fornecedor, quantidade);
        this.validade = validade;
    }

    public ProdutoPerecivel(String validade, String nome) {
        super(nome);
        this.validade = validade;
    }

    public ProdutoPerecivel(String validade, int id) {
        super(id);
        this.validade = validade;
    }

    public String getValidade() {
        return validade;
    }

}
