package biblioteca.classes;
public class Usuario {
    private String nome, nomeUsuario, senha;
    private int id;

    public Usuario() {}

    public Usuario(String nome, String nomeUsuario, String senha, int id) {
        this.nome = nome;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.id = id;
    }
    
    public Usuario(String nome, String nomeUsuario, String senha) {
        this.nome = nome;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public enum Genero {
        //ACAO, AVENTURA, COMEDIA, DRAMA, FICCAO, SUSPENSE, TERROR
        ACAO, AVENTURA, COMEDIA, DRAMA, FICCAO, SUSPENSE, TERROR
    }

    public boolean verificarLogin(String senha) {
        if (this.senha.equals(senha))
            return true;
        return false;
    }

    public String VerificarLivro(int codigo) {
        // use int codigo to access Genero enum
        return Genero.values()[codigo].toString();

        //return "Livro não encontrado";
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
       
}
    

