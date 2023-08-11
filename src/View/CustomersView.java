package View;


import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import DAO.dbConnection;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomersView extends javax.swing.JFrame {

    public CustomersView() {
        initComponents();
        setTitle("RideX: Customer Management");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo.png")));
        setRecordsIntoTable();
    }

//Method to Fetch the Records from Database to the UI table.    
public void setRecordsIntoTable(){
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
//    Method to check Validation
   public boolean validation() {
    String fname = txtfullname.getText();
    String phn = txtphone.getText();
    String email = txtemail.getText();
    
    if (fname.equals("")) {
        JOptionPane.showMessageDialog(this, "Please enter the first name");
        return false;
    }
    
    if (phn.equals("")) {
        JOptionPane.showMessageDialog(this, "Please enter your phone number");
        return false;
    } else if (phn.length() != 10) {
        JOptionPane.showMessageDialog(this, "Phone number should be 10 digits long");
        return false;
    }
    
    if (email.equals("")) {
        JOptionPane.showMessageDialog(this, "Please enter the email");
        return false;
    }
    
    return true;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtfullname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnremove = new javax.swing.JButton();
        btnaddcustomer1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcustomer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        navbtn_Dashboard = new javax.swing.JButton();
        navbtn_Customers = new javax.swing.JButton();
        navbtn_Vehicles = new javax.swing.JButton();
        navbtn_Booking = new javax.swing.JButton();
        navbtn_Billing = new javax.swing.JButton();
        navbtn_Transactions = new javax.swing.JButton();
        navbtn_bookHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 48)); // NOI18N
        jLabel7.setText("Customer Management");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 20, 550, 70);

        txtfullname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtfullname);
        txtfullname.setBounds(60, 250, 260, 40);

        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtemail);
        txtemail.setBounds(60, 450, 260, 40);

        txtphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtphone);
        txtphone.setBounds(60, 350, 260, 40);
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

        btnreset.setBackground(new java.awt.Color(129, 51, 51));
        btnreset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("Clear Fields");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset);
        btnreset.setBounds(250, 530, 170, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 39, 76));
        jLabel15.setText("Email:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(60, 410, 190, 29);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 39, 76));
        jLabel14.setText("Phone Number:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(60, 310, 190, 29);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 39, 76));
        jLabel11.setText("Full Name:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 210, 120, 29);

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 59, 93));
        jLabel8.setText("Add New Customer");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 150, 350, 50);

        btnremove.setBackground(new java.awt.Color(178, 0, 12));
        btnremove.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnremove.setForeground(new java.awt.Color(255, 255, 255));
        btnremove.setText("Delete");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnremove);
        btnremove.setBounds(950, 650, 130, 40);

        btnaddcustomer1.setBackground(new java.awt.Color(154, 57, 23));
        btnaddcustomer1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnaddcustomer1.setForeground(new java.awt.Color(255, 255, 255));
        btnaddcustomer1.setText("Add New");
        btnaddcustomer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcustomer1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddcustomer1);
        btnaddcustomer1.setBounds(80, 530, 130, 40);

        tblcustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblcustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FULL NAME", "PHONE NO", "EMAIL"
            }
        ));
        tblcustomer.setRowHeight(40);
        tblcustomer.getTableHeader().setReorderingAllowed(false);
        tblcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcustomerMouseClicked(evt);
            }
        });
        tblcustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblcustomerKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblcustomer);
        if (tblcustomer.getColumnModel().getColumnCount() > 0) {
            tblcustomer.getColumnModel().getColumn(1).setMinWidth(10);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(530, 120, 790, 500);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addCustomerBG.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 90, 510, 550);

        btnupdate.setBackground(new java.awt.Color(2, 118, 186));
        btnupdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate);
        btnupdate.setBounds(780, 650, 130, 40);

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

        navbtn_Billing.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_Billing.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_Billing.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_Billing.setText("Billing");
        navbtn_Billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_BillingActionPerformed(evt);
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

        navbtn_bookHistory.setBackground(new java.awt.Color(11, 16, 65));
        navbtn_bookHistory.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        navbtn_bookHistory.setForeground(new java.awt.Color(255, 255, 255));
        navbtn_bookHistory.setText("Booking History");
        navbtn_bookHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navbtn_bookHistoryActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navbtn_Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navbtn_Customers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navbtn_Vehicles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navbtn_Booking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navbtn_Billing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navbtn_bookHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navbtn_Transactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navbtn_Billing, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navbtn_bookHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navbtn_Transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
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

