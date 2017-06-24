/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import java.sql.*;
import javax.swing.*;

public class ConnectDAL {
    // kết nối với CSDL
    public static Connection getConnect()
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:49403;databaseName=QLSV1C;user=sa;password=sa");
            return conn;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "kết nối thất bại", "Thông Báo", 1);
            return null;
        }
    }
    
}
