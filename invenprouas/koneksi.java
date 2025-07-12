/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invenprouas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static final String URL = "jdbc:mysql://localhost:3306/invenpro"; // ganti dengan DB kamu
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    public static void main(String[] args) {
    try {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Koneksi Berhasil!");
        }
    } catch (SQLException e) {
        System.out.println("Koneksi Gagal: " + e.getMessage());
    }
}
}
 