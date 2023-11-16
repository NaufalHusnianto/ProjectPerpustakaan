/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanprakpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DatabaseConnection {
        static Connection koneksi = null;
        static String url = "jdbc:mysql://localhost:3306/data_perpus";
        static String username = "root";
        static String password = "";
    
        public static Connection DBConnection () {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                koneksi = DriverManager.getConnection(url, username, password);
                System.out.println("Koneksi Berhasil");
            } catch (ClassNotFoundException | SQLException ex) {
                ex.getMessage();
            }
            
            return koneksi;
        }
}

    

