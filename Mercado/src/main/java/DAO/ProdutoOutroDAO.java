package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.ProdutoOutro;

public class ProdutoOutroDAO {

    private final Connection conexao;

    public ProdutoOutroDAO(Connection connection) {
        this.conexao = connection;
    }

    public void insert(ProdutoOutro produtoOutro) throws SQLException {
        String sql = "INSERT INTO produto (fornecedor, nome, preco, quantidade) VALUES (?,?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, produtoOutro.getFornecedor());
        prepareStatement.setString(2, produtoOutro.getNome());
        prepareStatement.setDouble(3, produtoOutro.getPreco());
        prepareStatement.setDouble(4, produtoOutro.getQuantidade());
        prepareStatement.execute();

        sql = "SELECT MAX(id) FROM produto;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        int id = prepareStatement.getResultSet().getInt(1);

        sql = "INSERT INTO produtooutro (id) VALUES (?);";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, id);
        prepareStatement.execute();
    }
}
