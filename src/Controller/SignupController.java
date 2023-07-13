///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Controller;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import javax.swing.JOptionPane;
//import DAO.dbConnection;
//import View.Signupview;
//import java.sql.SQLException;
//import javax.swing.JFrame;
//
///**
// *
// * @author hello
// */
//public class SignupController {
//     private Connection conn;
//    private Statement stmt;
//
//    public SignupController() {
//        conn = dbConnection.dbconnect();
//    }
//    
//    public boolean validation(String FName, String LastName, String Phone, String password,String conpassword, String sec_qn, String sec_ans){
//    // Retrieve input values
//    String fname = FName.trim();
//    String lname = LastName.trim();
//    String phn = Phone.trim();
//    String pass = password.trim();
//    String conpass = conpassword.trim();
//    String securityQN = sec_qn.trim();
//    String securityAns = sec_ans.trim();
//
//    // Check if any field is empty
//    if (fname.equals("") || lname.equals("") || phn.equals("") || pass.equals("") || conpass.equals("")|| securityQN.equals("")|| securityAns.equals("")) {
//        JOptionPane.showMessageDialog(null, "Please fill in all the fields");
//        return false;
//    }
//
//    // Check if password and confirm password match
//    if (!pass.equals(conpass)) {
//        JOptionPane.showMessageDialog(null, "Password and Confirm Password do not match");
//        return false;
//    }
//
//    // Check if the phone number is valid
//    String phoneRegex = "^[0-9]{10}$";
//    if (!phn.matches(phoneRegex)) {
//        JOptionPane.showMessageDialog(null, "Invalid phone number format. Please enter a 10-digit number");
//        return false;
//    }
//
//    // Check if the phone number is unique in the signUP table
//   try {
//        Connection conn =dbConnection.dbconnect();
//        String query = "SELECT PhoneNumber FROM AdminDetails WHERE PhoneNumber = ?";
//        PreparedStatement statement = conn.prepareStatement(query);
//        statement.setString(1, phn);
//        ResultSet resultSet = statement.executeQuery();
//        if (resultSet.next()) {
//            JOptionPane.showMessageDialog(null, "Phone number is already registered");
//            return false;
//        }
//        conn.close();
//    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(null, "Error connecting to the database");
//        e.printStackTrace();
//        return false;
//    }
//
//    // All validations passed
//    return true;
//}
// 
//public void registerUser(String FName, String LastName, String Phone, String password, String sec_qn, String sec_ans) {
//    String sql = "INSERT INTO AdminDetails (FirstName, LastName, PhoneNumber, pass, security_qn, sec_ans) VALUES (?, ?, ?, ?, ?, ?)";
//
//    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
//        pstmt.setString(1, FName);
//        pstmt.setString(2, LastName);
//        pstmt.setString(3, Phone);
//        pstmt.setString(4, password);
//        pstmt.setString(5, sec_qn);
//        pstmt.setString(6, sec_ans);
//
//        int rowsAffected = pstmt.executeUpdate();
//        if (rowsAffected > 0) {
//            System.out.println("Data inserted successfully");
//            JOptionPane.showMessageDialog(null, "Successfully inserted", "EMPLOYEE", JOptionPane.INFORMATION_MESSAGE);
//        } else {
//            System.out.println("Data insertion failed");
//        }
//    } catch (SQLException e) {
//        System.out.println("Error inserting data: " + e.getMessage());
//    }
//}
//
//}
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import DAO.dbConnection;
import View.Signupview;
import javax.swing.JFrame;
import junit.framework.Assert;

/**
 * 
 * author hello
 */
public class SignupController {
    private Connection conn;
    private Statement stmt;

    public SignupController() {
        conn = dbConnection.dbconnect();
    }

    public void registerUser(String FName, String LastName, String Phone, String password, String conpassword,
            String sec_qn, String sec_ans) {
        // Retrieve input values
        String fname = FName.trim();
        String lname = LastName.trim();
        String phn = Phone.trim();
        String pass = password.trim();
        String conpass = conpassword.trim();
        String securityQN = sec_qn.trim();
        String securityAns = sec_ans.trim();

        // Check if any field is empty
        if (fname.equals("") || lname.equals("") || phn.equals("") || pass.equals("") || conpass.equals("")
                || securityQN.equals("") || securityAns.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in all the fields");
            return;
        }

        // Check if password and confirm password match
        if (!pass.equals(conpass)) {
            JOptionPane.showMessageDialog(null, "Password and Confirm Password do not match");
            return;
        }

        // Check if the phone number is valid
        String phoneRegex = "^[0-9]{10}$";
        if (!phn.matches(phoneRegex)) {
            JOptionPane.showMessageDialog(null, "Invalid phone number format. Please enter a 10-digit number");
            return;
        }

        // Check if the phone number is unique in the signUP table
        try {
            Connection conn = dbConnection.dbconnect();
            String query = "SELECT PhoneNumber FROM AdminDetails WHERE PhoneNumber = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, phn);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Phone number is already registered");
                return;
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database");
            e.printStackTrace();
            return;
        }

        // All validations passed, register the user
        String sql = "INSERT INTO AdminDetails (FirstName, LastName, PhoneNumber, pass, security_qn, sec_ans) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
//           Assert.assertEquals("Ram", fname);
            
            pstmt.setString(1, fname);
            pstmt.setString(2, lname);
            pstmt.setString(3, phn);
            pstmt.setString(4, pass);
            pstmt.setString(5, securityQN);
            pstmt.setString(6, securityAns);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully");
                JOptionPane.showMessageDialog(null, "Successfully inserted", "EMPLOYEE",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Data insertion failed");
            }
        } catch (SQLException e) {
            System.out.println("Error inserting data: " + e.getMessage());
        }
    }

}
