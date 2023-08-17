/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.BookingModel;
import View.BookingsView;
import DAO.BookingDAO;
import javax.swing.JTable;
/**
 *
 * @author hello
 */
public class BookingController {
   public void setRecords(JTable tbl_vehicleData){
       BookingDAO bdao=new BookingDAO();
       bdao.setRecordsToTable(tbl_vehicleData);
   }
   public String[] checkCustomerRecord(String phoneNumber){
      BookingDAO bdao=new BookingDAO();  
      String[] cusDetails= bdao.checkCustomerRecord(phoneNumber);
      return cusDetails;
   }
}
