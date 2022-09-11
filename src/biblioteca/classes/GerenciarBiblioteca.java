package biblioteca.classes;


import biblioteca.classes.Estante;
import java.util.HashMap;
import biblioteca.db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GerenciarBiblioteca {
    public static void main(String[] args) throws SQLException{
        try ( //HashMap<String,Estante> mapaEstantes = new HashMap<>();
                Connection conexao = new Conexao().getConnection()) {
            String sql = "INSERT INTO usuarios(nome,senha) VALUES('joao','123456')";
            
            PreparedStatement state = conexao.prepareStatement(sql);
            state.execute();
        }
           

       
    }
    
}
