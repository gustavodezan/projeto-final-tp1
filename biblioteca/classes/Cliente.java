/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.classes;

//import java.util.HashMap;
import java.util.ArrayList;
//import java.util.Comparator;
import java.util.GregorianCalendar;
public class Cliente extends Usuario {
    private GregorianCalendar dataInscricao;
    private int nivelLeitor;
    private ArrayList<Livro> historicoLivros;
    private ArrayList<Livro> livrosEmprestados;
    
    public Cliente(){
        this.livrosEmprestados = new ArrayList<>();
    }
    public Cliente(String nome,String senha,String username,
    ArrayList historicoLivros,GregorianCalendar dataInscricao,int nivelLeitor){
        super(nome,username,senha);
        this.historicoLivros = historicoLivros;
        this.dataInscricao = dataInscricao;
        this.nivelLeitor = nivelLeitor;
        this.livrosEmprestados = new ArrayList<>();
    }
    public Cliente(int id, String nome,String senha,String username,
    ArrayList<Livro> historicoLivros,GregorianCalendar dataInscricao,int nivelLeitor){
        super(nome,username,senha,id);
        this.historicoLivros = historicoLivros;
        this.dataInscricao = dataInscricao;
        this.nivelLeitor = nivelLeitor;
        this.livrosEmprestados = new ArrayList<>();
    }
    public Cliente(String nome, String senha, String username) {
        super(nome,username,senha);
        this.historicoLivros = new ArrayList<Livro>();
        this.dataInscricao = new GregorianCalendar();
        this.nivelLeitor = 0;
        this.livrosEmprestados = new ArrayList<>();
    }
    
    public Cliente(String nome,String senha,String username, ArrayList<Livro> historicoLivros,GregorianCalendar dataInscricao,int nivelLeitor, ArrayList<Livro> emprestado){
        super(nome,username,senha);
        this.historicoLivros = historicoLivros;
        this.dataInscricao = dataInscricao;
        this.nivelLeitor = nivelLeitor;
        this.livrosEmprestados = emprestado;
    }
    
    public ArrayList<Livro> getHistoricoLivros(){
        return this.historicoLivros;
    }
    public void setHistoricoLivros(ArrayList<Livro> historicoLivros){
        this.historicoLivros = historicoLivros;
    }
    public GregorianCalendar getDataIncricao(){
        return this.dataInscricao;
    }
    public void setDataInscricao(GregorianCalendar dataInscricao){
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
        historicoLivros.add(livro);
    }
    
    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
     
    public void updateNivel(){
        nivelLeitor = (int) (historicoLivros.size() / 5);
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
        livrosEmprestados.remove(livro);
        nivelLeitor = (int) (historicoLivros.size() / 5);
    }
    
    public void devolverLivros(){
       for (int i = 0; i < livrosEmprestados.size(); i++) {
           livrosEmprestados.get(i).setEmprestado(false);
       }
       livrosEmprestados.clear();
    }
}