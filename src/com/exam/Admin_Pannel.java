/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;




/**
 *
 * @author rakibul
 */
public class Admin_Pannel extends javax.swing.JFrame {

    public Admin_Pannel() {
        initComponents();
        currentTime();
        add();
       
    
    }
   
    static String rpass="apcl123456";
    
    
    
    String yu;
    String du;
    String mu;
    
    
    
   
     public void currentDate(){
        
        Calendar cal=new GregorianCalendar();
        int yy=cal.get(Calendar.YEAR);
        int m=cal.get(Calendar.MONTH); 
         int d=cal.get(Calendar.DATE);
         
         
          du=String.valueOf(d);
         
            yu=String.valueOf(yy);
            
            
       String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
       
       mu=month[m];
            

        }
    
    int total1=0;
    public void add(){
        
        currentDate();
         try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank","root",rpass);
           PreparedStatement pstmt=con.prepareStatement("SELECT SUM(total),SUM(cost) FROM transaction WHERE date=?");
           
          pstmt.setDate(1, new Date(new java.util.Date(""+du+"-"+mu+"-"+yu+"").getTime()));
           
           ResultSet rs=pstmt.executeQuery();
           
           while(rs.next()){
            int ts1= rs.getInt("SUM(total)");
            int ts2= rs.getInt("SUM(cost)");
          ts.setText(String.valueOf(ts1)+" Tk");  
          tc.setText(String.valueOf(ts2)+" Tk"); 
          int ts3=ts1-ts2;
          tp.setText(String.valueOf(ts3)+" Tk");
          total1=ts1;
          tfttt.setText("Today's Information:");
           }
          
           //Date d=new Date(new java.util.Date("24-February-2018").getTime());
            // System.out.println(d);
           

        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    

   String time;
     public void currentTime(){
         Thread clock =new Thread(){
          public void run(){
              for(;;){
                  time=""+new java.util.Date();
                  y.setText(time);
                  
                  try {
                      sleep(1000);
                  } catch (InterruptedException ex) {
                      Logger.getLogger(Admin_Pannel.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
          }  
            };
         clock.start();
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
        y = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfttt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ts = new javax.swing.JLabel();
        tc = new javax.swing.JLabel();
        tp = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnDate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dateselect = new com.toedter.calendar.JDateChooser();
        btnRef = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        imaGE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Pannel");
        setBounds(new java.awt.Rectangle(350, 50, 0, 0));
        setMinimumSize(new java.awt.Dimension(630, 360));
        setPreferredSize(new java.awt.Dimension(790, 520));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        y.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        y.setForeground(new java.awt.Color(240, 240, 240));
        y.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(y);
        y.setBounds(190, 60, 370, 30);

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/ms.png"))); // NOI18N
        jButton6.setText("Manage SalesMan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(300, 120, 120, 110);

        jButton2.setBackground(new java.awt.Color(153, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/me.jpg"))); // NOI18N
        jButton2.setText("Manage Employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 120, 110, 120);

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/mp.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(170, 310, 100, 110);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/icon-05.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(40, 310, 110, 110);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Report");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 410, 150, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/employee_icon_by_ornorm-d4wep0s.png"))); // NOI18N
        jButton1.setText("New Employee");
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 120, 110, 120);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrator Control Pannel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 20, 390, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add Employee");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 230, 150, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manage Employee");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 230, 150, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manage Sales Dep");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(290, 230, 150, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD Product");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 410, 150, 50);

        tfttt.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 3, 24)); // NOI18N
        tfttt.setForeground(new java.awt.Color(102, 0, 102));
        tfttt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfttt.setText("Today's Information:");
        jPanel1.add(tfttt);
        tfttt.setBounds(520, 110, 250, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Sales:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(540, 150, 80, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total Cost:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(540, 180, 80, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Profit:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(540, 210, 90, 17);

        ts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ts.setForeground(new java.awt.Color(255, 0, 0));
        ts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ts);
        ts.setBounds(630, 150, 150, 20);

        tc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tc.setForeground(new java.awt.Color(255, 0, 0));
        tc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(tc);
        tc.setBounds(630, 180, 150, 20);

        tp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tp.setForeground(new java.awt.Color(255, 0, 0));
        tp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(tp);
        tp.setBounds(630, 210, 150, 20);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(null);

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(240, 240, 240));
        jButton5.setText("LogOut");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(690, 10, 80, 40);

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/refresh.png"))); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset);
        btnReset.setBounds(10, 10, 60, 60);

        btnChange.setBackground(new java.awt.Color(0, 0, 255));
        btnChange.setForeground(new java.awt.Color(240, 240, 240));
        btnChange.setText("Change Password");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        jPanel2.add(btnChange);
        btnChange.setBounds(640, 80, 140, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 790, 100);
        jPanel1.add(tfSearch);
        tfSearch.setBounds(430, 420, 200, 30);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/sss.jpg"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(650, 400, 60, 60);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Enter Transaction Id");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(450, 390, 150, 17);

        btnDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/date.jpg"))); // NOI18N
        btnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateActionPerformed(evt);
            }
        });
        jPanel1.add(btnDate);
        btnDate.setBounds(650, 320, 60, 60);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Select date");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(490, 320, 100, 15);
        jPanel1.add(dateselect);
        dateselect.setBounds(430, 350, 200, 30);

        btnRef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/tn.png"))); // NOI18N
        btnRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefActionPerformed(evt);
            }
        });
        jPanel1.add(btnRef);
        btnRef.setBounds(290, 310, 110, 110);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Manage Product");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(140, 410, 150, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 520);

        imaGE.setBackground(new java.awt.Color(204, 255, 0));
        imaGE.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(imaGE);
        imaGE.setBounds(0, 0, 620, 340);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Manae_employe em=new Manae_employe();
        em.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        Add_Item ms=new Add_Item();
        ms.setVisible(true);
        
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        login l=new login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Manae_sales ms=new Manae_sales();
        ms.setVisible(true);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Emploee_add_admin ad1=new Emploee_add_admin();
        ad1.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained

    }//GEN-LAST:event_jButton1FocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        Manage_product mp=new Manage_product();
        mp.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        String ts=tfSearch.getText();
    if(ts.isEmpty()){
        JOptionPane.showMessageDialog(null,"Enter Transaction Id","Alert",JOptionPane.ERROR_MESSAGE);
    }else{
        
        
        String s1=tfSearch.getText();
       
        transaction_all ta=new transaction_all();
        ta.ctablename(s1);
        ta.showData();
        ta.showTotal();
        ta.setVisible(true);
        tfSearch.setText("");
    }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        add();
        dateselect.cleanup();

    }//GEN-LAST:event_btnResetActionPerformed

    
    
    private void btnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateActionPerformed
        // TODO add your handling code here:

         try{
             
            java.util.Date d1 = dateselect.getDate();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String dt = df.format(d1);
            java.util.Date utild = df.parse(dt);
            java.sql.Date sqlD = new java.sql.Date(new java.util.Date(utild.getTime()).getTime());

          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank","root",rpass);
           PreparedStatement pstmt=con.prepareStatement("SELECT SUM(total),SUM(cost) FROM transaction WHERE date=?");
             pstmt.setDate(1, sqlD);
           ResultSet rs=pstmt.executeQuery();
           
           while(rs.next()){
            int ts1= rs.getInt("SUM(total)");
            int ts2= rs.getInt("SUM(cost)");
            tfttt.setText(String.valueOf(sqlD));
          ts.setText(String.valueOf(ts1)+" Tk");  
          tc.setText(String.valueOf(ts2)+" Tk"); 
          int ts3=ts1-ts2;
          tp.setText(String.valueOf(ts3)+" Tk");
          total1=ts1;
           }
          
           //Date d=new Date(new java.util.Date("24-February-2018").getTime());
            // System.out.println(d);
           
             
        }catch(Exception e){
            e.printStackTrace();
        }
          
       
    }//GEN-LAST:event_btnDateActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        // TODO add your handling code here:

         String str1 = JOptionPane.showInputDialog("Enter Current Password");

          try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank","root",rpass);
           PreparedStatement pstmt=con.prepareStatement("SELECT * FROM admin WHERE pass=?");
            PreparedStatement pstmt1=con.prepareStatement("UPDATE admin SET pass=? WHERE pass=?");
           
           pstmt.setString(1, str1);
           ResultSet rs=pstmt.executeQuery();
           if(rs.next()){
               String cp=rs.getString("pass");
              String np1 = JOptionPane.showInputDialog("Enter New Password"); 
              String np2 = JOptionPane.showInputDialog("Confirm Password");
              if(np1.equals(np2)){
                  
                  pstmt1.setString(1, np2);
                   pstmt1.setString(2, str1);
                   int i=pstmt1.executeUpdate();
                  if(i>0){
                   JOptionPane.showMessageDialog(null, "Password Change Succefully");
                   login l=new login();
                   l.setVisible(true);
                   dispose();
                  }
                  
              }else{
               JOptionPane.showMessageDialog(null, "Password Not Matched","Alert",JOptionPane.ERROR_MESSAGE);
           }
               
           }else{
               JOptionPane.showMessageDialog(null, "password Wrong","Alert",JOptionPane.WARNING_MESSAGE);
           }

             
        }catch(Exception e){
            e.printStackTrace();
        }
          
         
         
         
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefActionPerformed
        // TODO add your handling code here:
        
         Transaction tn=new Transaction();
        tn.setVisible(true);
        
    }//GEN-LAST:event_btnRefActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Pannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Pannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Pannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Pannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Pannel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDate;
    private javax.swing.JButton btnRef;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private com.toedter.calendar.JDateChooser dateselect;
    private javax.swing.JLabel imaGE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel tc;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JLabel tfttt;
    private javax.swing.JLabel tp;
    private javax.swing.JLabel ts;
    private javax.swing.JLabel y;
    // End of variables declaration//GEN-END:variables
}
