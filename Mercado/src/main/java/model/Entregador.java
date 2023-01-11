package model;

import DAO.ConexaoDAO;
import DAO.EntregadorDAO;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

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
    
    public static int contEntregador() throws SQLException{
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        Connection conexao = conexaoDAO.getConection();
        EntregadorDAO entregadorDAO = new EntregadorDAO(conexao);
        return entregadorDAO.selectAll().size();
    }
}
