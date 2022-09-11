/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.classes;

import java.util.HashMap;
import java.util.ArrayList;
public class Cliente extends Usuario {
    private String historicoLivros,dataInscricao,nivelLeitor;

    public Cliente(){}
    public Cliente(String nome,String senha,int id,
    String historicoLivros,String dataInscricao,String nivelLeitor){
        super(nome,senha,id);
        this.historicoLivros = historicoLivros;
        this.dataInscricao = dataInscricao;
        this.nivelLeitor = nivelLeitor;
    }
    public String getHistoricoLivros(){
        return this.historicoLivros;
    }
    public void setHistoricoLivros(String historicoLivros){
        this.historicoLivros = historicoLivros;
    }
    public String getDataIncricao(){
        return this.dataInscricao;
    }
    public void setDataInscricao(String dataInscricao){
        this.dataInscricao = dataInscricao;
    }
    public String getNivelLeitor(){
        return this.nivelLeitor;
    }
    public void setNivelLeitor(String nivelLeitor){
        this.nivelLeitor = nivelLeitor;
    }
    //public boolean solicitarEmprestimo(String nomeLivro,String genero){};
    public boolean verificarLivro(String nomeLivro,String genero,HashMap<String,ArrayList<Livro>> mapa){
        ArrayList<Livro>  listaLivros = mapa.get(genero);
        if(listaLivros != null){
            for(Livro livro:listaLivros){
                if(livro.getNome().equals(nomeLivro)){
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
    }
    public void devolverLivro(String nomeLivro,String genero){};
    public String listarLivros(String genero,HashMap<String,ArrayList<Livro>> mapa){
        for(String generoEstante:mapa.keySet()){
            if(generoEstante.equals(genero)){
                return mapa.get(genero).toString();
            }
        }
        return null;
    }
}
