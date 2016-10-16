/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stcs.ui.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xiaob
 */
public class Function_MemberTableModel extends DefaultTableModel{
    public Vector columnIdentifiers = new Vector();
    {
        columnIdentifiers.add("会员id");
        columnIdentifiers.add("姓名");
        columnIdentifiers.add("性别");
        columnIdentifiers.add("院系专业");
        columnIdentifiers.add("宿舍");
        columnIdentifiers.add("qq");
        columnIdentifiers.add("邮箱");
        columnIdentifiers.add("电话");
        columnIdentifiers.add("会费");
        columnIdentifiers.add("入会时间");
        columnIdentifiers.add("会员状态");
    }
    
    
    
    public Vector<Vector> findAll(){
        Vector<Vector> columnData = new  Vector<Vector>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st","root","root");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from st_member");
            while(rs.next()){
                Vector vo = new Vector();
                vo.add(rs.getString("m_id"));
                vo.add(rs.getString("m_name"));
                vo.add(rs.getString("m_sex"));
                vo.add(rs.getString("m_major"));
                vo.add(rs.getString("m_dorm"));
                vo.add(rs.getString("m_qq"));
                vo.add(rs.getString("m_email"));
                vo.add(rs.getString("m_phone"));
                vo.add(rs.getString("m_money"));
                vo.add(rs.getString("m_addtime"));
                vo.add(rs.getString("m_state"));
                
                columnData.add(vo);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return columnData;
    }
    
    
    
    boolean[] canEdit = new boolean[]{
        false,false,false,false,false,false,false,false,false,false,false };
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return canEdit[columnIndex];
    }
}