/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import DAO.dbConnection;
import java.awt.Toolkit;

/**
 *    
 * @author 97798
 */
public class VehiclesView extends javax.swing.JFrame {

    
   
    DefaultTableModel model;
    public VehiclesView() {
        initComponents();
        setTitle("RideX- Vehicle Management Page.");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo.png")));
        setRecordsToTable();
       
        
    }
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
                String status = rs.getString("status");
//                String status = "✅";
              
                Object[] obj = {vehicleType, vehiclebrand,vehiclemodel, vehicleNo,fuel,rate,color,speed,status};
                model = (DefaultTableModel)tbl_vehicleData.getModel();
                model.addRow(obj);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
public void clearTable(){
        DefaultTableModel model = (DefaultTableModel)tbl_vehicleData.getModel();
        model.setRowCount(0);    
    } 

    public void addVehicle(String vtype,String vno,String brand,String Speed, String color, String fuel, int rate, String model){
        
        try{
            Connection con = dbConnection.dbconnect();
            PreparedStatement pst = con.prepareStatement("insert into vehicle(vehicle_no,vehicle_type,brand,model,speed,fuel,color,rate) values(?,?,?,?,?,?,?,?)");
            pst.setString(1,vno);
            pst.setString(2, vtype);
            pst.setString(3, brand);
            pst.setString(4, model);
            pst.setString(5, Speed);
            pst.setString(6, fuel);
            pst.setString(7, color);
            pst.setInt(8, rate);
          
            int rowCount = pst.executeUpdate();
            if (rowCount == 1){
                JOptionPane.showMessageDialog(this, "vehicle added sucessfully");                         
                clearTable();
                setRecordsToTable();
            
            }else{
                JOptionPane.showMessageDialog(this, "vehicle insertion field");
            
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "vehicle insertion field");
            e.printStackTrace();
        }
    
    }
    
