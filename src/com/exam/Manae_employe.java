/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author rakibul
 */
public class Manae_employe extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Pannel
     */
    public Manae_employe() {
        initComponents();
    }

     String uv="";
         public void t_idAdd(){
      try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank","root",Admin_Pannel.rpass);
            
            PreparedStatement pstmt=con.prepareStatement("SELECT MAX(em_id)FROM employee");
            ResultSet rs=pstmt.executeQuery();
            String max_tid;
            while(rs.next()){
            max_tid=rs.getString("MAX(em_id)");
            if(max_tid==null){
                max_tid="999";}else{
               max_tid=rs.getString("MAX(em_id)");
            }
            int in=Integer.parseInt(max_tid);
            int i2=in+1;
            String id_s=String.valueOf(i2);
            uv=id_s;
          
           }
          
           //System.out.println("Hello"+uv);
      }catch(Exception e){
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfPhoto = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        tfFather = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfMother = new javax.swing.JTextField();
        tfGender = new javax.swing.JTextField();
        tfMobile = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfDigi = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        tfSalary = new javax.swing.JTextField();
        tfJd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mange Employee");
        setBounds(new java.awt.Rectangle(350, 50, 0, 0));
        setMinimumSize(new java.awt.Dimension(600, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Employee id:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 28, 110, 30);

        tf_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_id.setForeground(new java.awt.Color(204, 0, 0));
        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });
        tf_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_idKeyReleased(evt);
            }
        });
        getContentPane().add(tf_id);
        tf_id.setBounds(148, 30, 186, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 92, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Father:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 132, 40, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Mother:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(68, 181, 60, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Gender:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(68, 228, 60, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Mobile:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(68, 275, 60, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("E-Mail:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(68, 322, 40, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Salary:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 464, 60, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Address:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(58, 361, 70, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Joining Date:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(48, 517, 90, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Photo:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(443, 134, 52, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Designation");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 408, 80, 15);

        tfPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 0), null));
        getContentPane().add(tfPhoto);
        tfPhoto.setBounds(378, 157, 180, 190);

        btnUpdate.setBackground(new java.awt.Color(0, 0, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(240, 240, 240));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(378, 37, 77, 30);

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(240, 240, 240));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(465, 37, 70, 30);
        getContentPane().add(tfFather);
        tfFather.setBounds(148, 126, 186, 33);
        getContentPane().add(tfName);
        tfName.setBounds(148, 79, 186, 33);
        getContentPane().add(tfMother);
        tfMother.setBounds(148, 173, 186, 33);
        getContentPane().add(tfGender);
        tfGender.setBounds(148, 220, 186, 33);
        getContentPane().add(tfMobile);
        tfMobile.setBounds(148, 267, 186, 33);
        getContentPane().add(tfEmail);
        tfEmail.setBounds(148, 314, 186, 33);
        getContentPane().add(tfDigi);
        tfDigi.setBounds(148, 400, 186, 33);
        getContentPane().add(tfAddress);
        tfAddress.setBounds(148, 353, 186, 33);
        getContentPane().add(tfSalary);
        tfSalary.setBounds(148, 456, 186, 33);
        getContentPane().add(tfJd);
        tfJd.setBounds(148, 509, 186, 33);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Password:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 565, 70, 20);
        getContentPane().add(tfPassword);
        tfPassword.setBounds(150, 560, 180, 30);

        jLabel13.setBackground(new java.awt.Color(102, 255, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/e.jpg"))); // NOI18N
        jLabel13.setMinimumSize(new java.awt.Dimension(630, 540));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, -10, 590, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_idKeyReleased
        // TODO add your handling code here:
        try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank","root",Admin_Pannel.rpass);
            PreparedStatement pstmt=con.prepareStatement("SELECT * FROM employee WHERE em_id=?");
            pstmt.setString(1, tf_id.getText());
            ResultSet rs=pstmt.executeQuery();
            if (rs.next()){
                String name=rs.getString("em_name");
                tfName.setText(name);
                String father=rs.getString("father");
                tfFather.setText(father);
                String mother=rs.getString("mother");
                tfMother.setText(mother);
                String gender=rs.getString("gender");
                tfGender.setText(gender);
                
                String mobile=rs.getString("mobile");
                tfMobile.setText(mobile);
                
                 String email=rs.getString("email");
                tfEmail.setText(email);
                
                String add=rs.getString("address");
                tfAddress.setText(add);
                
                String dig=rs.getString("digisnation");
                tfDigi.setText(dig);
                int sal=rs.getInt("salary");
                tfSalary.setText(String.valueOf(sal));
                Date jd=rs.getDate("joining_date");
                tfJd.setText(String.valueOf(jd));
                String pass=rs.getString("password");
                tfPassword.setText(pass);
                
                byte[] ima=rs.getBytes("photo");
                Image imag=Toolkit.getDefaultToolkit().createImage(ima);
                ImageIcon icon=new ImageIcon(imag);
                tfPhoto.setIcon(icon);
                
                
            }else{
                tfName.setText("");
                tfFather.setText("");
                tfMother.setText("");
                tfGender.setText("");
                tfMobile.setText("");
                tfEmail.setText("");
                tfAddress.setText("");
                tfDigi.setText("");
                tfSalary.setText("");
                tfJd.setText("");
                tfPassword.setText("");
               // tfPhoto.setText("C:\\Users\\rakibul\\Documents\\NetBeansProjects\\My_Bank\\Image\\2.jpg");
                
                String s5="";
                 s5 = "C:\\Users\\rakibul\\Documents\\NetBeansProjects\\My_Bank\\Image\\2.jpg";
      
                 tfPhoto.setIcon(new ImageIcon(s5));
                
            }
          
            
            

            
        }catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_tf_idKeyReleased

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
         try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank","root",Admin_Pannel.rpass);
          PreparedStatement pstmt=con.prepareStatement("UPDATE employee SET em_name=?,father=?,mother=?,gender=?,mobile=?,email=?,address=?,digisnation=?,salary=?,password=? WHERE em_id=?");
           
          pstmt.setString(1, tfName.getText());
          pstmt.setString(2, tfFather.getText());
          pstmt.setString(3, tfMother.getText());
          pstmt.setString(4, tfGender.getText());
          pstmt.setString(5, tfMobile.getText());
          pstmt.setString(6, tfEmail.getText());
          pstmt.setString(7, tfAddress.getText());
          pstmt.setString(8, tfDigi.getText());
          
          String s1=tfSalary.getText();
          int sal=Integer.parseInt(s1);
          pstmt.setInt(9,sal);
          pstmt.setString(10,tfPassword.getText());
          pstmt.setString(11, tf_id.getText());
          
          int i=pstmt.executeUpdate();
          if(i>0){
              JOptionPane.showMessageDialog(null, "Update success");
          }

            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank","root",Admin_Pannel.rpass);
          PreparedStatement pstmt=con.prepareStatement("DELETE FROM employee WHERE em_id=?");
           
         pstmt.setString(1, tf_id.getText());
          
          int i=pstmt.executeUpdate();
          if(i>0){
              
              tfName.setText("");
                tfFather.setText("");
                tfMother.setText("");
                tfGender.setText("");
                tfMobile.setText("");
                tfEmail.setText("");
                tfAddress.setText("");
                tfDigi.setText("");
                tfSalary.setText("");
                tfJd.setText("");
                tfPassword.setText("");
               // tfPhoto.setText("C:\\Users\\rakibul\\Documents\\NetBeansProjects\\My_Bank\\Image\\2.jpg");
                
                String s5="";
                 s5 = "C:\\Users\\rakibul\\Documents\\NetBeansProjects\\My_Bank\\Image\\2.jpg";
      
                 tfPhoto.setIcon(new ImageIcon(s5));
              JOptionPane.showMessageDialog(null, "Deleted");
          }

            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed
        String st="";
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
            java.util.logging.Logger.getLogger(Manae_employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manae_employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manae_employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manae_employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manae_employe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfDigi;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFather;
    private javax.swing.JTextField tfGender;
    private javax.swing.JTextField tfJd;
    private javax.swing.JTextField tfMobile;
    private javax.swing.JTextField tfMother;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JLabel tfPhoto;
    private javax.swing.JTextField tfSalary;
    private javax.swing.JTextField tf_id;
    // End of variables declaration//GEN-END:variables
}
