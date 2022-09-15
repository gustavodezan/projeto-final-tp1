package biblioteca.classes;

public class Livro{
    private String nome,dataDePublicacao,genero;
    private int qtDePaginas, id;
    private boolean emprestado;
    private Autor autor;
    private Estante estante;
    private Editora editora;
    
    public Livro() {
    }

    public Livro(String nome, String dataDePublicacao, String genero, 
            int qtDePaginas) {
        this.nome = nome;
        this.dataDePublicacao = dataDePublicacao;
        this.genero = genero;
        this.qtDePaginas = qtDePaginas;
    }
    
    public Livro(String nome, String dataDePublicacao, String genero, int qtDePaginas, Autor autor, Estante estante) {
        this.nome = nome;
        this.dataDePublicacao = dataDePublicacao;
        this.genero = genero;
        this.qtDePaginas = qtDePaginas;
        this.autor = autor;
        this.estante = estante;
    }

    public Livro(int id, String nome, String dataDePublicacao, String genero, int qtDePaginas, Autor autor, Estante estante, Editora editora) {
        this.id = id;
        this.nome = nome;
        this.dataDePublicacao = dataDePublicacao;
        this.genero = genero;
        this.qtDePaginas = qtDePaginas;
        this.autor = autor;
        this.estante = estante;
        this.editora = editora;
    }
    public Livro(String nome, String dataDePublicacao, String genero, int qtDePaginas, Autor autor, Estante estante, Editora editora) {
        this.nome = nome;
        this.dataDePublicacao = dataDePublicacao;
        this.genero = genero;
        this.qtDePaginas = qtDePaginas;
        this.autor = autor;
        this.estante = estante;
        this.editora = editora;
    }
    
    public boolean emprestar() {
        if (!isEmprestado()) {
            emprestado = !emprestado;
            return true;
        }
        return false;
    }
    
    public boolean devolver() {
            if (isEmprestado()) {
            emprestado = !emprestado;
            return true;
        }
        return false;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDePublicacao() {
        return dataDePublicacao;
    }

    public void setDataDePublicacao(String dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQtDePaginas() {
        return qtDePaginas;
    }

    public void setQtDePaginas(int qtDePaginas) {
        this.qtDePaginas = qtDePaginas;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Estante getEstante() {
        return estante;
    }

    public void setEstante(Estante estante) {
        this.estante = estante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String mostrarInformacoes(){
        return "Nome: "+this.nome+"\nData de Publicação: "+this.dataDePublicacao
                +"\nQuantidade de Paginas: "+this.qtDePaginas+"\nGênero: "
                +this.genero;
    }  
}