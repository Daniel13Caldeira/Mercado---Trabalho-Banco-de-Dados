package model;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> produtos;
    private Cliente cliente;

    public Carrinho() {
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(int cod, double quantidade) {

    }

    public void removerProduto(int cod, double quantidade) {

    }

    public double getPrecoTotal() {
        return 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
