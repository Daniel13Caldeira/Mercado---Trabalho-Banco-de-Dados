package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ProdutoPerecivel;

public class ProdutoPerecivelDAO extends ProdutoDAO {

    public ProdutoPerecivelDAO(Connection conexao) {
        super(conexao);
    }

    public ProdutoPerecivel getProdutoPerecivel(String id) throws SQLException {
        String sql = "select *\n"
                + "from (select p.id,p.fornecedor,p.preco,p.nome,p.quantidade,pp.validade\n"
                + "from produto as p , produtoperecivel as pp\n"
                + "where p.id = pp.id) as foo\n"
                + "where foo.id = ?";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, Integer.parseInt(id));
        statement.execute();
        ResultSet result = statement.getResultSet();
        if (result.next()) {
            return new ProdutoPerecivel(result.getString("validade"), result.getInt("id"), result.getDouble("preco"), result.getString("nome"), result.getString("fornecedor"), result.getDouble("quantidade"));
        }
        return null;
    }

    public void updateP(ProdutoPerecivel produtoPP) throws SQLException {
        update(produtoPP);
        String sql = "update produtoperecivel set validade  = ? where id = ?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, produtoPP.getValidade());
        preparedStatement.setInt(2, produtoPP.getId());
        preparedStatement.execute();

    }

    public void insert(ProdutoPerecivel produto) throws SQLException {
        String sql = "INSERT INTO produto (fornecedor, nome, preco, quantidade,tipo) VALUES (?,?,?,?,'Perecível');";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, produto.getFornecedor());
        prepareStatement.setString(2, produto.getNome());
        prepareStatement.setDouble(3, produto.getPreco());
        prepareStatement.setDouble(4, produto.getQuantidade());
        prepareStatement.execute();

        sql = "SELECT MAX(id) as id FROM produto;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        int id = -1;
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            id = result.getInt("id");
        }

        sql = "INSERT INTO produtoperecivel (id,validade) VALUES (?,?);";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, id);
        prepareStatement.setString(2, produto.getValidade());
        prepareStatement.execute();
    }

    public String getValidade(ProdutoPerecivel produto) throws SQLException {
        String sql = "SELECT validade FROM produtoperecivel WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getString("validade");
        }
        return null;
    }

    public void delete(ProdutoPerecivel produto) throws SQLException {
        String sql = "DELETE FROM produtoperecivel WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();

        sql = "DELETE FROM produto WHERE id = ?;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
    }
}
