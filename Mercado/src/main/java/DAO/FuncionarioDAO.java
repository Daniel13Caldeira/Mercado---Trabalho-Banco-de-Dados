package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Funcionario;

public class FuncionarioDAO extends PessoaDAO {
    
    public FuncionarioDAO(Connection conexao) {
        super(conexao);
    }
    
    private void funcionarioBase(Funcionario funcionario) throws SQLException {
        //insere na tabela funcionario
        String sql = "INSERT INTO funcionario (cpf) VALUES (?)";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, funcionario.getCpf());
        prepareStatement.execute();
    }
    
    public void insertComEndereco(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO endereco(uf, cidade, bairro, rua, numero, cep) VALUES (?,?,?,?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, funcionario.getEndereco().getUf());
        prepareStatement.setString(2, funcionario.getEndereco().getCidade());
        prepareStatement.setString(3, funcionario.getEndereco().getBairro());
        prepareStatement.setString(4, funcionario.getEndereco().getRua());
        prepareStatement.setString(5, funcionario.getEndereco().getNumero());
        prepareStatement.setString(6, funcionario.getEndereco().getCep());
        prepareStatement.execute();

        //pega o id do endereço
        sql = "SELECT MAX(id) FROM endereco;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        int endereco = prepareStatement.getResultSet().getInt(1);

        //insere na tabela pessoa
        sql = "INSERT INTO pessoa (cpf, nome, senha, endereco) VALUES (?,?,?,?);";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, funcionario.getCpf());
        prepareStatement.setString(2, funcionario.getNome());
        prepareStatement.setString(3, funcionario.getSenha());
        prepareStatement.setInt(4, endereco);
        prepareStatement.execute();
        
        funcionarioBase(funcionario);
    }
    
    public void insertSemEndereco(Funcionario funcionario) throws SQLException {
        
        String sql = "INSERT INTO pessoa (cpf, nome, senha) VALUES (?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, funcionario.getCpf());
        prepareStatement.setString(2, funcionario.getNome());
        prepareStatement.setString(3, funcionario.getSenha());
        prepareStatement.execute();
        
        funcionarioBase(funcionario);
    }
    
    public String getCargo(Funcionario funcionario) throws SQLException {
        String sql = "SELECT cargo FROM funcionario WHERE id= ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, funcionario.getId());
        prepareStatement.execute();
        return prepareStatement.getResultSet().getString(1);
    }
    
    public void setCargo(Funcionario funcionario) throws SQLException {
        String sql = "UPDATE funcionario SET cargo = ? WHERE id = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, funcionario.getCargo());
        preparedStatement.setInt(2, funcionario.getId());
        preparedStatement.execute();

        //add trigger se o novo cargo for entregador
    }
    
    public void delete(Funcionario funcionario) throws SQLException {
        String sql;
        PreparedStatement prepareStatement;
        if (funcionario.getCargo().equalsIgnoreCase("entregador")) {
            sql = "DELETE FROM entregador WHERE id = ?;";
            prepareStatement = conexao.prepareStatement(sql);
            prepareStatement.setInt(1, funcionario.getId());
            prepareStatement.execute();
        }
        sql = "DELETE FROM funcionario WHERE id = ?;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, funcionario.getId());
        prepareStatement.execute();
        
        sql = "DELETE FROM pessoa WHERE cpf = ?;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, funcionario.getCpf());
        prepareStatement.execute();
    }
}
