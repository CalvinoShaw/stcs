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
import stcs.vo.FinancialVO;

/**
 *
 * @author Administrator
 */
public class FinancialBO {
    
    
    /**
     * 删除财务项
     *
     * @param f_id
     * @return
     */
    public boolean doDelete(String f_id) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();
            stmt.execute("delete from st_financial where f_id = " + f_id);
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
     * 新增财务项
     *
     * @param vo
     * @return
     */
    public boolean doAdd(FinancialVO vo) {

        String f_type_temp = vo.getF_type();
        String f_money_temp = vo.getF_money();
        String f_date_temp = vo.getF_date();
        String f_associate_temp = vo.getF_associate();
        String f_desc_temp = vo.getF_desc();
        String f_recorder_temp = vo.getF_recorder();

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();
            String sql_1 ="insert into st_financial "
                    + "(f_id,f_type,f_money,f_date,f_associate,f_desc,f_recorder) "
                    + "values "
                    + "(null,'"
                    +f_type_temp+"','"+f_money_temp+"','"+f_date_temp+"','"+f_associate_temp+"','"+f_desc_temp+"','"+f_recorder_temp+"');";

            System.out.println(sql_1);

            stmt.execute(sql_1);
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
     * 修改财务项
     *
     * @param vo
     * @return
     */
    public boolean doUpdate(FinancialVO vo,String f_id) {
        String f_type_temp = vo.getF_type();
        String f_money_temp = vo.getF_money();
        String f_date_temp = vo.getF_date();
        String f_associate_temp = vo.getF_associate();
        String f_desc_temp = vo.getF_desc();
        String f_recorder_temp = vo.getF_recorder();

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();

            String sql_1 = "update st_financial set f_type = '"+f_type_temp
                +"',f_money = '"+f_money_temp
                +"',f_date = '"+f_date_temp
                +"',f_associate = '"+f_associate_temp
                +"',f_desc = '"+f_desc_temp
                +"',f_recorder = '"+f_recorder_temp+"'where f_id = "+f_id;

            System.out.println(sql_1);
   
            stmt.executeUpdate(sql_1);
            
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

    /**
     * 根据财务id查询财务信息
     *
     * @param m_id
     * @return
     */
    public FinancialVO findFinancialByF_id(String f_id) {
        FinancialVO vo = new FinancialVO();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from st_financial where f_id = " + f_id);
            if (rs.next()) {
                vo.setF_type(rs.getString("f_type"));
                vo.setF_money(rs.getString("f_money"));
                vo.setF_date(rs.getString("f_date"));
                vo.setF_associate(rs.getString("f_associate"));
                vo.setF_desc(rs.getString("f_desc"));
                vo.setF_recorder(rs.getString("f_recorder"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return vo;
        }
    }
    
    
}
