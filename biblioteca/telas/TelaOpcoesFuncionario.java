/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca.telas;

import biblioteca.classes.Cliente;
import biblioteca.classes.Estante;
import biblioteca.classes.Funcionario;
import biblioteca.classes.GerenciarBiblioteca;
import java.util.ArrayList;

/**
 *
 * @author jplim
 */
public class TelaOpcoesFuncionario extends javax.swing.JFrame {
    GerenciarBiblioteca sistema;
    Funcionario funcionarioA;
    
    public TelaOpcoesFuncionario(){
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
       
    }
    
    /*Inicia os componentes da tela e conecta a variavel da tela com a referencia da lista de estantes 
    dada ao iniciar a tela */
    
    public TelaOpcoesFuncionario(GerenciarBiblioteca sistema,Funcionario funcionario) {
        initComponents();
        this.sistema=sistema;
        this.funcionarioA = funcionario;
        this.setExtendedState(MAXIMIZED_BOTH);
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        simboloF = new javax.swing.JLabel();
        menuTelaOpcoesFuncionario = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuICadastrarClie = new javax.swing.JMenuItem();
        menuMosLiv = new javax.swing.JMenuItem();
        menuIFazerpedido = new javax.swing.JMenuItem();
        menuFunc = new javax.swing.JMenu();
        menuCadFunc = new javax.swing.JMenuItem();
        menuLivros = new javax.swing.JMenu();
        menuIAddLivro = new javax.swing.JMenuItem();
        menuIRemDaEstante = new javax.swing.JMenuItem();
        menuEstante = new javax.swing.JMenu();
        menuICriarEstante = new javax.swing.JMenuItem();
        menuIEditarEstante = new javax.swing.JMenuItem();
        menuIRemEstante = new javax.swing.JMenuItem();
        menuAutor = new javax.swing.JMenu();
        viewAutor = new javax.swing.JMenuItem();
        addAutor = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        viewEditora = new javax.swing.JMenuItem();
        addEdit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/library.png")).getImage());

        simboloF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simboloF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/library.png"))); // NOI18N

        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/cliente16x16.png"))); // NOI18N
        menuCliente.setText("Cliente");
        menuCliente.setName(""); // NOI18N

        menuICadastrarClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/add.png"))); // NOI18N
        menuICadastrarClie.setText("Cadastrar");
        menuICadastrarClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuICadastrarClieActionPerformed(evt);
            }
        });
        menuCliente.add(menuICadastrarClie);

        menuMosLiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/list.png"))); // NOI18N
        menuMosLiv.setText("Ver Livros emprestados");
        menuMosLiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMosLivActionPerformed(evt);
            }
        });
        menuCliente.add(menuMosLiv);

        menuIFazerpedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/sendfile_envia_13691.png"))); // NOI18N
        menuIFazerpedido.setText("Fazer pedido");
        menuIFazerpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIFazerpedidoActionPerformed(evt);
            }
        });
        menuCliente.add(menuIFazerpedido);

        menuTelaOpcoesFuncionario.add(menuCliente);

        menuFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/employee.png"))); // NOI18N
        menuFunc.setText("Funcionario");

        menuCadFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/add.png"))); // NOI18N
        menuCadFunc.setText("Cadastrar Funcionario");
        menuCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadFuncActionPerformed(evt);
            }
        });
        menuFunc.add(menuCadFunc);

        menuTelaOpcoesFuncionario.add(menuFunc);

        menuLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/livro16x16.png"))); // NOI18N
        menuLivros.setText("Livros");

        menuIAddLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/add.png"))); // NOI18N
        menuIAddLivro.setText("Adicionar na estante");
        menuIAddLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIAddLivroActionPerformed(evt);
            }
        });
        menuLivros.add(menuIAddLivro);

        menuIRemDaEstante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/remover16x16.png"))); // NOI18N
        menuIRemDaEstante.setLabel("Remover Livro da Estante");
        menuIRemDaEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIRemDaEstanteActionPerformed(evt);
            }
        });
        menuLivros.add(menuIRemDaEstante);

        menuTelaOpcoesFuncionario.add(menuLivros);

        menuEstante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/bookshelf16x16.png"))); // NOI18N
        menuEstante.setText("Estante");

        menuICriarEstante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/add.png"))); // NOI18N
        menuICriarEstante.setText("Criar Estante");
        menuICriarEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuICriarEstanteActionPerformed(evt);
            }
        });
        menuEstante.add(menuICriarEstante);

        menuIEditarEstante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/edit16x16.png"))); // NOI18N
        menuIEditarEstante.setText("Editar Estante");
        menuIEditarEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIEditarEstanteActionPerformed(evt);
            }
        });
        menuEstante.add(menuIEditarEstante);

        menuIRemEstante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/remover16x16.png"))); // NOI18N
        menuIRemEstante.setText("Remover Estante");
        menuIRemEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIRemEstanteActionPerformed(evt);
            }
        });
        menuEstante.add(menuIRemEstante);

        menuTelaOpcoesFuncionario.add(menuEstante);

        menuAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/author.png"))); // NOI18N
        menuAutor.setText("Autor");

        viewAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/author.png"))); // NOI18N
        viewAutor.setText("Ver autor");
        viewAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAutorActionPerformed(evt);
            }
        });
        menuAutor.add(viewAutor);

        addAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/add.png"))); // NOI18N
        addAutor.setText("Adicionar Autor");
        addAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAutorActionPerformed(evt);
            }
        });
        menuAutor.add(addAutor);

        menuTelaOpcoesFuncionario.add(menuAutor);

        menuEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/publisher.png"))); // NOI18N
        menuEdit.setText("Editora");

        viewEditora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/publisher.png"))); // NOI18N
        viewEditora.setText("Ver Editora");
        viewEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEditoraActionPerformed(evt);
            }
        });
        menuEdit.add(viewEditora);

        addEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/add.png"))); // NOI18N
        addEdit.setText("Adicionar Editora");
        addEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEditActionPerformed(evt);
            }
        });
        menuEdit.add(addEdit);

        menuTelaOpcoesFuncionario.add(menuEdit);

        setJMenuBar(menuTelaOpcoesFuncionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(simboloF, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(simboloF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Abre a tela para cadastrar cliente */
    
    private void menuICadastrarClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuICadastrarClieActionPerformed
        new TelaFuncionarioCadastrarClie(sistema).setVisible(true);
    }//GEN-LAST:event_menuICadastrarClieActionPerformed
    
    /*Abre a tela para fazer um pedido para um cliente (ainda n??o tem fun????o)*/
    
    private void menuIFazerpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIFazerpedidoActionPerformed
        new FuncEscolherClie(sistema).setVisible(true);
    }//GEN-LAST:event_menuIFazerpedidoActionPerformed

    /*Abre a tela para escolher uma estante onde se quer adicionar algum livro */
    
    private void menuIAddLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIAddLivroActionPerformed
        new FuncEscolherEstanteA(sistema,funcionarioA).setVisible(true);
    }//GEN-LAST:event_menuIAddLivroActionPerformed
    
    /*Abre a tela para escolher alguma estante para poder remover um livro dela */
    
    private void menuIRemDaEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIRemDaEstanteActionPerformed
        new FuncEscolherEstanteR(sistema).setVisible(true);
    }//GEN-LAST:event_menuIRemDaEstanteActionPerformed
    
    /*Abre a tela de cria????o de estante */
    
    private void menuICriarEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuICriarEstanteActionPerformed
        new FuncAdicionarEstante(sistema).setVisible(true);
    }//GEN-LAST:event_menuICriarEstanteActionPerformed
    
    /*Abre a tela de escolha e edi????o de alguma estante */
    
    private void menuIEditarEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIEditarEstanteActionPerformed
         new FuncEditarEstante(sistema).setVisible(true);
    }//GEN-LAST:event_menuIEditarEstanteActionPerformed
    
    /*Abre a tela onde se escolhe e remove uma estante*/
    
    private void menuIRemEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIRemEstanteActionPerformed
        new FuncRemoverEstante(sistema).setVisible(true);
    }//GEN-LAST:event_menuIRemEstanteActionPerformed

    //abre a tela para cadastrar um Funcionario
    
    private void menuCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadFuncActionPerformed
        new CadastrarFunc(sistema).setVisible(true);
    }//GEN-LAST:event_menuCadFuncActionPerformed
    
    //abre a tela para mostrar os livros que est??o emprestados para um cliente
    
    private void menuMosLivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMosLivActionPerformed
        new FuncMostrarLivrosEmprestados(sistema).setVisible(true);
    }//GEN-LAST:event_menuMosLivActionPerformed

    private void addAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAutorActionPerformed
        new AdicionarAutor(sistema).setVisible(true);
    }//GEN-LAST:event_addAutorActionPerformed

    private void addEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEditActionPerformed
       new AdicionarEditora(sistema).setVisible(true);
    }//GEN-LAST:event_addEditActionPerformed

    private void viewAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAutorActionPerformed
        new ExibirAutor(sistema).setVisible(true);
    }//GEN-LAST:event_viewAutorActionPerformed

    private void viewEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEditoraActionPerformed
        new ExibirEditoras(sistema).setVisible(true);
    }//GEN-LAST:event_viewEditoraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoesFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoesFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoesFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoesFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOpcoesFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addAutor;
    private javax.swing.JMenuItem addEdit;
    private javax.swing.JMenu menuAutor;
    private javax.swing.JMenuItem menuCadFunc;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuEstante;
    private javax.swing.JMenu menuFunc;
    private javax.swing.JMenuItem menuIAddLivro;
    private javax.swing.JMenuItem menuICadastrarClie;
    private javax.swing.JMenuItem menuICriarEstante;
    private javax.swing.JMenuItem menuIEditarEstante;
    private javax.swing.JMenuItem menuIFazerpedido;
    private javax.swing.JMenuItem menuIRemDaEstante;
    private javax.swing.JMenuItem menuIRemEstante;
    private javax.swing.JMenu menuLivros;
    private javax.swing.JMenuItem menuMosLiv;
    private javax.swing.JMenuBar menuTelaOpcoesFuncionario;
    private javax.swing.JLabel simboloF;
    private javax.swing.JMenuItem viewAutor;
    private javax.swing.JMenuItem viewEditora;
    // End of variables declaration//GEN-END:variables
}
