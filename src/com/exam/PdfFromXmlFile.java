/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

/**
 *
 * @author RAKIB
 */
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class PdfFromXmlFile {
    public static void main(String[] args) {
        
        try {
            System.out.println("Start ....");

            String jrxmlFileName = "C:/reports/rakib.jrxml";
            String jasperFileName = "C:/reports/rakib.jasper";
            String pdfFileName = "C:/reports/rakib.pdf";

            JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bank", "root", "apcl123456");
             HashMap hm = null;
            // Create arguments
            // Map params = new HashMap();
             hm = new HashMap();
            //   hm.put("ID", "123");
           //   hm.put("DATENAME", "April 2006");

            // Generate jasper print
            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, hm, conn);

            // Export pdf file
            JasperExportManager.exportReportToPdfFile(jprint, pdfFileName);

            JOptionPane.showMessageDialog(null, "Done");

        } catch (Exception e) {
            System.out.print("Exceptiion" + e);
        }
    }
}
