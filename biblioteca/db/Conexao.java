package biblioteca.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
    public Connection getConnection() throws SQLException{
        try{
            Connection conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bibliotecadb","root","");
            return conexao;
        }catch(SQLException erro){
            throw new RuntimeException("Cannot connect to database", erro);
        }
    }
}   
