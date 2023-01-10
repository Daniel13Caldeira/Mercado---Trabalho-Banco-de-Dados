package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Carrinho;
import model.Cliente;
import model.Produto;

public class CarrinhoDAO {

    private final Connection conexao;

    public CarrinhoDAO(Connection connection) {
        this.conexao = connection;
    }

    public boolean produtoEstaNoCarrinho(Carrinho carrinho,Produto produto) throws SQLException{
        String sql = "SELECT produto, quantidade FROM carrinho where cpf = ? and produto = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, carrinho.getCliente().getCpf());
        prepareStatement.setInt(2, produto.getId());
        prepareStatement.execute();
        ResultSet resultado = prepareStatement.getResultSet();
        return resultado.next();
    }
    
    public void insertProduto(Cliente cliente, Produto produto) throws SQLException {
        String sql = "INSERT INTO carrinho(cliente, produto, quantidade) VALUES (?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.setInt(2, produto.getId());
        prepareStatement.setDouble(3, produto.getQuantidade());
        prepareStatement.execute();
    }

    public ArrayList<Produto> getProdutos(Cliente cliente) throws SQLException {
        String sql = "SELECT produto, quantidade FROM carrinho where cpf = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.execute();
        ResultSet resultado = prepareStatement.getResultSet();
        ArrayList<Produto> produtos = new ArrayList<>();
        while (resultado.next()) {
            int id = resultado.getInt("produto");
            double quantidade = resultado.getDouble("quantidade");
            produtos.add(new Produto(id,quantidade));
        }

        return produtos;
    }

    public double selectQuantidadeProduto(Carrinho carrinho, Produto produto) throws SQLException {
        String sql = "SELECT quantidade FROM carrinho WHERE cliente = ? AND produto = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, carrinho.getCliente().getCpf());
        prepareStatement.setInt(2, produto.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getDouble("quantidade");
        }
        return 0;
    }
    
    public void setQuantidadeProduto(Carrinho carrinho, Produto produto) throws SQLException {
        String sql = "UPDATE carrinho SET quantidade = ? WHERE cliente = ? AND produto = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setDouble(1, produto.getQuantidade());
        prepareStatement.setString(2, carrinho.getCliente().getCpf());
        prepareStatement.setInt(3, produto.getId());
        prepareStatement.execute();
    }

    public void deleteProdutoCarrinho(Carrinho carrinho, Produto produto) throws SQLException {
        String sql = "DELETE FROM carrinho WHERE cliente = ? AND remedio = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(2, carrinho.getCliente().getCpf());
        prepareStatement.setInt(2, produto.getId());
        prepareStatement.execute();
    }

    public void delete(Carrinho carrinho) throws SQLException {
        String sql = "DELETE FROM carrinho WHERE cliente = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, carrinho.getCliente().getCpf());
        preparedStatement.execute();
    }
}
