/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.classes;


import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Pedido {
    private int id, numLivros;
    private int limiteBase = 3;
    private GregorianCalendar data;
    private Cliente cliente;
    private ArrayList<Livro> livros;
    
    public Pedido() {
        livros = new ArrayList<Livro>();
        data = new GregorianCalendar();
    }
    
    public Pedido(int id, Cliente cliente, ArrayList<Livro> livros) {
        this.id = id;
        this.numLivros = livros.size();
        this.livros = livros;
        this.cliente = cliente;
        this.data = new GregorianCalendar();
    }
    
    public boolean verificarValidade(int limite){
        if (numLivros <= limite) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        numLivros += 1;
    }
    
    public boolean removerLivro(Livro livro) {
        return livros.remove(livro);
    }
    
    public boolean efetuarPedido() {
        int limite = cliente.getNivelLeitor()+limiteBase-cliente.getLivrosEmprestados().size();
        if (verificarValidade(limite)) {
            for (int i = 0; i < livros.size(); i++) {
                livros.get(i).emprestar();
                cliente.addLivroEmprestado(livros.get(i));
            }
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumLivros() {
        return numLivros;
    }

    public void setNumLivros(int numLivros) {
        this.numLivros = numLivros;
    }

    public GregorianCalendar getData() {
        return data;
    }

    public void setData(GregorianCalendar data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    
    
}
