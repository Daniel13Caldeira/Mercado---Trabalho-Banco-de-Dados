package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Fornecedor;
import model.Produto;

public class ProdutoDAO {

    protected final Connection conexao;

    public ProdutoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public String getNome(Produto produto) throws SQLException {
        String sql = "SELECT nome FROM produto WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getString("nome");
        }
        return null;

    }

    public Fornecedor getFornecedor(Produto produto) throws SQLException {
        String sql = "SELECT fornecedor FROM produto WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return new Fornecedor(result.getString("fornecedor"));
        }
        return null;

    }

    public double getPreco(Produto produto) throws SQLException {
        String sql = "SELECT preco FROM produto WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getDouble("preco");
        }
        return -1;
    }

    public double getQuantidade(Produto produto) throws SQLException {
        String sql = "SELECT quantidade FROM produto WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getDouble("quantidade");
        }
        return -1;
    }

    public void setQuantidade(Produto produto) throws SQLException {
        String sql = "UPDATE produto SET quantidade = ? WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setDouble(1, produto.getQuantidade());
        prepareStatement.setInt(2, produto.getId());
        prepareStatement.execute();

    }

    public void setPreco(Produto produto) throws SQLException {
        String sql = "UPDATE produto SET preco = ? WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setDouble(1, produto.getPreco());
        prepareStatement.setInt(2, produto.getId());
        prepareStatement.execute();
    }
}
