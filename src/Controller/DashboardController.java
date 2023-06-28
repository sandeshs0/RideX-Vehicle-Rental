/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JTable;

/**
 *
 * @author hello
 */
public class DashboardController {
    private Connection conn;
    private Statement stmt;
    
DefaultTableModel model;
 public DashboardController() {
        conn = dbConnection.dbconnect();
    }

    public void setRecordsToTable(JTable tbl_vehicleData){
        try{
            Connection con = dbConnection.dbconnect();
            PreparedStatement pst = con.prepareStatement("select * from vehicle");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                
                String vehiclebrand = rs.getString("brand");
                String vehiclemodel = rs.getString("model");
                
                String fuel = rs.getString("fuel");
                String rate = rs.getString("rate");
           

                
                
                Object[] obj = {vehiclebrand,vehiclemodel,fuel,rate};
                model = (DefaultTableModel)tbl_vehicleData.getModel();
                model.addRow(obj);
            }
        
        
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    