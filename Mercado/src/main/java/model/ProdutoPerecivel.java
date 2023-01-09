package model;
public class ProdutoPerecivel extends Produto {

    private String validade;

    public ProdutoPerecivel(String validade, int id, double preco, String nome, String fornecedor, double quantidade) {
        super(id, preco, nome, fornecedor, quantidade,"Perecível");
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

    public ProdutoPerecivel(String id) {
        super(id);
    }

    public String getValidade() {
        return validade;
    }

}
