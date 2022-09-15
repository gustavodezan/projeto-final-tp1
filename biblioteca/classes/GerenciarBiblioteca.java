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
import java.io.FileWriter;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GerenciarBiblioteca {
    int id_cliente = 0, id_funcionario = 0, id_estante = 0, id_pedido = 0, id_livro = 0, id_editora = 0, id_autor = 0;
    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Estante> estantes;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Autor> autores;
    private ArrayList<Editora> editoras;
    private ArrayList<Livro> livros;
    private Cliente currentCliente;
    
    public GerenciarBiblioteca() {
        this.clientes = new ArrayList<Cliente>();
        this.funcionarios = new ArrayList<Funcionario>();
        this.estantes = new ArrayList<Estante>();
        this.pedidos = new ArrayList<Pedido>();
        this.autores = new ArrayList<Autor>();
        this.editoras = new ArrayList<Editora>();
        this.livros = new ArrayList<Livro>();
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
            this.id_autor = (int) sistema.get("id_autor");

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
            ArrayList<Map<String, Object>> estante_list = (ArrayList<Map<String, Object>>) map.get("estantes");
            Estante est;
            for (int k = 0; k < estante_list.size(); k++) {
                est = new Estante();
                est.setIdentificacao((String) estante_list.get(k).get("id"));
                est.setLocalizacao((String) estante_list.get(k).get("ala"));
                est.setGenero((String) estante_list.get(k).get("generos"));
                this.estantes.add(est);
                
            }
            System.out.println(this.estantes.toString());
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
                    (String) autor.get("pais"),
                    (String) autor.get("nascimento"),
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
                    if (e.getIdentificacao().equals(livro.get("estante"))) {
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

    public void saveData() {
        // sistema
        Map<String, Object> sistema = new LinkedHashMap<>();
        sistema.put("id_cliente", this.id_cliente);
        sistema.put("id_funcionario", this.id_funcionario);
        sistema.put("id_estante", this.id_estante);
        sistema.put("id_pedido", this.id_pedido);
        sistema.put("id_livro", this.id_livro);
        sistema.put("id_editora", this.id_editora);
        sistema.put("id_autor", this.id_autor);

        // save clientes
        ArrayList<Map<String, Object>> clientes = new ArrayList<>();
        for (Cliente c : this.clientes) {
            Map<String, Object> cliente = new HashMap<>();
            cliente.put("nome", c.getNome());
            cliente.put("senha", c.getSenha());
            cliente.put("usuario", c.getNomeUsuario());
            cliente.put("nivel", c.getNivelLeitor());
            cliente.put("data_registro", c.getDataIncricao().toZonedDateTime().format(DateTimeFormatter.ofPattern("uuuu/MM/dd")));
            ArrayList<Map<String, Object>> historico = new ArrayList<>();
            ArrayList<Livro> temp = c.getHistoricoLivros();
            for (Livro l : temp) {
                Map<String, Object> livro = new HashMap<>();
                livro.put("livro", l.getId());
                historico.add(livro);
            }
            cliente.put("historico", historico);
            ArrayList<Map<String, Object>> emprestados = new ArrayList<>();
            for (Livro l : c.getLivrosEmprestados()) {
                Map<String, Object> livro = new HashMap<>();
                livro.put("livro", l.getId());
                emprestados.add(livro);
            }
            cliente.put("emprestados", emprestados);
            clientes.add(cliente);
        }
        // save funcionarios
        ArrayList<Map<String, Object>> funcionarios = new ArrayList<>();
        for (Funcionario f : this.funcionarios) {
            Map<String, Object> funcionario = new HashMap<>();
            funcionario.put("nome", f.getNome());
            funcionario.put("senha", f.getSenha());
            funcionario.put("usuario", f.getNomeUsuario());
            funcionario.put("funcao", f.getCargo());
            funcionario.put("setor", f.getSetorResponsavel());
            funcionarios.add(funcionario);
        }
        // save estantes
        ArrayList<Map<String, Object>> estantes = new ArrayList<>();
        for (Estante e : this.estantes) {
            Map<String, Object> estante = new HashMap<>();
            estante.put("id", e.getIdentificacao());
            estante.put("ala", e.getLocalizacao());
            estante.put("generos", e.getGenero());
            estantes.add(estante);
        }

        // save editoras
        ArrayList<Map<String, Object>> editoras = new ArrayList<>();
        for (Editora e : this.editoras) {
            Map<String, Object> editora = new HashMap<>();
            editora.put("id", e.getId());
            editora.put("nome", e.getNome());
            editora.put("pais", e.getPaisOrigem());
            editora.put("fundacao", e.getDataCriacao().toZonedDateTime().format(DateTimeFormatter.ofPattern("uuuu/MM/dd")));
            editoras.add(editora);
        }

        // save livros
        ArrayList<Map<String, Object>> livros = new ArrayList<>();
        for (Livro l : this.livros) {
            Map<String, Object> livro = new HashMap<>();
            livro.put("id", l.getId());
            livro.put("nome", l.getNome());
            livro.put("publicado", l.getDataDePublicacao());
            livro.put("genero", l.getGenero());
            livro.put("paginas", l.getQtDePaginas());
            livro.put("editora", l.getEditora().getId());
            livro.put("autor", l.getAutor().getId());
            livro.put("estante", l.getEstante().getIdentificacao());
            livros.add(livro);
        }

        // save autores
        ArrayList<Map<String, Object>> autores = new ArrayList<>();
        for (Autor a : this.autores) {
            Map<String, Object> autor = new HashMap<>();
            autor.put("id", a.getId());
            autor.put("nome", a.getNome());
            autor.put("pais", a.getPaisOrigem());
            autor.put("nascimento", a.getDataDeNascimento());
            autor.put("livros",0);
            autores.add(autor);
        }

        // save pedidos (id, cliente, livros, data)
        ArrayList<Map<String, Object>> pedidos = new ArrayList<>();
        for (Pedido p : this.pedidos) {
            Map<String, Object> pedido = new HashMap<>();
            pedido.put("id", p.getId());
            pedido.put("cliente", p.getCliente().getNomeUsuario());
            pedido.put("data", p.getData().toZonedDateTime().format(DateTimeFormatter.ofPattern("uuuu/MM/dd")));
            ArrayList<Map<String, Object>> livrosPedido = new ArrayList<>();
            for (Livro l : p.getLivros()) {
                Map<String, Object> livro = new HashMap<>();
                livro.put("livro", l.getId());
                livrosPedido.add(livro);
            }
            pedido.put("livros", livrosPedido);
            pedidos.add(pedido);
        }

        // save to file
        Map<String, Object> data = new HashMap<>();
        data.put("sistema", sistema);
        data.put("clientes", clientes);
        data.put("funcionarios", funcionarios);
        data.put("estantes", estantes);
        data.put("editoras", editoras);
        data.put("livros", livros);
        data.put("autores", autores);
        data.put("pedidos", pedidos);

        try {
            // save file with json
            FileWriter file = new FileWriter("C:/Users/gusta/OneDrive/Documents/NetBeansProjects/Projeto TP1/src/biblioteca/data/database.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, data);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Cliente> getClientes() {
//        System.out.println(this.clientes);
//        System.out.println(this.funcionarios);
//        System.out.println(this.livros);
        
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
        return this.estantes;
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

    public ArrayList<Editora> getEditoras() {
        return editoras;
    }

    public void setEditoras(ArrayList<Editora> editoras) {
        this.editoras = editoras;
    }
    
    public void addLivro(Livro livro) {
        this.livros.add(livro);
    }
    
    public void addAutores(Autor autor) {
        this.autores.add(autor);
    }
    
    public void addEditora(Editora editora){
        this.editoras.add(editora);
    }
}
