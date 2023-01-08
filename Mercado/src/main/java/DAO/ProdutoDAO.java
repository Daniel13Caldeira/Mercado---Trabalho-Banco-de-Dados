package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        return prepareStatement.getResultSet().getString(1);
    }

    public Fornecedor getFornecedor(Produto produto) throws SQLException {
        String sql = "SELECT fornecedor FROM produto WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
        return new Fornecedor(prepareStatement.getResultSet().getString(1));
    }

    public double getPreco(Produto produto) throws SQLException {
        String sql = "SELECT preco FROM produto WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
        return prepareStatement.getResultSet().getDouble(1);
    }

    public double getQuantidade(Produto produto) throws SQLException {
        String sql = "SELECT quantidade FROM produto WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
        return prepareStatement.getResultSet().getDouble(1);
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
