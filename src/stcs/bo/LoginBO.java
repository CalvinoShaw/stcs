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
public class LoginBO {
    
    public static String st_password;
    public static String admin_userpass;
    
    public boolean doLogin_as_society(int st_id, String pass){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st","root","root");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from st_society where st_id = '" + st_id+"'");
            if(rs.next()){
                st_password = rs.getString("st_password");
                if(pass.equals(st_password)){
                    return true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                rs.close();
                stmt.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    
    public boolean doLogin_as_admin(int admin_id, String pass) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st","root","root");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from st_admin where admin_id = '" + admin_id+"'");
            if(rs.next()){
                admin_userpass = rs.getString("admin_userpass");
                if(pass.equals(admin_userpass)){
                    return true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                rs.close();
                stmt.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    
    
}
