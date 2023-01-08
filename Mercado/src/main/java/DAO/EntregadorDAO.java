package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Entregador;

public class EntregadorDAO extends FuncionarioDAO {

    private final Connection conexao;

    public EntregadorDAO(Connection conexao) {
        super(conexao);
        this.conexao = conexao;
    }

    private void entregadorBase(Entregador entregador) throws SQLException {
        //insere na tabela funcionario
        String sql = "INSERT INTO funcionario (cpf) VALUES (?)";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, entregador.getCpf());
        prepareStatement.execute();

        sql = "SELECT MAX(id) FROM funcionario;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        int id = prepareStatement.getResultSet().getInt(1);

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
        sql = "SELECT MAX(id) FROM endereco;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        int endereco = prepareStatement.getResultSet().getInt(1);

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
        return prepareStatement.getResultSet().getString(1);
    }
}
