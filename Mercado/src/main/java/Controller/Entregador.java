package Controller;

public class Entregador extends Funcionario {

    private String placaVeiculo;

    public Entregador(String placaVeiculo, int id, String nome, String cpf, String senha, Endereco endereco) {
        super(id, nome, cpf, senha, endereco);
        this.placaVeiculo = placaVeiculo;
    }

    public Entregador(String placaVeiculo, int id, String nome, String cpf, String senha) {
        super(id, nome, cpf, senha);
        this.placaVeiculo = placaVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
}
