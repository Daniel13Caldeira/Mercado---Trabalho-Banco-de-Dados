package model;

import DAO.ClienteDAO;
import DAO.ConexaoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Cliente extends Pessoa {

    private Carrinho carrino;
    private ArrayList<Pedido> pedidos;
    private double conta;

    public double getConta() throws SQLException {
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        Connection conexao = conexaoDAO.getConection();
        ClienteDAO clienteDAO = new ClienteDAO(conexao);
        return clienteDAO.getConta(this);
    }

    public void setConta(double conta) throws SQLException {
       ConexaoDAO conexaoDAO = new ConexaoDAO();
        Connection conexao = conexaoDAO.getConection();
        ClienteDAO clienteDAO = new ClienteDAO(conexao);
        clienteDAO.updateConta(this,conta);
    }

    public Cliente(String nome, String cpf, Endereco endereco, String senha, float conta) {
        super(nome, cpf, endereco, senha);
        this.conta = conta;
    }

    public Cliente(String nome, String cpf, String senha, float conta) {
        super(nome, cpf, senha);
        this.conta = conta;
    }

    public Cliente(String cpf) {
        super(cpf);
    }

    public Carrinho getCarrino() {
        return carrino;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void updateAll() {

    }

}
