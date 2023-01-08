package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Endereco;
import model.Funcionario;

public class FuncionarioDAO {

    private final Connection conexao;

    public FuncionarioDAO(Connection conexao) {
        this.conexao = conexao;
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

    public String getNome(Funcionario funcionario) throws SQLException {
        String sql = "SELECT nome FROM pessoa as p WHERE p.cpf = (SELECT f.cpf FROM funcionario as f WHERE id = ?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, funcionario.getId());
        prepareStatement.execute();
        return prepareStatement.getResultSet().getString(1);
    }

    public String getSenha(Funcionario funcionario) throws SQLException {
        String sql = "SELECT senha FROM pessoa as p WHERE p.cpf = (SELECT f.cpf FROM funcionario as f WHERE id = ?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, funcionario.getId());
        prepareStatement.execute();
        return prepareStatement.getResultSet().getString(1);
    }

    public Endereco getEndereco(Funcionario funcionario) throws SQLException {
        String sql = "SELECT cidade, bairro, rua, cep, uf, numero FROM endereco WHERE id = (SELECT endereco FROM pessoa as p WHERE p.cpf = (SELECT f.cpf FROM funcionario as f WHERE id = ?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, funcionario.getId());
        prepareStatement.execute();
        ResultSet endereco = prepareStatement.getResultSet();
        return new Endereco(endereco.getString(1), endereco.getString(2), endereco.getString(3), endereco.getString(4), endereco.getString(5), endereco.getString(6));
    }

    public String getCargo(Funcionario funcionario) throws SQLException {
        String sql = "SELECT cargo FROM funcionario WHERE id= ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, funcionario.getId());
        prepareStatement.execute();
        return prepareStatement.getResultSet().getString(1);
    }
}