//    Method to Check Validation and Add Customers:
    private void addCustomers() {
    boolean srijan = validation();
    if (srijan) {
        Connection conn = dbConnection.dbconnect();
        try {
            String sql = "INSERT INTO customer (full_name, phone_number, email) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, txtfullname.getText());
            statement.setString(2, txtphone.getText());
            statement.setString(3, txtemail.getText());

            statement.executeUpdate();
            System.out.println("Data inserted");
            JOptionPane.showMessageDialog(this, "Successfully inserted", "Customer Added!", JOptionPane.INFORMATION_MESSAGE);

            conn.close();

            reset();
            setRecordsIntoTable();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
}
public void clearTable(){
        DefaultTableModel model = (DefaultTableModel)tblcustomer.getModel();
        model.setRowCount(0);    
    }
            
    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        String srch = txtsearch.getText();
        Connection conn3= dbConnection.dbconnect();
        DefaultTableModel tableModel = (DefaultTableModel) tblcustomer.getModel();
    tableModel.setRowCount(0);
                try {
//            Statement stmt3 =conn3.createStatement();
            String sql = "SELECT * FROM customer WHERE phone_number = ?";
PreparedStatement stmt3 = conn3.prepareStatement(sql);
stmt3.setString(1, srch);
ResultSet rs = stmt3.executeQuery();
             
            while(rs.next()){

            String full_name = String.valueOf(rs.getString("full_name"));
            String phone_number = String.valueOf(rs.getInt("phone_number"));
            String email = String.valueOf(rs.getString("email"));
            
            
            String tbdata[]={full_name,phone_number,email};
                DefaultTableModel tblmodel=(DefaultTableModel)tblcustomer.getModel();
                tblmodel.addRow(tbdata);
                
        }
//            tableModel.fireTableDataChanged();
        conn3.close();
    }                                           
    catch(Exception e)
         {
             System.out.println(e.getMessage());
             
         }
    }//GEN-LAST:event_btnsearchActionPerformed

//    Method to Update the Customer Details:
    private void updateCustomer() {
    try {
        String fullname = txtfullname.getText();
        String phone = txtphone.getText();
        String email = txtemail.getText();

        Connection conn = dbConnection.dbconnect();
        PreparedStatement stmt = conn.prepareStatement("UPDATE customer SET full_name=?, email=? WHERE phone_number=?");
        stmt.setString(1, fullname);
        stmt.setString(2, email);
        stmt.setString(3, phone);
        stmt.executeUpdate();

        JOptionPane.showMessageDialog(rootPane, "Updated Successfully");

        conn.close();

        reset();
        setRecordsIntoTable();
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
}

             
 public void delete(Long phone_number){
        try{
            Connection con4 = dbConnection.dbconnect();
            PreparedStatement pst4 = con4.prepareStatement("delete from customer where phone_number = ?");
         
            pst4.setLong(1, phone_number);
            
            int rowCount = pst4.executeUpdate();
            if (rowCount == 1){
                JOptionPane.showMessageDialog(this, "customer deleted sucessfully");                         
                clearTable();
                setRecordsIntoTable();
            
            }else{
                JOptionPane.showMessageDialog(this, "Couldn't Delete the Customer");
            
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Something went Wrong");
//            e.printStackTrace();
        }       
  
   }
 private void clearFields(){
             txtfullname.setText(null);
             txtphone.setText(null);
             txtemail.setText(null);
 }
             
             
    private void tblcustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblcustomerKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblcustomerKeyPressed

    private void tblcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcustomerMouseClicked
       int i =tblcustomer.getSelectedRow();
       DefaultTableModel model=(DefaultTableModel)tblcustomer.getModel();
       txtfullname.setText(model.getValueAt(i,0).toString());
       txtphone.setText(model.getValueAt(i,1).toString());
       txtemail.setText(model.getValueAt(i,2).toString());
       
    }//GEN-LAST:event_tblcustomerMouseClicked

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

    private void navbtn_BillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_BillingActionPerformed
        // TODO add your handling code here:
        new ReturnVehicle().setVisible(true);
        dispose();
    }//GEN-LAST:event_navbtn_BillingActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
reset();
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnaddcustomer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcustomer1ActionPerformed
    addCustomers();        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnaddcustomer1ActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
      // TODO add your handling code here:
        Long phone_number = Long.valueOf(txtphone.getText());
        delete(phone_number);
        clearFields();   
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        updateCustomer();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void navbtn_TransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_TransactionsActionPerformed
        new Transactions().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_navbtn_TransactionsActionPerformed

    private void navbtn_bookHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_bookHistoryActionPerformed
        // TODO add your handling code here:
        new BookingListView().setVisible(true);
        dispose();
    }//GEN-LAST:event_navbtn_bookHistoryActionPerformed

    public void reset()
{
    txtemail.setText("");
    txtfullname.setText("");
    txtphone.setText("");
}




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
            java.util.logging.Logger.getLogger(CustomersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomersView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddcustomer1;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton navbtn_Billing;
    private javax.swing.JButton navbtn_Booking;
    private javax.swing.JButton navbtn_Customers;
    private javax.swing.JButton navbtn_Dashboard;
    private javax.swing.JButton navbtn_Transactions;
    private javax.swing.JButton navbtn_Vehicles;
    private javax.swing.JButton navbtn_bookHistory;
    private javax.swing.JTable tblcustomer;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
