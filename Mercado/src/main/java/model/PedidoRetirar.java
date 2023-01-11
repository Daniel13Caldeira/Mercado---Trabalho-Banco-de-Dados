package model;

import DAO.ConexaoDAO;
import DAO.PedidoDAO;
import java.sql.Connection;
import java.sql.SQLException;

public class PedidoRetirar extends Pedido{

    public PedidoRetirar(Carrinho carrinho, String pagamento) throws SQLException {
        super(carrinho, pagamento);
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        Connection conexao = conexaoDAO.getConection();
        PedidoDAO pedidoDAO = new PedidoDAO(conexao);
        pedidoDAO.insert(carrinho, pagamento);
    }

    public PedidoRetirar(Carrinho carrinho) {
        super(carrinho);
    }
    
    public PedidoRetirar(int id) {
        super(id);
    }
}
