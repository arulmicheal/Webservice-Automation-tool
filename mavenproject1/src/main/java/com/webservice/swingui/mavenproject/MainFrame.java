/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice.swingui.mavenproject;

import com.reports.ExtentReport.Reporter;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author praka
 */
public class MainFrame extends javax.swing.JFrame {

    static public String strCSVFilePath="";
    Reporter report=new Reporter();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        report.startReport();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanelMainTab = new javax.swing.JPanel();
        jTextFieldEndPointUrl = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonSendReq = new javax.swing.JButton();
        jComboBoxMethods = new javax.swing.JComboBox<>();
        jLabelStatusCode = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonUpload = new javax.swing.JButton();
        jLabelFileName = new javax.swing.JLabel();
        jLabelProcess = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaReqBody = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaResBody = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ReqPonse");
        setBackground(new java.awt.Color(0, 51, 204));
        setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        setForeground(java.awt.Color.white);
        setName("MainFrame"); // NOI18N

        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanelMainTab.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelMainTab.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jTextFieldEndPointUrl.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jTextFieldEndPointUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEndPointUrlActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("EndPointUrl");

        jButtonSendReq.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonSendReq.setForeground(new java.awt.Color(0, 0, 204));
        jButtonSendReq.setText("Send Request");
        jButtonSendReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendReqActionPerformed(evt);
            }
        });

        jComboBoxMethods.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GET", "POST", "PUT", "DELETE", "UPDATE" }));

        jLabelStatusCode.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Status :");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Request");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Response");

        jButtonUpload.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonUpload.setText("Upload (.csv file)");
        jButtonUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadActionPerformed(evt);
            }
        });

        jLabelProcess.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabelProcess.setForeground(new java.awt.Color(0, 153, 0));

        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jTextAreaReqBody.setColumns(20);
        jTextAreaReqBody.setRows(5);
        jTextAreaReqBody.setName("Params"); // NOI18N
        jScrollPane1.setViewportView(jTextAreaReqBody);

        jTabbedPane1.addTab("Params", jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Authorization", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Headers", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Request Body", jPanel3);

        jTextAreaResBody.setColumns(20);
        jTextAreaResBody.setRows(5);
        jScrollPane3.setViewportView(jTextAreaResBody);
        jTextAreaResBody.getAccessibleContext().setAccessibleName("jTextAreaResBody");

        javax.swing.GroupLayout jPanelMainTabLayout = new javax.swing.GroupLayout(jPanelMainTab);
        jPanelMainTab.setLayout(jPanelMainTabLayout);
        jPanelMainTabLayout.setHorizontalGroup(
            jPanelMainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainTabLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEndPointUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSendReq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainTabLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanelMainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMainTabLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(262, 262, 262)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelStatusCode, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelMainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxMethods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jTabbedPane1)
                                .addComponent(jScrollPane3))))
                    .addGroup(jPanelMainTabLayout.createSequentialGroup()
                        .addGap(658, 658, 658)
                        .addComponent(jButtonUpload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFileName)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanelMainTabLayout.setVerticalGroup(
            jPanelMainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelMainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldEndPointUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSendReq)
                    .addComponent(jLabelProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelMainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainTabLayout.createSequentialGroup()
                        .addComponent(jComboBoxMethods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonUpload)
                        .addComponent(jLabelFileName)))
                .addGap(8, 8, 8)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addComponent(jLabelStatusCode, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tabPanel");

        jPanelMainTab.add(new CloseTabBtn());

        jTabbedPane2.addTab("Untitled", jPanelMainTab);
        jPanelMainTab.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadActionPerformed
        int iRes=jFileChooser1.showOpenDialog(null);
        if (iRes == JFileChooser.APPROVE_OPTION)
        {
            String strFileName=jFileChooser1.getSelectedFile().getName();
            if(strFileName.substring(strFileName.lastIndexOf("."),strFileName.length()).equalsIgnoreCase(".csv"))
            {
                jLabelFileName.setText(jFileChooser1.getSelectedFile().getName());
                strCSVFilePath=jFileChooser1.getSelectedFile().getAbsolutePath();
            }else
            {
                jLabelFileName.setForeground(Color.red);
                jLabelFileName.setText("Upload valid file type!");
               
            }
        }
    }//GEN-LAST:event_jButtonUploadActionPerformed

    private void jButtonSendReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendReqActionPerformed
        String strEndpoint=jTextFieldEndPointUrl.getText();
        report.startTest(strEndpoint);
        jLabelProcess.setForeground(Color.blue);
        jLabelProcess.setText("Processing...");
        jPanelMainTab.repaint();
        try
        {
            //Getting Endpoint URL
            RestAssured.baseURI = strEndpoint;
            // specified in the above step.
            RequestSpecification httpRequest = RestAssured.given();
            Response response =null;
            //Setting Request Method and sending request
            String strMethod=jComboBoxMethods.getSelectedItem().toString();
            switch (strMethod.toLowerCase()) 
            {
                case "get":
                    response= httpRequest.request(Method.GET);
                    break;
                case "post":
                    response= httpRequest.request(Method.POST);
                case "put":
                    response=httpRequest.request(Method.PUT);
                case "delete":
                    response=httpRequest.request(Method.DELETE);
                default:
                    response=httpRequest.request(Method.GET);
            };
            // Now let us print the body of the message to see what response
            // we have recieved from the server
            jLabelStatusCode.setText(response.getStatusLine());
            jTextAreaResBody.setText(response.getBody().prettyPrint());
            report.reportStep("Testing", "PASS",false);
            jLabelProcess.setForeground(Color.decode("#073b04"));
            jLabelProcess.setText("Completed!");
            jPanelMainTab.repaint();
        }catch(Exception ex)
        {
            jLabelProcess.setForeground(Color.red);
            jLabelProcess.setText("Exception");
            jPanelMainTab.repaint();
        }
        
    }//GEN-LAST:event_jButtonSendReqActionPerformed

    private void jTextFieldEndPointUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEndPointUrlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEndPointUrlActionPerformed
