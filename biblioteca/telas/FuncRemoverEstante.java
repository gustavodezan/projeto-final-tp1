/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca.telas;

import biblioteca.classes.Estante;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jplim
 */
public class FuncRemoverEstante extends javax.swing.JFrame {
     ArrayList<Estante> estantes = new ArrayList<>();
     
    public FuncRemoverEstante(){
        initComponents();
        carregarTabela();
    }
    
    /*Inicia os componentes da tela e conecta a variavel da tela com a referencia da lista de estantes 
    dada ao iniciar a tela */
    
    public FuncRemoverEstante(ArrayList<Estante> estantes){
        initComponents();
        this.estantes=estantes;
        carregarTabela();
    }
    
    /*Carega ou atualiza a tabela de Estantes*/
    
    public void carregarTabela(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Identificacao","Localizacao","Genero","Quantidade de Livros"},0){
            @Override
            public boolean isCellEditable(int row, int column){return false;}};
        
        for (int i=0;i < estantes.size();i++){
            Object linha[] = {estantes.get(i).getIdentificacao(),estantes.get(i).getLocalizacao(),estantes.get(i).getGenero(),estantes.get(i).getQtLivrosEstante()};
            modelo.addRow(linha);
        }
        tblEscEst.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btConfirmarRemEst = new javax.swing.JButton();
        btCancelarRemEst = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEscEst = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remover Estante");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/library.png")).getImage());

        btConfirmarRemEst.setText("Confirmar");
        btConfirmarRemEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarRemEstActionPerformed(evt);
            }
        });

        btCancelarRemEst.setText("Cancelar");
        btCancelarRemEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarRemEstActionPerformed(evt);
            }
        });

        tblEscEst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificação", "Genero", "Localização", "Quantidade de livros"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEscEst);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btConfirmarRemEst)
                .addGap(59, 59, 59)
                .addComponent(btCancelarRemEst)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmarRemEst)
                    .addComponent(btCancelarRemEst))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /*Fecha a tela */
    
    private void btCancelarRemEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarRemEstActionPerformed
       this.dispose();
    }//GEN-LAST:event_btCancelarRemEstActionPerformed
    
    /*Remove a estante selecionada e atualiza a tabela*/
    
    private void btConfirmarRemEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarRemEstActionPerformed
        int ind = tblEscEst.getSelectedRow();
        if (ind >=0 && ind < estantes.size()){
            estantes.remove(ind);
            carregarTabela();
        }
    }//GEN-LAST:event_btConfirmarRemEstActionPerformed

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
            java.util.logging.Logger.getLogger(FuncRemoverEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncRemoverEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncRemoverEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncRemoverEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncRemoverEstante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarRemEst;
    private javax.swing.JButton btConfirmarRemEst;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEscEst;
    // End of variables declaration//GEN-END:variables
}
