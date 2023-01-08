package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;
import model.Remedio;

public class ReceitaDAO {

    private final Connection conexao;

    public ReceitaDAO(Connection connection) {
        this.conexao = connection;
    }

    private void insert(Cliente cliente, Remedio remedio) throws SQLException {
        String sql = "INSERT INTO receita(cliente,remedio,quantidade) VALUES (?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.setString(2, remedio.getNome());
        prepareStatement.setDouble(3, remedio.getQuantidade());
        prepareStatement.execute();
    }
}
