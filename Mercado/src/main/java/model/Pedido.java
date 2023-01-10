package model;

public class Pedido {

    protected Carrinho carrinho;
    protected Cliente cliente;
    protected int id;
    protected String status;

    public Pedido(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Pedido(int id, Cliente cliente, String status) {
        this.cliente = cliente;
        this.id = id;
        this.status = status;
    }

    public Pedido(Carrinho carrinho, Cliente cliente) {
        this.carrinho = carrinho;
        this.cliente = cliente;
        this.status = "Aguardando Confirmação";
    }

    public Pedido(Carrinho carrinho, Cliente cliente, String status) {
        this.carrinho = carrinho;
        this.cliente = cliente;
        this.status = status;
    }

    public Pedido(Carrinho carrinho, Cliente cliente, int id, String status) {
        this.carrinho = carrinho;
        this.cliente = cliente;
        this.id = id;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
