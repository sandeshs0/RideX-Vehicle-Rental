/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.CustomerDAO;
import Model.CustomerModel;
import View.CustomersView;
import java.util.List;
import javax.swing.JTable;
import Model.CustomerModel;
import View.CustomersView;
import javax.swing.JOptionPane;
/**
 *
 * @author hello
 */
public class CustomerController {
    public void setRecordsToTable(JTable tblcustomer){
           CustomerDAO cdao=new CustomerDAO();
            cdao.setRecordsIntoTable(tblcustomer);
    }
    
    public void addCustomers(String fullName, String phone, String email){
        if(validation(fullName,phone,email)){
        CustomerDAO cdao= new CustomerDAO();
        cdao.addCustomer(fullName,phone,email);
    }
    }
   public void updateCustomer(String fullname, String phone, String email){
      
       CustomerDAO cdao= new CustomerDAO();
       cdao.updateCustomer(fullname, phone, email);
   }
   public void deleteCustomer(Long phonenumber){
       CustomerDAO cdao= new CustomerDAO();
       cdao.delete(phonenumber);
   }
  
   public boolean validation(String fname ,String phn,String email) {
    
    if (fname.equals("")) {
        JOptionPane.showMessageDialog(null, "Please enter the first name");
        return false;
    }
    
    if (phn.equals("")) {
        JOptionPane.showMessageDialog(null, "Please enter your phone number");
        return false;
    } else if (phn.length() != 10) {
        JOptionPane.showMessageDialog(null, "Phone number should be 10 digits long");
        return false;
    }
    
    if (email.equals("")) {
        JOptionPane.showMessageDialog(null, "Please enter the email");
        return false;
    }
    
    return true;
}
}
