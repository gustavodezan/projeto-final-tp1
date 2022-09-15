/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca.telas;

import biblioteca.classes.Autor;
import biblioteca.classes.Cliente;
import biblioteca.classes.Editora;
import biblioteca.classes.Estante;
import biblioteca.classes.Funcionario;
import biblioteca.classes.GerenciarBiblioteca;
import biblioteca.classes.Livro;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author jplim
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ArrayList<Estante> estantes;
    ArrayList<Cliente> clientes;
    ArrayList<Funcionario> funcionarios ;
    GerenciarBiblioteca sistema;
    /*Inicia os componentes da tela e cria a lista de estantes */
    
    public TelaPrincipal() {
        initComponents();
        sistema = new GerenciarBiblioteca();
        estantes =(sistema.getEstantes());
        clientes = (sistema.getClientes());
        funcionarios = (sistema.getFuncionarios());
        // estantes = new ArrayList<>();
        // Estante estanteA = new Estante("A", "Ala 1", "Aventura");
        // estantes.add(estanteA);
        // Estante estanteB = new Estante("B", "Ala 2", "Sci-Fi");
        // estantes.add(estanteB);
        // Estante estanteC = new Estante("C", "Ala 3", "Drama");
        // estantes.add(estanteC);
        
        // clientes = new ArrayList<>();
        // Cliente cliente1 = new Cliente("root", "root", "root");
        // clientes.add(cliente1);
        
        // funcionarios =new ArrayList<>();
        // Funcionario funcionarioA=new Funcionario("João Gustavo","12345","admin1","administrador do Sistema","TI");
        // Funcionario funcionarioB = new Funcionario("admin","admin","admin","Admin","TI");
        // funcionarios.add(funcionarioA);
        // funcionarios.add(funcionarioB);
        
        // Editora editoraA = new Editora("Harper Collins Brasil", "Brasil", new GregorianCalendar(2015,1,1));
        // Editora editoraB = new Editora("Aleph", "Brasil", new GregorianCalendar(1986,1,1));
        // Editora editoraC = new Editora("Zahar", "Rio de Janeiro, Brasil", new GregorianCalendar(1957,1,1));
        // //{"id": 3, "nome":"O Chamado de Cthulhu", "genero":"Drama", "editora":2, "autor":3, "ano":1926, "edicao":1, "paginas":192, "isbn":"978-85-359-0277-1", "preco": 15.00, "quantidade": 1}
        
        // Autor tolkien = new Autor("J. R. R. Tolkien", "Inglaterra", "03/01/1892", 0);
        // Livro hobbit = new Livro("O Hobbit", "21/09/1937", "Aventura", 299, tolkien, estanteA);
        // hobbit.setEditora(editoraA);
        // editoraA.addLivro(hobbit);
        // tolkien.escreveuLivro(hobbit);
        // estanteA.adicionarLivro(hobbit);
        
        // Autor gibson = new Autor("Willian Gibson", "Estados Unidos", "17/02/1948", 0);
        // Livro neuromancer = new Livro("Neuromancer", "01/06/1984", "Sci-Fi", 319, gibson, estanteB);
        // neuromancer.setEditora(editoraB);
        // editoraB.addLivro(neuromancer);
        // gibson.escreveuLivro(neuromancer);
        // estanteB.adicionarLivro(neuromancer);
        
        // Autor dumas = new Autor("Alexandre Dumas", "França", "24/07/1802", 0);
        // Livro conde = new Livro("O Conde de Monte Cristo - Volume 1", "1846", "Drama", 719, dumas, estanteC);
        // conde.setEditora(editoraC);
        // editoraC.addLivro(conde);
        // dumas.escreveuLivro(conde);
        // estanteC.adicionarLivro(conde);
        
        // Autor doyle = new Autor("Arthur Conan Doyle", "Inglaterra", "22/05/1859", 0);
        // Livro holmes = new Livro("Um Estudo em Vermelho", "1887", "Investigação", 190, doyle, estanteC);
        // holmes.setEditora(editoraC);
        // editoraC.addLivro(holmes);
        // doyle.escreveuLivro(holmes);
        // estanteC.adicionarLivro(holmes);
        
        // sistema = new GerenciarBiblioteca(clientes,funcionarios,estantes);
        
        // sistema.addAutores(tolkien);
        // sistema.addAutores(gibson);
        // sistema.addAutores(dumas);
        // sistema.addAutores(doyle);
        
        // sistema.setId_pedido(3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCads = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/library.png")).getImage());

        jPanel1.setLayout(new java.awt.BorderLayout());

        btnCads.setText("Cadastro do usuario");
        btnCads.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadsActionPerformed(evt);
            }
        });

        btnLog.setText("Login");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/library.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnLog)
                        .addGap(37, 37, 37)
                        .addComponent(btnCads))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1)))
                .addGap(0, 77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLog)
                    .addComponent(btnCads))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadsActionPerformed
        new CadastroView(sistema).setVisible(true);
    }//GEN-LAST:event_btnCadsActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        new LoginView(sistema).setVisible(true);
    }//GEN-LAST:event_btnLogActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCads;
    private javax.swing.JButton btnLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
