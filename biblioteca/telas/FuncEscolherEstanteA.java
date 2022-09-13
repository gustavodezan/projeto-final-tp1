/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca.telas;

import biblioteca.classes.Estante;
import biblioteca.classes.Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jplim
 */
public class FuncEscolherEstanteA extends javax.swing.JFrame {
ArrayList<Estante> estantes = new ArrayList<>();
    Funcionario funcionarioA;
    public FuncEscolherEstanteA(){
        initComponents();
        carregarTabela();
    }
    
    /*Inicia os componentes da tela ,conectas as variaveis com os argumentos dados 
    e carrega a tabela de estantes para o usuario poder selecionar alguma para adicionar
    um livro*/
    
    public FuncEscolherEstanteA(ArrayList<Estante> estantes,Funcionario funcionario){
        initComponents();
        this.estantes=estantes;
        this.funcionarioA=funcionario;
        carregarTabela();
    }
    
    /*Carrega a tabela de estantes*/
    
    public void carregarTabela(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Identificacao","Localizacao","Genero","Quantidade de Livros"},0){
            @Override
            public boolean isCellEditable(int row, int column){return false;}
        };
            
        
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

        btConfEscEstA = new javax.swing.JButton();
        btCancEscEstA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEscEst = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/library.png")).getImage());

        btConfEscEstA.setText("Confirmar");
        btConfEscEstA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfEscEstAActionPerformed(evt);
            }
        });

        btCancEscEstA.setText("Cancelar");
        btCancEscEstA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancEscEstAActionPerformed(evt);
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
                .addGap(113, 113, 113)
                .addComponent(btConfEscEstA)
                .addGap(18, 18, 18)
                .addComponent(btCancEscEstA)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfEscEstA)
                    .addComponent(btCancEscEstA))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Se alguma estante estiver selecionada abre a tela para adicionar um livro nessa estante*/
    
    private void btConfEscEstAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfEscEstAActionPerformed
        int ind = tblEscEst.getSelectedRow();
        if (ind >=0 && ind < estantes.size()){
            new FuncAdicionarLivroEstante(estantes.get(ind),this).setVisible(true);
        }
    }//GEN-LAST:event_btConfEscEstAActionPerformed

     /*Fecha a tela */
    
    private void btCancEscEstAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancEscEstAActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancEscEstAActionPerformed

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
            java.util.logging.Logger.getLogger(FuncEscolherEstanteA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncEscolherEstanteA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncEscolherEstanteA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncEscolherEstanteA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncEscolherEstanteA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancEscEstA;
    private javax.swing.JButton btConfEscEstA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEscEst;
    // End of variables declaration//GEN-END:variables
}
