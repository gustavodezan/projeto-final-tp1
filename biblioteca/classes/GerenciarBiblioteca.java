package biblioteca.classes;


import biblioteca.classes.Autor;
import biblioteca.classes.Pedido;
import biblioteca.classes.Estante;
import biblioteca.classes.Funcionario;
import biblioteca.classes.Livro;
import biblioteca.classes.Editora;

import java.io.File;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import netscape.javascript.JSObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class GerenciarBiblioteca {
    int id_cliente = 0, id_funcionario = 0, id_estante = 0, id_pedido = 0, id_livro = 0, id_editora = 0;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList<Estante> estantes = new ArrayList<Estante>();
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    private ArrayList<Autor> autores = new ArrayList<>();
    private ArrayList<Editora> editoras = new ArrayList<>();
    private ArrayList<Livro> livros = new ArrayList<>();
    private Cliente currentCliente;
    
    public GerenciarBiblioteca() {
        // Iniciar sistemas - Ler JSON
        // read json file and write to ArrayList
        ObjectMapper mapper = new ObjectMapper();
        String filename = "C:/Users/gusta/OneDrive/Documents/NetBeansProjects/Projeto TP1/src/biblioteca/data/database.json";
        // read file
        try {
            Map<String, Object> map = mapper.readValue(new File(filename), Map.class);
            System.out.println(map);
            // get sistema
            Map<String, Object> sistema = (Map<String, Object>) map.get("sistema");
            this.id_cliente = (int) sistema.get("id_cliente");
            this.id_funcionario = (int) sistema.get("id_funcionario");
            this.id_estante = (int) sistema.get("id_estante");
            this.id_pedido = (int) sistema.get("id_pedido");
            this.id_livro = (int) sistema.get("id_livro");
            this.id_editora = (int) sistema.get("id_editora");

            // get funcionarios
            ArrayList<Map<String, Object>> funcionarios = (ArrayList<Map<String, Object>>) map.get("funcionarios");
            for (Map<String, Object> funcionario : funcionarios) {
                Funcionario f = new Funcionario(
                    (String) funcionario.get("nome"),
                    (String) funcionario.get("senha"),
                    (String) funcionario.get("usuario"),
                    (String) funcionario.get("funcao"),
                    (String) funcionario.get("setor"));
                this.funcionarios.add(f);
            }

            // get estantes (id, ala, generos)
            ArrayList<Map<String, Object>> estantes = (ArrayList<Map<String, Object>>) map.get("estantes");
            for (Map<String, Object> estante : estantes) {
                Estante e = new Estante(
                    (String) estante.get("id"),
                    (String) estante.get("ala"),
                    (String) estante.get("generos"));
                this.estantes.add(e);
            }

            // get editoras (id, nome, pais , fundacao)
            ArrayList<Map<String, Object>> editoras = (ArrayList<Map<String, Object>>) map.get("editoras");
            for (Map<String, Object> editora : editoras) {
                String temp_data = (String) editora.get("fundacao");
                GregorianCalendar fundacao = new GregorianCalendar(
                    Integer.parseInt(temp_data.substring(0, 4)),
                    Integer.parseInt(temp_data.substring(5, 7)),
                    Integer.parseInt(temp_data.substring(8, 10)));
                Editora e = new Editora(
                    (int) editora.get("id"),
                    (String) editora.get("nome"),
                    (String) editora.get("pais"),
                    fundacao);
                this.editoras.add(e);
            }

            // get autores (id, nome, nacionalidade, data_nascimento, numLivros)
            ArrayList<Map<String, Object>> autores = (ArrayList<Map<String, Object>>) map.get("autores");
            for (Map<String, Object> autor : autores) {
                Autor a = new Autor(
                    (int) autor.get("id"),
                    (String) autor.get("nome"),
                    (String) autor.get("nacionalidade"),
                    (String) autor.get("data_nascimento"),
                    (int) autor.get("livros"));
                this.autores.add(a);
            }

            // get livros (id, titulo, ano, genero, paginas, editora, autor, estante)
            ArrayList<Map<String, Object>> livros = (ArrayList<Map<String, Object>>) map.get("livros");
            for (Map<String, Object> livro : livros) {
            
                Editora editora = new Editora();
                for (Editora e : this.editoras) {
                    if (e.getId() == (int) livro.get("editora")) {
                        editora = e;
                        break;
                    }
                }
                Autor autor = new Autor();
                for (Autor a : this.autores) {
                    if (a.getId() == (int) livro.get("autor")) {
                        autor = a;
                        break;
                    }
                }
                Estante estante = new Estante();
                for (Estante e : this.estantes) {
                    if (e.getIdentificacao() == (String) livro.get("estante")) {
                        System.out.println(e.getIdentificacao());
                        estante = e;
                        break;
                    }
                }

                Livro l = new Livro(
                (int) livro.get("id"),
                (String) livro.get("nome"),
                (String) livro.get("publicado"),
                (String) livro.get("genero"),
                (int) livro.get("paginas"),
                autor,
                estante,
                editora);
                this.livros.add(l);

                editora.addLivro(l);
                autor.escreveuLivro(l);
                estante.adicionarLivro(l);
            }

            // get clientes (nome, senha, usuario, nivel, data_registro, historico, emprestados)
            ArrayList<Map<String, Object>> clientes = (ArrayList<Map<String, Object>>) map.get("clientes");
            for (Map<String, Object> cliente : clientes) {
                ArrayList<Map<String, Object>> int_hist = (ArrayList<Map<String, Object>>) cliente.get("historico");
                ArrayList<Livro> hist_livro = new ArrayList<>();
                for (Map<String, Object> livro : int_hist) {
                    for (Livro l : this.livros) {
                        if (l.getId() == (int) livro.get("livro")) {
                            hist_livro.add(l);
                            break;
                        }
                    }
                }
                
                ArrayList<Map<String, Object>> int_emprestados = (ArrayList<Map<String, Object>>) cliente.get("emprestados");
                ArrayList<Livro> em = new ArrayList<>();
                for (Map<String, Object> livro : int_emprestados) {
                    for (Livro l : this.livros) {
                        if (l.getId() == (int) livro.get("livro")) {
                            em.add(l);
                            break;
                        }
                    }
                }

                GregorianCalendar data_registro = new GregorianCalendar(
                    Integer.parseInt(((String) cliente.get("data_registro")).substring(0, 4)),
                    Integer.parseInt(((String) cliente.get("data_registro")).substring(5, 7)),
                    Integer.parseInt(((String) cliente.get("data_registro")).substring(8, 10)));

                Cliente c = new Cliente(
                    (String) cliente.get("nome"),
                    (String) cliente.get("senha"),
                    (String) cliente.get("usuario"),
                    hist_livro,
                    data_registro,
                    (int) cliente.get("nivel"),
                    em);
                this.clientes.add(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
