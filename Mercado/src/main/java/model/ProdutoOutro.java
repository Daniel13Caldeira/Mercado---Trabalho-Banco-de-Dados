package model;

public class ProdutoOutro extends Produto {

    public ProdutoOutro(int id, double preco, String nome, String fornecedor, double quantidade) {
        super(id, preco, nome, fornecedor, quantidade, "Outros");
    }

    public ProdutoOutro(double preco, String nome, String fornecedor, double quantidade) {
        super(preco, nome, fornecedor, quantidade, "Outros");
    }

    public ProdutoOutro(String id) {
        super(id);
    }

}
