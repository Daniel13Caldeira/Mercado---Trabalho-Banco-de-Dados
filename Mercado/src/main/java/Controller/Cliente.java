package Controller;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private Carrinho carrino;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nome, String cpf, String senha, Endereco endereco) {
        super(nome, cpf, senha, endereco);
    }

    public Cliente(String nome, String cpf, String senha) {
        super(nome, cpf, senha);
    }

    public Carrinho getCarrino() {
        return carrino;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
