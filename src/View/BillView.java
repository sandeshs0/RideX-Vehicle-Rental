/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.BookingSlipModel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author hello
 */
public class BillView extends javax.swing.JFrame {
    private BookingSlipModel bsv1;
    /**
     * Creates new form BookingSlipView
     */
    public BillView() {
        initComponents();
        setTitle("Payment Receipt");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo.png")));

    }
    
    public void setBookingSlipViewModel(BookingSlipModel bsv1){
        this.bsv1=bsv1;
        updateLabels();
    }
   
    private void updateLabels(){
        String vehicleNo=bsv1.getVechicleNumber();
        String brand=bsv1.getBrand();
        String model=bsv1.getModel();
        String specialReq=bsv1.getSpecial_request();
        String borrowDate=bsv1.getBorrow_date();
        String returnDate=bsv1.getReturn_date();
        String cusName=bsv1.getCustomer_name();
        String cusPhone=bsv1.getCustomer_number();
        String tot=bsv1.getTotal();
        int bookingID=bsv1.getBookingId();
        String advAmt=bsv1.getAdvancePayment();
        String collateral=bsv1.getCollateral();
        
//        setting the fields:
setFields(vehicleNo,brand,model,specialReq,borrowDate,returnDate,cusName,cusPhone,tot,bookingID,advAmt,collateral);
    }
    
public void setFields(String Vno,String Brand,String Model,String SpecialReq,String BorrowDate,String ReturnDate,String CusName,String CusPhone,String Total, int bookingId, String advAmt,String Collateral){
//    slip_vehicleNo.setText(Vno);
//    slip_brand.setText(Brand);
//    slip_model.setText(Model);
////    slip_specialReq1.setText(SpecialReq);
//    slip_borrowDate1.setText(BorrowDate);
//    slip_returnDate1.setText(ReturnDate);
//    slip_cusName1.setText(CusName);
//    slip_cusPhone1.setText(CusPhone);
//    slip_Total.setText(String.valueOf(Total));
//    slip_bookingNo.setText(String.valueOf(bookingId));
//    slip_advanceAmt.setText(advAmt);
////    slip_collateral.setText(Collateral);
//    double dues=Double.parseDouble(Total)-Double.parseDouble(advAmt);
//    slip_DueRemaining.setText(String.valueOf(dues));
}
 public void printSlip() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return NO_SUCH_PAGE;
                }

                Graphics2D g2d = (Graphics2D) graphics;
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                slipPannel.printAll(graphics);

                return PAGE_EXISTS;
            }
        });

        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    }
 
