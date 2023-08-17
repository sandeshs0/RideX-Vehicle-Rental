/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import Model.BookingModel;
import Controller.BookingController;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author hello
 */
public class BookingDAO {
        public void setRecordsToTable(JTable tbl_vehicleData){
        try{
            Connection con = dbConnection.dbconnect();
            PreparedStatement pst = con.prepareStatement("select * from vehicle where status='Available'");
            ResultSet rs = pst.executeQuery();      
            while(rs.next()){         
                String vehicleType = rs.getString("vehicle_type");
                String vehiclebrand = rs.getString("brand");
                String vehiclemodel = rs.getString("model");
                String vehicleNo = rs.getString("vehicle_no");
                String fuel = rs.getString("fuel");
                String rate = rs.getString("rate");
                String color = rs.getString("color");
                String speed = rs.getString("speed");
                Object[] obj = {vehicleType, vehiclebrand,vehiclemodel, vehicleNo,fuel,rate,color,speed};
                DefaultTableModel model = (DefaultTableModel)tbl_vehicleData.getModel();
                model.addRow(obj);
            }
        
        
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
        
public String[] checkCustomerRecord(String phoneNumber) {
    
    String[] cusDetails = new String[2];
    String fullName = null; // Initialize fullName as null
    
    // Validate phone number length
    if (phoneNumber.length() != 10) {
        JOptionPane.showMessageDialog(null, "Invalid phone number. Please enter a 10-digit phone number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        return null; // Return null if validation fails
    }
    
    try {
        Connection conn = dbConnection.dbconnect();
        String sql = "SELECT full_name, phone_number, email, address FROM customer WHERE phone_number = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, phoneNumber);
        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            fullName = rs.getString("full_name");
            String phone = rs.getString("phone_number");
            String email = rs.getString("email");
            String address = rs.getString("address");
           
            cusDetails[0]=phone;
            cusDetails[1]=fullName;
        } else {
            JOptionPane.showMessageDialog(null, "No customer record found for the entered phone number", "Customer Record Not Found", JOptionPane.ERROR_MESSAGE);
        }
        
        rs.close();
        pstmt.close();
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "An error occurred while checking customer record: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    return cusDetails;// Return the fullName value (null if validation fails)
}
        
        
        
}
