package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Remedio;

public class RemedioDAO extends ProdutoDAO {

    public RemedioDAO(Connection conexao) {
        super(conexao);
    }

    public void insert(Remedio remedio) throws SQLException {
        String sql = "INSERT INTO produto (fornecedor, nome, preco, quantidade,tipo) VALUES (?,?,?,?,'Remédio');";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, remedio.getFornecedor());
        prepareStatement.setString(2, remedio.getNome());
        prepareStatement.setDouble(3, remedio.getPreco());
        prepareStatement.setDouble(4, remedio.getQuantidade());
        prepareStatement.execute();

        sql = "SELECT MAX(id) as id FROM produto;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        int id = -1;
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            id = result.getInt("id");
        }

        sql = "INSERT INTO remedio (id, validade) VALUES (?, ?);";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, id);
        prepareStatement.setString(2, remedio.getValidade());
        prepareStatement.execute();
    }

    public String getValidade(Remedio remedio) throws SQLException {
        String sql = "SELECT validade FROM remedio WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, remedio.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getString("validade");
        }
        return null;
    }

    public Remedio getRemedio(String id) throws SQLException {

        String sql = "select *\n"
                + "from (select p.id,p.fornecedor,p.preco,p.nome,p.quantidade,r.validade\n"
                + "from produto as p , remedio as r\n"
                + "where p.id = r.id) as foo\n"
                + "where foo.id = ?";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1,Integer.parseInt(id));
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if(result.next()){
            return new Remedio(result.getInt("id"),result.getDouble("preco"),result.getString("nome"), result.getString("fornecedor"), result.getString("validade"),result.getFloat("quantidade"));
        }
        return null;
    }

    public void delete(Remedio remedio) throws SQLException {
        String sql = "DELETE FROM remedio WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, remedio.getId());
        prepareStatement.execute();

        sql = "DELETE FROM produto WHERE id = ?;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, remedio.getId());
        prepareStatement.execute();
    }
    
    public void updateR(Remedio remedio) throws SQLException{
       update(remedio);
       String sql = "update remedio set validade  = ? where id = ?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, remedio.getValidade());
        preparedStatement.setInt(2, remedio.getId());
        preparedStatement.execute();
    }
}
