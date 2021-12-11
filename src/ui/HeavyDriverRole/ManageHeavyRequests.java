/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HeavyDriverRole;

import ui.LightDriverRole.*;
import ui.SupplierAdminRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import Business.WorkQueue.Product;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harish
 */
public class ManageHeavyRequests extends javax.swing.JPanel {
    JPanel userProcessConatiner;
    Enterprise enterprise;
    UserAccount userAccount;
    EcoSystem ecoSystem;
    /**
     * Creates new form ManageRequests
     */
    public ManageHeavyRequests(JPanel userProcessConatiner, Enterprise enterprise,UserAccount userAccount,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessConatiner = userProcessConatiner;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        populateRequests();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        btnOrderDetails = new javax.swing.JButton();

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "SenderEnterprise", "Receiver Enterprise", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblRequest);

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product", "Description", "Distributor Price", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(tblDetails);

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnOrderDetails.setText("Order Details");
        btnOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOrderDetails)
                        .addGap(54, 54, 54)
                        .addComponent(btnProcess))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess)
                    .addComponent(btnOrderDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        Order order = (Order)tblRequest.getValueAt(selectedRow, 0);
        order.setReceiver(userAccount);
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        for(Product product:order.getProductList()){
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getDescription();
            row[2] = product.getDistributorPrice();
            row[3] = product.getQuantity();
            model.addRow(row);
        }
    }//GEN-LAST:event_btnOrderDetailsActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        Order order = (Order)tblRequest.getValueAt(selectedRow, 0);
        ProcessLightRequests manageEmployeeJPanel = new ProcessLightRequests(userProcessConatiner, order);
        userProcessConatiner.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessConatiner.getLayout();
        layout.next(userProcessConatiner);
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderDetails;
    private javax.swing.JButton btnProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTable tblRequest;
    // End of variables declaration//GEN-END:variables

    private void populateRequests() {
        DefaultTableModel model = (DefaultTableModel) tblRequest.getModel();
        model.setRowCount(0);
        for(WorkRequest workRequest:ecoSystem.getWorkQueue().getWorkRequestList()){
            if(workRequest.getDelivery()!=null && workRequest.getDelivery().equals(userAccount)){
                Object[] row = new Object[5];
                row[0] = workRequest;
                row[1] = workRequest.getReceiver();
                row[2] = workRequest.getSenderEnterprise();
                row[3] = workRequest.getReceiverEnterprise();
                row[4] = workRequest.getStatus();
                model.addRow(row);
            }
        }
    }
    
    
    
    
}
