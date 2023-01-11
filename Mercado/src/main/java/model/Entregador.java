package model;

public class Entregador extends Funcionario {

    private String placaVeiculo;

    public Entregador(int id) {
        super(id);
    }

    public Entregador(String placaVeiculo, String cargo, String nome, String cpf, String senha) {
        super(cargo, nome, cpf, senha);
        this.placaVeiculo = placaVeiculo;
    }

    public Entregador(String placaVeiculo, String nome, String cpf, int id, String cargo, String senha) {
        super(nome, cpf, id, cargo, senha);
        this.placaVeiculo = placaVeiculo;
    }

    public Entregador(String placaVeiculo, String nome, String cpf, Endereco endereco, int id, String cargo, String senha) {
        super(nome, cpf, endereco, id, cargo, senha);
        this.placaVeiculo = placaVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
}
