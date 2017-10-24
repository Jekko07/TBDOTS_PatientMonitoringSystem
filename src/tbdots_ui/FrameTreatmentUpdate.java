/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbdots_ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.sql.DriverManager.getConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jekko
 */ 
public class FrameTreatmentUpdate extends javax.swing.JFrame {
    java.sql.Connection conn  = null;
    java.sql.Statement stmt = null;
    static String url = "jdbc:sqlite:C:\\Users\\Jekko\\Documents\\NetBeansProjects\\TBDOTS_UI\\src\\tbdots_ui\\db.sqlite";
    
    String[][] records;

    /**
     * Creates new form FrameTreatmentUpdate
     */
    public FrameTreatmentUpdate() {
        initComponents();
        setCenterFrame();
        changeIcon();
        this.setResizable(false);
    }
    public void setCenterFrame(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    public void changeIcon(){
        ImageIcon icon = new ImageIcon("src/TBDOTS_UI/ddhlogo1.jpg");
        this.setIconImage(icon.getImage());
    }
    
     void setComboBox(){
       
                
        if(SQLite.openDB()){
            records = SQLite.read("Doctor");
            String[] doctors = new String[records.length+1];
            doctors[0] = " ";
            for(int i=1,j=0;j<records.length;i++,j++){
                doctors[i] = records[j][2]+", "+records[j][1]+" "+records[j][3];
            }
            

            cmdDoctors.setModel(new javax.swing.DefaultComboBoxModel(doctors));
            SQLite.closeDB();
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTreatmentID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jEndTreatment = new com.toedter.calendar.JDateChooser();
        jStartTreatment = new com.toedter.calendar.JDateChooser();
        lblFirstname = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        lblMiddlename = new javax.swing.JLabel();
        lblLastname = new javax.swing.JLabel();
        cmdDoctors = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblDoctorID = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLastVisit = new com.toedter.calendar.JDateChooser();
        lblBack = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnUpdateDoc = new javax.swing.JButton();
        lblPatientID = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PATIENT ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Doctor ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Start Treatment");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        txtTreatmentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTreatmentIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtTreatmentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 90, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("FIRSTNAME:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("MIDDLENAME: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("LASTNAME:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Last Visit");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("End Treatment");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, 20));
        getContentPane().add(jEndTreatment, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 141, 30));
        getContentPane().add(jStartTreatment, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 141, 30));

        lblFirstname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFirstname.setText("firstname");
        getContentPane().add(lblFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 69, -1));

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 70, 30));

        lblMiddlename.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMiddlename.setText("middlename");
        getContentPane().add(lblMiddlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, 20));

        lblLastname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLastname.setText("lastname");
        getContentPane().add(lblLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        cmdDoctors.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmdDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDoctorsActionPerformed(evt);
            }
        });
        getContentPane().add(cmdDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 190, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setText("UPDATE TREATMENT DATES");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 690, 40));

        jPanel6.setBackground(new java.awt.Color(54, 33, 89));
        jPanel6.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 20));

        jPanel3.setBackground(new java.awt.Color(54, 33, 89));
        jPanel3.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 700, 20));

        lblDoctorID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDoctorID.setText("0");
        getContentPane().add(lblDoctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 30, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Fullname:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));
        getContentPane().add(jLastVisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 141, 30));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/icons8_Return_50px.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tbdots_ui/icons8_Cancel_52px_2.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        btnReset.setBackground(new java.awt.Color(255, 102, 102));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, 120, 40));

        btnUpdateDoc.setBackground(new java.awt.Color(255, 255, 0));
        btnUpdateDoc.setText("UPDATE");
        btnUpdateDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDocActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 130, 50));

        lblPatientID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPatientID.setText("ID");
        getContentPane().add(lblPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("TREATMENT ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTreatmentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTreatmentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTreatmentIDActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        try {

            SQLite.conn = getConnection(SQLite.url);
            SQLite.stmt = SQLite.conn.createStatement();

            //            int id = Integer.parseInt(this.txtUpdateID.getText());
            int id = Integer.parseInt(txtTreatmentID.getText());
            java.sql.ResultSet rs = SQLite.stmt.executeQuery("SELECT * FROM Treatment WHERE TREATMENTID="+id+"");
            while(rs.next()){
                String PatientID = rs.getString("PATIENTID");
//                String firstname = rs.getString("FIRSTNAME");
//                String middlename = rs.getString("MIDDLENAME");
//                String lastname = rs.getString("LASTNAME");
//                String DoctorID = rs.getString("DOCTORID");
                String starttreat = rs.getString("START_TREATMENT");
                String last_visit = rs.getString("LAST_VISIT");
                String end_treatment = rs.getString("END_TREATMENT");
                
                try{

                }catch(Exception e){

                }
                lblPatientID.setText(PatientID);
//                lblFirstname.setText(firstname);
//                lblMiddlename.setText(middlename);
//                lblLastname.setText(lastname);
//                lblDoctorID.setText(DoctorID);
                cmdDoctors.getComponent(id);
                Date justart = new SimpleDateFormat("yyyy-MM-dd").parse(starttreat);
                jStartTreatment.setDate(justart);
                Date julast = new SimpleDateFormat("yyyy-MM-dd").parse(last_visit);
                jStartTreatment.setDate(julast);
                Date juend = new SimpleDateFormat("yyyy-MM-dd").parse(end_treatment);
                jStartTreatment.setDate(juend);
                
                

            }
            conn.close();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void cmdDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDoctorsActionPerformed
        int selectedIndex = cmdDoctors.getSelectedIndex();
        if(selectedIndex>0){
            lblDoctorID.setText(records[selectedIndex-1][0]);
        }
    }//GEN-LAST:event_cmdDoctorsActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        FrameTreatment F1 = new FrameTreatment();
        F1.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.txtTreatmentID.setText("");
        this.lblFirstname.setText("");
        this.lblMiddlename.setText("");
        this.lblLastname.setText("");
        this.lblDoctorID.setText("");
        this.cmdDoctors.setSelectedIndex(0);
        //reset jdatechooser text
        jStartTreatment.setDate(null);
        jLastVisit.setDate(null);
        jEndTreatment.setDate(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDocActionPerformed
        if(SQLite.openDB()){
            int TreatmentID = Integer.parseInt(this.txtTreatmentID.getText());
            
            String doctor = lblDoctorID.getText();
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String starttreatment = dateFormat.format(jStartTreatment.getDate());
            
            SimpleDateFormat dateFormats = new SimpleDateFormat("yyyy-MM-dd");
            String last_visit = dateFormats.format(jLastVisit.getDate());
            
            SimpleDateFormat dateFormated = new SimpleDateFormat("yyyy-MM-dd");
            String endtreatment = dateFormated.format(jEndTreatment.getDate());
            
            String set = "TREATMENTID = '"+TreatmentID+"'"+", DOCTORNO = '"+doctor+"'"+", START_TREATMENT='"+starttreatment+"',"+"LASTVISIT='"+last_visit+"'"+",END_TREATMENT='"+endtreatment+"'";
            //            String values = id +"," +"'" + firstname +"'"+","+"'"+middlename+"'"+","+"'"+lastname+"'" +","+"'"+sex+"'" +","+"'"+contactNo+"'" +","+"'"+specialization+"'";
            
            
            System.out.println(set);
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Please Confirm Action", "Would you like to Update?", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION) {
                System.out.println("Yes");
                SQLite.updateTreatment("Info",set, TreatmentID);
            } else if(dialogResult == JOptionPane.NO_OPTION){
                System.out.println("NO");
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, "Error!!");
            }

            if(SQLite.updateTreatment("Treatment", set, TreatmentID)){
                javax.swing.JOptionPane.showMessageDialog(null, "Patient Treatment has been updated!");
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, "Error!");
            }
            SQLite.closeDB();
        }
    }//GEN-LAST:event_btnUpdateDocActionPerformed

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
            java.util.logging.Logger.getLogger(FrameTreatmentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTreatmentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTreatmentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTreatmentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTreatmentUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdateDoc;
    private javax.swing.JComboBox cmdDoctors;
    private com.toedter.calendar.JDateChooser jEndTreatment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jLastVisit;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSplitPane jSplitPane1;
    private com.toedter.calendar.JDateChooser jStartTreatment;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDoctorID;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblMiddlename;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JTextField txtTreatmentID;
    // End of variables declaration//GEN-END:variables
}
