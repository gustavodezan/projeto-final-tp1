package biblioteca.classes;


public class Funcionario extends Usuario{
    private String cargo,setorResponsavel;

    public Funcionario(String nome, String senha, String username,String cargo, String setorResponsavel) {
        super(nome,senha,username);
        this.cargo = cargo;
        this.setorResponsavel = setorResponsavel;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }
    public void adicionarLivro(String nome, String dataDePublicacao, String genero,int qtDePaginas,Estante estante){
        Livro livro= new Livro(nome,dataDePublicacao,genero,qtDePaginas);
        estante.adicionarLivro(livro);
    }
    public void fazerPedido(){}
}
