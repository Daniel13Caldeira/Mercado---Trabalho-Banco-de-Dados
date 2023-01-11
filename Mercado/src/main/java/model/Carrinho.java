package model;

import DAO.CarrinhoDAO;
import DAO.ConexaoDAO;
import DAO.ProdutoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.Login;

public class Carrinho {

    private ArrayList<Produto> produtos;
    private Cliente cliente;

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Produto> getProdutos() throws SQLException {
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        Connection conexao = conexaoDAO.getConection();
        CarrinhoDAO carrinhoDAO = new CarrinhoDAO(conexao);
        this.produtos = carrinhoDAO.getProdutos(new Cliente(Login.getUser()));
        return this.produtos;
    }

    public boolean addProduto(int id, double quantidade) throws SQLException {
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        Connection conexao = conexaoDAO.getConection();
        Produto produto = new Produto(id, quantidade);
        ProdutoDAO produtoDAO = new ProdutoDAO(conexao);
        double quantidadeDB = produtoDAO.getQuantidade(produto);
        //verifica se tem estoque
        if (produto.quantidade > quantidadeDB) {
            JOptionPane.showMessageDialog(null, "Não temos estoque suficiente do produto!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        CarrinhoDAO carrinhoDAO = new CarrinhoDAO(conexao);
        //ver se esse produto já ta no carrinho
        if (carrinhoDAO.produtoEstaNoCarrinho(this, produto)) {
            //atualiza a quantidade no carrinho
            produto.setQuantidade(quantidade + carrinhoDAO.selectQuantidadeProduto(this, produto));
            carrinhoDAO.updateQuantidadeCarrinho(produto, this);
        } else {
            //insere no carrinho
            carrinhoDAO.insertProduto(new Cliente(Login.getUser()), produto);
        }

        //atualiza quantidade no estoque
        produto.setQuantidade(quantidadeDB - quantidade);
        produtoDAO.updateQuantidade(produto);
        return true;
    }

    public void removerProduto(int id, double quantidade) throws SQLException {
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        Connection conexao = conexaoDAO.getConection();
        Produto produto = new Produto(id, quantidade);
        ProdutoDAO produtoDAO = new ProdutoDAO(conexao);
        CarrinhoDAO carrinhoDAO = new CarrinhoDAO(conexao);
        carrinhoDAO.deleteProdutoCarrinho(this, produto);
        produto.setQuantidade(quantidade + produtoDAO.getQuantidade(produto));
        produtoDAO.updateQuantidade(produto);
    }

    public double getPrecoTotal() throws SQLException {
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        Connection conexao = conexaoDAO.getConection();
        ArrayList<Produto> prods = this.getProdutos();
        ProdutoDAO produtoDAO = new ProdutoDAO(conexao);
        double precoTotal = 0;
        for (int i = 0; i < prods.size(); i++) {
            double quantidade = produtoDAO.getQuantidade(prods.get(i));
            double preco = produtoDAO.getPreco(prods.get(i));
            precoTotal += (quantidade * preco);
        }
        return precoTotal;
    }

    public void esvazia() throws SQLException {
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        Connection conexao = conexaoDAO.getConection();
        CarrinhoDAO carrinhoDAO = new CarrinhoDAO(conexao);
        carrinhoDAO.delete(this);
    }
}
