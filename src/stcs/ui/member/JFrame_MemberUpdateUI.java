/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stcs.ui.member;

import stcs.bo.MemberBO;
import stcs.ui.Main;
import stcs.vo.MemberVO;

/**
 *
 * @author xiaob
 */
public class JFrame_MemberUpdateUI extends javax.swing.JFrame {

    public static String m_id;
    
    /**
     * Creates new form MemberUpdateUI
     */
    public JFrame_MemberUpdateUI() {
        initComponents();
    }

    public JFrame_MemberUpdateUI(String m_id) {
        initComponents();
        this.m_id = m_id;
        findMember();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_m_name = new javax.swing.JLabel();
        Label_m_dorm = new javax.swing.JLabel();
        Label_m_qq = new javax.swing.JLabel();
        Label_m_dept = new javax.swing.JLabel();
        Label_m_money = new javax.swing.JLabel();
        Label_m_money2 = new javax.swing.JLabel();
        Label_m_state = new javax.swing.JLabel();
        Label_m_desc = new javax.swing.JLabel();
        Label_m_sex = new javax.swing.JLabel();
        Label_m_phone = new javax.swing.JLabel();
        Label_m_email = new javax.swing.JLabel();
        Label_m_post = new javax.swing.JLabel();
        Label_m_major = new javax.swing.JLabel();
        Label_m_leavetime = new javax.swing.JLabel();
        m_name = new javax.swing.JTextField();
        m_dorm = new javax.swing.JTextField();
        m_phone = new javax.swing.JTextField();
        m_dept = new javax.swing.JTextField();
        m_money2 = new javax.swing.JTextField();
        m_leavetime = new javax.swing.JTextField();
        m_post = new javax.swing.JTextField();
        m_qq = new javax.swing.JTextField();
        m_major = new javax.swing.JTextField();
        m_email = new javax.swing.JTextField();
        m_sex = new javax.swing.JComboBox();
        m_money = new javax.swing.JComboBox();
        m_state = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        m_desc = new javax.swing.JTextArea();
        Button_sure = new javax.swing.JButton();
        Button_cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Label_m_name.setText("姓名：");

        Label_m_dorm.setText("宿舍：");

        Label_m_qq.setText("QQ号码：");

        Label_m_dept.setText("部门：");

        Label_m_money.setText("会费缴纳：");

        Label_m_money2.setText("年");

        Label_m_state.setText("会员状态：");

        Label_m_desc.setText("备注：");

        Label_m_sex.setText("性别：");

        Label_m_phone.setText("联系电话：");

        Label_m_email.setText("电子邮箱：");

        Label_m_post.setText("职务：");

        Label_m_major.setText("院系专业：");

        Label_m_leavetime.setText("退出时间：");

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

        m_money2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_money2ActionPerformed(evt);
            }
        });

        m_leavetime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_leavetimeActionPerformed(evt);
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

        m_major.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_majorActionPerformed(evt);
            }
        });

        m_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_emailActionPerformed(evt);
            }
        });

        m_sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "男", "女" }));

        m_money.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "未交", "第几年已交", "已退出", "已毕业" }));

        m_state.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "在册", "已毕业", "已退出" }));

        m_desc.setColumns(20);
        m_desc.setRows(5);
        jScrollPane1.setViewportView(m_desc);

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

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Label_m_desc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(Button_sure)
                            .addGap(55, 55, 55)
                            .addComponent(Button_cancel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Label_m_major)
                                    .addComponent(Label_m_state)
                                    .addComponent(Label_m_leavetime))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(m_leavetime)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(m_state, 0, 137, Short.MAX_VALUE)
                                            .addComponent(m_major))
                                        .addGap(79, 79, 79)
                                        .addComponent(Label_m_money)
                                        .addGap(82, 82, 82)
                                        .addComponent(m_money2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Label_m_money2))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_m_qq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_qq, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(Label_m_email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_email, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label_m_name)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m_name, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(99, 99, 99)
                                    .addComponent(Label_m_sex)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m_sex, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label_m_dorm)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m_dorm, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(75, 75, 75)
                                    .addComponent(Label_m_phone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_m_dept)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(Label_m_post)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(m_money, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m_post, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_m_name)
                        .addComponent(m_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_m_sex)
                        .addComponent(m_sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_m_dorm)
                        .addComponent(m_dorm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_m_phone)
                        .addComponent(m_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_m_qq)
                        .addComponent(m_qq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_m_email)
                        .addComponent(m_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_m_dept)
                        .addComponent(m_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_m_post)
                        .addComponent(m_post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_m_money)
                    .addComponent(m_money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_m_state)
                    .addComponent(m_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_m_money2)
                    .addComponent(m_money2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_m_major))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_leavetime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_m_leavetime)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_m_desc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_sure)
                    .addComponent(Button_cancel))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void m_majorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_majorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_majorActionPerformed

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

    private void m_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_nameActionPerformed

    private void m_dormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_dormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_dormActionPerformed

    private void m_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_phoneActionPerformed

    private void m_money2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_money2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_money2ActionPerformed

    private void m_leavetimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_leavetimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_leavetimeActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        Main.memberUpdate = null;
    }//GEN-LAST:event_formWindowClosed

    private void Button_sureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_sureActionPerformed
        updateMember();

    }//GEN-LAST:event_Button_sureActionPerformed

    private void Button_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cancelActionPerformed
        this.setVisible(false);
        Main.memberUpdate = null;
    }//GEN-LAST:event_Button_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_MemberUpdateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_MemberUpdateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_MemberUpdateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_MemberUpdateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_MemberUpdateUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_cancel;
    private javax.swing.JButton Button_sure;
    private javax.swing.JLabel Label_m_dept;
    private javax.swing.JLabel Label_m_desc;
    private javax.swing.JLabel Label_m_dorm;
    private javax.swing.JLabel Label_m_email;
    private javax.swing.JLabel Label_m_leavetime;
    private javax.swing.JLabel Label_m_major;
    private javax.swing.JLabel Label_m_money;
    private javax.swing.JLabel Label_m_money2;
    private javax.swing.JLabel Label_m_name;
    private javax.swing.JLabel Label_m_phone;
    private javax.swing.JLabel Label_m_post;
    private javax.swing.JLabel Label_m_qq;
    private javax.swing.JLabel Label_m_sex;
    private javax.swing.JLabel Label_m_state;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField m_dept;
    private javax.swing.JTextArea m_desc;
    private javax.swing.JTextField m_dorm;
    private javax.swing.JTextField m_email;
    private javax.swing.JTextField m_leavetime;
    private javax.swing.JTextField m_major;
    private javax.swing.JComboBox m_money;
    private javax.swing.JTextField m_money2;
    private javax.swing.JTextField m_name;
    private javax.swing.JTextField m_phone;
    private javax.swing.JTextField m_post;
    private javax.swing.JTextField m_qq;
    private javax.swing.JComboBox m_sex;
    private javax.swing.JComboBox m_state;
    // End of variables declaration//GEN-END:variables

    private void findMember() {
        MemberBO bo = new MemberBO();
        MemberVO vo = bo.findMemberByM_id(m_id);
        m_name.setText(vo.getM_name());
        m_dorm.setText(vo.getM_dorm());
        m_dept.setText(vo.getM_dept());
        m_qq.setText(vo.getM_qq());
        m_money.setSelectedItem(vo.getM_money());
        m_state.setSelectedItem(vo.getM_state());
        m_major.setText(vo.getM_major());
        m_sex.setSelectedItem(vo.getM_sex());
        m_phone.setText(vo.getM_phone());
        m_post.setText(vo.getM_post());
        m_email.setText(vo.getM_email());
        m_leavetime.setText(vo.getM_leavetime());
        m_desc.setText(vo.getM_desc());
    }

    private void updateMember() {
        MemberVO vo = new MemberVO();
        vo.setM_name(m_name.getText());
        vo.setM_dorm(m_dorm.getText());
        vo.setM_qq(m_qq.getText());
        vo.setM_dept(m_dept.getText());
        vo.setM_state((String)m_state.getSelectedItem());
        vo.setM_major(m_major.getText());
        vo.setM_leavetime(m_leavetime.getText());
        vo.setM_desc(m_desc.getText());
        vo.setM_sex((String)m_sex.getSelectedItem());
        vo.setM_phone(m_phone.getText());
        vo.setM_email(m_email.getText());
        vo.setM_post(m_post.getText());
        vo.setM_money((String)m_money.getSelectedItem());
        
        MemberBO bo = new MemberBO();
        boolean update_rtn = bo.doUpdate(vo,m_id);
        
        JDialog_MemberUpdateRTN rtnDialog = new JDialog_MemberUpdateRTN(new javax.swing.JFrame(), true);
        if(update_rtn == true){
            this.setVisible(false);
            Main.memberUpdate = null;
            Main.stMenu.loadMemberData();
            rtnDialog.setVisible(true);
        }else{
            rtnDialog.updateFailed();
        }
        
    }
}
