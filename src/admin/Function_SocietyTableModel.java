/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

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
public class Function_SocietyTableModel extends DefaultTableModel{
    
    public Vector columnIdentifiers = new Vector();{
        columnIdentifiers.add("社团id");
        columnIdentifiers.add("社团名称");
        columnIdentifiers.add("所在城市");
        columnIdentifiers.add("所属院校");
        columnIdentifiers.add("注册时间");
        columnIdentifiers.add("简要说明");
        columnIdentifiers.add("联系人姓名");
        columnIdentifiers.add("联系人电话");
        columnIdentifiers.add("联系人邮箱");
        columnIdentifiers.add("联系人QQ");
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
            rs = stmt.executeQuery("select * from st_society");
            while(rs.next()){
                Vector vo = new Vector();
                vo.add(rs.getString("st_id"));
                vo.add(rs.getString("st_name"));
                vo.add(rs.getString("st_city"));
                vo.add(rs.getString("st_school"));
                vo.add(rs.getString("st_addtime"));
                vo.add(rs.getString("st_desc"));
                vo.add(rs.getString("lx_name"));
                vo.add(rs.getString("lx_phone"));
                vo.add(rs.getString("lx_email"));
                vo.add(rs.getString("lx_qq"));
                
//                System.out.println(vo.toString());
                
                columnData.add(vo);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return columnData;
    }
    
    
    
    boolean[] canEdit = new boolean[]{
        false,false,false,false,false,false,false,false,false,false,false 
    };
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return canEdit[columnIndex];
    }
    
    
}


