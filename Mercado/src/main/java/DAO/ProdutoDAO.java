package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Fornecedor;
import model.Produto;
import model.ProdutoOutro;
import model.ProdutoPerecivel;
import model.Remedio;
import model.Vestuario;

public class ProdutoDAO {

    protected final Connection conexao;

    public ProdutoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public String getNome(Produto produto) throws SQLException {
        String sql = "SELECT nome FROM produto WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getString("nome");
        }
        return null;

    }

    public String getTipo(String id) throws SQLException {
        String sql = "select tipo from produto where id=?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, Integer.parseInt(id));
        preparedStatement.execute();
        ResultSet result = preparedStatement.getResultSet();
        if (result.next()) {
            return result.getString("tipo");
        }
        return null;
    }

    public Fornecedor getFornecedor(Produto produto) throws SQLException {
        String sql = "SELECT fornecedor FROM produto WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return new Fornecedor(result.getString("fornecedor"));
        }
        return null;

    }

    public ArrayList<Produto> getAll() throws SQLException {
        String sql = "select id,nome,preco from produto";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.execute();
        ResultSet result = preparedStatement.getResultSet();
        ArrayList<Produto> produtos = new ArrayList<>();
        while (result.next()) {
            produtos.add(new Produto(result.getInt("id"), result.getString("nome"), result.getDouble("preco")));
        }
        return produtos;
    }

    public double getPreco(Produto produto) throws SQLException {
        String sql = "SELECT preco FROM produto WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getDouble("preco");
        }
        return -1;
    }

    public double getQuantidade(Produto produto) throws SQLException {
        String sql = "SELECT quantidade FROM produto WHERE id = ?;";
        PreparedStatement prepareStatement = conexao.prepareStatement(sql);
        prepareStatement.setInt(1, produto.getId());
        prepareStatement.execute();
        ResultSet result = prepareStatement.getResultSet();
        if (result.next()) {
            return result.getDouble("quantidade");
        }
        return 0;
    }

    public void update(Produto produto) throws SQLException {
        String sql = "update produto set (fornecedor, preco,nome,quantidade) = (?,?,?,?) where id = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, produto.getFornecedor());
        preparedStatement.setDouble(2, produto.getPreco());
        preparedStatement.setString(3, produto.getNome());
        preparedStatement.setDouble(4, produto.getQuantidade());
        preparedStatement.setInt(5, produto.getId());
        preparedStatement.execute();
    }

    public void updateQuantidade(Produto produto) throws SQLException {
        String sql = "update produto set quantidade = ? where id = ?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setDouble(1, produto.getQuantidade());
        preparedStatement.setInt(2, produto.getId());
        preparedStatement.execute();
    }
    
    public void delete(String id) throws SQLException {
        String tipo = getTipo(id);
        switch (tipo) {
            case "Remédio":
                new RemedioDAO(conexao).delete(new Remedio(Integer.parseInt(id)));
                break;
            case "Vestuário":
                new VestuarioDAO(conexao).delete(new Vestuario(Integer.parseInt(id)));
                break;
            case "Perecível":
                new ProdutoPerecivelDAO(conexao).delete(new ProdutoPerecivel(id));
                break;
            case "Outros":
                new ProdutoOutroDAO(conexao).delete(new ProdutoOutro(id));
                break;
            default:
                break;
        }
    }
}
