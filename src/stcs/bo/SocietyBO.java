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
import stcs.vo.MemberVO;
import stcs.vo.SocietyVO;

/**
 *
 * @author xiaob
 */
public class SocietyBO {
    
    /**
     *
     * @param st_id
     * @param pass
     * @return 
     */
        
//    public static String st_password;
//    public static String admin_userpass;
//    
//    public boolean doLogin_as_society(int st_id, String pass){
//        Connection conn = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st","root","root");
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery("select * from st_society where st_id = '" + st_id+"'");
//            if(rs.next()){
//                st_password = rs.getString("st_password");
//                if(pass.equals(st_password)){
//                    return true;
//                }
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally{
//            try{
//                rs.close();
//                stmt.close();
//                conn.close();
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//        }
//        return false;
//    }
//    
//    public boolean doLogin_as_admin(int admin_id, String pass) {
//        Connection conn = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st","root","root");
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery("select * from st_admin where admin_id = '" + admin_id+"'");
//            if(rs.next()){
//                admin_userpass = rs.getString("admin_userpass");
//                if(pass.equals(admin_userpass)){
//                    return true;
//                }
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally{
//            try{
//                rs.close();
//                stmt.close();
//                conn.close();
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//        }
//        return false;
//    }
    
    
    
     /**
     * 删除社团
     *
     * @param st_id
     * @return
     */
    public boolean doDelete(String st_id) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();
            stmt.execute("delete from st_society where st_id = " + st_id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 添加社团
     *
     * @param vo
     * @return
     */
    public boolean doAdd(SocietyVO vo) {

        String st_name_temp = vo.getSt_name();
        String st_city_temp = vo.getSt_city();
        String st_school_temp = vo.getSt_school();
        String st_addtime_temp = vo.getSt_addtime();
        String st_desc_temp = vo.getSt_desc();
        String lx_name_temp = vo.getLx_email();
        String lx_phone_temp = vo.getLx_phone();
        String lx_email_temp = vo.getLx_email();
        String lx_qq_temp = vo.getLx_qq();

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();
            String sql_add ="insert into st_society "
                    + "(st_id,st_name,st_city,st_school,st_addtime,st_desc,lx_name,lx_phone,lx_email,lx_qq) "
                    + "values "
                    + "(null,'"
                    +st_name_temp+"','"+st_city_temp+"','"+st_school_temp+"','"+st_addtime_temp+"','"+st_desc_temp+"','"+lx_name_temp+"','"+lx_phone_temp+"','"+lx_email_temp+"','"+lx_qq_temp+"');";

            System.out.println(sql_add);

            stmt.execute(sql_add);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return true;
    }

    /**
     * 修改社团
     *
     * @param vo
     * @return
     */
    public boolean doUpdate(SocietyVO vo,String st_id) {
        String st_name_temp = vo.getSt_name();
        String st_city_temp = vo.getSt_city();
        String st_school_temp = vo.getSt_school();
        String st_addtime_temp = vo.getSt_addtime();
        String st_desc_temp = vo.getSt_desc();
        String lx_name_temp = vo.getLx_email();
        String lx_phone_temp = vo.getLx_phone();
        String lx_email_temp = vo.getLx_email();
        String lx_qq_temp = vo.getLx_qq();

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();

            String sql_update = "update st_society set st_name = '"+st_name_temp
                +"',st_city = '"+st_city_temp
                +"',st_school = '"+st_school_temp
                +"',st_addtime = '"+st_addtime_temp
                +"',lx_name = '"+lx_name_temp
                +"',lx_phone = '"+lx_phone_temp
                +"',lx_email = '"+lx_email_temp
                +"',lx_qq = '"+lx_qq_temp
                +"',st_desc = '"+st_desc_temp+"'where st_id = "+st_id;

            System.out.println(sql_update);
   
            stmt.executeUpdate(sql_update);
            
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        
    }
    
    
    
    
    public SocietyVO findSocietyBySt_id(String st_id){
        SocietyVO vo = new SocietyVO();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st","root","root");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from st_society where st_id = " + st_id);
            if(rs.next()){
                vo.setSt_id(rs.getString("st_id"));
                vo.setSt_password(rs.getString("st_password"));
                vo.setSt_name(rs.getString("st_name"));
                vo.setSt_school(rs.getString("st_school"));
                vo.setSt_addtime(rs.getString("st_addtime"));
                vo.setSt_desc(rs.getString("st_desc"));
                vo.setLx_name(rs.getString("lx_name"));
                vo.setLx_phone(rs.getString("lx_phone"));
                vo.setLx_email(rs.getString("lx_email"));
                vo.setLx_qq(rs.getString("lx_qq"));
                
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
            return vo;
        }
    }




    
}
