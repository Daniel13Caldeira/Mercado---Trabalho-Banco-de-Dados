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

    private int pedidoBase(Cliente cliente, String pagamento) throws SQLException {
        String sql = "INSERT INTO pedido (cliente, pagamento) VALUES (?, ?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.setString(2, pagamento);
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

    public void insert(Carrinho carrinho, String pagamento) throws SQLException {
        int id = pedidoBase(carrinho.getCliente(), pagamento);
        String sql;
        int tam = carrinho.getProdutos().size();
        for (int i = 0; i < tam; i++) {
            sql = "INSERT INTO pedidoretirar (id) VALUES (?);";
            PreparedStatement prepareStatement = conexao.prepareStatement(sql);
            prepareStatement.setInt(1, id);
            prepareStatement.execute();
        }
    }

    public void insert(Entregador entregador, Carrinho carrinho, String pagamento) throws SQLException {
        int id = pedidoBase(carrinho.getCliente(), pagamento);
        String sql;
        int tam = carrinho.getProdutos().size();
        for (int i = 0; i < tam; i++) {
            sql = "INSERT INTO pedidodelivery (id,entregador) VALUES (?,?);";
            PreparedStatement prepareStatement = conexao.prepareStatement(sql);
            prepareStatement.setInt(1, id);
            prepareStatement.setInt(2, entregador.getId());
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
        String sql = "SELECT id,cliente,status FROM pedido;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.execute();
        ResultSet resultado = preparedStatement.getResultSet();
        while (resultado.next()) {
            int id = resultado.getInt("id");
            Cliente cliente = new ClienteDAO(conexao).getCliente(resultado.getString("cliente"));
            String status = resultado.getString("status");
            pedidos.add(new Pedido(id, cliente, status));
        }
        return pedidos;
    }

    public Pedido getPedido(int id) throws SQLException {
        String sql = "SELECT * FROM pedido where id=?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
        ResultSet resultado = preparedStatement.getResultSet();
        return new Pedido(resultado.getInt("id"), new ClienteDAO(conexao).getCliente(resultado.getString("cpf")), resultado.getString("status"));
    }

    public ArrayList<Pedido> getPedidosALLEntregador() throws SQLException {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT id,cliente,status FROM pedido where status=?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, "Aguardando Entrega");
        preparedStatement.execute();
        ResultSet resultado = preparedStatement.getResultSet();
        while (resultado.next()) {
            int id = resultado.getInt("id");
            Cliente cliente = new ClienteDAO(conexao).getCliente(resultado.getString("cliente"));
            String status = resultado.getString("status");
            pedidos.add(new Pedido(id, cliente, status));
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
