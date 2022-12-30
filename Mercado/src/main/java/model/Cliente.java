package model;

import java.util.ArrayList;

public class Cliente extends Pessoa {

    private Carrinho carrino;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nome, String cpf, Endereco endereco, String senha) {
        super(nome, cpf, endereco, senha);
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
