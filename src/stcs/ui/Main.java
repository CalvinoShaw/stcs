/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stcs.ui;

import stcs.ui.transaction.JFrame_TransactionDeleteUI;
import stcs.ui.transaction.JFrame_TransactionAddUI;
import stcs.ui.transaction.JFrame_TransactionUpdateUI;
import stcs.ui.transaction.JFrame_TransactionViewUI;

//import stcs.ui.society.JFrame_SocietyDeleteUI;
//import stcs.ui.society.JFrame_SocietyAddUI;
//import stcs.ui.society.JFrame_SocietyUpdateUI;
//import stcs.ui.society.JFrame_SocietyViewUI;

import stcs.ui.member.JFrame_MemberAddUI;
import stcs.ui.member.JFrame_MemberUpdateUI;
import stcs.ui.member.JFrame_MemberViewUI;
import stcs.ui.member.JFrame_MemberDeleteUI;

import stcs.ui.financial.JFrame_FinancialAddUI;
import stcs.ui.financial.JFrame_FinancialUpdateUI;
import stcs.ui.financial.JFrame_FinancialViewUI;
import stcs.ui.financial.JFrame_FinancialDeleteUI;
import stcs.ui.financial.JFrame_FinancialStatisticsUI;

import stcs.ui.setting.settingUI;

import stcs.ui.setting.sigle_SocietyViewUI;
import stcs.ui.setting.single_SocietyUpdateUI;
import stcs.ui.setting.single_PassUpdateUI;


/**
 *
 * @author xiaob
 */
public class Main {
    public static LoginUI login;
    public static StMenuUI stMenu;
    public static AdminMenuUI adminMenu;
    
    public static JFrame_MemberAddUI memberAdd;//添加会员
    public static JFrame_MemberViewUI memberView;//查看会员
    public static JFrame_MemberUpdateUI memberUpdate;//修改会员
    public static JFrame_MemberDeleteUI memberDelete;//删除会员
    
    
    public static JFrame_TransactionAddUI transactionAdd;//添加社团事务
    public static JFrame_TransactionViewUI transactionView;//查看社团事务
    public static JFrame_TransactionUpdateUI transactionUpdate;//修改社团事务
    public static JFrame_TransactionDeleteUI transactionDelete;//删除社团事务
    
    
    public static JFrame_FinancialAddUI financialAdd;//添加财务项
    public static JFrame_FinancialViewUI financialView;//查看财务项
    public static JFrame_FinancialUpdateUI financialUpdate;//修改财务项
    public static JFrame_FinancialDeleteUI financialDelete;//删除财务项
    public static JFrame_FinancialStatisticsUI financialStatistics;//收支统计
    
//    public static JFrame_SocietyAddUI societyAdd;//添加社团
//    public static JFrame_SocietyViewUI societyView;//查看社团
//    public static JFrame_SocietyUpdateUI societyUpdate;//修改社团
//    public static JFrame_SocietyDeleteUI societyDelete;//删除社团
    
    
    public static settingUI setting;//
    public static sigle_SocietyViewUI singleSocietyView;//
    public static single_SocietyUpdateUI singleSocietyUpdate;//
    public static single_PassUpdateUI singlePassUpdate;//
    
    public static int st_id;

   
    
    public static void main(String []args){
        
        /* 
        创建并显示对话框
        */
        
        java.awt.EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
               login = new LoginUI(new javax.swing.JFrame(),true);
               login.setVisible(true);
            }
            
        });
        
    }
    
}
