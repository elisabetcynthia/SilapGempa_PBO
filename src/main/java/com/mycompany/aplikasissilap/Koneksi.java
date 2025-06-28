/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasissilap;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {
    private String url = "jdbc:mysql://localhost:3306/db_silapgempa"; 
    private String user = "root"; 
    private String pass = "cynthia";     
    private Connection conn;
    
    public void connect() {
        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Connection getCon() {
    if (conn == null) {
        connect();
    }
        return conn;
    }
    
}
