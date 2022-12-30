
package model;
/**
 *
 * @author danie
 */
public class ProdutoPerecivel extends Produto{
    private String validade;

    public ProdutoPerecivel(String validade, int id, double preco, String nome, String fornecedor) {
        super(id, preco, nome, fornecedor);
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
