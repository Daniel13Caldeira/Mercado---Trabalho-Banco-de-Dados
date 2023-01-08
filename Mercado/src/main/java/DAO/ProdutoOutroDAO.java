package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.ProdutoOutro;

public class ProdutoOutroDAO extends ProdutoDAO {

    public ProdutoOutroDAO(Connection conexao) {
        super(conexao);
    }

    public void insert(ProdutoOutro produto) throws SQLException {
        String sql = "INSERT INTO produto (fornecedor, nome, preco, quantidade) VALUES (?,?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, produto.getFornecedor());
        prepareStatement.setString(2, produto.getNome());
        prepareStatement.setDouble(3, produto.getPreco());
        prepareStatement.setDouble(4, produto.getQuantidade());
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
