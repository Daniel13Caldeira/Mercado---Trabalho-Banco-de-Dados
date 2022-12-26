package Controller;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private Carrinho carrino;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    public Cliente(String nome, String cpf, Endereco endereco) {
        super(nome, cpf, endereco);
    }

    public Carrinho getCarrino() {
        return carrino;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
