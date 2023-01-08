package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;

public class ClienteDAO extends PessoaDAO {

    public ClienteDAO(Connection conexao) {
        super(conexao);
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
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.setString(2, cliente.getNome());
        prepareStatement.setString(3, cliente.getSenha());
        prepareStatement.execute();

        clienteBase(cliente);
    }

}
