/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DAO.dbConnection;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sandesh
 */
public class DashboardView extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
        DefaultTableModel model;

    public DashboardView() {
        initComponents();
        updateVehicleCards();
        setRecordsToTable();
    }
    
    public void setRecordsToTable(){
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
    
 public void search(String str){
        model = (DefaultTableModel)tbl_vehicleData.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tbl_vehicleData.setRowSorter(trs);
       trs.setRowFilter(RowFilter.regexFilter(str));
    }
 
    public void updateVehicleCards(){
        try {
            // Get the database connection
            Connection con = dbConnection.dbconnect();

            // Create a prepared statement to query the count of entries in the "vehicle" table
            PreparedStatement pst = con.prepareStatement("SELECT COUNT(*) AS count FROM vehicle");
            
            // Execute the query and retrieve the result set
            ResultSet rs = pst.executeQuery();

            // Check if the result set has a row
            if (rs.next()) {
                // Get the count from the result set
                int count = rs.getInt("count");
                
                // Update the label with the count
                txtVehiclesCard.setText(String.valueOf(count));
            }
            
            // Close the result set, prepared statement, and database connection
            rs.close();
            pst.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle any exceptions that occur during the database operation
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        vechiclesOnFleetCard = new javax.swing.JPanel();
        txtVehiclesCard = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NavBar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        navbtn_Billing = new javax.swing.JButton();
        navbtn_Dashboard = new javax.swing.JButton();
        navbtn_Vehicles = new javax.swing.JButton();
        navbtn_Booking = new javax.swing.JButton();
        navbtn_Customers = new javax.swing.JButton();
        OnRentCard = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtOnRent = new javax.swing.JLabel();
        BookingCard = new javax.swing.JPanel();
        txtBooking = new javax.swing.JLabel();
        bookinglab = new javax.swing.JLabel();
        AlertsCard = new javax.swing.JPanel();
        txtAlerts = new javax.swing.JLabel();
        AlertsLab = new javax.swing.JLabel();
        OverdueCard = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtOverdue = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_vehicleData = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btnViewProfile = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jTextField1.setBackground(new java.awt.Color(232, 247, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(191, 17, 250, 38);

        vechiclesOnFleetCard.setBackground(new java.awt.Color(16, 3, 35));
        vechiclesOnFleetCard.setLayout(null);

        txtVehiclesCard.setFont(new java.awt.Font("Dubai", 1, 90)); // NOI18N
        txtVehiclesCard.setForeground(new java.awt.Color(255, 255, 255));
        txtVehiclesCard.setText("-");
        vechiclesOnFleetCard.add(txtVehiclesCard);
        txtVehiclesCard.setBounds(10, 3, 110, 90);

        jLabel5.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vehicles on Fleet");
        vechiclesOnFleetCard.add(jLabel5);
        jLabel5.setBounds(10, 110, 170, 42);

        getContentPane().add(vechiclesOnFleetCard);
        vechiclesOnFleetCard.setBounds(190, 120, 230, 160);

        NavBar.setBackground(new java.awt.Color(221, 229, 239));
        NavBar.setDoubleBuffered(false);
        NavBar.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        NavBar.add(jLabel9);
        jLabel9.setBounds(10, 10, 140, 170);

        navbtn_Billing.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_Billing.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_Billing.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_Billing.setText("Billing");
        navbtn_Billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_BillingActionPerformed(evt);
            }
        });
        NavBar.add(navbtn_Billing);
        navbtn_Billing.setBounds(0, 530, 160, 40);

        navbtn_Dashboard.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_Dashboard.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_Dashboard.setText("Dashboard");
        navbtn_Dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_DashboardActionPerformed(evt);
            }
        });
        NavBar.add(navbtn_Dashboard);
        navbtn_Dashboard.setBounds(0, 330, 160, 40);

        navbtn_Vehicles.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_Vehicles.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_Vehicles.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_Vehicles.setText("Vehicles");
        navbtn_Vehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_VehiclesActionPerformed(evt);
            }
        });
        NavBar.add(navbtn_Vehicles);
        navbtn_Vehicles.setBounds(0, 430, 160, 40);

        navbtn_Booking.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_Booking.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_Booking.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_Booking.setText("Booking");
        navbtn_Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_BookingActionPerformed(evt);
            }
        });
        NavBar.add(navbtn_Booking);
        navbtn_Booking.setBounds(0, 480, 160, 40);

        navbtn_Customers.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_Customers.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_Customers.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_Customers.setText("Customers");
        navbtn_Customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_CustomersActionPerformed(evt);
            }
        });
        NavBar.add(navbtn_Customers);
        navbtn_Customers.setBounds(0, 380, 160, 40);

        getContentPane().add(NavBar);
        NavBar.setBounds(0, 0, 160, 880);

        OnRentCard.setBackground(new java.awt.Color(68, 160, 116));
        OnRentCard.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("On Rent");
        OnRentCard.add(jLabel7);
        jLabel7.setBounds(20, 110, 100, 40);

        txtOnRent.setFont(new java.awt.Font("Dubai", 1, 90)); // NOI18N
        txtOnRent.setForeground(new java.awt.Color(255, 255, 255));
        txtOnRent.setText("10");
        OnRentCard.add(txtOnRent);
        txtOnRent.setBounds(10, 0, 110, 90);

        getContentPane().add(OnRentCard);
        OnRentCard.setBounds(450, 120, 230, 160);

        BookingCard.setBackground(new java.awt.Color(50, 116, 178));
        BookingCard.setLayout(null);

        txtBooking.setBackground(new java.awt.Color(50, 116, 178));
        txtBooking.setFont(new java.awt.Font("Dubai", 1, 90)); // NOI18N
        txtBooking.setForeground(new java.awt.Color(255, 255, 255));
        txtBooking.setText("10");
        BookingCard.add(txtBooking);
        txtBooking.setBounds(10, 10, 110, 80);

        bookinglab.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        bookinglab.setForeground(new java.awt.Color(255, 255, 255));
        bookinglab.setText("Booking");
        BookingCard.add(bookinglab);
        bookinglab.setBounds(10, 110, 90, 42);

        getContentPane().add(BookingCard);
        BookingCard.setBounds(710, 120, 230, 160);

        AlertsCard.setBackground(new java.awt.Color(186, 133, 53));
        AlertsCard.setLayout(null);

        txtAlerts.setBackground(new java.awt.Color(50, 116, 178));
        txtAlerts.setFont(new java.awt.Font("Dubai", 1, 90)); // NOI18N
        txtAlerts.setForeground(new java.awt.Color(255, 255, 255));
        txtAlerts.setText("10");
        AlertsCard.add(txtAlerts);
        txtAlerts.setBounds(10, 0, 140, 110);

        AlertsLab.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        AlertsLab.setForeground(new java.awt.Color(255, 255, 255));
        AlertsLab.setText("Alerts");
        AlertsCard.add(AlertsLab);
        AlertsLab.setBounds(10, 110, 90, 42);

        getContentPane().add(AlertsCard);
        AlertsCard.setBounds(970, 120, 230, 160);

        OverdueCard.setBackground(new java.awt.Color(215, 111, 111));
        OverdueCard.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Overdue");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OverdueCard.add(jLabel13);
        jLabel13.setBounds(0, 110, 110, 42);

        txtOverdue.setBackground(new java.awt.Color(50, 116, 178));
        txtOverdue.setFont(new java.awt.Font("Dubai", 1, 90)); // NOI18N
        txtOverdue.setForeground(new java.awt.Color(255, 255, 255));
        txtOverdue.setText("10");
        OverdueCard.add(txtOverdue);
        txtOverdue.setBounds(10, 10, 160, 90);

        getContentPane().add(OverdueCard);
        OverdueCard.setBounds(1230, 120, 230, 160);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);
        getContentPane().add(jPanel8);
        jPanel8.setBounds(-1210, -240, 1770, 0);

        jLabel16.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        jLabel16.setText("DASHBOARD");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(191, 61, 233, 62);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 32)); // NOI18N
        jLabel8.setText("Rate List");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(950, 310, 200, 53);

        tbl_vehicleData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        tbl_vehicleData.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tbl_vehicleData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Model", "Fuel", "Rate"
            }
        ));
        tbl_vehicleData.setRowHeight(40);
        tbl_vehicleData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_vehicleDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_vehicleData);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(750, 360, 560, 200);

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 32)); // NOI18N
        jLabel4.setText("Search Vehicle");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 570, 290, 53);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 32)); // NOI18N
        jLabel2.setText("Query Customers");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 330, 290, 53);

        txt_search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel2.add(txt_search);
        txt_search.setBounds(130, 620, 390, 50);

        btnViewProfile.setBackground(new java.awt.Color(0, 0, 0));
        btnViewProfile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        jPanel2.add(btnViewProfile);
        btnViewProfile.setBounds(440, 390, 130, 50);

        jTextField2.setBackground(new java.awt.Color(232, 247, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setText("  Phone Number");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField2);
        jTextField2.setBounds(60, 390, 340, 50);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/querycusBG.png"))); // NOI18N
        jPanel2.add(jLabel20);
        jLabel20.setBounds(20, 300, 640, 190);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/smallbg.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 490, 650, 290);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ratelistBG.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(710, 280, 650, 530);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchbtn.png"))); // NOI18N
        jButton1.setText("  ");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(300, 20, 70, 38);
        jPanel2.add(jScrollBar1);
        jScrollBar1.setBounds(1290, 420, 10, 48);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(150, 0, 1390, 880);

        setBounds(0, 0, 1550, 1087);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void navbtn_BillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_BillingActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_navbtn_BillingActionPerformed

    private void navbtn_DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_DashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navbtn_DashboardActionPerformed

    private void navbtn_VehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_VehiclesActionPerformed
        // TODO add your handling code here:
       new VehiclesView().setVisible(true);
               dispose();

    }//GEN-LAST:event_navbtn_VehiclesActionPerformed

    private void navbtn_BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_BookingActionPerformed
        // TODO add your handling code here:
        new BookingsView().setVisible(true);
        dispose();
    }//GEN-LAST:event_navbtn_BookingActionPerformed

    private void navbtn_CustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_CustomersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navbtn_CustomersActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        String searchString = txt_search.getText();
        search(searchString);        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchKeyReleased

    private void tbl_vehicleDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_vehicleDataMouseClicked

        int rowNo = tbl_vehicleData.getSelectedRow();
        TableModel model = tbl_vehicleData.getModel();

