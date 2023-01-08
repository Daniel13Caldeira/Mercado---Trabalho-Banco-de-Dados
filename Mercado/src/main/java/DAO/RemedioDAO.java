package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Remedio;

public class RemedioDAO extends ProdutoDAO {

    public RemedioDAO(Connection conexao) {
        super(conexao);
    }

    public void insert(Remedio remedio) throws SQLException {
        String sql = "INSERT INTO produto (fornecedor, nome, preco, quantidade) VALUES (?,?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, remedio.getFornecedor());
        prepareStatement.setString(2, remedio.getNome());
        prepareStatement.setDouble(3, remedio.getPreco());
        prepareStatement.setDouble(4, remedio.getQuantidade());
        prepareStatement.execute();

        sql = "SELECT MAX(id) FROM produto;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        int id = prepareStatement.getResultSet().getInt(1);

        sql = "INSERT INTO remedio (id, precisareceita, validade) VALUES (?,?,?);";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, id);
        prepareStatement.setBoolean(2, remedio.isPrecisaReceita());
        prepareStatement.setString(3, remedio.getValidade());
        prepareStatement.execute();
    }

    public String getNome(Remedio remedio) throws SQLException {
        String sql = "SELECT nome FROM produto WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, remedio.getId());
        prepareStatement.execute();
        return prepareStatement.getResultSet().getString(1);
    }

    public String getValidade(Remedio remedio) throws SQLException {
        String sql = "SELECT validade FROM remedio WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, remedio.getId());
        prepareStatement.execute();
        return prepareStatement.getResultSet().getString(1);
    }

    public boolean isPrecisaReceita(Remedio remedio) throws SQLException {
        String sql = "SELECT precisareceita FROM remedio WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, remedio.getId());
        prepareStatement.execute();
        return prepareStatement.getResultSet().getBoolean(1);
    }
}
