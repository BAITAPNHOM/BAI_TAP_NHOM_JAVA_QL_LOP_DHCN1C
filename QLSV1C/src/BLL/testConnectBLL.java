/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.*;
import javax.swing.*;
import DAL.*;

// Kiểm tra kết nối
public class testConnectBLL 
{
    
    public static Connection conn = null; // biến kết nối
    public static ResultSet rs = null;  // kết quả trả về dạng 1 bảng hay 1 dòng dữ liệu
    public static PreparedStatement pst = null; // biến thực thi sql
    
    
    public static String testConnectBLL()
    {
        try
        {
            conn = ConnectDAL.getConnect();
            return "Kết nối thành công";
        }
        catch (Exception e)
        {
            return"Kết nối thất bại";
        }
    }
    public static ResultSet resul (String tenDN, String MK)
    {
        String sql= "select *from DANGNHAP where tenDN=? and MK=?";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tenDN);
            pst.setString(2, MK);
            return rs= pst.executeQuery();
        }
        catch(Exception e)
        {
            return rs=null;
        }
    }
}
