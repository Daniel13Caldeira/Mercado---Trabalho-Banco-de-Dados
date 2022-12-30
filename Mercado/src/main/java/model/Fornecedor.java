package model;
public class Fornecedor {

    private String CNPJ, nome;

    public Fornecedor(String CNPJ, String nome) {
        this.CNPJ = CNPJ;
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
