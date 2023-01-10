package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;
import model.Endereco;
import model.Pessoa;

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

    public Cliente getClientePorSenhaEcpf(String cpf, String senha) throws SQLException {
        String sql = "select * \n"
                + "from (select c.cpf,p.nome,p.senha,p.endereco,c.conta from pessoa as p inner join cliente as c on p.cpf = c.cpf ) as foo\n"
                + "where foo.cpf = ? and foo.senha = ?";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cpf);
        prepareStatement.setString(2, senha);
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            Endereco end = getEndereco(new Pessoa(result.getString("cpf")) {
            });
            if (end != null) {
                return new Cliente(result.getString("nome"), result.getString("cpf"), end, result.getString("senha"), result.getFloat("conta"));
            } else {
                return new Cliente(result.getString("nome"), result.getString("cpf"), result.getString("senha"), result.getFloat("conta"));
            }
        }
        return null;
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
        sql = "SELECT MAX(id) as id FROM endereco;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        int endereco = -1;
        if (result.next()) {
            endereco = result.getInt("id");
        }

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

    public void delete(Cliente cliente) throws SQLException {
        String sql = "DELETE FROM cliente WHERE cpf = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.execute();

        sql = "DELETE FROM pessoa WHERE cpf = ?;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.execute();
    }

    public Cliente getCliente(String cpf) throws SQLException {
        String sql = "select * \n"
                + "from (select c.cpf,p.nome,p.senha,p.endereco,c.conta from pessoa as p inner join cliente as c on p.cpf = c.cpf ) as foo\n"
                + "where foo.cpf = ? ";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cpf);
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            Endereco end = getEndereco(new Pessoa(result.getString("cpf")) {
            });
            if (end != null) {
                return new Cliente(result.getString("nome"), result.getString("cpf"), end, result.getString("senha"), result.getFloat("conta"));
            } else {
                return new Cliente(result.getString("nome"), result.getString("cpf"), result.getString("senha"), result.getFloat("conta"));
            }
        }
        return null;
    }
}
