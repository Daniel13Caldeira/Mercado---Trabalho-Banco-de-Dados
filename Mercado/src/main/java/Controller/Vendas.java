package Controller;

public class Vendas {

    private int id;
    private boolean entrega;
    private Cliente cliente;
    private Entregador entregador;
    private Carrinho carrinho;
    private double preco;

    public Vendas(int id, boolean entrega, Cliente cliente, Carrinho carrinho, double preco) {
        this.id = id;
        this.entrega = entrega;
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.preco = preco;
    }

    public Vendas(int id, boolean entrega, Cliente cliente, Entregador entregador, Carrinho carrinho, double preco) {
        this.id = id;
        this.entrega = entrega;
        this.cliente = cliente;
        this.entregador = entregador;
        this.carrinho = carrinho;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public boolean isEntrega() {
        return entrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public double getPreco() {
        return preco;
    }

}
