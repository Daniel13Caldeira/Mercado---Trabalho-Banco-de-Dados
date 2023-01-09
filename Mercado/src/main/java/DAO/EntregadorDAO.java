package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Endereco;
import model.Entregador;
import model.Funcionario;

public class EntregadorDAO extends FuncionarioDAO {

    public EntregadorDAO(Connection conexao) {
        super(conexao);
    }

    private void entregadorBase(Entregador entregador) throws SQLException {
        //insere na tabela funcionario
        String sql = "INSERT INTO funcionario (cpf) VALUES (?)";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, entregador.getCpf());
        prepareStatement.execute();

        sql = "SELECT MAX(id) as id FROM funcionario;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        int id = -1;
        if (result.next()) {
            id = result.getInt("id");
        }

        sql = "INSERT INTO entregador (placaveiculo, id) VALUES (?,?);";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, entregador.getPlacaVeiculo());
        prepareStatement.setInt(2, id);
        prepareStatement.execute();
    }

    public void insertEntregadorComEndereco(Entregador entregador) throws SQLException {
        //insere o endereço
        String sql = "INSERT INTO endereco(uf, cidade, bairro, rua, numero, cep) VALUES (?,?,?,?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, entregador.getEndereco().getUf());
        prepareStatement.setString(2, entregador.getEndereco().getCidade());
        prepareStatement.setString(3, entregador.getEndereco().getBairro());
        prepareStatement.setString(4, entregador.getEndereco().getRua());
        prepareStatement.setString(5, entregador.getEndereco().getNumero());
        prepareStatement.setString(6, entregador.getEndereco().getCep());
        prepareStatement.execute();
        //pega o id do endereço
        sql = "SELECT MAX(id) as id FROM endereco;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        int endereco = -1;
        if (result.next()) {
            endereco = result.getInt("id");
        }

        sql = "INSERT INTO pessoa (cpf, nome, senha, endereco) VALUES (?,?,?,?);";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, entregador.getCpf());
        prepareStatement.setString(2, entregador.getNome());
        prepareStatement.setString(3, entregador.getSenha());
        prepareStatement.setInt(4, endereco);
        prepareStatement.execute();

        entregadorBase(entregador);
    }

    public void insertEntregadorSemEndereco(Entregador entregador) throws SQLException {
        String sql = "INSERT INTO pessoa (cpf, nome, senha) VALUES (?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, entregador.getCpf());
        prepareStatement.setString(2, entregador.getNome());
        prepareStatement.setString(3, entregador.getSenha());
        prepareStatement.execute();

        entregadorBase(entregador);
    }

    public String getPlacaVeiculo(Entregador entregador) throws SQLException {
        String sql = "SELECT placaVeiculo FROM entregador WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, entregador.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getString("placaveiculo");
        }
        return null;
    }

    public void setPlacaVeiculo(Entregador entregador) throws SQLException {
        String sql = "UPDATE entregador SET placaveiculo = ? WHERE id = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, entregador.getPlacaVeiculo());
        preparedStatement.setInt(2, entregador.getId());
        preparedStatement.execute();
    }

    public void deleteSetCargo(Entregador entregador) throws SQLException {
        String sql = "DELETE FROM entregador WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, entregador.getId());
        prepareStatement.execute();
    }

    public void delete(Entregador entregador) throws SQLException {
        String sql = "DELETE FROM entregador WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, entregador.getId());
        prepareStatement.execute();

        sql = "DELETE FROM funcionario WHERE id = ?;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, entregador.getId());
        prepareStatement.execute();

        sql = "DELETE FROM pessoa WHERE cpf = ?;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, entregador.getCpf());
        prepareStatement.execute();
    }

    public Entregador getEntregador(Funcionario func) throws SQLException {
        String sql = "select *\n"
                + "from (select f.id,f.cpf,f.cargo,p.nome,p.senha,p.endereco,en.placaveiculo\n"
                + "from pessoa as p , funcionario as f,entregador as en\n"
                + "where f.cpf=p.cpf) as foo\n"
                + "where foo.id=?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, func.getId());
        preparedStatement.execute();
        ResultSet result = preparedStatement.getResultSet();
        if (result.next()) {
            Entregador en = new Entregador(result.getString("placaveiculo"),result.getString("nome"), result.getString("cpf"), result.getInt("id"), result.getString("cargo"), result.getString("senha"));
            Endereco end = getEndereco(func);
            if (end != null) {
                en.setEndereco(end);
            }
            return en;
        }
        return null;

    }
    
    
    public void updateEnt(Entregador entregador) throws SQLException{
        update(entregador);
        String sql = "update entregador set placaveiculo = ?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, entregador.getPlacaVeiculo());
        preparedStatement.execute();
   
    }
}
