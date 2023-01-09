package model;

import java.util.ArrayList;

public class Cliente extends Pessoa {

    private Carrinho carrino;
    private ArrayList<Pedido> pedidos;
    private float conta;

    public Cliente(String nome, String cpf, Endereco endereco, String senha, float conta) {
        super(nome, cpf, endereco, senha);
        this.conta = conta;
    }

    public Cliente(String nome, String cpf, String senha, float conta) {
        super(nome, cpf, senha);
        this.conta = conta;
    }

    public Cliente(String cpf) {
        super(cpf);
    }

    public Carrinho getCarrino() {
        return carrino;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
