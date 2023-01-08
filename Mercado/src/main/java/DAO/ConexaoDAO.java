package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexaoDAO {
    public Connection getConection() throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mercado","postgres","postgres");
        return conexao;
    }
}
