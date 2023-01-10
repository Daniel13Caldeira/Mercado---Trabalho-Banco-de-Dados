package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getString("nome");
        }
        return null;
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

    public ArrayList<Fornecedor> getAll() throws SQLException {
        ArrayList<Fornecedor> fornecedores = fornecedores = new ArrayList<>();;
        String sql = "select cnpj,nome from fornecedor";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.execute();
        ResultSet result = preparedStatement.getResultSet();
        while (result.next()) {
            Fornecedor forn = new Fornecedor(result.getString("cnpj"), result.getString("nome"));
            fornecedores.add(forn);
        }
        return fornecedores;
    }
    public List<Fornecedor> getAllList() throws SQLException {
        ArrayList<Fornecedor> fornecedores = fornecedores = new ArrayList<>();;
        String sql = "select cnpj,nome from fornecedor";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.execute();
        ResultSet result = preparedStatement.getResultSet();
        while (result.next()) {
            Fornecedor forn = new Fornecedor(result.getString("cnpj"), result.getString("nome"));
            fornecedores.add(forn);
        }
        return fornecedores;
    }

    public Fornecedor getFornecedor(String cnpj) throws SQLException {
        String sql = "select f.cnpj,f.nome from fornecedor as f where f.cnpj=?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, cnpj);
        preparedStatement.execute();
        ResultSet result = preparedStatement.getResultSet();
        if (result.next()) {
            Fornecedor forn = new Fornecedor(result.getString("cnpj"), result.getString("nome"));
            return forn;
        }
        return null;
    }
}
