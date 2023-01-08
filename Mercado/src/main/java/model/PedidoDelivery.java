package model;

public class PedidoDelivery extends Pedido {

    Entregador entregador;

    public PedidoDelivery(Entregador entregador, int id) {
        super(id);
        this.entregador = entregador;
    }

    public PedidoDelivery(int id) {
        super(id);
    }

    public PedidoDelivery(Entregador entregador, Carrinho carrinho, Cliente cliente) {
        super(carrinho, cliente);
        this.entregador = entregador;
    }

    public Entregador getEntregador() {
        return entregador;
    }

}
