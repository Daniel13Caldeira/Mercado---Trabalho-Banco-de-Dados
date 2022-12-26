package Controller;

public class Endereco {

    String Cidade, bairro, rua, cep, uf;
    int numero;

    public Endereco(String Cidade, String bairro, String rua, String cep, String uf, int numero) {
        this.Cidade = Cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.uf = uf;
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
