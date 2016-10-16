/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stcs.ui.transaction;


import stcs.bo.TransactionBO;
import stcs.ui.Main;

/**
 *
 * @author xiaob
 */
public class JFrame_TransactionDeleteUI extends javax.swing.JFrame {

    public static String t_id;
    
    /**
     * Creates new form SocietyDeleteUI
     */
    public JFrame_TransactionDeleteUI(String t_id) {
        initComponents();
        this.t_id = t_id;
        this.setLocationRelativeTo(null);
    }

    private JFrame_TransactionDeleteUI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_sure = new javax.swing.JButton();
        Button_cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Button_sure.setText("确定");
        Button_sure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_sureActionPerformed(evt);
            }
        });

        Button_cancel.setText("取消");
        Button_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_cancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("确定要删除该事务吗？");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(Button_sure)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_cancel)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_sure)
                    .addComponent(Button_cancel))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cancelActionPerformed
        this.setVisible(false);
        Main.transactionDelete = null;
    }//GEN-LAST:event_Button_cancelActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        Main.transactionDelete = null;
    }//GEN-LAST:event_formWindowClosed

    private void Button_sureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_sureActionPerformed
        this.setVisible(false);
        deleteTransaction(t_id);
        Main.transactionDelete = null;
        Main.stMenu.loadTransactionData();
    }//GEN-LAST:event_Button_sureActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_TransactionDeleteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_TransactionDeleteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_TransactionDeleteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_TransactionDeleteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_TransactionDeleteUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_cancel;
    private javax.swing.JButton Button_sure;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
    private void deleteTransaction(String t_id) {
        JDialog_TransactionDeleteRTN rtnDialog = new JDialog_TransactionDeleteRTN(new javax.swing.JFrame(), true);
        TransactionBO bo = new TransactionBO();
        boolean delete_rtn = bo.doDelete(t_id);
        if(delete_rtn == true){
            //提示删除成功并刷新表格界面
            this.setVisible(false);
            Main.stMenu.loadTransactionData();
            rtnDialog.setVisible(true);
        }else{
            //提示删除失败
            rtnDialog.deleteFailed();
        }
    }

}