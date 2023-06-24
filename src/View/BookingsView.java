        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import DAO.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JOptionPane;
/**
 * 
 * @author hello
 */
public class BookingsView extends javax.swing.JFrame {

    /**
     * Creates new form BookingsView
     */
    public BookingsView() {
        initComponents();
        setRecordsToTable();
    }

        DefaultTableModel model;

    public void setRecordsToTable(){
        try{
            Connection con = dbConnection.dbconnect();
            PreparedStatement pst = con.prepareStatement("select * from vehicle");
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
                model = (DefaultTableModel)tbl_vehicleData.getModel();
                model.addRow(obj);
            }
        
        
        }catch (Exception e) {
            e.printStackTrace();
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

        jLabel16 = new javax.swing.JLabel();
        NavBar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        navbtn_Billing = new javax.swing.JButton();
        navbtn_Dashboard = new javax.swing.JButton();
        navbtn_Vehicles = new javax.swing.JButton();
        navbtn_Booking = new javax.swing.JButton();
        navbtn_Customers = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_vehicleData = new javax.swing.JTable();
        btnSearchVehicle = new javax.swing.JButton();
        bk_vehicleNo = new javax.swing.JTextField();
        bk_Model = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bk_Days = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bk_Brand = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        bk_SpecialReq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bk_Rate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bk_PhoneNo = new javax.swing.JTextField();
        bk_Surcharge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_calculate = new javax.swing.JButton();
        bg_booking = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        sum_vehicleNo = new javax.swing.JLabel();
        sum_Rate = new javax.swing.JLabel();
        sum_days = new javax.swing.JLabel();
        sum_surcharge = new javax.swing.JLabel();
        sum_total = new javax.swing.JLabel();
        sum_tax = new javax.swing.JLabel();
        btn_Book = new javax.swing.JButton();
        Outline = new javax.swing.JLabel();
        summarybg = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        jLabel16.setText("DASHBOARD");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        txt_search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel2.add(txt_search);
        txt_search.setBounds(970, 20, 370, 50);

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 32)); // NOI18N
        jLabel8.setText("Available Vehicles");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(880, 100, 300, 53);

        tbl_vehicleData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Brand", "Model", "Vehicle No", "Fuel", "Rate", "Color", "Speed"
            }
        ));
        tbl_vehicleData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_vehicleDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_vehicleData);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(800, 140, 452, 220);

        btnSearchVehicle.setBackground(new java.awt.Color(0, 0, 0));
        btnSearchVehicle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSearchVehicle.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchVehicle.setText("Select");
        btnSearchVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchVehicleActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearchVehicle);
        btnSearchVehicle.setBounds(290, 730, 130, 50);

        bk_vehicleNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bk_vehicleNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bk_vehicleNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bk_vehicleNoActionPerformed(evt);
            }
        });
        jPanel2.add(bk_vehicleNo);
        bk_vehicleNo.setBounds(350, 80, 200, 40);

        bk_Model.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bk_Model.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bk_Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bk_ModelActionPerformed(evt);
            }
        });
        jPanel2.add(bk_Model);
        bk_Model.setBounds(350, 200, 200, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 39, 76));
        jLabel10.setText("Model");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(130, 200, 140, 29);

        bk_Days.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bk_Days.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bk_Days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bk_DaysActionPerformed(evt);
            }
        });
        jPanel2.add(bk_Days);
        bk_Days.setBounds(350, 320, 200, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 39, 76));
        jLabel11.setText("No of Days");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(130, 320, 140, 29);

        bk_Brand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bk_Brand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bk_Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bk_BrandActionPerformed(evt);
            }
        });
        jPanel2.add(bk_Brand);
        bk_Brand.setBounds(350, 140, 200, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 39, 76));
        jLabel12.setText("Special Request");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(130, 380, 180, 29);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 250, 246));
        jLabel18.setText("Total");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(860, 670, 140, 30);

        bk_SpecialReq.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bk_SpecialReq.setText("No Requests");
        bk_SpecialReq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bk_SpecialReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bk_SpecialReqActionPerformed(evt);
            }
        });
        jPanel2.add(bk_SpecialReq);
        bk_SpecialReq.setBounds(350, 380, 200, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 39, 76));
        jLabel2.setText("Brand");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(130, 140, 140, 29);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 39, 76));
        jLabel13.setText("Rate");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(130, 260, 140, 29);

        bk_Rate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bk_Rate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bk_Rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bk_RateActionPerformed(evt);
            }
        });
        jPanel2.add(bk_Rate);
        bk_Rate.setBounds(350, 260, 200, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 39, 76));
        jLabel1.setText("Vehicle No");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(130, 80, 140, 29);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 39, 76));
        jLabel14.setText("Phone Number");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(100, 660, 180, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 39, 76));
        jLabel17.setText("Surcharge");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(130, 440, 180, 29);

        bk_PhoneNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bk_PhoneNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bk_PhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bk_PhoneNoActionPerformed(evt);
            }
        });
        jPanel2.add(bk_PhoneNo);
        bk_PhoneNo.setBounds(300, 660, 250, 40);

        bk_Surcharge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bk_Surcharge.setText("0");
        bk_Surcharge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bk_Surcharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bk_SurchargeActionPerformed(evt);
            }
        });
        jPanel2.add(bk_Surcharge);
        bk_Surcharge.setBounds(350, 440, 200, 40);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 48)); // NOI18N
        jLabel5.setText("BOOKING");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(220, 10, 290, 80);

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel4.setText("Select Customer");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 580, 290, 53);

        btn_calculate.setBackground(new java.awt.Color(154, 57, 23));
        btn_calculate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_calculate.setForeground(new java.awt.Color(255, 255, 255));
        btn_calculate.setText("Calculate");
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_calculate);
        btn_calculate.setBounds(270, 490, 150, 40);

        bg_booking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchVehiBG.png"))); // NOI18N
        jPanel2.add(bg_booking);
        bg_booking.setBounds(40, 540, 650, 290);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ratelistBG.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 40, 650, 530);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ratelistBG.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(710, 80, 650, 310);

        jLabel15.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel15.setText("Search Vehicle");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(780, 30, 290, 53);

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Summary");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(960, 420, 160, 33);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 250, 246));
        jLabel21.setText("Vehicle No");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(810, 490, 140, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 250, 246));
        jLabel22.setText("Rate");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(810, 520, 140, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 250, 246));
        jLabel23.setText("Days Rented");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(810, 550, 140, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 250, 246));
        jLabel24.setText("Surcharge");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(810, 580, 140, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 250, 246));
        jLabel25.setText("Tax");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(810, 610, 140, 30);

        sum_vehicleNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sum_vehicleNo.setForeground(new java.awt.Color(255, 250, 246));
        sum_vehicleNo.setText("-");
        jPanel2.add(sum_vehicleNo);
        sum_vehicleNo.setBounds(1080, 490, 140, 30);

        sum_Rate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sum_Rate.setForeground(new java.awt.Color(255, 250, 246));
        sum_Rate.setText("-");
        jPanel2.add(sum_Rate);
        sum_Rate.setBounds(1080, 520, 140, 30);

        sum_days.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sum_days.setForeground(new java.awt.Color(255, 250, 246));
        sum_days.setText("-");
        jPanel2.add(sum_days);
        sum_days.setBounds(1080, 550, 140, 30);

        sum_surcharge.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sum_surcharge.setForeground(new java.awt.Color(255, 250, 246));
        sum_surcharge.setText("-");
        jPanel2.add(sum_surcharge);
        sum_surcharge.setBounds(1080, 580, 140, 30);

        sum_total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sum_total.setForeground(new java.awt.Color(255, 250, 246));
        sum_total.setText("-");
        jPanel2.add(sum_total);
        sum_total.setBounds(1060, 670, 140, 30);

        sum_tax.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sum_tax.setForeground(new java.awt.Color(255, 250, 246));
        sum_tax.setText("-");
        jPanel2.add(sum_tax);
        sum_tax.setBounds(1080, 610, 140, 30);

        btn_Book.setBackground(new java.awt.Color(154, 57, 23));
        btn_Book.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Book.setForeground(new java.awt.Color(255, 255, 255));
        btn_Book.setText("Book");
        btn_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BookActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Book);
        btn_Book.setBounds(960, 720, 120, 40);

        Outline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bill border.png"))); // NOI18N
        jPanel2.add(Outline);
        Outline.setBounds(750, 430, 580, 310);

        summarybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bgdark.png"))); // NOI18N
        jPanel2.add(summarybg);
        summarybg.setBounds(710, 330, 630, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NavBar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addComponent(NavBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navbtn_BillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_BillingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navbtn_BillingActionPerformed

    private void navbtn_DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_DashboardActionPerformed
        // TODO add your handling code here:
        new DashboardView().setVisible(true);
        dispose();
    }//GEN-LAST:event_navbtn_DashboardActionPerformed

    private void navbtn_VehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_VehiclesActionPerformed
        // TODO add your handling code here:
        new VehiclesView().setVisible(true);
        dispose();
    }//GEN-LAST:event_navbtn_VehiclesActionPerformed

    private void navbtn_BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_BookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navbtn_BookingActionPerformed

    private void btnSearchVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchVehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchVehicleActionPerformed
 public void calculateBooking(String vehicleNo, String Brand,String Model,int Rate,int Days,String SpecialReq,int Surcharge){
     int subAmt=Rate*Days;
     int Amt=subAmt + Surcharge;
     double Tax=0.13*Amt;
     double Total=Amt+Tax;
     
     sum_vehicleNo.setText(vehicleNo);
     sum_Rate.setText(String.valueOf(Rate));
     sum_days.setText(String.valueOf(Days));
     sum_surcharge.setText(String.valueOf(Surcharge));
     sum_tax.setText(String.valueOf(Tax));
     sum_total.setText(String.valueOf(Total));
 }
    public void search(String str){
        model = (DefaultTableModel)tbl_vehicleData.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tbl_vehicleData.setRowSorter(trs);
       trs.setRowFilter(RowFilter.regexFilter(str));
    }
    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        String searchString = txt_search.getText();
        search(searchString);        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void tbl_vehicleDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_vehicleDataMouseClicked

        int rowNo = tbl_vehicleData.getSelectedRow();
        TableModel model = tbl_vehicleData.getModel();

        bk_vehicleNo.setText(model.getValueAt(rowNo, 3).toString());
        bk_Brand.setText(model.getValueAt(rowNo, 1).toString());
        bk_Model.setText(model.getValueAt(rowNo, 2).toString());
        bk_Rate.setText(model.getValueAt(rowNo, 5).toString());

        //        txt_vmodel.setText(model.getValueAt(rowNo, 5).toString());
    }//GEN-LAST:event_tbl_vehicleDataMouseClicked

    private void bk_vehicleNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bk_vehicleNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bk_vehicleNoActionPerformed

    private void bk_ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bk_ModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bk_ModelActionPerformed

    private void bk_DaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bk_DaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bk_DaysActionPerformed

    private void bk_BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bk_BrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bk_BrandActionPerformed

    private void bk_SpecialReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bk_SpecialReqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bk_SpecialReqActionPerformed

    private void bk_RateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bk_RateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bk_RateActionPerformed

    private void bk_PhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bk_PhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bk_PhoneNoActionPerformed

    private void bk_SurchargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bk_SurchargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bk_SurchargeActionPerformed

    private void btn_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BookActionPerformed

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed
        // TODO add your handling code here:
