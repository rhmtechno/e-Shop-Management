/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import static com.exam.Admin_Pannel.rpass;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rakibul
 */
public class Manager_pannel extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Pannel
     */
    public Manager_pannel() {
        initComponents();
        currentTime();
       add();
    }
    
    
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
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank","root",Admin_Pannel.rpass);
           PreparedStatement pstmt=con.prepareStatement("SELECT SUM(total),SUM(cost) FROM transaction WHERE date=?");
           
          pstmt.setDate(1, new java.sql.Date(new java.util.Date(""+du+"-"+mu+"-"+yu+"").getTime()));
           
           ResultSet rs=pstmt.executeQuery();
           
           while(rs.next()){
            int ts1= rs.getInt("SUM(total)");
            int ts2= rs.getInt("SUM(cost)");
          ts.setText(String.valueOf(ts1)+" Tk");  
          tc.setText(String.valueOf(ts2)+" Tk"); 
          int ts3=ts1-ts2;
          tp.setText(String.valueOf(ts3)+" Tk");
          total1=ts1;
          tftt.setText("Today's Information:");
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
    
    
    
    
  String wel="";
    public void wel(String b){
        y1.setText("Welcome "+b);
        wel=b;
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
        y1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        imaGE = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        tftt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ts = new javax.swing.JLabel();
        tc = new javax.swing.JLabel();
        tp = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dateselect = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager Pannel");
        setBounds(new java.awt.Rectangle(350, 50, 0, 0));
        setMinimumSize(new java.awt.Dimension(820, 470));

        jPanel1.setBackground(new java.awt.Color(204, 255, 0));
        jPanel1.setLayout(null);

        y1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(y1);
        y1.setBounds(0, 80, 220, 30);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Manager Control Pannel");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(210, 0, 480, 40);

        y.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        y.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(y);
        y.setBounds(230, 40, 310, 30);

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(240, 240, 240));
        jButton5.setText("LogOut");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(720, 10, 80, 40);

        imaGE.setBackground(new java.awt.Color(204, 255, 0));
        jPanel3.add(imaGE);
        imaGE.setBounds(0, -10, 800, 450);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/refresh.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(10, 10, 60, 60);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 820, 80);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/ms.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(70, 280, 80, 70);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/employee_icon_by_ornorm-d4wep0s.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(80, 150, 70, 70);

        btnAddItem.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnAddItem.setForeground(new java.awt.Color(0, 0, 255));
        btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/icon-05.png"))); // NOI18N
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddItem);
        btnAddItem.setBounds(190, 150, 80, 70);

        btnManage.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnManage.setForeground(new java.awt.Color(0, 51, 51));
        btnManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/mp.png"))); // NOI18N
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        jPanel1.add(btnManage);
        btnManage.setBounds(190, 270, 80, 80);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Enter Transaction Id");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(540, 370, 150, 17);
        jPanel1.add(tfSearch);
        tfSearch.setBounds(520, 400, 200, 30);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/sss.jpg"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(740, 370, 60, 60);

        tftt.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 3, 24)); // NOI18N
        tftt.setForeground(new java.awt.Color(102, 0, 102));
        tftt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tftt.setText("Today's Information:");
        jPanel1.add(tftt);
        tftt.setBounds(480, 110, 250, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Sales:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(510, 150, 80, 17);

        ts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ts.setForeground(new java.awt.Color(255, 0, 0));
        ts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ts);
        ts.setBounds(600, 150, 150, 20);

        tc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tc.setForeground(new java.awt.Color(255, 0, 0));
        tc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(tc);
        tc.setBounds(600, 180, 150, 20);

        tp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tp.setForeground(new java.awt.Color(255, 0, 0));
        tp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(tp);
        tp.setBounds(600, 210, 150, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Profit:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(510, 210, 90, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total Cost:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(510, 180, 80, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Manage Product");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 360, 130, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sales Person");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 230, 110, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Daily Report");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 230, 130, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Manage Emloyee");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 360, 120, 20);

        btnDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/date.jpg"))); // NOI18N
        btnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateActionPerformed(evt);
            }
        });
        jPanel1.add(btnDate);
        btnDate.setBounds(740, 290, 60, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Select date");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(580, 290, 100, 15);
        jPanel1.add(dateselect);
        dateselect.setBounds(520, 310, 200, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/tn.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(300, 150, 80, 70);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("New Product");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(180, 230, 130, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SalesMan_add_Manager ad1=new SalesMan_add_Manager();
        ad1.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Manae_sales em=new Manae_sales();
        em.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        Add_Item ad=new Add_Item();
        ad.setVisible(true);
        ad.name(wel);
        
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
        
          Manage_product mp=new Manage_product();
        mp.setVisible(true);
          mp.name(wel);
        
    }//GEN-LAST:event_btnManageActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        login l=new login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        add();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateActionPerformed
        // TODO add your handling code here:
 try{
             
            java.util.Date d1 = dateselect.getDate();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
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
            tftt.setText(String.valueOf(sqlD));
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Transaction tn=new Transaction();
        tn.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Manager_pannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_pannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_pannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_pannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_pannel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnDate;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnSearch;
    private com.toedter.calendar.JDateChooser dateselect;
    private javax.swing.JLabel imaGE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel tc;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JLabel tftt;
    private javax.swing.JLabel tp;
    private javax.swing.JLabel ts;
    private javax.swing.JLabel y;
    private javax.swing.JLabel y1;
    // End of variables declaration//GEN-END:variables
}