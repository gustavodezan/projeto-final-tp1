/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca.telas;

import biblioteca.classes.Cliente;
import biblioteca.classes.Estante;
import biblioteca.classes.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author jplim
 */
public class TelaOpcoesFuncionario extends javax.swing.JFrame {
    ArrayList<Estante> estantes = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>(); 
    Funcionario funcionarioA;
    
    public TelaOpcoesFuncionario(){
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
       
    }
    
    /*Inicia os componentes da tela e conecta a variavel da tela com a referencia da lista de estantes 
    dada ao iniciar a tela */
    
    public TelaOpcoesFuncionario(ArrayList<Estante> estantes,Funcionario funcionario) {
        initComponents();
        this.estantes = estantes;
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

        jMenuItem1 = new javax.swing.JMenuItem();
        simboloF = new javax.swing.JLabel();
        menuTelaOpcoesFuncionario = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuICadastrarClie = new javax.swing.JMenuItem();
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

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        menuIFazerpedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/sendfile_envia_13691.png"))); // NOI18N
        menuIFazerpedido.setText("Fazer pedido");
        menuIFazerpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIFazerpedidoActionPerformed(evt);
            }
        });
        menuCliente.add(menuIFazerpedido);

        menuTelaOpcoesFuncionario.add(menuCliente);

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

        setJMenuBar(menuTelaOpcoesFuncionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(simboloF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        new TelaFuncionarioCadastrarClie(clientes).setVisible(true);
    }//GEN-LAST:event_menuICadastrarClieActionPerformed
    
    /*Abre a tela para fazer um pedido para um cliente (ainda não tem função)*/
    
    private void menuIFazerpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIFazerpedidoActionPerformed
        new FuncEscolherClie(clientes,estantes).setVisible(true);
    }//GEN-LAST:event_menuIFazerpedidoActionPerformed

    /*Abre a tela para escolher uma estante onde se quer adicionar algum livro */
    
    private void menuIAddLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIAddLivroActionPerformed
        new FuncEscolherEstanteA(estantes,funcionarioA).setVisible(true);
    }//GEN-LAST:event_menuIAddLivroActionPerformed
    
    /*Abre a tela para escolher alguma estante para poder remover um livro dela */
    
    private void menuIRemDaEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIRemDaEstanteActionPerformed
        new FuncEscolherEstanteR(estantes).setVisible(true);
    }//GEN-LAST:event_menuIRemDaEstanteActionPerformed
    
    /*Abre a tela de criação de estante */
    
    private void menuICriarEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuICriarEstanteActionPerformed
        new FuncAdicionarEstante(estantes).setVisible(true);
    }//GEN-LAST:event_menuICriarEstanteActionPerformed
    
    /*Abre a tela de escolha e edição de alguma estante */
    
    private void menuIEditarEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIEditarEstanteActionPerformed
         new FuncEditarEstante(estantes).setVisible(true);
    }//GEN-LAST:event_menuIEditarEstanteActionPerformed
    
    /*Abre a tela onde se escolhe e remove uma estante*/
    
    private void menuIRemEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIRemEstanteActionPerformed
        new FuncRemoverEstante(estantes).setVisible(true);
    }//GEN-LAST:event_menuIRemEstanteActionPerformed

    //abre a tela para cadastrar um Funcionario
    
    private void menuCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadFuncActionPerformed
        new CadastrarFunc().setVisible(true);
    }//GEN-LAST:event_menuCadFuncActionPerformed

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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuCadFunc;
    private javax.swing.JMenu menuCliente;
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
    private javax.swing.JMenuBar menuTelaOpcoesFuncionario;
    private javax.swing.JLabel simboloF;
    // End of variables declaration//GEN-END:variables
}
