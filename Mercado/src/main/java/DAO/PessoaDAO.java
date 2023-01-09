package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Endereco;
import model.Pessoa;

public class PessoaDAO {

    protected final Connection conexao;

    public PessoaDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public String getNome(Pessoa pessoa) throws SQLException {
        String sql = "SELECT nome FROM pessoa WHERE cpf = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, pessoa.getCpf());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getString("nome");
        }
        return null;
    }
    
    public String getSenha(Pessoa pessoa) throws SQLException {
        String sql = "SELECT senha FROM pessoa WHERE cpf= ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, pessoa.getCpf());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getString("senha");
        }
        return null;
    }

    public Endereco getEndereco(Pessoa pessoa) throws SQLException {
        String sql = "SELECT endereco FROM pessoa WHERE cpf= ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, pessoa.getCpf());
        prepareStatement.execute();
        int id = -1;
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            id = result.getInt("endereco");
        } else {
            return null;
        }

        sql = "SELECT cidade, bairro, rua, cep, uf, numero FROM endereco WHERE id = ?;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, id);
        prepareStatement.execute();
        ResultSet endereco = prepareStatement.getResultSet();
        if (endereco.next()) {
            return new Endereco(endereco.getString("cidade"), endereco.getString("bairro"), endereco.getString("rua"), endereco.getString("cep"), endereco.getString("uf"), endereco.getString("numero"));
        }
        return null;
    }

    public void setSenha(Pessoa pessoa) throws SQLException {
        String sql = "UPDATE pessoa SET senha = ? WHERE cpf = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, pessoa.getSenha());
        preparedStatement.setString(2, pessoa.getCpf());
        preparedStatement.execute();
    }

    public void setEndereco(Pessoa pessoa) throws SQLException {
        String sql = "UPDATE endereco SET uf = ?, cidade = ?, bairro = ?, rua = ?, numero = ?, cep = ? WHERE id = (SELECT endereco FROM pessoa WHERE cpf = ?);";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, pessoa.getEndereco().getUf());
        preparedStatement.setString(2, pessoa.getEndereco().getCidade());
        preparedStatement.setString(3, pessoa.getEndereco().getBairro());
        preparedStatement.setString(4, pessoa.getEndereco().getRua());
        preparedStatement.setString(5, pessoa.getEndereco().getNumero());
        preparedStatement.setString(6, pessoa.getEndereco().getCep());
        preparedStatement.setString(7, pessoa.getCpf());
        preparedStatement.execute();
    }
}