// To save as PDF
 public static void savePanelAsPDF(JPanel panel, String filePath) {
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            com.itextpdf.text.pdf.PdfContentByte contentByte = writer.getDirectContent();
            com.itextpdf.text.pdf.PdfTemplate template = contentByte.createTemplate(panel.getWidth(), panel.getHeight());
            Graphics2D g2d = template.createGraphics(panel.getWidth(), panel.getHeight());
            panel.print(g2d);
            g2d.dispose();
            contentByte.addTemplate(template, 0, 0);
JOptionPane.showMessageDialog(null, "PDF has been Saved to the Device!");
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document != null) {
                document.close();
            }
        }}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_printSlip = new javax.swing.JButton();
        btn_savePDF = new javax.swing.JButton();
        slipPannel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        slip_advanceAmt = new javax.swing.JLabel();
        slip_DueRemaining = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        slip_vehicleNo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        slip_brand = new javax.swing.JLabel();
        slip_model = new javax.swing.JLabel();
        slip_borrowDate1 = new javax.swing.JLabel();
        slip_cusName1 = new javax.swing.JLabel();
        slip_cusPhone1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        slip_Total = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        slip_advanceAmt1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        slip_advanceAmt2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        slip_advanceAmt3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        slip_advanceAmt4 = new javax.swing.JLabel();
        slip_advanceAmt5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        slip_borrowDate2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        slip_advanceAmt6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1272, 761));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(224, 248, 255));
        jPanel1.setLayout(null);

        btn_printSlip.setBackground(new java.awt.Color(0, 69, 64));
        btn_printSlip.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btn_printSlip.setForeground(new java.awt.Color(255, 255, 255));
        btn_printSlip.setText("Print Bill");
        btn_printSlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printSlipActionPerformed(evt);
            }
        });
        jPanel1.add(btn_printSlip);
        btn_printSlip.setBounds(390, 10, 140, 40);

        btn_savePDF.setBackground(new java.awt.Color(0, 0, 0));
        btn_savePDF.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btn_savePDF.setForeground(new java.awt.Color(255, 255, 255));
        btn_savePDF.setText("Save PDF");
        btn_savePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_savePDFActionPerformed(evt);
            }
        });
        jPanel1.add(btn_savePDF);
        btn_savePDF.setBounds(90, 10, 140, 40);

        slipPannel.setBackground(new java.awt.Color(255, 255, 255));
        slipPannel.setMaximumSize(new java.awt.Dimension(62767, 62767));
        slipPannel.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(23, 0, 57));

        jLabel1.setBackground(new java.awt.Color(0, 51, 68));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment Receipt");

        jLabel2.setBackground(new java.awt.Color(0, 51, 68));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Payment Receipt");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(672, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        slipPannel.add(jPanel2);
        jPanel2.setBounds(0, 0, 1270, 60);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 40, 107));
        jLabel3.setText("RideX Vehicle Rental Management System");
        slipPannel.add(jLabel3);
        jLabel3.setBounds(80, 70, 440, 30);

        slip_advanceAmt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_advanceAmt.setForeground(new java.awt.Color(0, 102, 153));
        slip_advanceAmt.setText("Rs. 22261.0");
        slipPannel.add(slip_advanceAmt);
        slip_advanceAmt.setBounds(250, 590, 200, 40);

        slip_DueRemaining.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_DueRemaining.setText("-");
        slipPannel.add(slip_DueRemaining);
        slip_DueRemaining.setBounds(750, 520, 210, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Brand:");
        slipPannel.add(jLabel6);
        jLabel6.setBounds(120, 150, 160, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Model:");
        slipPannel.add(jLabel7);
        jLabel7.setBounds(120, 190, 160, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Rented Days:");
        slipPannel.add(jLabel10);
        jLabel10.setBounds(120, 270, 180, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Borrow Date:");
        slipPannel.add(jLabel11);
        jLabel11.setBounds(120, 230, 160, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Customer Name:");
        slipPannel.add(jLabel12);
        jLabel12.setBounds(120, 310, 200, 40);

        slip_vehicleNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_vehicleNo.setForeground(new java.awt.Color(0, 102, 153));
        slip_vehicleNo.setText("BA 46 Cha 8756");
        slipPannel.add(slip_vehicleNo);
        slip_vehicleNo.setBounds(260, 110, 240, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Vehicle No.:");
        slipPannel.add(jLabel14);
        jLabel14.setBounds(120, 110, 160, 40);

        slip_brand.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_brand.setForeground(new java.awt.Color(0, 102, 153));
        slip_brand.setText("Mercedes");
        slipPannel.add(slip_brand);
        slip_brand.setBounds(210, 150, 240, 40);

        slip_model.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_model.setForeground(new java.awt.Color(0, 102, 153));
        slip_model.setText("S-Class");
        slipPannel.add(slip_model);
        slip_model.setBounds(210, 190, 240, 40);

        slip_borrowDate1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_borrowDate1.setForeground(new java.awt.Color(0, 102, 153));
        slip_borrowDate1.setText("8");
        slipPannel.add(slip_borrowDate1);
        slip_borrowDate1.setBounds(280, 270, 230, 40);

        slip_cusName1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_cusName1.setForeground(new java.awt.Color(0, 102, 153));
        slip_cusName1.setText(" Ramesh Rimal");
        slipPannel.add(slip_cusName1);
        slip_cusName1.setBounds(310, 310, 240, 40);

        slip_cusPhone1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_cusPhone1.setForeground(new java.awt.Color(0, 102, 153));
        slip_cusPhone1.setText("Rs. 2400");
        slipPannel.add(slip_cusPhone1);
        slip_cusPhone1.setBounds(300, 390, 240, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Customer Phone:");
        slipPannel.add(jLabel15);
        jLabel15.setBounds(120, 350, 200, 40);

        slip_Total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_Total.setForeground(new java.awt.Color(0, 102, 153));
        slip_Total.setText("9841494890");
        slipPannel.add(slip_Total);
        slip_Total.setBounds(310, 350, 230, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Tax:");
        slipPannel.add(jLabel16);
        jLabel16.setBounds(120, 430, 200, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Rate:");
        slipPannel.add(jLabel17);
        jLabel17.setBounds(120, 390, 200, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Late Fee:");
        slipPannel.add(jLabel18);
        jLabel18.setBounds(120, 590, 210, 40);

        slip_advanceAmt1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_advanceAmt1.setForeground(new java.awt.Color(0, 102, 153));
        slip_advanceAmt1.setText("Rs. 2561");
        slipPannel.add(slip_advanceAmt1);
        slip_advanceAmt1.setBounds(300, 430, 200, 40);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Advance Amount:");
        slipPannel.add(jLabel20);
        jLabel20.setBounds(120, 550, 210, 40);

        slip_advanceAmt2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_advanceAmt2.setForeground(new java.awt.Color(0, 102, 153));
        slip_advanceAmt2.setText("Rs. 5000");
        slipPannel.add(slip_advanceAmt2);
        slip_advanceAmt2.setBounds(330, 550, 200, 40);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("Booking Amount:");
        slipPannel.add(jLabel21);
        jLabel21.setBounds(120, 510, 210, 40);

        slip_advanceAmt3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_advanceAmt3.setForeground(new java.awt.Color(0, 102, 153));
        slip_advanceAmt3.setText("Rs. 22610.0 ");
        slipPannel.add(slip_advanceAmt3);
        slip_advanceAmt3.setBounds(330, 510, 200, 40);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("Surcharge:");
        slipPannel.add(jLabel19);
        jLabel19.setBounds(120, 470, 210, 40);

        slip_advanceAmt4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_advanceAmt4.setForeground(new java.awt.Color(0, 102, 153));
        slip_advanceAmt4.setText("Rs. 500");
        slipPannel.add(slip_advanceAmt4);
        slip_advanceAmt4.setBounds(260, 470, 200, 40);

        slip_advanceAmt5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_advanceAmt5.setForeground(new java.awt.Color(0, 102, 153));
        slip_advanceAmt5.setText("Rs. 25861");
        slipPannel.add(slip_advanceAmt5);
        slip_advanceAmt5.setBounds(270, 670, 200, 40);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Total Paid:");
        slipPannel.add(jLabel22);
        jLabel22.setBounds(120, 670, 210, 40);

        slip_borrowDate2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_borrowDate2.setForeground(new java.awt.Color(0, 102, 153));
        slip_borrowDate2.setText("2023-8-11");
        slipPannel.add(slip_borrowDate2);
        slip_borrowDate2.setBounds(280, 230, 230, 40);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setText("Remaining Paid:");
        slipPannel.add(jLabel23);
        jLabel23.setBounds(120, 630, 210, 40);

        slip_advanceAmt6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        slip_advanceAmt6.setForeground(new java.awt.Color(0, 102, 153));
        slip_advanceAmt6.setText("Rs. 20861.0");
        slipPannel.add(slip_advanceAmt6);
        slip_advanceAmt6.setBounds(310, 630, 200, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slipPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(slipPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(674, 827));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_printSlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printSlipActionPerformed
printSlip();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_printSlipActionPerformed

    private void btn_savePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_savePDFActionPerformed
//        String pathToSavePDF="C:\\Users\\hello\\OneDrive\\Documents\\BookingSlips\\slip.pdf";
        String pathToSavePDF="C: \\Users\\hello\\OneDrive\\Documents\\RideXBill\bill.pdf";
        savePanelAsPDF(slipPannel,pathToSavePDF);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_savePDFActionPerformed

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
            java.util.logging.Logger.getLogger(BillView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_printSlip;
    private javax.swing.JButton btn_savePDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel slipPannel;
    private javax.swing.JLabel slip_DueRemaining;
    private javax.swing.JLabel slip_Total;
    private javax.swing.JLabel slip_advanceAmt;
    private javax.swing.JLabel slip_advanceAmt1;
    private javax.swing.JLabel slip_advanceAmt2;
    private javax.swing.JLabel slip_advanceAmt3;
    private javax.swing.JLabel slip_advanceAmt4;
    private javax.swing.JLabel slip_advanceAmt5;
    private javax.swing.JLabel slip_advanceAmt6;
    private javax.swing.JLabel slip_borrowDate1;
    private javax.swing.JLabel slip_borrowDate2;
    private javax.swing.JLabel slip_brand;
    private javax.swing.JLabel slip_cusName1;
    private javax.swing.JLabel slip_cusPhone1;
    private javax.swing.JLabel slip_model;
    private javax.swing.JLabel slip_vehicleNo;
    // End of variables declaration//GEN-END:variables
}