private class CloseTabBtn extends JButton {
 
        public CloseTabBtn() {
            int size = 17;
            setPreferredSize(new Dimension(size, size));
            setToolTipText("Close this chat");
            //Make the button looks the same for all Laf's
            setUI(new BasicButtonUI());
            //Make it transparent
            setContentAreaFilled(false);
            setFocusable(false);
            setBorder(BorderFactory.createEtchedBorder());
            setBorderPainted(false);
            //Make nice rollover effect
            setRolloverEnabled(true);
            //Action Listener for close btn
            addActionListener(new java.awt.event.ActionListener() {
 
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    //Close tab and remove resource from Resource.
                }
            });
        }
 
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            Stroke stroke = g2.getStroke();
            g2.setStroke(new BasicStroke(2));
            g.setColor(Color.BLACK);
            if (getModel().isRollover()) {
                g.setColor(Color.MAGENTA);
            }
            int delta = 5;
            g.drawLine(delta, delta, getWidth() - delta - 1, getHeight() - delta - 1);
            g.drawLine(getWidth() - delta - 1, delta, delta, getHeight() - delta - 1);
            g2.setStroke(stroke);
 
            //int i = jTabbedPane2.getTabCount() - 1;
            //tabContainer.setTitleAt(i, getTarget());
        }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSendReq;
    private javax.swing.JButton jButtonUpload;
    private javax.swing.JComboBox<String> jComboBoxMethods;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFileName;
    private javax.swing.JLabel jLabelProcess;
    private javax.swing.JLabel jLabelStatusCode;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelMainTab;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextAreaReqBody;
    private javax.swing.JTextArea jTextAreaResBody;
    private javax.swing.JTextField jTextFieldEndPointUrl;
    // End of variables declaration//GEN-END:variables
}
