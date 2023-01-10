package model;
public class Funcionario extends Pessoa {

    protected int id;

    protected String cargo;

    public Funcionario(String nome, String cpf, int id, String cargo, String senha) {
        super(nome, cpf, senha);
        this.id = id;
        this.cargo = cargo;
    }

    public Funcionario(int id) {
        this.id = id;
    }

    public Funcionario(String cargo, String nome, String cpf, String senha) {
        super(nome, cpf, senha);
        this.cargo = cargo;
    }

    public Funcionario(String nome, String cpf, Endereco endereco, int id, String cargo, String senha) {
        super(nome, cpf, endereco, senha);
        this.id = id;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public Funcionario(int id, String cpf) {
        super(cpf);
        this.id = id;
    }
    
}
