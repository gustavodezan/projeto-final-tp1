/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca.telas;

import biblioteca.classes.Autor;
import biblioteca.classes.GerenciarBiblioteca;
import biblioteca.classes.Livro;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gusta
 */
public class ExibirLivrosAutor extends javax.swing.JFrame {
    GerenciarBiblioteca sistema;
    Autor autor;
    /**
     * Creates new form ExibirLivrosAutor
     */
    public ExibirLivrosAutor() {
        initComponents();
        carregarInfo();
    }
    
    public ExibirLivrosAutor(GerenciarBiblioteca sistema, Autor autor) {
        initComponents();
        this.sistema = sistema;
        this.autor = autor;
        carregarInfo();
    }

    public void carregarInfo(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Informações do autor"},0){
            @Override
            public boolean isCellEditable(int row, int column){return false;}
        };
        ArrayList<Livro> livros = autor.getLivros();
        ArrayList<Object> lista = new ArrayList<>();
        
        lista.add("Nome: "+ autor.getNome());
        lista.add("Data de nascimento: " + autor.getDataDeNascimento());
        lista.add("País de origem: " + autor.getPaisOrigem());
        lista.add("Livros publicados: " + autor.getLivros().size());
        for (int i = 0; i < lista.size(); i++) {
           Object linha0[] = {lista.get(i)};
           modelo.addRow(linha0);
        }
        
        for (int i=0;i < livros.size(); i++){
            Livro livro = livros.get(i);
            Object linha[] = {livro.getNome() + " - Estante: " + livro.getEstante().getIdentificacao()};
            modelo.addRow(linha);
             
        }
        jTable1.setModel(modelo);    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ExibirLivrosAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirLivrosAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirLivrosAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirLivrosAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirLivrosAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
