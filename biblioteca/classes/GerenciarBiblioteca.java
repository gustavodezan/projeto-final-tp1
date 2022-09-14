package biblioteca.classes;;


import biblioteca.classes.Autor;
import biblioteca.classes.Pedido;
import biblioteca.classes.Estante;
import biblioteca.classes.Funcionario;
import java.util.ArrayList;

public class GerenciarBiblioteca {
    int id_cliente = 0, id_funcionario = 0, id_estante = 0, id_pedido = 0;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList<Estante> estantes = new ArrayList<Estante>();
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    private ArrayList<Autor> autores = new ArrayList<>();
    private Cliente currentCliente;
    
    public GerenciarBiblioteca() {
        // Iniciar sistemas - Ler JSON
        
        
    }
    
    public GerenciarBiblioteca(
            ArrayList<Cliente> clientes,
            ArrayList<Funcionario> funcionarios,
            ArrayList<Estante> estantes) {
        this.clientes.addAll(clientes);
        this.funcionarios.addAll(funcionarios);
        this.estantes.addAll(estantes);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Estante> getEstantes() {
        return estantes;
    }

    public void setEstantes(ArrayList<Estante> estantes) {
        this.estantes = estantes;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    
    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getId_estante() {
        return id_estante;
    }

    public void setId_estante(int id_estante) {
        this.id_estante = id_estante;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }
    
    public int incrementIDPedido() {
        id_pedido += 1;
        return id_pedido;
    }

    public Cliente getCurrentCliente() {
        return currentCliente;
    }

    public void setCurrentCliente(Cliente currentCliente) {
        this.currentCliente = currentCliente;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
    
    public void addAutores(Autor autor) {
        this.autores.add(autor);
    }
}
