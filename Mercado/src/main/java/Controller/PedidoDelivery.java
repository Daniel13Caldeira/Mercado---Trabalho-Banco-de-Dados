package Controller;

public class PedidoDelivery extends Pedido {

    Entregador entregador;

    public PedidoDelivery(Entregador entregador, Carrinho carrinho, Cliente cliente) {
        super(carrinho, cliente);
        this.entregador = entregador;
    }

    public Entregador getEntregador() {
        return entregador;
    }

}
