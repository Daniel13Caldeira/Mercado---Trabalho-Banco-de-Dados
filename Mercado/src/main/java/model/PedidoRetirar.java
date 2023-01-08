package model;

public class PedidoRetirar extends Pedido{

    public PedidoRetirar(Carrinho carrinho, Cliente cliente) {
        super(carrinho, cliente);
    }

    public PedidoRetirar(int id) {
        super(id);
    }
}
