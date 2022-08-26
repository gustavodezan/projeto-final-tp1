/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 07339943188
 */
//package Biblioteca;
class Livro{
    private String nome,dataDePublicacao,genero;
    private int qtDePaginas;

    public Livro() {
    }

    public Livro(String nome, String dataDePublicacao, String genero, 
            int qtDePaginas) {
        this.nome = nome;
        this.dataDePublicacao = dataDePublicacao;
        this.genero = genero;
        this.qtDePaginas = qtDePaginas;
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
    
    public String mostrarInformacoes(){
        return "Nome: "+this.nome+"\nData de Publicação: "+this.dataDePublicacao
                +"\nQuantidade de Paginas: "+this.qtDePaginas+"\nGênero: "
                +this.genero;
    }  
}
