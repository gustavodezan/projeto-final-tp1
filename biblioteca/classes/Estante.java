package biblioteca.classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jplim
 */
import java.util.ArrayList;

public class Estante {
    private String identificacao,localizacao,genero;
    private ArrayList<Livro> estante = new ArrayList<>();
    private int qtLivrosEstante;

    public Estante() {
    }

    public Estante(String identificacao, String localizacao, String genero) {
        this.identificacao = identificacao;
        this.localizacao = localizacao;
        this.genero = genero;
        this.qtLivrosEstante=estante.size();
    }
    
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQtLivrosEstante() {
        return qtLivrosEstante;
    }

    public ArrayList<Livro> getEstante() {
        return estante;
    }

    public void setEstante(ArrayList<Livro> estante) {
        this.estante = estante;
        this.qtLivrosEstante=estante.size();
    }
    
    
    public Livro procurarLivro(String nome){
        //verificar se o array nao esta null
        for(Livro livro:this.estante){
            if(livro.getNome().equals(nome)){
                return livro;
            }
        }
        return null;
    }
    public void adicionarLivro(Livro livro){
        if(this.procurarLivro(livro.getNome())==null){
            this.estante.add(livro);
            this.qtLivrosEstante=estante.size();
        }
        else{
            //jpanel para mostrar que ja existe tal livro na estante
            System.out.println("já existe esse exemplar");
        }
        
    }
    public void removerLivro(Livro livro){
        //verificaçao se existe ou nao o livro no array
       if(this.procurarLivro(livro.getNome())!=null){
           this.estante.remove(livro);
           this.qtLivrosEstante=estante.size();
       }
       else{
           //jpanel para mostrar que nao existe tal livro na estante
           System.out.println("nao existe esse exemplar");
       }
    }
    
}
