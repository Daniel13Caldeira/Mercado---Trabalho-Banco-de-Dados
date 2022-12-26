package Controller;


public class Pedido{
    protected Carrinho carrinho;
    protected Cliente cliente;

    public Pedido(Carrinho carrinho, Cliente cliente) {
        this.carrinho = carrinho;
        this.cliente = cliente;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