//        txt_vType.setText(model.getValueAt(rowNo, 0).toString());
//        txt_brand.setText(model.getValueAt(rowNo, 1).toString());
//        txt_vmodel.setText(model.getValueAt(rowNo, 2).toString());
//        txt_vno.setText(model.getValueAt(rowNo, 3).toString());
//        txt_fuel.setText(model.getValueAt(rowNo, 4).toString());
//        txt_rate.setText(model.getValueAt(rowNo, 5).toString());
//        txt_color.setText(model.getValueAt(rowNo, 6).toString());
//        txt_speed.setText(model.getValueAt(rowNo, 7).toString());

        //        txt_vmodel.setText(model.getValueAt(rowNo, 5).toString());
    }//GEN-LAST:event_tbl_vehicleDataMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AlertsCard;
    private javax.swing.JLabel AlertsLab;
    private javax.swing.JPanel BookingCard;
    private javax.swing.JPanel NavBar;
    private javax.swing.JPanel OnRentCard;
    private javax.swing.JPanel OverdueCard;
    private javax.swing.JLabel bookinglab;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton navbtn_Billing;
    private javax.swing.JButton navbtn_Booking;
    private javax.swing.JButton navbtn_Customers;
    private javax.swing.JButton navbtn_Dashboard;
    private javax.swing.JButton navbtn_Vehicles;
    private javax.swing.JTable tbl_vehicleData;
    private javax.swing.JLabel txtAlerts;
    private javax.swing.JLabel txtBooking;
    private javax.swing.JLabel txtOnRent;
    private javax.swing.JLabel txtOverdue;
    private javax.swing.JLabel txtVehiclesCard;
    private javax.swing.JTextField txt_search;
    private javax.swing.JPanel vechiclesOnFleetCard;
    // End of variables declaration//GEN-END:variables
}
