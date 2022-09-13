package biblioteca.classes;;


import biblioteca.classes.Estante;
import java.util.ArrayList;

public class GerenciarBiblioteca {
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList<Estante> estantes = new ArrayList<Estante>();
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    
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
    
    
}
