package DAO;

import Model.CustomerModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CustomerDAO {
//Method to Fetch the Records from Database to the UI table.    
public void setRecordsIntoTable(JTable tblcustomer){
        DefaultTableModel tableModel = (DefaultTableModel) tblcustomer.getModel();
    tableModel.setRowCount(0);

        Connection conn= dbConnection.dbconnect();

       try {
            Statement stmt =conn.createStatement();
            String sql= "select * FROM customer";
             ResultSet rs= stmt.executeQuery(sql);
            while(rs.next()){

            String full_name = String.valueOf(rs.getString("full_name"));
            String phone_number = String.valueOf(rs.getLong("phone_number"));
            String email = String.valueOf(rs.getString("email"));
            
            String tbdata[]={full_name,phone_number,email};
                DefaultTableModel tblmodel=(DefaultTableModel)tblcustomer.getModel();
                tblmodel.addRow(tbdata);
                
        }
        conn.close();
    }                                           
    catch(Exception e)
         {
             System.out.println(e.getMessage());
             
         }
    }

public void addCustomer(String FullName, String PhoneNumber, String Email) {
        try {
            Connection conn = dbConnection.dbconnect();
            String sql = "INSERT INTO customer (full_name, phone_number, email) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, FullName);
            statement.setString(2, PhoneNumber);
            statement.setString(3,Email);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully inserted", "Customer Added!", JOptionPane.INFORMATION_MESSAGE);
            conn.close();
        } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }

//private void updateCustomer(String fullname, String phone, String email) {
//    try {
//
//        Connection conn = dbConnection.dbconnect();
//        PreparedStatement stmt = conn.prepareStatement("UPDATE customer SET full_name=?, email=? WHERE phone_number=?");
//        stmt.setString(1, fullname);
//        stmt.setString(2, email);
//        stmt.setString(3, phone);
//        stmt.executeUpdate();
//
//        JOptionPane.showMessageDialog(null, "Updated Successfully");
//
//        conn.close();
//
//        reset();
//        setRecordsIntoTable();
//        
//    } catch (Exception ex) {
//        JOptionPane.showMessageDialog(null, ex.getMessage());
//    }
//}
    public void updateCustomer(String fullname, String phone, String email) {
    try {
        Connection conn = dbConnection.dbconnect();
        PreparedStatement stmt = conn.prepareStatement("UPDATE customer SET full_name=?, email=? WHERE phone_number=?");
        stmt.setString(1, fullname);
        stmt.setString(2, email);
        stmt.setString(3, phone);
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Updated Successfully");
        conn.close();
//        reset();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
}



//public void delete(Long phone_number){
//        try{
//            Connection con4 = dbConnection.dbconnect();
//            PreparedStatement pst4 = con4.prepareStatement("delete from customer where phone_number = ?");
//         
//            pst4.setLong(1, phone_number);
//            
//            int rowCount = pst4.executeUpdate();
//            if (rowCount == 1){
//                JOptionPane.showMessageDialog(this, "customer deleted sucessfully");                         
//                clearTable();
//                setRecordsIntoTable();
//            
//            }else{
//                JOptionPane.showMessageDialog(this, "Couldn't Delete the Customer");
//            
//            }
//            
//        }catch (Exception e){
//            JOptionPane.showMessageDialog(this, "Something went Wrong");
////            e.printStackTrace();
//        }       
//  
//   }

 public void delete(Long phone_number){
        try{
            Connection con4 = dbConnection.dbconnect();
            PreparedStatement pst4 = con4.prepareStatement("delete from customer where phone_number = ?");
         
            pst4.setLong(1, phone_number);
            
            int rowCount = pst4.executeUpdate();
            if (rowCount == 1){
                JOptionPane.showMessageDialog(null, "customer deleted sucessfully");                         
             
            }else{
                JOptionPane.showMessageDialog(null, "Couldn't Delete the Customer");
            }   
        }catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Something went Wrong");
//            e.printStackTrace();
        }       
  
   }
 
 
//    public void setFields(){
//                String srch = txtsearch.getText();
//        Connection conn3= dbConnection.dbconnect();
//        DefaultTableModel tableModel = (DefaultTableModel) tblcustomer.getModel();
//    tableModel.setRowCount(0);
//                try {
////            Statement stmt3 =conn3.createStatement();
//            String sql = "SELECT * FROM customer WHERE phone_number = ?";
//PreparedStatement stmt3 = conn3.prepareStatement(sql);
//stmt3.setString(1, srch);
//ResultSet rs = stmt3.executeQuery();
//             
//            while(rs.next()){
//
//            String full_name = String.valueOf(rs.getString("full_name"));
//            String phone_number = String.valueOf(rs.getInt("phone_number"));
//            String email = String.valueOf(rs.getString("email"));
//            
//            
//            String tbdata[]={full_name,phone_number,email};
//                DefaultTableModel tblmodel=(DefaultTableModel)tblcustomer.getModel();
//                tblmodel.addRow(tbdata);
//                
//        }
////            tableModel.fireTableDataChanged();
//        conn3.close();
//    }                                           
//    catch(Exception e)
//         {
//             System.out.println(e.getMessage());
//             
//         }
//    }



}
