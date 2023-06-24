/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.dbConnection;
import View.Signupview;
import View.loginView;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.sql.*;
import View.DashboardView;

/**
 *
 * @author hello
 */
public class LoginController {
     private Connection conn;
    private Statement stmt;

    public LoginController() {
        conn = dbConnection.dbconnect();
    }
  
public void LoginQuery(String phone, String pass){
    
    if (phone.equals("")) {
        JOptionPane.showMessageDialog(null, "Enter username");
        return;
    }
    
    if (pass.equals("")) {
        JOptionPane.showMessageDialog(null, "Enter password");
        return;
    }
    
    Connection conn = dbConnection.dbconnect();
    try {
        Statement stmt = conn.createStatement();
        String query = "SELECT * FROM AdminDetails WHERE PhoneNumber='" + phone + "' AND pass='" + pass + "'";
        ResultSet resultSet = stmt.executeQuery(query);
        boolean check = resultSet.next();
        if (check) {
            JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL");
            new loginView().setVisible(false);
            new DashboardView().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    
}
}
