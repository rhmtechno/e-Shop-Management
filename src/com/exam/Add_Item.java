/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author rakibul
 */
public class Add_Item extends javax.swing.JFrame {

    public static String getPath() {
        return path;
    }

    public static void setPath(String aPath) {
        path = aPath;
    }

    /**
     * Creates new form Add_Item
     */
    public Add_Item() {
        initComponents();
    }

    String uv = "";

    public void t_idAdd() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank", "root", Admin_Pannel.rpass);

            PreparedStatement pstmt = con.prepareStatement("SELECT MAX(em_id)FROM employee");
            ResultSet rs = pstmt.executeQuery();
            String max_tid;
            while (rs.next()) {
                max_tid = rs.getString("MAX(em_id)");
                if (max_tid == null) {
                    max_tid = "999";
                } else {
                    max_tid = rs.getString("MAX(em_id)");
                }
                int in = Integer.parseInt(max_tid);
                int i2 = in + 1;
                String id_s = String.valueOf(i2);
                uv = id_s;

            }

            //System.out.println("Hello"+uv);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void t_idAdd1() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank", "root", Admin_Pannel.rpass);

            PreparedStatement pstmt = con.prepareStatement("SELECT MAX(p_id)FROM product");
            ResultSet rs = pstmt.executeQuery();
            String max_tid;
            while (rs.next()) {
                max_tid = rs.getString("MAX(p_id)");
                if (max_tid == null) {
                    max_tid = "99";
                } else {
                    max_tid = rs.getString("MAX(p_id)");
                }
                int in = Integer.parseInt(max_tid);
                int i2 = in + 1;
                String id_s = String.valueOf(i2);
                uv = id_s;

            }

            //System.out.println("Hello"+uv);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String n = "";

    public void name(String b) {
        tfWel.setText("Welcome " + b);
        n = b;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfPath = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfWel = new javax.swing.JLabel();
        btnChose = new javax.swing.JButton();
        tfPurchase = new javax.swing.JTextField();
        tfStock = new javax.swing.JTextField();
        tfSales = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        tfPhoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Item");
        setBounds(new java.awt.Rectangle(350, 50, 0, 0));
        setMinimumSize(new java.awt.Dimension(580, 480));
        setPreferredSize(new java.awt.Dimension(581, 480));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("ADD NEW ITEM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 160, 17);

        tfPath.setText("Max 200P X200P");
        getContentPane().add(tfPath);
        tfPath.setBounds(270, 250, 280, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("purchase_price");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 120, 120, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Photo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 250, 42, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Sales_price");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 150, 90, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("stock");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 200, 34, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("p_name:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 70, 60, 30);

        tfWel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfWel.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(tfWel);
        tfWel.setBounds(10, 10, 200, 30);

        btnChose.setText("chose");
        btnChose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoseActionPerformed(evt);
            }
        });
        getContentPane().add(btnChose);
        btnChose.setBounds(180, 240, 80, 30);
        getContentPane().add(tfPurchase);
        tfPurchase.setBounds(170, 110, 200, 30);
        getContentPane().add(tfStock);
        tfStock.setBounds(170, 190, 200, 30);
        getContentPane().add(tfSales);
        tfSales.setBounds(170, 150, 200, 30);
        getContentPane().add(tfName);
        tfName.setBounds(170, 70, 200, 30);

        btnSave.setBackground(new java.awt.Color(0, 0, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(240, 240, 240));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(230, 300, 80, 30);

        tfPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(tfPhoto);
        tfPhoto.setBounds(380, 70, 180, 170);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Photo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 50, 40, 15);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/11.png"))); // NOI18N
        getContentPane().add(image);
        image.setBounds(0, 0, 580, 440);

        pack();
    }// </editor-fold>                        

    private String irs;

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String a1 = tfName.getText();
        String a2 = tfPurchase.getText();
        String a3 = tfSales.getText();
        String a4 = tfStock.getText();

        if (a1.length() > 0 && a2.length() > 0 && a3.length() > 0 && a4.length() > 0) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank", "root", Admin_Pannel.rpass);
                PreparedStatement pstmt = con.prepareStatement("INSERT INTO product VALUES(?,?,?,?,?,?,?,NOW())");
                t_idAdd1();
                pstmt.setString(1, uv);
                pstmt.setString(2, tfName.getText());

                String s1 = tfPurchase.getText();
                int s2 = Integer.parseInt(s1);
                pstmt.setInt(3, s2);

                String s3 = tfSales.getText();
                int s4 = Integer.parseInt(s3);
                pstmt.setInt(4, s4);

                String s5 = tfStock.getText();
                int s6 = Integer.parseInt(s5);
                pstmt.setInt(5, s6);

                pstmt.setString(6, n);

                String st2 = tfPath.getText();
                ResizeImageExample rs = new ResizeImageExample();
                this.setIrs(st2);
                File fe = new File(st2);

                InputStream is = new FileInputStream(fe);
                pstmt.setBlob(7, is);

                int i = pstmt.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Product Add Succesfull");

                    tfName.setText("");
                    tfPurchase.setText("");
                    tfSales.setText("");
                    tfStock.setText("");
                    s5 = "C:\\Users\\rakibul\\Documents\\NetBeansProjects\\My_Bank\\Image\\2.jpg";

                    tfPhoto.setIcon(new ImageIcon(s5));
                } else {
                    JOptionPane.showMessageDialog(null, "Failed", "Attention", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Empty Feild Not Allowed", "Attention", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static String path;

    private void btnChoseActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(null);
        File f = jf.getSelectedFile();

        String s = f.getAbsolutePath();
        tfPath.setText(s);
        ResizeImageExample er = new ResizeImageExample();
        try {
        er.m1(tfPath.getText());
        } catch (Exception e) {
        }
       
        tfPhoto.setIcon(new ImageIcon(s));
    }

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
            java.util.logging.Logger.getLogger(Add_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnChose;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfName;
    private javax.swing.JLabel tfPath;
    private javax.swing.JLabel tfPhoto;
    private javax.swing.JTextField tfPurchase;
    private javax.swing.JTextField tfSales;
    private javax.swing.JTextField tfStock;
    private javax.swing.JLabel tfWel;
    // End of variables declaration                   

    public String getIrs() {
        return irs;
    }

    public void setIrs(String irs) {
        this.irs = irs;
    }
}
