package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
import model.Produto;

public class CarrinhoDAO {

    private final Connection conexao;

    public CarrinhoDAO(Connection connection) {
        this.conexao = connection;
    }

    public void insertProduto(Cliente cliente, Produto produto) throws SQLException {
        String sql = "INSERT INTO carrinho(cliente, produto, quantidade) VALUES (?,?,?);";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.setInt(2, produto.getId());
        prepareStatement.setDouble(3, produto.getQuantidade());
        prepareStatement.execute();
    }

    public ArrayList<Produto> getProdutos(Cliente cliente) throws SQLException {
        String sql = "SELECT produto, quantidade FROM carrinho where cpf = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setString(1, cliente.getCpf());
        prepareStatement.execute();
        ResultSet resultado = prepareStatement.getResultSet();
        ArrayList<Produto> produtos = new ArrayList<>();
        return produtos;
    }
}
