package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;
import model.Endereco;

public class ClienteDAO {

    private final Connection conexao;

    public ClienteDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void clienteBase(Cliente cliente) throws SQLException {
        //insere na tabela cliente
        String sql = "INSERT INTO cliente (cpf) VALUES (?)";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.execute();
    }

    public void insertComEndereco(Cliente cliente) throws SQLException {
        //insere o endereço
        String sql = "INSERT INTO endereco(uf, cidade, bairro, rua, numero, cep) VALUES (?,?,?,?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getEndereco().getUf());
        prepareStatement.setString(2, cliente.getEndereco().getCidade());
        prepareStatement.setString(3, cliente.getEndereco().getBairro());
        prepareStatement.setString(4, cliente.getEndereco().getRua());
        prepareStatement.setString(5, cliente.getEndereco().getNumero());
        prepareStatement.setString(6, cliente.getEndereco().getCep());
        prepareStatement.execute();

        //pega o id do endereço
        sql = "SELECT MAX(id) FROM endereco;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        int endereco = prepareStatement.getResultSet().getInt(1);

        //insere na tabela pessoa
        sql = "INSERT INTO pessoa (cpf, nome, senha, endereco) VALUES (?,?,?,?);";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.setString(2, cliente.getNome());
        prepareStatement.setString(3, cliente.getSenha());
        prepareStatement.setInt(4, endereco);
        prepareStatement.execute();

        clienteBase(cliente);
    }

    public void insertSemEndereco(Cliente cliente) throws SQLException {

        String sql = "INSERT INTO pessoa (cpf, nome, senha) VALUES (?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.setString(2, cliente.getNome());
        prepareStatement.setString(3, cliente.getSenha());
        prepareStatement.execute();

        clienteBase(cliente);
    }

    public String getNome(Cliente cliente) throws SQLException {
        String sql = "SELECT nome FROM pessoa WHERE cpf = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.execute();
        return prepareStatement.getResultSet().getString(1);
    }

    public String getSenha(Cliente cliente) throws SQLException {
        String sql = "SELECT senha FROM pessoa WHERE cpf= ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.execute();
        return prepareStatement.getResultSet().getString(1);
    }

    public Endereco getEndereco(Cliente cliente) throws SQLException {
        String sql = "SELECT endereco FROM pessoa WHERE cpf= ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.execute();
        int id = prepareStatement.getResultSet().getInt(1);

        sql = "SELECT cidade, bairro, rua, cep, uf, numero FROM endereco WHERE id = ?;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, id);
        prepareStatement.execute();
        ResultSet endereco = prepareStatement.getResultSet();
        return new Endereco(endereco.getString(1), endereco.getString(2), endereco.getString(3), endereco.getString(4), endereco.getString(5), endereco.getString(6));
    }
}
