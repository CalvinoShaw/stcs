/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stcs.ui.setting;

import java.awt.CardLayout;
import stcs.ui.Main;

/**
 *
 * @author xiaob
 */
public class settingUI extends javax.swing.JFrame {

    
    public static String st_id;
    
    /**
     * Creates new form settingUI
     */
    public settingUI(String st_id) {
        initComponents();
        this.st_id = st_id;
        this.setLocationRelativeTo(null);
    }

    private settingUI() {
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

        jPanel1 = new javax.swing.JPanel();
        viewSociety_button = new javax.swing.JButton();
        updateSociety_button = new javax.swing.JButton();
        updatePass_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        viewSociety_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reg/images/setting/查看社团信息.png"))); // NOI18N
        viewSociety_button.setText("查看社团信息");
        viewSociety_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        viewSociety_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewSociety_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        viewSociety_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSociety_buttonActionPerformed(evt);
            }
        });

        updateSociety_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reg/images/setting/修改社团信息.png"))); // NOI18N
        updateSociety_button.setText("修改社团信息");
        updateSociety_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateSociety_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        updateSociety_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSociety_buttonActionPerformed(evt);
            }
        });

        updatePass_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reg/images/setting/修改密码.png"))); // NOI18N
        updatePass_button.setText("修改管理密码");
        updatePass_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updatePass_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        updatePass_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePass_buttonActionPerformed(evt);
            }
        });

        exit_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reg/images/setting/退出.png"))); // NOI18N
        exit_button.setText("退出");
        exit_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewSociety_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateSociety_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updatePass_button, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatePass_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateSociety_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewSociety_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewSociety_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSociety_buttonActionPerformed
        Main.singleSocietyView = new sigle_SocietyViewUI(st_id);
        Main.singleSocietyView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewSociety_buttonActionPerformed

    private void updatePass_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePass_buttonActionPerformed
        Main.singlePassUpdate = new single_PassUpdateUI(st_id);
        Main.singlePassUpdate.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updatePass_buttonActionPerformed

    private void updateSociety_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSociety_buttonActionPerformed
        Main.singleSocietyUpdate = new single_SocietyUpdateUI(st_id);
        Main.singleSocietyUpdate.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateSociety_buttonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exit_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(settingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(settingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(settingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(settingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new settingUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton updatePass_button;
    private javax.swing.JButton updateSociety_button;
    private javax.swing.JButton viewSociety_button;
    // End of variables declaration//GEN-END:variables
}
