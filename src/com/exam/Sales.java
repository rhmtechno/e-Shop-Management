/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author rakibul
 */
public class Sales extends javax.swing.JFrame {

    public static int getTotalw() {
        return totalw;
    }

    public static void setTotalw(int aTotalw) {
        totalw = aTotalw;
    }

    /**
     * Creates new form Sales
     */
    public Sales() {
        initComponents();
        showData1();
        add();
        currentTime();
        tsu();

    }

    public void tsu() {

        Admin_Pannel ap = new Admin_Pannel();

        ap.add();
        ss.setText(String.valueOf(ap.total1) + " Tk");

    }

    String uv = "";

    public void t_idAdd() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank", "root", Admin_Pannel.rpass);

            PreparedStatement pstmt = con.prepareStatement("SELECT MAX(t_id)FROM transaction");
            ResultSet rs = pstmt.executeQuery();
            String max_tid;
            while (rs.next()) {
                max_tid = rs.getString("MAX(t_id)");
                if (max_tid == null) {
                    max_tid = "999";
                } else {
                    max_tid = rs.getString("MAX(t_id)");
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

    String time;

    public void currentTime() {
        Thread clock = new Thread() {
            public void run() {
                for (;;) {
                    time = "" + new java.util.Date();
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

    //Transaction Table
    public void showData1() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank", "root", Admin_Pannel.rpass);
            ResultSet rs = null;
            ResultSetMetaData rsm = null;
            PreparedStatement pstmt = con.prepareStatement("SELECT t_id,total,date,sales_by FROM transaction");
            rs = pstmt.executeQuery();
            rsm = rs.getMetaData();
            DefaultTableModel dtm = new DefaultTableModel();
            Object[] columnNames = new Object[rsm.getColumnCount()];
            for (int i = 0; i < rsm.getColumnCount(); i++) {
                columnNames[i] = rsm.getColumnLabel(i + 1);
                dtm.addColumn(columnNames[i]);

            }

            while (rs.next()) {
                Object[] data = new Object[rsm.getColumnCount()];
                for (int i = 0; i < data.length; i++) {
                    data[i] = rs.getObject(i + 1);
                }
                dtm.addRow(data);

            }

            trans.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void add() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank", "root", Admin_Pannel.rpass);
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM product");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                String id = rs.getString("p_id");

                ddOption.addItem(id);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    String n = "";

    public void wel(String b) {
        tfWel.setText("Welcome " + b);
        n = b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        trans = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        ddOption = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ss = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfPhoto = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        tfPrice = new javax.swing.JTextField();
        tfStock = new javax.swing.JTextField();
        tfWel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        result = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        r2 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        r = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tfQuan = new javax.swing.JTextField();
        lQuan = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        y = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("e-Shop");
        setMinimumSize(new java.awt.Dimension(1320, 750));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transaction Information");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 420, 310, 20);

        jLabel12.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Today's Information:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(900, 70, 250, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Total Sales:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(920, 120, 80, 17);

        trans.setBackground(new java.awt.Color(51, 51, 255));
        trans.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trans.setForeground(new java.awt.Color(240, 240, 240));
        trans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "T_id", "Total", "Date", "Sales_By"
            }
        ));
        trans.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jScrollPane2.setViewportView(trans);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 450, 1300, 210);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Product id:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 40, 90, 30);

        ddOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Id" }));
        ddOption.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ddOptionItemStateChanged(evt);
            }
        });
        ddOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddOptionActionPerformed(evt);
            }
        });
        getContentPane().add(ddOption);
        ddOption.setBounds(100, 40, 240, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 90, 50, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Price:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 130, 38, 17);

        ss.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ss.setForeground(new java.awt.Color(255, 0, 0));
        ss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ss.setText("NO sale Found");
        getContentPane().add(ss);
        ss.setBounds(1020, 120, 150, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Stock:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 50, 17);

        tfPhoto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(tfPhoto);
        tfPhoto.setBounds(20, 240, 190, 170);
        getContentPane().add(tfName);
        tfName.setBounds(100, 80, 240, 30);
        getContentPane().add(tfSearch);
        tfSearch.setBounds(940, 290, 200, 30);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/sss.jpg"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(1150, 260, 60, 60);
        getContentPane().add(tfPrice);
        tfPrice.setBounds(100, 120, 240, 30);

        tfStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStockActionPerformed(evt);
            }
        });
        getContentPane().add(tfStock);
        tfStock.setBounds(100, 160, 240, 30);

        tfWel.setBackground(new java.awt.Color(255, 0, 0));
        tfWel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfWel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(tfWel);
        tfWel.setBounds(10, 0, 230, 30);

        result.setBackground(new java.awt.Color(204, 204, 255));
        result.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jScrollPane3.setViewportView(result);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(690, 70, 130, 300);

        r2.setBackground(new java.awt.Color(204, 204, 255));
        r2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jScrollPane4.setViewportView(r2);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(470, 70, 130, 300);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Product name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(490, 50, 86, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Price(tk.)");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(730, 50, 70, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Total:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(630, 380, 52, 22);

        r.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });
        getContentPane().add(r);
        r.setBounds(690, 370, 130, 30);

        btnEnter.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 51, 0));
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/sel.png"))); // NOI18N
        btnEnter.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
        btnEnter.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnEnterAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter);
        btnEnter.setBounds(230, 240, 80, 70);

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(240, 240, 240));
        jButton5.setText("LogOut");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1220, 10, 80, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Quantity:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 210, 70, 17);

        tfQuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfQuanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfQuanMouseEntered(evt);
            }
        });
        tfQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuanActionPerformed(evt);
            }
        });
        tfQuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfQuanKeyReleased(evt);
            }
        });
        getContentPane().add(tfQuan);
        tfQuan.setBounds(100, 200, 240, 30);

        lQuan.setBackground(new java.awt.Color(204, 204, 255));
        lQuan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        getContentPane().add(lQuan);
        lQuan.setBounds(610, 70, 70, 300);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Quantity:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(620, 50, 60, 15);

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/reset.jpg"))); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(370, 70, 80, 80);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/final.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 160, 80, 80);

        y.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        y.setForeground(new java.awt.Color(0, 0, 255));
        y.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(y);
        y.setBounds(470, 10, 330, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter Transaction Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(970, 260, 140, 14);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 0));
        jLabel14.setText("Confirm");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(390, 240, 60, 14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setText("Select");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(250, 320, 40, 14);

        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 255), null));
        getContentPane().add(jLabel16);
        jLabel16.setBounds(460, 40, 380, 370);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/tn.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1150, 340, 60, 50);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("Sale History");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1140, 390, 90, 20);

        image.setBackground(new java.awt.Color(204, 255, 204));
        image.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exam/13.jpg"))); // NOI18N
        getContentPane().add(image);
        image.setBounds(0, 0, 1320, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStockActionPerformed
    int purchase;
    int stock_status;
    String sq;
    private void ddOptionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ddOptionItemStateChanged
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank", "root", Admin_Pannel.rpass);
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM product WHERE p_id=?");
            String id = ddOption.getSelectedItem().toString();
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String name = rs.getString("p_name");
                tfName.setText(name);

                int sp = rs.getInt("salce_price");
                tfPrice.setText(String.valueOf(sp));

                int st = rs.getInt("stock");
                tfStock.setText(String.valueOf(st));
                stock_status = st;

                byte[] ima = rs.getBytes("photo");
                Image imag = Toolkit.getDefaultToolkit().createImage(ima);
                ImageIcon icon = new ImageIcon(imag);
                tfPhoto.setIcon(icon);

                purchase = rs.getInt("purchase_price");
                tfQuan.setText("0");

            } else {
                tfName.setText("");

                tfPrice.setText("");
                tfStock.setText("");
                tfQuan.setText("");
                tfQuan.setText("0");
                String s5 = "";
                s5 = "C:\\Users\\rakibul\\Documents\\NetBeansProjects\\My_Bank\\Image\\2.jpg";

                tfPhoto.setIcon(new ImageIcon(s5));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_ddOptionItemStateChanged

    private void ddOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddOptionActionPerformed

    private void btnEnterAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnEnterAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnterAncestorAdded
    int total;
    int totalP;

    DefaultListModel Number = new DefaultListModel();
    DefaultListModel product = new DefaultListModel();
    DefaultListModel QuanList = new DefaultListModel();

    ArrayList<String> p_name = new ArrayList<String>();
    ArrayList<String> p_id = new ArrayList<String>();
    ArrayList<Integer> p_price = new ArrayList<Integer>();
    ArrayList<String> quan = new ArrayList<String>();
    ArrayList<Integer> cost = new ArrayList<Integer>();
    ArrayList<Integer> stockl = new ArrayList<Integer>();


    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        // TODO add your handling code here:
        //int total;

        if (stock_status <= 10 && stock_status > 0) {
            JOptionPane.showMessageDialog(null, "Only " + stock_status + " Product Left", "Alert", JOptionPane.WARNING_MESSAGE);
        };

        if (stock_status < 1) {
            JOptionPane.showMessageDialog(null, "No Product Left For Sale", "Alert", JOptionPane.ERROR_MESSAGE);
            tfQuan.setText("");

        } else if (stock_status < Integer.parseInt(tfQuan.getText())) {
            JOptionPane.showMessageDialog(null, "Quantity Is More Than Stock", "Alert", JOptionPane.ERROR_MESSAGE);
            tfQuan.setText("");

        } else if (1 > Integer.parseInt(tfQuan.getText())) {
            JOptionPane.showMessageDialog(null, "Quantity Must 1 Or More Than 1", "Alert", JOptionPane.ERROR_MESSAGE);
            tfQuan.setText("0");
        } else {
            System.out.println(tfQuan.getText());
            String s1 = tfQuan.getText();
            int s2 = Integer.parseInt(s1);
            String s3 = tfPrice.getText();
            int s4 = Integer.parseInt(s3);
            int num1 = s2 * s4;
            Number.addElement(num1);
            result.setModel(Number);

            total = total + num1;
            r.setText(String.valueOf(total));

            String w = tfName.getText();
            product.addElement(w);
            r2.setModel(product);

            int qp1 = purchase * s2;
            quan.add(s1);//ArrayList
            QuanList.addElement(s1);
            lQuan.setModel(QuanList);
            totalP = totalP + qp1;
            cost.add(purchase);

            String id = ddOption.getSelectedItem().toString();
            p_id.add(id);
            p_name.add(w);

            p_price.add(s4);

            String st = tfStock.getText();
            int st1 = Integer.parseInt(st);

            int ups = st1 - s2;
            stockl.add(ups);
            ddOption.setSelectedIndex(0);
            tfQuan.setText("0");
        }


    }//GEN-LAST:event_btnEnterActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        login l = new login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tfQuanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuanKeyReleased
        // TODO add your handling code here:


    }//GEN-LAST:event_tfQuanKeyReleased

    private void tfQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuanActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        // result.setVisible(false);
        Number.clear();
        product.clear();
        QuanList.clear();
        result.setModel(Number);
        r2.setModel(product);
        lQuan.setModel(QuanList);
        r.setText(" ");
        total = 0;

        p_name.clear();
        p_id.clear();
        p_price.clear();
        quan.clear();
        cost.clear();
        stockl.clear();
        purchase = 0;
        total = 0;
        totalP = 0;


    }//GEN-LAST:event_btnResetActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String qu1 = r.getText();

        if (qu1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty Transaction", "Alert", JOptionPane.ERROR_MESSAGE);
        } else {
            t_idAdd();
            String s = "s" + uv;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank", "root", Admin_Pannel.rpass);

                PreparedStatement pstmt = con.prepareStatement("CREATE TABLE  " + s + " (p_id VARCHAR(50) NOT NULL, p_name VARCHAR(50), Quantuty VARCHAR(50),price INT,cost INT, PRIMARY KEY (p_id))");
                PreparedStatement pstmt1 = con.prepareStatement("INSERT INTO transaction(t_id,total,date,sales_by,cost)VALUES(?,?,NOW(),?,?)");
                PreparedStatement pstmt2 = con.prepareStatement("INSERT INTO " + s + "(p_id,p_name,Quantuty,price,cost)VALUES(?,?,?,?,?)");
                PreparedStatement pstmtb = con.prepareStatement("INSERT INTO billing(t_id,p_id,p_name,Quantuty,price,p_total,sales_by,date)VALUES(?,?,?,?,?,?,?,NOW())");
                PreparedStatement pstmtu = con.prepareStatement("UPDATE product SET stock=? WHERE p_id=?");
                pstmt1.setString(1, uv);
                pstmt1.setInt(2, total);
                pstmt1.setString(3, n);
                pstmt1.setInt(4, totalP);

                //Transaction 1st Run
                int i3 = pstmt1.executeUpdate();

                if (i3 > 0) {
                    //Create table
                    int i = pstmt.executeUpdate();

                    int t;
                    for (t = 0; t <= p_name.size() - 1; t++) {
                        String id = ddOption.getSelectedItem().toString();
                        pstmt2.setString(1, p_id.get(t));
                        pstmt2.setString(2, p_name.get(t));
                        pstmt2.setString(3, quan.get(t));

                        pstmt2.setInt(4, p_price.get(t));
                        pstmt2.setInt(5, cost.get(t));

                        int k = pstmt2.executeUpdate();

                        String id1 = ddOption.getSelectedItem().toString();
                        pstmtb.setString(1, uv);
                        pstmtb.setString(2, p_id.get(t));
                        pstmtb.setString(3, p_name.get(t));
                        pstmtb.setString(4, quan.get(t));
                        String q = quan.get(t);
                        pstmtb.setInt(5, p_price.get(t));
                        int qi = Integer.parseInt(q);
                        int price = p_price.get(t) * qi;
                        pstmtb.setInt(6, price);
                        pstmtb.setString(7, n);

                        int o = pstmtb.executeUpdate();

                        pstmtu.setInt(1, stockl.get(t));
                        pstmtu.setString(2, p_id.get(t));
                        int upst = pstmtu.executeUpdate();

                    }
                    pdf();
                    JOptionPane.showMessageDialog(null, "Selling Success And Stock Updated");
                    showData1();
                    tsu();
                    Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:/reports/" + uv + ".pdf");
                    Customer cm = new Customer();
                    cm.ctablename(s, uv);
                    cm.showData();

                    cm.setVisible(true);

                    Number.clear();
                    product.clear();
                    QuanList.clear();

                    r2.setModel(product);
                    r.setText("");
                    total = 0;
                    p_name.clear();
                    p_id.clear();
                    p_price.clear();
                    quan.clear();
                    cost.clear();
                    stockl.clear();
                    totalP = 0;

                }

                //System.out.println("Hello"+uv);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed
    public static int totalw;

    public void pdf() {
        //totalw = total;
        WordSpelling sp = new WordSpelling();
        String iw = sp.m(total) + " Tk. Only";

        try {
            System.out.println("Start ....");

            String jrxmlFileName = "C:/reports/rakib.jrxml";
            String jasperFileName = "C:/reports/rakib.jasper";
            String pdfFileName = "C:/reports/" + uv + ".pdf";

            JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank", "root", "apcl123456");
            HashMap hm = null;
            // Create arguments
            // Map params = new HashMap();
            hm = new HashMap();
            hm.put("p1", uv);
            EnglishNumberToWords es = new EnglishNumberToWords();
            hm.put("p2", iw);

            // Generate jasper print
            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, hm, conn);

            // Export pdf file
            JasperExportManager.exportReportToPdfFile(jprint, pdfFileName);

        } catch (Exception e) {
            System.out.print("Exceptiion" + e);
        }
    }


    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String ts = tfSearch.getText();
        if (ts.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Transaction Id", "Alert", JOptionPane.ERROR_MESSAGE);
        } else {
            String s1 = tfSearch.getText();

            Customer ta = new Customer();
            ta.ctablename("s" + s1, s1);
            ta.showData();
            ta.setVisible(true);
            tfSearch.setText("");

        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rActionPerformed

    private void tfQuanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfQuanMouseEntered

        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuanMouseEntered

    private void tfQuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfQuanMouseClicked
        tfQuan.setText("");
    }//GEN-LAST:event_tfQuanMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Transaction tn = new Transaction();
        tn.setVisible(true);
        ;


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> ddOption;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lQuan;
    private javax.swing.JTextField r;
    private javax.swing.JList<String> r2;
    private javax.swing.JList<String> result;
    private javax.swing.JLabel ss;
    private javax.swing.JTextField tfName;
    private javax.swing.JLabel tfPhoto;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfQuan;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfStock;
    private javax.swing.JLabel tfWel;
    private javax.swing.JTable trans;
    private javax.swing.JLabel y;
    // End of variables declaration//GEN-END:variables
}