//        String Vno=bk_vehicleNo.getText();
//        String brand=bk_Brand.getText();
//        String model=bk_Model.getText();
//        int rate=Integer.parseInt(bk_Rate.getText());
//        int days=Integer.parseInt(bk_Days.getText());
//        String specialReq=bk_SpecialReq.getText();
//        int surcharge=Integer.parseInt(bk_Surcharge.getText());
//        
//        
//        calculateBooking(Vno,brand,model,rate,days,specialReq,surcharge);
String Vno = bk_vehicleNo.getText();
    String brand = bk_Brand.getText();
    String model = bk_Model.getText();
    String rateStr = bk_Rate.getText();
    String daysStr = bk_Days.getText();
    String specialReq = bk_SpecialReq.getText();
    String surchargeStr = bk_Surcharge.getText();
    
    // Check if any field is empty
    if (Vno.isEmpty() || brand.isEmpty() || model.isEmpty() || rateStr.isEmpty() || daysStr.isEmpty() || specialReq.isEmpty() || surchargeStr.isEmpty()) {
        // Display an error message or perform other necessary action
        JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // All fields are filled, proceed with calculation
        int rate = Integer.parseInt(rateStr);
        int days = Integer.parseInt(daysStr);
        int surcharge = Integer.parseInt(surchargeStr);
        
        calculateBooking(Vno, brand, model, rate, days, specialReq, surcharge);
    }
    }//GEN-LAST:event_btn_calculateActionPerformed

    private void navbtn_CustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_CustomersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navbtn_CustomersActionPerformed

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
            java.util.logging.Logger.getLogger(BookingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NavBar;
    private javax.swing.JLabel Outline;
    private javax.swing.JLabel bg_booking;
    private javax.swing.JTextField bk_Brand;
    private javax.swing.JTextField bk_Days;
    private javax.swing.JTextField bk_Model;
    private javax.swing.JTextField bk_PhoneNo;
    private javax.swing.JTextField bk_Rate;
    private javax.swing.JTextField bk_SpecialReq;
    private javax.swing.JTextField bk_Surcharge;
    private javax.swing.JTextField bk_vehicleNo;
    private javax.swing.JButton btnSearchVehicle;
    private javax.swing.JButton btn_Book;
    private javax.swing.JButton btn_calculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton navbtn_Billing;
    private javax.swing.JButton navbtn_Booking;
    private javax.swing.JButton navbtn_Customers;
    private javax.swing.JButton navbtn_Dashboard;
    private javax.swing.JButton navbtn_Vehicles;
    private javax.swing.JLabel sum_Rate;
    private javax.swing.JLabel sum_days;
    private javax.swing.JLabel sum_surcharge;
    private javax.swing.JLabel sum_tax;
    private javax.swing.JLabel sum_total;
    private javax.swing.JLabel sum_vehicleNo;
    private javax.swing.JLabel summarybg;
    private javax.swing.JTable tbl_vehicleData;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
