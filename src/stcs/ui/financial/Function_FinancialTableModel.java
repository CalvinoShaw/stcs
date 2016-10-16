/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stcs.ui.financial;

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
public class Function_FinancialTableModel extends DefaultTableModel{
    
    public Vector columnIdentifiers = new Vector();{
        columnIdentifiers.add("财务id");
        columnIdentifiers.add("类型");
        columnIdentifiers.add("金额");
        columnIdentifiers.add("日期");
        columnIdentifiers.add("支出申报人/收入来源");
        columnIdentifiers.add("收支说明");
        columnIdentifiers.add("记录人");
        columnIdentifiers.add("社团id");
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
            rs = stmt.executeQuery("select * from st_financial");
            while(rs.next()){
                Vector vo = new Vector();
                vo.add(rs.getString("f_id"));
                vo.add(rs.getString("f_type"));
                vo.add(rs.getString("f_money"));
                vo.add(rs.getString("f_date"));
                vo.add(rs.getString("f_associate"));
                vo.add(rs.getString("f_desc"));
                vo.add(rs.getString("f_recorder"));
                vo.add(rs.getString("st_id"));
                
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


