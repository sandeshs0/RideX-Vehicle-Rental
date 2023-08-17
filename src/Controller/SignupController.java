///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */

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
import DAO.SignupDAO;
import View.Signupview;

import javax.swing.JOptionPane;

public class SignupController {
    private SignupDAO signupDAO;

    public SignupController() {
        signupDAO = new SignupDAO();
    }

    public void registerUser(String FName, String LastName, String Phone, String password, String conpassword,
                             String sec_qn, String sec_ans) {
        String feedbackMessage = validateInput(FName, LastName, Phone, password, conpassword, sec_qn, sec_ans);
        if (feedbackMessage == null) {
            boolean isRegistered = signupDAO.registerUser(FName, LastName, Phone, password, sec_qn, sec_ans);
            if (isRegistered) {
                JOptionPane.showMessageDialog(null, "Successfully registered");
                new Signupview().setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Registration failed");
            }
        } else {
            JOptionPane.showMessageDialog(null, feedbackMessage);
        }
    }

    private String validateInput(String FName, String LastName, String Phone, String password, String conpassword,
                                 String sec_qn, String sec_ans) {
        // Check if any field is empty
        if (FName.isEmpty() || LastName.isEmpty() || Phone.isEmpty() || password.isEmpty() || conpassword.isEmpty()
                || sec_qn.isEmpty() || sec_ans.isEmpty()) {
            return "Please fill in all the fields";
        }

        // Check if password and confirm password match
        if (!password.equals(conpassword)) {
            return "Password and Confirm Password do not match";
        }

        // Check if the phone number is valid
        String phoneRegex = "^[0-9]{10}$";
        if (!Phone.matches(phoneRegex)) {
            return "Invalid phone number format. Please enter a 10-digit number";
        }

        // Check if the phone number is unique in the AdminDetails table
        if (signupDAO.isPhoneRegistered(Phone)) {
            return "Phone number is already registered";
        }

        return null; // Validation passed
    }
    
}

