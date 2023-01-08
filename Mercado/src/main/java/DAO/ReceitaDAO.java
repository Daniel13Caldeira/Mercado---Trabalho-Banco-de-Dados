package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
import model.Remedio;
import model.Receita;

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

    //retorna id dos remedios e sua quantidade respectiva
    public ArrayList<Remedio> getRemedios(Receita receita) throws SQLException {
        ArrayList <Remedio> remedios = new ArrayList<>();
        String sql = "SELECT remedio FROM receita WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, receita.getId());
        prepareStatement.execute();
        int id =prepareStatement.getResultSet().getInt(1);
        
        return remedios;
    }
    
    public void setQuantidadeRemedio(Receita receita, Remedio remedio) throws SQLException{
        String sql = "UPDATE receita SET quantidade = ? WHERE id = ? AND remedio = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setDouble(1, remedio.getQuantidade());
        prepareStatement.setInt(2, receita.getId());
        prepareStatement.setInt(3, remedio.getId());
        prepareStatement.execute();
    }

    public void deleteRemedioReceia(Receita receita, Remedio remedio) throws SQLException{
        String sql = "DELETE FROM receita WHERE id = ? AND remedio = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, receita.getId());
        prepareStatement.setInt(2, remedio.getId());
        prepareStatement.execute();
    }
    
    public void delete(Receita receita) throws SQLException {
        String sql = "DELETE FROM receita WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, receita.getId());
        prepareStatement.execute();
    }
    
}
