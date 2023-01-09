package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
import model.Carrinho;
import model.Entregador;
import model.Pedido;
import model.PedidoDelivery;
import model.Produto;

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

        sql = "SELECT MAX(id) as id FROM pedido;";
        prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getInt("id");
        }
        return -1;
    }

    public void insert(Cliente cliente, Carrinho carrinho) throws SQLException {
        int id = pedidoBase(cliente);
        String sql;
        int tam = carrinho.getProdutos().size();
        for (int i = 0; i < tam; i++) {
            sql = "INSERT INTO pedidoretirar (id,produto,quantidade) VALUES (?,?,?);";
            PreparedStatement prepareStatement = conexao.prepareStatement(sql);
            prepareStatement.setInt(1, id);
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
            prepareStatement.setInt(1, id);
            prepareStatement.setInt(2, entregador.getId());
            prepareStatement.setInt(3, carrinho.getProdutos().get(i).getId());
            prepareStatement.setDouble(4, carrinho.getProdutos().get(i).getQuantidade());
            prepareStatement.execute();
        }
    }

    public ArrayList<Pedido> getPedidosCliente(Cliente cliente) throws SQLException {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT id FROM pedido WHERE cliente = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, cliente.getCpf());
        preparedStatement.execute();
        ResultSet resultado = preparedStatement.getResultSet();
        while (resultado.next()) {
            int id = resultado.getInt("id");
            pedidos.add(new Pedido(id));
        }

        return pedidos;
    }

    public ArrayList<Pedido> getPedidosALL() throws SQLException {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT id FROM pedido;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.execute();
        ResultSet resultado = preparedStatement.getResultSet();
        while (resultado.next()) {
            int id = resultado.getInt("id");
            pedidos.add(new Pedido(id));
        }
        return pedidos;
    }

    public ArrayList<Produto> getProdutosPedido(Pedido pedido) throws SQLException {
        ArrayList<Produto> produtos = new ArrayList<>();
        String sql = "SELECT produto, quantidade FROM produtopedido WHERE pedido = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, pedido.getId());
        preparedStatement.execute();
        ResultSet resultado = preparedStatement.getResultSet();
        while (resultado.next()) {
            int produto = resultado.getInt("produto");
            double quantidade = resultado.getDouble("quantidade");
            produtos.add(new Produto(produto, quantidade));
        }
        return produtos;
    }

    public Entregador getEntregador(PedidoDelivery pedido) throws SQLException {
        String sql = "SELECT entregador FROM pedidodelivery WHERE id = ?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, pedido.getId());
        preparedStatement.execute();
        ResultSet result = preparedStatement.getResultSet();
        if (result.next()) {
            return new Entregador(result.getInt("entregador"));
        }
        return null;
    }

    public void updateStatus(Pedido pedido) throws SQLException {
        String sql = "UPDATE pedido SET status = ? WHERE id = ;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, pedido.getStatus());
        preparedStatement.setInt(2, pedido.getId());
        preparedStatement.execute();
    }
}
