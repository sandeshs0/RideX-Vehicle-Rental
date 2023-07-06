package rideex;


import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import rideex.dbconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class add_customer extends javax.swing.JFrame {

    public add_customer() {
        initComponents();
        DefaultTableModel tableModel = (DefaultTableModel) tblcustomer.getModel();
    tableModel.setRowCount(0);

        Connection conn= dbconnection.dbconnect();

       try {
            Statement stmt =conn.createStatement();
            String sql= "select * from add_customer";
             ResultSet rs= stmt.executeQuery(sql);
            while(rs.next()){

            String full_name = String.valueOf(rs.getString("full_name"));
            String phone_number = String.valueOf(rs.getInt("phone_number"));
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
    boolean validation()
        {
            String fname=txtfullname.getText();
            String phn=txtphone.getText();
            String email=txtemail.getText();
           
            if (fname.equals(""))
            {
                JOptionPane.showMessageDialog(this,"please enter firstname");
                return false;
            }
                
                if (phn.equals(""))
            {
                JOptionPane.showMessageDialog(this,"please enter your phone number");
                return false;
            }
//               
                
                if (email.equals(""))
            {
                JOptionPane.showMessageDialog(this,"please enter password");
                return false;
            }
             
           
                else{
                        return true;
                        }
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtfullname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcustomer = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnaddcustomer = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Full Name");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Phone Number");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Email");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("Add New Customer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        tblcustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblcustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FULL NAME", "PHONE NO", "EMAIL"
            }
        ));
        tblcustomer.setRowHeight(25);
        tblcustomer.setSelectionBackground(new java.awt.Color(51, 153, 255));
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

        btnsearch.setBackground(new java.awt.Color(0, 0, 0));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnremove.setBackground(new java.awt.Color(0, 0, 0));
        btnremove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnremove.setForeground(new java.awt.Color(204, 0, 51));
        btnremove.setIcon(new javax.swing.ImageIcon("C:\\Users\\ittra\\Desktop\\remove2.jpg")); // NOI18N
        btnremove.setText("REMOVE");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btnaddcustomer.setBackground(new java.awt.Color(0, 0, 0));
        btnaddcustomer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnaddcustomer.setForeground(new java.awt.Color(0, 153, 204));
        btnaddcustomer.setIcon(new javax.swing.ImageIcon("C:\\Users\\ittra\\Desktop\\addcustomer.png")); // NOI18N
        btnaddcustomer.setText("ADD");
        btnaddcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcustomerActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(0, 0, 0));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 204, 51));
        btnupdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\ittra\\Desktop\\update4.png")); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(0, 0, 0));
        btnreset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 204, 51));
        btnreset.setIcon(new javax.swing.ImageIcon("C:\\Users\\ittra\\Desktop\\clear.png")); // NOI18N
        btnreset.setText("CLEAR");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnaddcustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnremove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(37, 37, 37)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsearch))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnaddcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnremove)))
                    .addComponent(jScrollPane1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcustomerActionPerformed
        boolean srijan = validation();
            if(srijan==true){
                Connection conn= dbconnection.dbconnect();
                try
                {
                    Statement stmt =conn.createStatement();
                    String sql ="insert into add_customer values('"+txtfullname.getText()+"','"+txtphone.getText()+"','"+txtemail.getText()+"')";
                    stmt.executeUpdate(sql);
                    System.out.println("data inserted");
                    JOptionPane.showMessageDialog(this,"succefully inserted", "EMPLOYEE", JOptionPane.INFORMATION_MESSAGE);
                
                    conn.close();
                    
                    reset();
                    
                } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
                DefaultTableModel tableModel = (DefaultTableModel) tblcustomer.getModel();
    tableModel.setRowCount(0);

        Connection conn2= dbconnection.dbconnect();

       try {
            Statement stmt2 =conn2.createStatement();
            String sql= "select * from add_customer";
             ResultSet rs= stmt2.executeQuery(sql);
            while(rs.next()){

            String full_name = String.valueOf(rs.getString("full_name"));
            String phone_number = String.valueOf(rs.getInt("phone_number"));
            String email = String.valueOf(rs.getString("email"));
            
            
            String tbdata[]={full_name,phone_number,email};
                DefaultTableModel tblmodel=(DefaultTableModel)tblcustomer.getModel();
                tblmodel.addRow(tbdata);
                
        }
//            tableModel.fireTableDataChanged();
        conn2.close();
    }                                           
    catch(Exception e)
         {
             System.out.println(e.getMessage());
             
         }
//                try {
//
//            Statement stmt =conn.createStatement();
//            String sql= "select * from add_customer";
//             ResultSet rs= stmt.executeQuery(sql);
//            while(rs.next()){
//
//            String full_name = String.valueOf(rs.getString("full_name"));
//            String phone_number = String.valueOf(rs.getInt("phone_number"));
//            String email = String.valueOf(rs.getString("email"));
//            
//            String tbdata[]={full_name,phone_number,email};
//                DefaultTableModel tblmodel=(DefaultTableModel)tblcustomer.getModel();
//                tblmodel.addRow(tbdata);
//        }
//        conn.close();
//                }
//                
//                catch(Exception e)
//                {
//                    System.out.println(e.getMessage());
//
//                }
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddcustomerActionPerformed
public void clearTable(){
        DefaultTableModel model = (DefaultTableModel)tblcustomer.getModel();
        model.setRowCount(0);    
    }

public void setRecordsToTable(){
    
Connection conn5= dbconnection.dbconnect();
        try{
             Statement stmt5 =conn5.createStatement();
            String sql= "select * from add_customer";
             ResultSet rs= stmt5.executeQuery(sql);
            
            
            while(rs.next()){
                
                String full_name = String.valueOf(rs.getString("full_name"));
            String phone_number = String.valueOf(rs.getInt("phone_number"));
            String email = String.valueOf(rs.getString("email"));
                
                
                Object[] obj = {full_name,phone_number,email};
                
                DefaultTableModel model = (DefaultTableModel)tblcustomer.getModel();
                model.addRow(obj);
            }
        }
        catch(Exception e)
         {
             System.out.println(e.getMessage());
             
         }
}
            
    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        String srch = txtsearch.getText();
        Connection conn3= dbconnection.dbconnect();
        DefaultTableModel tableModel = (DefaultTableModel) tblcustomer.getModel();
    tableModel.setRowCount(0);
                try {
//            Statement stmt3 =conn3.createStatement();
            String sql = "SELECT * FROM add_customer WHERE phone_number = ?";
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

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
            try{
                String fullname =txtfullname.getText();
                String phone =txtphone.getText();
                String email =txtemail.getText();
                Connection conn7= dbconnection.dbconnect();
                PreparedStatement stmt7 = conn7.prepareStatement("UPDATE add_customer set full_name=?,email=? where phone_number=?");
                stmt7.setString(1, fullname);
                stmt7.setString(2, email);
                stmt7.setString(3, phone);
                stmt7.executeUpdate();
                JOptionPane.showMessageDialog(rootPane,"Updated Successfully");               
                conn7.close();
                    
                    reset();
                    
                } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
                DefaultTableModel tableModel = (DefaultTableModel) tblcustomer.getModel();
    tableModel.setRowCount(0);

        Connection conn8= dbconnection.dbconnect();

       try {
            Statement stmt8 =conn8.createStatement();
            String sql= "select * from add_customer";
             ResultSet rs= stmt8.executeQuery(sql);
            while(rs.next()){

            String full_name = String.valueOf(rs.getString("full_name"));
            String phone_number = String.valueOf(rs.getInt("phone_number"));
            String email = String.valueOf(rs.getString("email"));
            
            
            String tbdata[]={full_name,phone_number,email};
                DefaultTableModel tblmodel=(DefaultTableModel)tblcustomer.getModel();
                tblmodel.addRow(tbdata);
                
        }
//            tableModel.fireTableDataChanged();
        conn8.close();
    }                                           
    catch(Exception e)
         {
             System.out.println(e.getMessage());
             
         }
            
            
                        
    }//GEN-LAST:event_btnupdateActionPerformed

             
 public void delete(int phone_number){
        try{
            Connection con4 = dbconnection.dbconnect();
            PreparedStatement pst4 = con4.prepareStatement("delete from add_customer where phone_number = ?");
         
            pst4.setInt(1, phone_number);
            
            int rowCount = pst4.executeUpdate();
            if (rowCount == 1){
                JOptionPane.showMessageDialog(this, "customer deleted sucessfully");                         
                clearTable();
                setRecordsToTable();
            
            }else{
                JOptionPane.showMessageDialog(this, "customer deletion field");
            
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "customer deletion field");
//            e.printStackTrace();
        }       
  
   }
 private void clearFields(){
             txtfullname.setText(null);
             txtphone.setText(null);
             txtemail.setText(null);
 }
             
             
    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
  int phone_number = Integer.parseInt(txtphone.getText());
        
        
        delete(phone_number);
        clearFields();          // TODO add your handling code here:
    }//GEN-LAST:event_btnremoveActionPerformed

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

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
       txtfullname.setText(null);
             txtphone.setText(null);
             txtemail.setText(null);
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(add_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddcustomer;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcustomer;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
