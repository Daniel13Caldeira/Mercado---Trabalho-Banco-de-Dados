package Controller;

public class Funcionario extends Pessoa {

    protected int id;
    
    public Funcionario(String nome, String cpf, int id) {
        super(nome, cpf);
        this.id = id;
    }

    public Funcionario(String nome, String cpf, Endereco endereco, int id) {
        super(nome, cpf, endereco);
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
