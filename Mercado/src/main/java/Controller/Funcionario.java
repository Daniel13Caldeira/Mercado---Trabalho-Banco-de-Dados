package Controller;

public class Funcionario extends Pessoa {

    protected int id;

    public Funcionario(int id, String nome, String cpf, String senha, Endereco endereco) {
        super(nome, cpf, senha, endereco);
        this.id = id;
    }

    public Funcionario(int id, String nome, String cpf, String senha) {
        super(nome, cpf, senha);
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public Funcionario(int id, String cpf) {
        super(cpf);
        this.id = id;
    }
}
