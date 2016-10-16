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

/**
 *
 * @author xiaob
 */
public class MemberBO {

    /**
     * 删除会员
     *
     * @param m_id
     * @return
     */
    public boolean doDelete(String m_id) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();
            stmt.execute("delete from st_member where m_id = " + m_id);
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
     * 添加会员
     *
     * @param vo
     * @return
     */
    public boolean doAdd(MemberVO vo) {
//        String m_id_temp = vo.getM_id();
        String m_name_temp = vo.getM_name();
        String m_sex_temp = vo.getM_sex();
        String m_dorm_temp = vo.getM_dorm();
        String m_phone_temp = vo.getM_phone();
        String m_qq_temp = vo.getM_qq();
        String m_email_temp = vo.getM_email();
        String m_dept_temp = vo.getM_dept();
        String m_post_temp = vo.getM_post();
        String m_money_temp = vo.getM_money();
        String m_major_temp = vo.getM_major();
//        
//        String m_addtime_temp = vo.getM_addtime();
//        String m_state_temp = vo.getM_state();
//        String m_leavetime_temp = vo.getM_leavetime();
//        String m_desc_temp = vo.getM_desc();
//        String st_id_temp = vo.getSt_id();

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();
            String sql_1 ="insert into st_member "
                    + "(m_id,m_name,m_sex,m_major,m_dorm,m_qq,m_phone,m_dept,m_post,m_money) "
                    + "values "
                    + "(null,'"
                    +m_name_temp+"','"+m_sex_temp+"','"+m_major_temp+"','"+m_dorm_temp+"','"+m_qq_temp+"','"+m_phone_temp+"','"+m_dept_temp+"','"+m_post_temp+"','"+m_money_temp+"');";

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
     * 修改会员
     *
     * @param vo
     * @return
     */
    public boolean doUpdate(MemberVO vo,String m_id) {
        String m_name_temp = vo.getM_name();
        String m_dorm_temp = vo.getM_dorm();
        String m_dept_temp = vo.getM_dept();
        String m_qq_temp = vo.getM_qq();
        String m_money_temp = vo.getM_money();
        String m_state_temp = vo.getM_state();
        String m_major_temp = vo.getM_major();
        String m_sex_temp = vo.getM_sex();
        String m_phone_temp = vo.getM_phone();
        String m_post_temp = vo.getM_post();
        String m_email_temp = vo.getM_email();
        String m_leavetime_temp = vo.getM_leavetime();
        String m_desc_temp = vo.getM_desc();

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();

            String sql_1 = "update st_member set m_name = '"+m_name_temp
                +"',m_dorm = '"+m_dorm_temp
                +"',m_dept = '"+m_dept_temp
                +"',m_qq = '"+m_qq_temp
                +"',m_money = '"+m_money_temp
                +"',m_state = '"+m_state_temp
                +"',m_major = '"+m_major_temp
                +"',m_sex = '"+m_sex_temp
                +"',m_phone = '"+m_phone_temp
                +"',m_post = '"+m_post_temp
                +"',m_email = '"+m_email_temp
                +"',m_leavetime = '"+m_leavetime_temp
                +"',m_desc = '"+m_desc_temp+"'where m_id = "+m_id;

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
     * 根据会员id查询会员信息
     *
     * @param m_id
     * @return
     */
    public MemberVO findMemberByM_id(String m_id) {
        MemberVO vo = new MemberVO();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "root");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from st_member where m_id = " + m_id);
            if (rs.next()) {
                vo.setM_name(rs.getString("m_name"));
                vo.setM_sex(rs.getString("m_sex"));
                vo.setM_dorm(rs.getString("m_dorm"));
                vo.setM_phone(rs.getString("m_phone"));
                vo.setM_qq(rs.getString("m_qq"));
                vo.setM_email(rs.getString("m_email"));
                vo.setM_dept(rs.getString("m_dept"));
                vo.setM_post(rs.getString("m_post"));
                vo.setM_state(rs.getString("m_state"));
                vo.setM_leavetime(rs.getString("m_leavetime"));
                vo.setM_desc(rs.getString("m_desc"));
                vo.setM_money(rs.getString("m_money"));
                vo.setM_major(rs.getString("m_major"));
                vo.setM_addtime(rs.getString("m_addtime"));

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
