package visao;

import bean.Estabelecimento;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import negocio.GerarRelatorioPDF;
import negocio.GerenciarDB;

/**
 *
 * @author Uguinho
 */
public class JanelaEst extends javax.swing.JFrame {
    protected String CNPJ;
    protected Estabelecimento estabelecimento;
    /**
     * Creates new form JanelaUsuario
     */
    public JanelaEst() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void startJanelaEst(String CNPJ){
     try {
            GerenciarDB banco = new GerenciarDB();
            System.out.println(CNPJ+"TESTE");
            String[][] mtx = banco.getExtratoEst(CNPJ);
            int i;
            for (i=(mtx[0].length)-1;i>=0;i--){
                DefaultTableModel dtm = (DefaultTableModel) Historico.getModel();
                dtm.addRow(new Object[]{mtx[0][i], mtx[1][i], mtx[2][i]});
            }
        } catch (Exception ex) {
            Logger.getLogger(JanelaEst.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("DEU ERRO PORQUE?");
        }   
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iCliente = new javax.swing.JLabel();
        SaldoLabel = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();
        AlterarSenha = new javax.swing.JButton();
        Debitar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Historico = new javax.swing.JTable();
        Sair = new javax.swing.JButton();
        ImprimirExtrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("iCards - iCliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iCliente.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        iCliente.setText("iShop");
        getContentPane().add(iCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        SaldoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SaldoLabel.setText("Receital atual:");
        getContentPane().add(SaldoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 344, 110, 20));

        Saldo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Saldo.setText("$ 00,00");
        getContentPane().add(Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 160, 30));

        AlterarSenha.setText("Alterar senha");
        AlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(AlterarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 140, 35));

        Debitar.setText("Debitar");
        Debitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebitarActionPerformed(evt);
            }
        });
        getContentPane().add(Debitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 140, 35));

        Historico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Cliente", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Historico);
        Historico.getColumnModel().getColumn(0).setPreferredWidth(120);
        Historico.getColumnModel().getColumn(1).setPreferredWidth(400);
        Historico.getColumnModel().getColumn(2).setPreferredWidth(100);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 630, 250));

        Sair.setText("Sair do sistema");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 170, 30));

        ImprimirExtrato.setText("Imprimir extrato");
        ImprimirExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirExtratoActionPerformed(evt);
            }
        });
        getContentPane().add(ImprimirExtrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 140, 35));

        setSize(new java.awt.Dimension(728, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void AlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarSenhaActionPerformed

        //this.dispose();
        //JanelaAlterarSenha frame = new JanelaAlterarSenha();
        //frame.CNPJ = CNPJ;
        //frame.setLocationRelativeTo(null);
        //frame.setVisible(true);
    }//GEN-LAST:event_AlterarSenhaActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        //jTable2.setValueAt(VALOR, LINHA, COLUNA);
        this.dispose();
        JanelaInicioEst frame = new JanelaInicioEst();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_SairActionPerformed

    private void DebitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebitarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JanelaDebito frame = new JanelaDebito();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_DebitarActionPerformed

    private void ImprimirExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirExtratoActionPerformed
        GerarRelatorioPDF file = new GerarRelatorioPDF();
        try {
            file.PDF(CNPJ, 1);
        } catch (Exception ex) {
            Logger.getLogger(JanelaEst.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ImprimirExtratoActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaEst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaEst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaEst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaEst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JanelaEst().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarSenha;
    private javax.swing.JButton Debitar;
    private javax.swing.JTable Historico;
    private javax.swing.JButton ImprimirExtrato;
    private javax.swing.JButton Sair;
    protected javax.swing.JLabel Saldo;
    private javax.swing.JLabel SaldoLabel;
    private javax.swing.JLabel iCliente;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
