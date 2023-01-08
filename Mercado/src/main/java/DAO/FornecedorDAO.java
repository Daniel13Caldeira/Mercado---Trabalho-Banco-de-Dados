package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Fornecedor;

public class FornecedorDAO {

    private final Connection conexao;

    public FornecedorDAO(Connection connection) {
        this.conexao = connection;
    }

    public void insert(Fornecedor fornecedor) throws SQLException {
        String sql = "INSERT INTO fornecedor (cnpj, nome) VALUES (?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, fornecedor.getCNPJ());
        prepareStatement.setString(2, fornecedor.getNome());
        prepareStatement.execute();
    }

    public String getNome(Fornecedor fornecedor) throws SQLException {
        String sql = "SELECT nome FROM fornecedor WHERE cnpj = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, fornecedor.getCNPJ());
        prepareStatement.execute();
        return prepareStatement.getResultSet().getString(1);
    }

    public void setNome(Fornecedor fornecedor) throws SQLException {
        String sql = "UPDATE fornecedor SET nome = ? WHERE cnpj = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, fornecedor.getNome());
        prepareStatement.setString(2, fornecedor.getCNPJ());
        prepareStatement.execute();
    }

    public void delete(Fornecedor fornecedor) throws SQLException {
        String sql = "DELETE FROM fornecedor WHERE cnpj = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, fornecedor.getCNPJ());
        prepareStatement.execute();
    }
}
