/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.dbConnection;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hello
 */
public class Transactions extends javax.swing.JFrame {

    /**
     * Creates new form Transactions
     */
    public Transactions() {
        initComponents();
        setTitle("RideX: Transaction History");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo.png")));
        setRecordsToTable();
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
        jLabel7 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooking = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        navbtn_Dashboard = new javax.swing.JButton();
        navbtn_Customers = new javax.swing.JButton();
        navbtn_Vehicles = new javax.swing.JButton();
        navbtn_Booking = new javax.swing.JButton();
        navbtn_bookHistory = new javax.swing.JButton();
        navbtn_Billing1 = new javax.swing.JButton();
        navbtn_Transactions = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 48)); // NOI18N
        jLabel7.setText("Transactions");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 20, 550, 70);
        jPanel1.add(txtsearch);
        txtsearch.setBounds(947, 1508, 211, 43);

        btnsearch.setBackground(new java.awt.Color(0, 0, 0));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch);
        btnsearch.setBounds(1176, 1505, 100, 43);

        tblBooking.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment ID", "Amount", "Date", "Type", "CustomerID"
            }
        ));
        tblBooking.setRowHeight(40);
        tblBooking.getTableHeader().setReorderingAllowed(false);
        tblBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookingMouseClicked(evt);
            }
        });
        tblBooking.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblBookingKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblBooking);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 1280, 590);

        jPanel5.setBackground(new java.awt.Color(221, 229, 239));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

        navbtn_Dashboard.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_Dashboard.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_Dashboard.setText("Dashboard");
        navbtn_Dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_DashboardActionPerformed(evt);
            }
        });

        navbtn_Customers.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_Customers.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_Customers.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_Customers.setText("Customers");
        navbtn_Customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_CustomersActionPerformed(evt);
            }
        });

        navbtn_Vehicles.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_Vehicles.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_Vehicles.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_Vehicles.setText("Vehicles");
        navbtn_Vehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_VehiclesActionPerformed(evt);
            }
        });

        navbtn_Booking.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_Booking.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_Booking.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_Booking.setText("Booking");
        navbtn_Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_BookingActionPerformed(evt);
            }
        });

        navbtn_bookHistory.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_bookHistory.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_bookHistory.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_bookHistory.setText("Booking History");
        navbtn_bookHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_bookHistoryActionPerformed(evt);
            }
        });

        navbtn_Billing1.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_Billing1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_Billing1.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_Billing1.setText("CheckOut");
        navbtn_Billing1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_Billing1ActionPerformed(evt);
            }
        });

        navbtn_Transactions.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_Transactions.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_Transactions.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_Transactions.setText("Transactions");
        navbtn_Transactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_TransactionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navbtn_Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navbtn_Customers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navbtn_Vehicles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navbtn_Booking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navbtn_bookHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navbtn_Transactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(navbtn_Billing1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(navbtn_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(navbtn_Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navbtn_Vehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navbtn_Booking, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(navbtn_bookHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navbtn_Transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(470, 470, 470)
                    .addComponent(navbtn_Billing1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(475, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
DefaultTableModel model;

public void setRecordsToTable(){
        try{
            java.sql.Connection con = dbConnection.dbconnect();
            java.sql.PreparedStatement pst = con.prepareStatement("select * from payment");
            java.sql.ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                
                String payID = rs.getString("PaymentId");
  
              
              
                String payDate = rs.getString("PayDate");
               
                String amt = rs.getString("amount");
                String type = rs.getString("PaymentType");
                String cusID = rs.getString("customerID");
                Object[] obj = {payID, amt, payDate,type, cusID};
                model = (DefaultTableModel)tblBooking.getModel();
                model.addRow(obj);
            }
        
        
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
//        String srch = txtsearch.getText();
//        Connection conn3= (Connection) dbConnection.dbconnect();
//        DefaultTableModel tableModel = (DefaultTableModel) tblBooking.getModel();
//        tableModel.setRowCount(0);
//        try {
//            //            Statement stmt3 =conn3.createStatement();
//            String sql = "SELECT * FROM payment";
//            PreparedStatement stmt3;
//            stmt3 = conn3.prepareStatement(sql);
//            stmt3.setString(1, srch);
//            ResultSet rs = stmt3.executeQuery();
//
//            while(rs.next()){
//
//                String full_name = String.valueOf(rs.getString("full_name"));
//                String phone_number = String.valueOf(rs.getInt("phone_number"));
//                String email = String.valueOf(rs.getString("email"));
//
//                String tbdata[]={full_name,phone_number,email};
//                DefaultTableModel tblmodel=(DefaultTableModel)tblBooking.getModel();
//                tblmodel.addRow(tbdata);
//
//            }
//            //            tableModel.fireTableDataChanged();
//            conn3.close();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//
//        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void tblBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookingMouseClicked
//        int i =tblBooking.getSelectedRow();
//        DefaultTableModel model=(DefaultTableModel)tblBooking.getModel();
//        selectedBkID=model.getValueAt(i,0).toString();

    }//GEN-LAST:event_tblBookingMouseClicked

    private void tblBookingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBookingKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookingKeyPressed

    private void navbtn_DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_DashboardActionPerformed
        // TODO add your handling code here:
        new DashboardView().setVisible(true);
        dispose();
    }//GEN-LAST:event_navbtn_DashboardActionPerformed

    private void navbtn_CustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_CustomersActionPerformed
        // TODO add your handling code here:
        new CustomersView().setVisible(true);
        dispose();
    }//GEN-LAST:event_navbtn_CustomersActionPerformed

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

    private void navbtn_bookHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_bookHistoryActionPerformed
        // TODO add your handling code here:
        new BookingListView().setVisible(true);
        dispose();
    }//GEN-LAST:event_navbtn_bookHistoryActionPerformed

    private void navbtn_Billing1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_Billing1ActionPerformed
new ReturnVehicle().setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_navbtn_Billing1ActionPerformed

    private void navbtn_TransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_TransactionsActionPerformed
    new Transactions().setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_navbtn_TransactionsActionPerformed

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
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transactions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton navbtn_Billing1;
    private javax.swing.JButton navbtn_Booking;
    private javax.swing.JButton navbtn_Customers;
    private javax.swing.JButton navbtn_Dashboard;
    private javax.swing.JButton navbtn_Transactions;
    private javax.swing.JButton navbtn_Vehicles;
    private javax.swing.JButton navbtn_bookHistory;
    private javax.swing.JTable tblBooking;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
