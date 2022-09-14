/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca.telas;

import biblioteca.classes.Cliente;
import biblioteca.classes.Estante;
import biblioteca.classes.GerenciarBiblioteca;
import biblioteca.classes.Livro;
import biblioteca.classes.Pedido;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jplim
 */
public class FuncFazerPedido extends javax.swing.JFrame {
    ArrayList<Estante> estantes = new ArrayList<>();
    Cliente cliente;
    ArrayList<Livro> livrosped=new  ArrayList<>();
    GerenciarBiblioteca sistema;
    Pedido pedido=new Pedido();
    
    public FuncFazerPedido(){
        initComponents();
        carregarTabela();
    }
    
    /*Inicia os componentes da tela ,conectas as variaveis com os argumentos dados 
    e carrega a tabela de estantes para o usuario poder selecionar alguma para adicionar
    um livro*/
    
    public FuncFazerPedido(Cliente cliente,GerenciarBiblioteca sistema){
        initComponents();
        this.estantes=sistema.getEstantes();
        this.cliente=cliente;
        this.sistema=sistema;
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
    
    public void carregarTabela2(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome","Data de Publicação","Genero","Quantidade de Paginas"},0){
            @Override
            public boolean isCellEditable(int row, int column){return false;}};
        
        for (int i=0;i < livrosped.size();i++){
            Object linha[] = {livrosped.get(i).getNome(),livrosped.get(i).getDataDePublicacao(),livrosped.get(i).getGenero(),livrosped.get(i).getQtDePaginas()};
            modelo.addRow(linha);
        }
        tblPed.setModel(modelo);
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
        btnConfP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPed = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/library.png")).getImage());

        btConfEscEstA.setText("Escolher Livros da Estante");
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

        btnConfP.setText("Confirmar Pedido");
        btnConfP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfPActionPerformed(evt);
            }
        });

        tblPed.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblPed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btnConfP)
                                .addGap(161, 161, 161)
                                .addComponent(btCancEscEstA))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(btConfEscEstA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btConfEscEstA, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfP)
                    .addComponent(btCancEscEstA))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Se alguma estante estiver selecionada abre a tela para adicionar um livro nessa estante*/
    
    private void btConfEscEstAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfEscEstAActionPerformed
        int ind = tblEscEst.getSelectedRow();
        if (ind >=0 && ind < estantes.size()){
            new FuncEscolherLivPed(estantes.get(ind),livrosped,this).setVisible(true);
        }
    }//GEN-LAST:event_btConfEscEstAActionPerformed

     /*Fecha a tela */
    
    private void btCancEscEstAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancEscEstAActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancEscEstAActionPerformed

    private void btnConfPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfPActionPerformed
        for (int i=0;i < livrosped.size();i++){
            pedido.adicionarLivro(livrosped.get(i));
        }
        pedido.setCliente(cliente);
        boolean Conf=pedido.efetuarPedido();
            
        if (Conf){
//            for (int i=0;i < livrosped.size();i++){
//                for(int j=0;j < estantes.size();j++){
//                    if (estantes.get(j).getEstante().contains(livrosped.get(i))){
//                        estantes.get(j).getEstante().get(estantes.get(j).getEstante().indexOf(livrosped.get(i))).emprestar();
//                        break;
//                    }
//                }
//            
//            }
            JOptionPane.showMessageDialog (null,"Pedido realizado com sucesso");
            sistema.addPedido(pedido);
            livrosped.clear();
            this.carregarTabela2();
        }
        else{
            JOptionPane.showMessageDialog (null,"Limite de Livros foi estourado");
            livrosped.clear();
            this.carregarTabela2();
            }
    }//GEN-LAST:event_btnConfPActionPerformed

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
            java.util.logging.Logger.getLogger(FuncFazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncFazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncFazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncFazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FuncFazerPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancEscEstA;
    private javax.swing.JButton btConfEscEstA;
    private javax.swing.JButton btnConfP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEscEst;
    private javax.swing.JTable tblPed;
    // End of variables declaration//GEN-END:variables
}
