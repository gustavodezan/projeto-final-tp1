/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import biblioteca.classes.Cliente;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author jplim
 */
public class TelaFuncionarioCadastrarClie extends javax.swing.JFrame {

    /**
     * Creates new form TelaFuncionarioCadastrarClie
     */
    public TelaFuncionarioCadastrarClie() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLbNome = new javax.swing.JLabel();
        jLbSenha = new javax.swing.JLabel();
        jLbId = new javax.swing.JLabel();
        jTfNome = new javax.swing.JTextField();
        jTfSenha = new javax.swing.JTextField();
        jTfId = new javax.swing.JTextField();
        jBtConf = new javax.swing.JButton();
        jBtCanc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagens/library.png")).getImage());

        jLbNome.setText("Nome:");

        jLbSenha.setText("Senha:");

        jLbId.setText("Id:");

        jBtConf.setText("Confirmar");
        jBtConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtConfActionPerformed(evt);
            }
        });

        jBtCanc.setText("Cancelar");
        jBtCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCancActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbSenha)
                            .addComponent(jLbNome))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTfNome))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLbId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTfId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtConf)
                                .addGap(40, 40, 40)
                                .addComponent(jBtCanc)))
                        .addContainerGap(100, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbNome)
                    .addComponent(jTfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbSenha)
                    .addComponent(jTfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbId)
                    .addComponent(jTfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtConf)
                    .addComponent(jBtCanc))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    
    
    // Fecha a janela
    
    private void jBtCancActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.dispose();
    }                                       

    // Cria o objeto do cliente
    
    private void jBtConfActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String nome = jTfNome.getText();
        String senha = jTfSenha.getText();
        GregorianCalendar cal = new GregorianCalendar();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        fmt.setCalendar(cal);
        String dataIns =fmt.format(cal.getTime());
        int id;

        try{
           id = Integer.parseInt(jTfId.getText());
        }catch (NumberFormatException e){
            id=-1;
        }
        
        if (!nome.equals("") && !dataIns.equals("") && !senha.equals("") && id > 0){
            Cliente cliente = new Cliente(nome,senha,id,"",dataIns,"1");
            JOptionPane.showMessageDialog (null,"Cliente cadastrado com sucesso.");
            jTfNome.setText("");
            jTfSenha.setText("");
            jTfId.setText("");
        }
        else{
            JOptionPane.showMessageDialog (null,"valor(es) invalido(s)");
            jTfNome.setText("");
            jTfSenha.setText("");
            jTfId.setText("");
        }
    }                                       

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
            java.util.logging.Logger.getLogger(TelaFuncionarioCadastrarClie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarioCadastrarClie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarioCadastrarClie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarioCadastrarClie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionarioCadastrarClie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jBtCanc;
    private javax.swing.JButton jBtConf;
    private javax.swing.JLabel jLbId;
    private javax.swing.JLabel jLbNome;
    private javax.swing.JLabel jLbSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTfId;
    private javax.swing.JTextField jTfNome;
    private javax.swing.JTextField jTfSenha;
    // End of variables declaration                   
}