/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stcs.ui.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import stcs.bo.MemberBO;
import stcs.ui.Main;
import stcs.vo.MemberVO;




/**
 *
 * @author xiaob
 */
public class JFrame_MemberAddUI extends javax.swing.JFrame {

    

    
    
    /**
     * Creates new form MemberAddUI
     */
    public JFrame_MemberAddUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_m_email = new javax.swing.JLabel();
        Label_m_name = new javax.swing.JLabel();
        Label_m_dorm = new javax.swing.JLabel();
        Label_m_qq = new javax.swing.JLabel();
        Label_m_dept = new javax.swing.JLabel();
        Label_m_sex = new javax.swing.JLabel();
        Label_m_phone = new javax.swing.JLabel();
        Label_m_post = new javax.swing.JLabel();
        Label_m_money = new javax.swing.JLabel();
        Label_m_major = new javax.swing.JLabel();
        m_name = new javax.swing.JTextField();
        m_dorm = new javax.swing.JTextField();
        m_phone = new javax.swing.JTextField();
        m_dept = new javax.swing.JTextField();
        m_post = new javax.swing.JTextField();
        m_qq = new javax.swing.JTextField();
        m_email = new javax.swing.JTextField();
        m_sex = new javax.swing.JComboBox();
        m_money = new javax.swing.JComboBox();
        m_major = new javax.swing.JTextField();
        Button_doUpdate = new javax.swing.JButton();
        Button_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Label_m_email.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Label_m_email.setText("电子邮箱：");

        Label_m_name.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Label_m_name.setText("姓名：");

        Label_m_dorm.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Label_m_dorm.setText("宿舍：");

        Label_m_qq.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Label_m_qq.setText("QQ号码：");

        Label_m_dept.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Label_m_dept.setText("部门：");

        Label_m_sex.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Label_m_sex.setText("性别：");

        Label_m_phone.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Label_m_phone.setText("联系电话：");

        Label_m_post.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Label_m_post.setText("职务：");

        Label_m_money.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Label_m_money.setText("会费缴纳：");

        Label_m_major.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Label_m_major.setText("院系专业：");

        m_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_nameActionPerformed(evt);
            }
        });

        m_dorm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_dormActionPerformed(evt);
            }
        });

        m_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_phoneActionPerformed(evt);
            }
        });

        m_dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_deptActionPerformed(evt);
            }
        });

        m_post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_postActionPerformed(evt);
            }
        });

        m_qq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_qqActionPerformed(evt);
            }
        });

        m_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_emailActionPerformed(evt);
            }
        });

        m_sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "男", "女" }));

        m_money.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "第几年已交", "未交", "已退出", "已毕业" }));

        m_major.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_majorActionPerformed(evt);
            }
        });

        Button_doUpdate.setText("保存");
        Button_doUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_doUpdateActionPerformed(evt);
            }
        });

        Button_back.setText("取消");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_m_major)
                            .addComponent(Label_m_money)
                            .addComponent(Label_m_dept)
                            .addComponent(Label_m_qq)
                            .addComponent(Label_m_dorm)
                            .addComponent(Label_m_name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_major, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(m_money, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(m_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(m_dorm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(m_dept, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(m_qq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Label_m_post)
                                            .addComponent(Label_m_email)
                                            .addComponent(Label_m_phone)
                                            .addComponent(Label_m_sex))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(m_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(m_post, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(m_email, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(m_sex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(Button_doUpdate)
                        .addGap(37, 37, 37)
                        .addComponent(Button_back)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_m_name)
                            .addComponent(m_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_m_dorm)
                            .addComponent(m_dorm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_m_qq)
                            .addComponent(m_qq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_m_dept)
                            .addComponent(m_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_m_sex)
                            .addComponent(m_sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_m_phone)
                            .addComponent(m_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_m_email)
                            .addComponent(m_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_m_post)
                            .addComponent(m_post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_m_money)
                    .addComponent(m_money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_m_major)
                    .addComponent(m_major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_doUpdate)
                    .addComponent(Button_back))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void m_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_nameActionPerformed

    private void m_dormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_dormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_dormActionPerformed

    private void m_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_phoneActionPerformed

    private void m_deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_deptActionPerformed

    private void m_postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_postActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_postActionPerformed

    private void m_qqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_qqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_qqActionPerformed

    private void m_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_emailActionPerformed

    private void m_majorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_majorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_majorActionPerformed

    private void Button_doUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_doUpdateActionPerformed
        MemberVO vo = new MemberVO();
        vo.setM_name(m_name.getText());
        vo.setM_dorm(m_dorm.getText());
        vo.setM_qq(m_qq.getText());
        vo.setM_dept(m_dept.getText());
        vo.setM_money((String)m_money.getSelectedItem());
        vo.setM_sex((String)m_sex.getSelectedItem());
        vo.setM_phone(m_phone.getText());
        vo.setM_email(m_email.getText());
        vo.setM_post(m_post.getText());
        vo.setM_major(m_major.getText());
        MemberBO bo = new MemberBO();
        boolean rtn = bo.doAdd(vo);
        
        Main.stMenu.loadMemberData();
        
        this.setVisible(false);
        Main.memberAdd = null;
    }//GEN-LAST:event_Button_doUpdateActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        Main.memberAdd = null;
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(JFrame_MemberAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_MemberAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_MemberAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_MemberAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new JFrame_MemberAddUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_back;
    private javax.swing.JButton Button_doUpdate;
    private javax.swing.JLabel Label_m_dept;
    private javax.swing.JLabel Label_m_dorm;
    private javax.swing.JLabel Label_m_email;
    private javax.swing.JLabel Label_m_major;
    private javax.swing.JLabel Label_m_money;
    private javax.swing.JLabel Label_m_name;
    private javax.swing.JLabel Label_m_phone;
    private javax.swing.JLabel Label_m_post;
    private javax.swing.JLabel Label_m_qq;
    private javax.swing.JLabel Label_m_sex;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField m_dept;
    private javax.swing.JTextField m_dorm;
    private javax.swing.JTextField m_email;
    private javax.swing.JTextField m_major;
    private javax.swing.JComboBox m_money;
    private javax.swing.JTextField m_name;
    private javax.swing.JTextField m_phone;
    private javax.swing.JTextField m_post;
    private javax.swing.JTextField m_qq;
    private javax.swing.JComboBox m_sex;
    // End of variables declaration//GEN-END:variables
}
