/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.classes;


import java.util.GregorianCalendar;


public class Pedido {
    private int id, numLivros;
    private GregorianCalendar data;

    public Pedido() {
        data = new GregorianCalendar();
    }
    
    public Pedido(int id, int numLivros) {
        this.id = id;
        this.numLivros = numLivros;
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
}
