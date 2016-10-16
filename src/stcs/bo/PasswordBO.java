/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stcs.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class PasswordBO {
    
    public boolean admin_passUpdate(int admin_id, String oldpass, String newpass){
        Connection conn = null;
        Statement stmt_Query = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st","root","root");
            stmt_Query = conn.createStatement();
            String sql_Query = "select * from st_admin where admin_id = '" + admin_id+"'";
            System.out.println(sql_Query);
            rs = stmt_Query.executeQuery(sql_Query);
            if(rs.next()){
                String adminpass  = rs.getString("admin_userpass");
                if(oldpass.equals(adminpass)){
                    Statement stmt_Update = conn.createStatement();
                    String sql_Update = "update st_admin set admin_userpass = '"+ newpass +"' where admin_id = '" + admin_id+"'";
                    System.out.println(sql_Update);
                    stmt_Update.executeUpdate(sql_Update);
                    stmt_Update.close();
                    return true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                rs.close();
                stmt_Query.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return false;
        

    }
    
    
    
    public boolean single_passUpdate(int st_id, String oldpass, String newpass){
        Connection conn = null;
        Statement stmt_Query = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st","root","root");
            stmt_Query = conn.createStatement();
            String sql_Query = "select * from st_society where st_id = '" + st_id+"'";
            System.out.println(sql_Query);
            rs = stmt_Query.executeQuery(sql_Query);
            if(rs.next()){
                String stpass  = rs.getString("st_password");
                if(oldpass.equals(stpass)){
                    Statement stmt_Update = conn.createStatement();
                    String sql_Update = "update st_society set st_password = '"+ newpass +"' where st_id = '" + st_id+"'";
                    System.out.println(sql_Update);
                    stmt_Update.executeUpdate(sql_Update);
                    stmt_Update.close();
                    return true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                rs.close();
                stmt_Query.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return false;
        
    }
}
