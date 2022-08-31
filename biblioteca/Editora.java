package biblioteca;
import java.util.ArrayList;

public class Editora {
    private String nome,paisOrigem,dataCriacao;
    private int qtdLivrosPublicados;
    private ArrayList<Livro> livros= new ArrayList<>();
    
    public Editora() {
    }

    public Editora(String nome, String paisOrigem, String dataCriacao, int qtdLivrosPublicados) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.dataCriacao = dataCriacao;
        this.qtdLivrosPublicados = qtdLivrosPublicados;
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

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
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
    }
     public void publicouLivro(Livro livro){
        livros.add(livro);
    }
    
}
