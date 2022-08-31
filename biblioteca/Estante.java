package biblioteca;
import java.util.ArrayList;

class Estante {
    private String identificacao,localizacao,genero;
    private int qtLivrosEstante;
    private ArrayList<Livro> estante = new ArrayList<Livro>();

    public Estante() {
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

    public void setQtLivrosEstante(int qtLivrosEstante) {
        this.qtLivrosEstante = qtLivrosEstante;
    }

    public ArrayList<Livro> getEstante() {
        return estante;
    }

    public void setEstante(ArrayList<Livro> estante) {
        this.estante = estante;
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
       }
       else{
           //jpanel para mostrar que nao existe tal livro na estante
           System.out.println("nao existe esse exemplar");
       }
    }
    
}