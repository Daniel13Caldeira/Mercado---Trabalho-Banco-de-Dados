package model;

import DAO.ConexaoDAO;
import DAO.EntregadorDAO;
import DAO.PedidoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class PedidoDelivery extends Pedido {

    Entregador entregador;

    public PedidoDelivery(Entregador entregador, int id) {
        super(id);
        this.entregador = entregador;
    }

    public PedidoDelivery(Carrinho carrinho, String pagamento) throws SQLException {
        super(carrinho, pagamento);
        this.entregador = selecionaEntregadorAleatorio();
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        Connection conexao = conexaoDAO.getConection();
        PedidoDAO pedidoDAO = new PedidoDAO(conexao);
        pedidoDAO.insert(entregador, carrinho, pagamento);
    }

    public PedidoDelivery(int id) {
        super(id);
    }

    public PedidoDelivery(Entregador entregador, Carrinho carrinho, Cliente cliente) {
        super(carrinho, cliente);
        this.entregador = entregador;
    }

    private Entregador selecionaEntregadorAleatorio() throws SQLException {
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        Connection conexao = conexaoDAO.getConection();
        EntregadorDAO entregadorDAO = new EntregadorDAO(conexao);
        ArrayList<Entregador> entregadores = entregadorDAO.selectAll();
        Random random = new Random();
        return entregadores.get(random.nextInt(entregadores.size()));
    }

    public Entregador getEntregador() {
        return entregador;
    }

}