    public void update(String vtype,String vno,String brand,String Speed, String color, String fuel, int rate, String model){
        try{
            Connection con = dbConnection.dbconnect();
            PreparedStatement pst = con.prepareStatement("update vehicle set vehicle_type = ?, color = ?, fuel = ?, rate = ?,brand = ?, speed = ?, model=? where vehicle_no = ?");
            pst.setString(1,vtype);
            pst.setString(2, color);
            pst.setString(3, fuel);
            pst.setInt(4, rate);
            pst.setString(5,brand);
            pst.setString(6, Speed);
            pst.setString(7, model);
            pst.setString(8, vno);
          
            int rowCount = pst.executeUpdate();
            if (rowCount == 1){
                JOptionPane.showMessageDialog(this, "vehicle updated sucessfully");                         
                clearTable();
                setRecordsToTable();
            
            }else{
                JOptionPane.showMessageDialog(this, "vehicle updation field");
            
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "vehicle updation field");
            e.printStackTrace();
        }
    }
//   
    public void delete(String vno){
        try{
            Connection con = dbConnection.dbconnect();
            PreparedStatement pst = con.prepareStatement("delete from vehicle where vehicle_no = ?");           
            pst.setString(1, vno);
          
            int rowCount = pst.executeUpdate();
            if (rowCount == 1){
                JOptionPane.showMessageDialog(this, "vehicle deleted sucessfully");                         
                clearTable();
                setRecordsToTable();
            
            }else{
                JOptionPane.showMessageDialog(this, "vehicle deletion field");
            
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "vehicle deletion field");
            e.printStackTrace();
        }
    
    }
    public void search(String str){
        model = (DefaultTableModel)tbl_vehicleData.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tbl_vehicleData.setRowSorter(trs);
       trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    private void clearFields(){
        txt_vType.setText(null);
        
        txt_vno.setText(null);
        txt_vmodel.setText(null);
        txt_rate.setText(null);
        txt_fuel.setText(null);
        txt_color.setText(null);
        txt_speed.setText(null);
        txt_brand.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txt_vType = new javax.swing.JTextField();
        txt_vno = new javax.swing.JTextField();
        txt_color = new javax.swing.JTextField();
        txt_fuel = new javax.swing.JTextField();
        txt_rate = new javax.swing.JTextField();
        txt_vmodel = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        txt_brand = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_speed = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_vehicleData = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        navbtn_Dashboard = new javax.swing.JButton();
        navbtn_Customers = new javax.swing.JButton();
        navbtn_Vehicles = new javax.swing.JButton();
        navbtn_Booking = new javax.swing.JButton();
        navbtn_Billing = new javax.swing.JButton();
        navbtn_Transactions = new javax.swing.JButton();
        navbtn_bookHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText(" VEHICLES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(585, 585, 585)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(522, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        jPanel3.setBackground(new java.awt.Color(232, 247, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Vehicle Types :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Model :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Vehicle No :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Fuel Type :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Rate :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Color :");

        jButton5.setBackground(new java.awt.Color(102, 97, 122));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txt_vType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_vType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vTypeActionPerformed(evt);
            }
        });

        txt_vno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_vno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vnoActionPerformed(evt);
            }
        });

        txt_color.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_fuel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_fuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fuelActionPerformed(evt);
            }
        });

        txt_rate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_vmodel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_add.setBackground(new java.awt.Color(16, 108, 73));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        txt_brand.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Brand:");

        txt_speed.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Speed:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fuel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_speed, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel9)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_vType)
                                    .addComponent(txt_vno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_vmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_vType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_vno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_vmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_speed, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fuel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tbl_vehicleData.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbl_vehicleData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Brand", "Model", "Vehicle No", "Fuel", "Rate", "Color", "Speed", "Status"
            }
        ));
        tbl_vehicleData.setRowHeight(40);
        tbl_vehicleData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_vehicleDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_vehicleData);

        jButton3.setBackground(new java.awt.Color(172, 78, 126));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(190, 55, 50));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setText("Query Vehicles");

        jPanel4.setBackground(new java.awt.Color(232, 247, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(221, 229, 239));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

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
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
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
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navbtn_bookHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navbtn_Transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(510, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clearFields();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
   
        String vtype = txt_vType.getText();
        String vno =txt_vno.getText();
        String color = txt_color.getText();
        String fuel = txt_fuel.getText();
        int rate = Integer.parseInt(txt_rate.getText());
        String brand = txt_brand.getText();
        String speed = txt_speed.getText();
        String model = txt_vmodel.getText();
        
        addVehicle(vtype, vno,brand,speed, color,fuel,rate,model);
         clearFields();
          
    }//GEN-LAST:event_btn_addActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String vtype = txt_vType.getText();
        String vno =txt_vno.getText();
        String color = txt_color.getText();
        String fuel = txt_fuel.getText();
        int rate = Integer.parseInt(txt_rate.getText());
        String model = txt_vmodel.getText();
        String brand = txt_brand.getText();
        String speed = txt_speed.getText();
        
        update(vtype, vno,brand,speed,color,fuel,rate,model);
         clearFields();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        String searchString = txt_search.getText();
        search(searchString);   
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_vTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vTypeActionPerformed

    private void txt_vnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vnoActionPerformed

    private void tbl_vehicleDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_vehicleDataMouseClicked
     
        int rowNo = tbl_vehicleData.getSelectedRow();
        TableModel model = tbl_vehicleData.getModel();
        
        txt_vType.setText(model.getValueAt(rowNo, 0).toString());
        txt_brand.setText(model.getValueAt(rowNo, 1).toString());
        txt_vmodel.setText(model.getValueAt(rowNo, 2).toString());
        txt_vno.setText(model.getValueAt(rowNo, 3).toString());
        txt_fuel.setText(model.getValueAt(rowNo, 4).toString());
        txt_rate.setText(model.getValueAt(rowNo, 5).toString());    
        txt_color.setText(model.getValueAt(rowNo, 6).toString());
        txt_speed.setText(model.getValueAt(rowNo, 7).toString());

//        txt_vmodel.setText(model.getValueAt(rowNo, 5).toString());
    }//GEN-LAST:event_tbl_vehicleDataMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        String vno =txt_vno.getText();
        delete(vno);
          clearFields();   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_fuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fuelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fuelActionPerformed

    private void navbtn_DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_DashboardActionPerformed
        // TODO add your handling code here:
        new DashboardView().setVisible(true);
        dispose();
    }//GEN-LAST:event_navbtn_DashboardActionPerformed

    private void navbtn_CustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navbtn_CustomersActionPerformed
        // TODO add your handling code here:
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

    }//GEN-LAST:event_navbtn_BillingActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

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
            java.util.logging.Logger.getLogger(VehiclesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehiclesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehiclesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehiclesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehiclesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton navbtn_Billing;
    private javax.swing.JButton navbtn_Booking;
    private javax.swing.JButton navbtn_Customers;
    private javax.swing.JButton navbtn_Dashboard;
    private javax.swing.JButton navbtn_Transactions;
    private javax.swing.JButton navbtn_Vehicles;
    private javax.swing.JButton navbtn_bookHistory;
    private javax.swing.JTable tbl_vehicleData;
    private javax.swing.JTextField txt_brand;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_fuel;
    private javax.swing.JTextField txt_rate;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_speed;
    private javax.swing.JTextField txt_vType;
    private javax.swing.JTextField txt_vmodel;
    private javax.swing.JTextField txt_vno;
    // End of variables declaration//GEN-END:variables

  
}
