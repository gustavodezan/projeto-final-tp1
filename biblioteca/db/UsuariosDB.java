/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.db;

import biblioteca.classes.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author jp
 */
public class UsuariosDB {
    private final Connection connection;

    public UsuariosDB(Connection connection) {
        this.connection = connection;
    }
    
   public void insertUsuario(Usuario user) throws SQLException{
       String sql = "INSERT INTO Usuarios(nome,senha,tipo_usuario) VALUES('"+user.getNome()+"','"+user.getSenha()+"','cliente')";
               
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.execute();
       connection.close();
   }
   
   public ResultSet autenticacaoUser(Usuario user) throws SQLException{
       String query = "SELECT * FROM usuarios WHERE nome = '"+user.getNome()+"' and senha = '"+user.getSenha()+"'";
       
       try{
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet nomeQuery = statement.executeQuery();
            return nomeQuery;
       }catch(SQLException erro){
                return null;
            }
   }
   public void insertFuncionario(Usuario user){
       String sql = "INSERT INTO Funcionarios(nome,senha) VALUES('"+user.getNome()+"','"+user.getSenha()+"')";
   }
}
