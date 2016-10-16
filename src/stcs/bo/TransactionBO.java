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
import stcs.vo.TransactionVO;

/**
 *
 * @author Administrator
 */
public class TransactionBO {
    
   
     /**
     * 删除事务
     *
     * @param t_id
     * @return
     */
    public boolean doDelete(String t_id) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();
            stmt.execute("delete from st_transaction where t_id = " + t_id);
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
     * 添加事务
     *
     * @param vo
     * @return
     */
    public boolean doAdd(TransactionVO vo) {
        String t_tittle_temp = vo.getT_tittle();
        String t_recorder_temp = vo.getT_recorder();
        String t_director_temp = vo.getT_director();
        String t_attendance_temp = vo.getT_attendance();
        String t_desc_temp = vo.getT_desc();
        String t_time_temp = vo.getT_time();
        String t_state_temp = vo.getT_state();


        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();
            String sql_add ="insert into st_transaction "
                    + "(t_id,t_tittle,t_recorder,t_director,t_attendance,t_desc,t_time,t_state) "
                    + "values "
                    + "(null,'"
                    +t_tittle_temp+"','"+t_recorder_temp+"','"+t_director_temp+"','"+t_attendance_temp+"','"+t_desc_temp+"','"+t_time_temp+"','"+t_state_temp+"');";

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
     * 修改事务
     *
     * @param vo
     * @return
     */
    public boolean doUpdate(TransactionVO vo,String t_id) {
        String t_tittle_temp = vo.getT_tittle();
        String t_recorder_temp = vo.getT_recorder();
        String t_director_temp = vo.getT_director();
        String t_attendance_temp = vo.getT_attendance();
        String t_desc_temp = vo.getT_desc();
        String t_time_temp = vo.getT_time();
        String t_state_temp = vo.getT_state();

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();

            String sql_update = "update st_transaction set t_tittle = '"+t_tittle_temp
                +"',t_recorder = '"+t_recorder_temp
                +"',t_director = '"+t_director_temp
                +"',t_attendance = '"+t_attendance_temp
                +"',t_desc = '"+t_desc_temp
                +"',t_time = '"+t_time_temp
                +"',t_state = '"+t_state_temp+"'where t_id = "+t_id;

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
    
    
    
    
    public TransactionVO findTransactionByT_id(String t_id){
        TransactionVO vo = new TransactionVO();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st","root","root");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from st_transaction where t_id = " + t_id);
            if(rs.next()){
                vo.setT_id(rs.getString("t_id"));
                vo.setT_recorder(rs.getString("t_recorder"));
                vo.setT_director(rs.getString("t_director"));
                vo.setT_attendance(rs.getString("t_attendance"));
                vo.setT_desc(rs.getString("t_desc"));
                vo.setT_time(rs.getString("t_time"));
                vo.setT_state(rs.getString("t_state"));
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
