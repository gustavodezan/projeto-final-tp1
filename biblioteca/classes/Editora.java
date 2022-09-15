package biblioteca.classes;


import java.util.ArrayList;
import java.util.GregorianCalendar;


public class Editora {
    private String nome,paisOrigem;
    private GregorianCalendar dataCriacao;
    private int qtdLivrosPublicados, id;
    private ArrayList<Livro> livros= new ArrayList<>();
    
    public Editora() {
    }

    public Editora(String nome, String paisOrigem, GregorianCalendar dataCriacao, int qtdLivrosPublicados) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.dataCriacao = dataCriacao;
        this.qtdLivrosPublicados = qtdLivrosPublicados;
    }
    
    public Editora(String nome, String paisOrigem, GregorianCalendar dataCriacao) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.dataCriacao = dataCriacao;
        this.qtdLivrosPublicados =livros.size();
        
    }
    
    public Editora(int id, String nome, String paisOrigem, GregorianCalendar dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.dataCriacao = dataCriacao;
        this.qtdLivrosPublicados =livros.size();
    }

    public void addLivro(Livro livro) {
        this.livros.add(livro);
        this.qtdLivrosPublicados =livros.size();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public GregorianCalendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(GregorianCalendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getQtdLivrosPublicados() {
        return qtdLivrosPublicados;
    }

    public void setQtdLivrosPublicados(int qtdLivrosPublicados) {
        this.qtdLivrosPublicados = qtdLivrosPublicados;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
        this.qtdLivrosPublicados =livros.size();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public void publicouLivro(Livro livro){
        livros.add(livro);
        this.qtdLivrosPublicados =livros.size();
    }
    
}
