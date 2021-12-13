/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SalesSupervisorRole;

import ui.CustomerRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import Business.WorkQueue.Product;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harish
 */
public class PreviousOrdersDA extends javax.swing.JPanel {
    JPanel userProcessConatiner;
    Enterprise enterprise;
    UserAccount userAccount;
    EcoSystem ecoSystem;
    /**
     * Creates new form PreviousOrders
     */
    public PreviousOrdersDA(JPanel userProcessConatiner, Enterprise enterprise,UserAccount userAccount, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessConatiner = userProcessConatiner;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
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
        btnOrderDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

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

        add(jScrollPane1);
        jScrollPane1.setBounds(290, 20, 454, 182);

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

        add(jScrollPane2);
        jScrollPane2.setBounds(270, 360, 454, 160);

        btnOrderDetails.setText("Order Details");
        btnOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDetailsActionPerformed(evt);
            }
        });
        add(btnOrderDetails);
        btnOrderDetails.setBounds(451, 293, 127, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/supermarket.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 990, 620);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTable tblRequest;
    // End of variables declaration//GEN-END:variables
    private void populateRequests() {
        DefaultTableModel model = (DefaultTableModel) tblRequest.getModel();
        model.setRowCount(0);
        for(WorkRequest workRequest:ecoSystem.getWorkQueue().getWorkRequestList()){
            if(workRequest.getSender()!=null && workRequest.getSender().equals(userAccount)){
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
