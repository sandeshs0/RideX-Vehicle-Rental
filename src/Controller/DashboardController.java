package Controller;

import DAO.DashboardDAO;
import DAO.dbConnection;
import Model.DashboardModel;
import View.DashboardView;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DashboardController {
    DefaultTableModel model;
    private DashboardView dashboardView;
    private DashboardModel dashboardModel;
    private DashboardDAO dashboardDAO;

    public DashboardController(DashboardView dashboardView, DashboardModel dashboardModel, DashboardDAO dashboardDAO) {
        this.dashboardView = dashboardView;
        this.dashboardModel = dashboardModel;
        this.dashboardDAO = dashboardDAO;
    }

    public void displayDashboard() {
        dashboardView.setVisible(true);
        updateDashboardData();
    }

    private void updateDashboardData() {
        dashboardModel.setTotalVehicles(dashboardDAO.getTotalVehicles());
        dashboardModel.setTotalBookings(dashboardDAO.getTotalBookings());
        dashboardModel.setOnRentBookings(dashboardDAO.getOnRentBookings());
        dashboardModel.setAvailableVehicles(dashboardDAO.getAvailableVehicles());
        dashboardModel.setOverdueBookings(dashboardDAO.getOverdueBookings());

        dashboardView.updateDashboard(dashboardModel);
    }
        public void setRecordsToTable(JTable tbl_vehicleData){
        try{
            Connection con = dbConnection.dbconnect();
            java.sql.PreparedStatement pst = con.prepareStatement("select * from vehicle");
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
