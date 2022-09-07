package biblioteca.classes;

import java.util.ArrayList;


public class Autor {
    private String nome,paisOrigem,dataDeNascimento;
    private int qtdLivrosEscritos;
    private ArrayList<Livro> livros= new ArrayList<>();

    public Autor() {
    }

    public Autor(String nome, String paisOrigem, String dataDeNascimento, int qtdLivrosEscritos) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.dataDeNascimento = dataDeNascimento;
        this.qtdLivrosEscritos = qtdLivrosEscritos;
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

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getQtdLivrosEscritos() {
        return qtdLivrosEscritos;
    }

    public void setQtdLivrosEscritos(int qtdLivrosEscritos) {
        this.qtdLivrosEscritos = qtdLivrosEscritos;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    
    public void escreveuLivro(Livro livro){
        livros.add(livro);
    }
    
}
