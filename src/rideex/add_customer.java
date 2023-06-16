
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtfullname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        btnaddcustomer = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcustomer = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnaddcustomer.setBackground(new java.awt.Color(0, 0, 0));
        btnaddcustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnaddcustomer.setText("Add Customer");
        btnaddcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcustomerActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Full Name");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Phone Number");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Email");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Add New Customer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel11)
                                    .addGap(38, 38, 38))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnaddcustomer)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtphone, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                            .addComponent(txtemail)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addGap(7, 7, 7)
                .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnaddcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        tblcustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "full_name", "phone_number", "email"
            }
        ));
        jScrollPane1.setViewportView(tblcustomer);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
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

        Connection conn1= dbconnection.dbconnect();

       try {
            Statement stmt1 =conn1.createStatement();
            String sql= "select * from add_customer";
             ResultSet rs= stmt1.executeQuery(sql);
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

    public void reset()
{
    txtemail.setText("");
    txtfullname.setText("");
    txtphone.setText("");
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblcustomer;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
