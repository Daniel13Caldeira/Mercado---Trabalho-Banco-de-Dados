package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;
import model.Carrinho;
import model.Entregador;

public class PedidoDAO {

    private final Connection conexao;

    public PedidoDAO(Connection connection) {
        this.conexao = connection;
    }

    private int pedidoBase(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO pedido (cliente) VALUES (?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.execute();

        sql = "SELECT MAX(id) FROM pedido;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        return prepareStatement.getResultSet().getInt(1);
    }

    public void insert(Cliente cliente, Carrinho carrinho) throws SQLException {
        int id = pedidoBase(cliente);
        String sql;
        int tam = carrinho.getProdutos().size();
        for (int i = 0; i < tam; i++) {
            sql = "INSERT INTO pedidoretirar (id,produto,quantidade) VALUES (?,?,?);";
            PreparedStatement prepareStatement = conexao.prepareStatement(sql);
            prepareStatement.setInt(1,id);
            prepareStatement.setInt(2, carrinho.getProdutos().get(i).getId());
            prepareStatement.setDouble(3, carrinho.getProdutos().get(i).getQuantidade());
            prepareStatement.execute();
        }
    }

    public void insert(Cliente cliente, Entregador entregador, Carrinho carrinho) throws SQLException {
        int id = pedidoBase(cliente);
        String sql;
        int tam = carrinho.getProdutos().size();
        for (int i = 0; i < tam; i++) {
            sql = "INSERT INTO pedidodelivery (id,entregador,produto,quantidade) VALUES (?,?,?,?);";
            PreparedStatement prepareStatement = conexao.prepareStatement(sql);
            prepareStatement.setInt(1,id);
            prepareStatement.setInt(2,entregador.getId());
            prepareStatement.setInt(3, carrinho.getProdutos().get(i).getId());
            prepareStatement.setDouble(4, carrinho.getProdutos().get(i).getQuantidade());
            prepareStatement.execute();
        }
    }
}
