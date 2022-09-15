package biblioteca.classes;


public class Funcionario extends Usuario{
    private String cargo,setorResponsavel;

    public Funcionario(String nome, String senha, String username,String cargo, String setorResponsavel) {
        super(nome,username,senha);
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
    public void adicionarLivro(Livro livro,Estante estante){
        estante.adicionarLivro(livro);
    }
}