/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stcs.ui.transaction;

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
public class Function_TransactionTableModel extends DefaultTableModel{
    
    public Vector columnIdentifiers = new Vector();{
        columnIdentifiers.add("事务id");
        columnIdentifiers.add("事务标题");
        columnIdentifiers.add("记录人");
        columnIdentifiers.add("负责人");
        columnIdentifiers.add("出席人员");
        columnIdentifiers.add("事务描述");
        columnIdentifiers.add("事务日期时间");
        columnIdentifiers.add("事务状态");
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
            rs = stmt.executeQuery("select * from st_transaction");
            while(rs.next()){
                Vector vo = new Vector();
                vo.add(rs.getInt("t_id"));
                vo.add(rs.getString("t_tittle"));
                vo.add(rs.getString("t_recorder"));
                vo.add(rs.getString("t_director"));
                vo.add(rs.getString("t_attendance"));
                vo.add(rs.getString("t_desc"));
                vo.add(rs.getString("t_time"));
                vo.add(rs.getString("t_state"));

                
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


