package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ProdutoOutro;

public class ProdutoOutroDAO extends ProdutoDAO {

    public ProdutoOutroDAO(Connection conexao) {
        super(conexao);
    }

    public ProdutoOutro getProdutoOutro(String id) throws SQLException {
        String sql = "select *\n"
                + "from (select p.id,p.fornecedor,p.preco,p.nome,p.quantidade\n"
                + "from produto as p , produtooutro as po\n"
                + "where p.id = po.id) as foo\n"
                + "where foo.id = ?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, Integer.parseInt(id));
        preparedStatement.execute();
        ResultSet result = preparedStatement.getResultSet();
        if (result.next()) {
            return new ProdutoOutro(result.getInt("id"), result.getDouble("preco"), result.getString("nome"), result.getString("fornecedor"), result.getDouble("quantidade"));
        }
        return null;
    }

    public void updatePo(ProdutoOutro produtoOU) throws SQLException {
        update(produtoOU);
    }

    public void insert(ProdutoOutro produto) throws SQLException {
        String sql = "INSERT INTO produto (fornecedor, nome, preco, quantidade) VALUES (?,?,?,?);";
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
        sql = "INSERT INTO produtooutro (id) VALUES (?);";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, id);
        prepareStatement.execute();
    }

    public void delete(ProdutoOutro produto) throws SQLException {
        String sql = "DELETE FROM produtooutro WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();

        sql = "DELETE FROM produto WHERE id = ?;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
    }
}
