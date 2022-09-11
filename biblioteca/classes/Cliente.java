/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.classes;

import java.util.HashMap;
import java.util.ArrayList;
public class Cliente extends Usuario {
    private String dataInscricao;
    private int nivelLeitor;
    private ArrayList<Livro> historicoLivros;
    private ArrayList<Livro> livrosEmprestados;
    
    public Cliente(){}
    public Cliente(String nome,String senha,int id,
    ArrayList historicoLivros,String dataInscricao,int nivelLeitor){
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
    public int getNivelLeitor(){
        return this.nivelLeitor;
    }
    public void setNivelLeitor(int nivelLeitor){
        this.nivelLeitor = nivelLeitor;
    }
 
    public void addLivroEmprestado(Livro livro) {
        livrosEmprestados.add(livro);
    }
    
    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
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
    
    public void devolverLivro(Livro livro) {
        livro.devolver();
        livrosEmprestados.remove(livro);
    }
    
    public void devolverLivros(){
       for (int i = 0; i < livrosEmprestados.size(); i++) {
           livrosEmprestados.get(i).setEmprestado(false);
       }
       livrosEmprestados.clear();
    }
    
    public ArrayList<Livro> listarLivros(){
       return this.historicoLivros;
    }
}
