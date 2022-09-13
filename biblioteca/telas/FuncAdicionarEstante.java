/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca.telas;

import biblioteca.classes.Estante;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jplim
 */
public class FuncAdicionarEstante extends javax.swing.JFrame {
    ArrayList<Estante> estantes = new ArrayList<>();
   
    
    public FuncAdicionarEstante() {
        initComponents();
    }
    /*Inicia os componentes da tela e conecta a variavel da tela com a referencia da lista de estantes 
    dada ao iniciar a tela */
    
    public FuncAdicionarEstante(ArrayList<Estante> estantes) {
        initComponents();
        this.estantes=estantes;
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
        labAdcId = new javax.swing.JLabel();
        labAdcLoc = new javax.swing.JLabel();
        labAdcGen = new javax.swing.JLabel();
        tfAdcId = new javax.swing.JTextField();
        tfAdcLoc = new javax.swing.JTextField();
        tfAdcGen = new javax.swing.JTextField();
        btConfAdcEst = new javax.swing.JButton();
        btCancAdcEst = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Estante");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/library.png")).getImage());

        jPanel1.setLayout(new java.awt.BorderLayout());

        labAdcId.setText("Identificação:");

        labAdcLoc.setText("Localização:");

        labAdcGen.setText("Genero:");

        btConfAdcEst.setText("Confirmar");
        btConfAdcEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfAdcEstActionPerformed(evt);
            }
        });

        btCancAdcEst.setText("Cancelar");
        btCancAdcEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancAdcEstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labAdcId)
                                        .addComponent(labAdcLoc))
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfAdcId, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(tfAdcLoc)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labAdcGen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(tfAdcGen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btConfAdcEst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCancAdcEst)))
                        .addGap(126, 126, 126))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAdcId)
                    .addComponent(tfAdcId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAdcLoc)
                    .addComponent(tfAdcLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfAdcGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCancAdcEst)
                            .addComponent(btConfAdcEst)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labAdcGen)))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /*Fecha a tela*/
    private void btCancAdcEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancAdcEstActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancAdcEstActionPerformed
    
    /*Pega os valores escritos nos campos de texto e se forem validos cria uma nova estante e
    adiciona na lista de estantes*/
    private void btConfAdcEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfAdcEstActionPerformed
        String id = tfAdcId.getText();
        String local = tfAdcLoc.getText();
        String genero = tfAdcGen.getText();
        
        
        if (!id.equals("") && !local.equals("") && !genero.equals("") ){
            Estante estante1 = new Estante(id,local,genero);
            estantes.add(estante1);
            JOptionPane.showMessageDialog (null,"Estante criada com sucesso");
                tfAdcId.setText("");
                tfAdcLoc.setText("");
                tfAdcGen.setText("");

        }else{
            JOptionPane.showMessageDialog (null,"valor(es) invalido(s)");
            tfAdcId.setText("");
            tfAdcLoc.setText("");
            tfAdcGen.setText("");
        }
        
        
    }//GEN-LAST:event_btConfAdcEstActionPerformed

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
            java.util.logging.Logger.getLogger(FuncAdicionarEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncAdicionarEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncAdicionarEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncAdicionarEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncAdicionarEstante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancAdcEst;
    private javax.swing.JButton btConfAdcEst;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labAdcGen;
    private javax.swing.JLabel labAdcId;
    private javax.swing.JLabel labAdcLoc;
    private javax.swing.JTextField tfAdcGen;
    private javax.swing.JTextField tfAdcId;
    private javax.swing.JTextField tfAdcLoc;
    // End of variables declaration//GEN-END:variables
}
