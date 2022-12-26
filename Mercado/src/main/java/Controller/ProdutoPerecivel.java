/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

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
