package biblioteca.classes;


import biblioteca.classes.Estante;
import java.util.ArrayList;

public class GerenciarBiblioteca {
    public static void main(String[] args){
        Livro livro = new Livro("matrix","22/01/25","ficcao",158);
        Livro livro1 = new Livro("a morte","22/01/25","ficcao",158);
        Livro livro2 = new Livro("peixe","22/01/25","ficcao",158);
        Estante estante = new Estante();
        //System.out.println(estante.getEstante());
        estante.adicionarLivro(livro);
        //estante.adicionarLivro("a morte");
        //estante.adicionarLivro("peixe");
        System.out.println(estante.getEstante().toString());
        //estante.removerLivro("peixe");
        //estante.toString();
        //estante.removerLivro("o jogo");
        //estante.toString();
        //System.out.println(livro.mostrarInformacoes());

       
    }
    
}
