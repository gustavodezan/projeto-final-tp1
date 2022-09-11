/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.classes;

//import java.util.HashMap;
import java.util.ArrayList;
import biblioteca.classes.Estante;
public class Cliente extends Usuario {
    private String dataInscricao,nivelLeitor;
    private ArrayList<Livro> historicoLivros;

    public Cliente(){}
    public Cliente(String nome,String senha,int id,
    ArrayList historicoLivros,String dataInscricao,String nivelLeitor){
        super(nome,senha,id);
        this.historicoLivros = historicoLivros;
        this.dataInscricao = dataInscricao;
        this.nivelLeitor = nivelLeitor;
    }
    public ArrayList getHistoricoLivros(){
        return this.historicoLivros;
    }
    public void setHistoricoLivros(ArrayList historicoLivros){
        this.historicoLivros = historicoLivros;
    }
    public String getDataIncricao(){
        return this.dataInscricao;
    }
    public void setDataInscricao(String dataInscricao){
        this.dataInscricao = dataInscricao;
    }
    public String getNivelLeitor(){
        return this.nivelLeitor;
    }
    public void setNivelLeitor(String nivelLeitor){
        this.nivelLeitor = nivelLeitor;
    }
    //public boolean solicitarEmprestimo(String nomeLivro,String genero){};
    
    public boolean verificarLivro(String nomeLivro,ArrayList<ArrayList<Livro>> estantes){
      for(ArrayList<Livro> estante: estantes){
          for(Livro livro:estante){
              if(livro.getNome().equals(nomeLivro)){
                  return true;
              }
          }
      }
        return false;
    }
    public void devolverLivro(String nomeLivro,String genero){};
    public ArrayList<Livro> listarLivros(){
       return this.historicoLivros;
    }
}
