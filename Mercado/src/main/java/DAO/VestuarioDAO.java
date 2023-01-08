package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Vestuario;

public class VestuarioDAO extends ProdutoDAO {

    public VestuarioDAO(Connection conexao) {
        super(conexao);
    }

    public void insert(Vestuario vestuario) throws SQLException {
        String sql = "INSERT INTO produto (fornecedor, nome, preco, quantidade) VALUES (?,?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, vestuario.getFornecedor());
        prepareStatement.setString(2, vestuario.getNome());
        prepareStatement.setDouble(3, vestuario.getPreco());
        prepareStatement.setDouble(4, vestuario.getQuantidade());
        prepareStatement.execute();

        sql = "SELECT MAX(id) as id FROM produto;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        int id = -1;
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            id = result.getInt("id");
        }

        sql = "INSERT INTO vestuario (id, tamanho) VALUES (?,?);";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, id);
        prepareStatement.setString(2, vestuario.getTamanho());
        prepareStatement.execute();
    }

    public String getTamanho(Vestuario vestuario) throws SQLException {
        String sql = "SELECT tamanho FROM vestuario WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, vestuario.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getString("tamanho");
        }
        return null;
    }

    public void delete(Vestuario vestuario) throws SQLException {
        String sql = "DELETE FROM produtooutro WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, vestuario.getId());
        prepareStatement.execute();

        sql = "DELETE FROM produto WHERE id = ?;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, vestuario.getId());
        prepareStatement.execute();
    }
}
