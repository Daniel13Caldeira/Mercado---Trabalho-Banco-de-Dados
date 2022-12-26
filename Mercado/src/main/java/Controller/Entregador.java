package Controller;

public class Entregador extends Funcionario {

    private String placaVeiculo;

    public Entregador(String placaVeiculo, String nome, String cpf, int id) {
        super(nome, cpf, id);
        this.placaVeiculo = placaVeiculo;
    }

    public Entregador(String placaVeiculo, String nome, String cpf, Endereco endereco, int id) {
        super(nome, cpf, endereco, id);
        this.placaVeiculo = placaVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
}
