package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.ProdutoPerecivel;

public class ProdutoPerecivelDAO {

    private final Connection conexao;

    public ProdutoPerecivelDAO(Connection connection) {
        this.conexao = connection;
    }

    public void insert(ProdutoPerecivel produtoPerecivel) throws SQLException {
        String sql = "INSERT INTO produto (fornecedor, nome, preco, quantidade) VALUES (?,?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, produtoPerecivel.getFornecedor());
        prepareStatement.setString(2, produtoPerecivel.getNome());
        prepareStatement.setDouble(3, produtoPerecivel.getPreco());
        prepareStatement.setDouble(4, produtoPerecivel.getQuantidade());
        prepareStatement.execute();

        sql = "SELECT MAX(id) FROM produto;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        int id = prepareStatement.getResultSet().getInt(1);

        sql = "INSERT INTO produtoperecivel (id,validade) VALUES (?,?);";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, id);
        prepareStatement.setString(2, produtoPerecivel.getValidade());
        prepareStatement.execute();
    }
}
