/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SupplierAdminRole;

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
public class ManageRequests extends javax.swing.JPanel {
    JPanel userProcessConatiner;
    Enterprise enterprise;
    UserAccount userAccount;
    EcoSystem ecoSystem;
    /**
     * Creates new form ManageRequests
     */
    public ManageRequests(JPanel userProcessConatiner, Enterprise enterprise,UserAccount userAccount,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessConatiner = userProcessConatiner;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        populateRequests();
        populateDriverTypes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnOrderDetails = new javax.swing.JButton();
        cboxDriverType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboxDriver = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept);
        btnAccept.setBounds(278, 200, 87, 29);

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(561, 200, 82, 29);

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "SenderEnterprise", "Receiver Enterprise", "Status", "Sender Network", "Delivery", "Supplier Admin"
            }
        ));
        jScrollPane1.setViewportView(tblRequest);

        add(jScrollPane1);
        jScrollPane1.setBounds(238, 6, 454, 182);

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product", "Description", "Price", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(tblDetails);

        add(jScrollPane2);
        jScrollPane2.setBounds(238, 395, 454, 160);

        btnOrderDetails.setText("Order Details");
        btnOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDetailsActionPerformed(evt);
            }
        });
        add(btnOrderDetails);
        btnOrderDetails.setBounds(398, 200, 127, 29);

        cboxDriverType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cboxDriverType);
        cboxDriverType.setBounds(398, 248, 96, 27);

        jLabel1.setText("Driver Type:");
        add(jLabel1);
        jLabel1.setBounds(289, 252, 76, 16);

        jButton1.setText("Assign");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(561, 295, 81, 29);

        jLabel2.setText("Driver");
        add(jLabel2);
        jLabel2.setBounds(329, 300, 38, 16);

        cboxDriver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cboxDriver);
        cboxDriver.setBounds(400, 296, 96, 27);

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(561, 247, 81, 29);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh);
        btnRefresh.setBounds(798, 53, 91, 29);

        jButton3.setText("<<Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(30, 30, 97, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/supplier.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 1010, 590);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }

        Order order = (Order)tblRequest.getValueAt(selectedRow, 0);
        if(order.getSupplierAdmin()!=null){
            JOptionPane.showMessageDialog(this, "This order has been picked already");
            return;
        }
        order.setSupplierAdmin(userAccount);
        if(!order.getStatus().contains("Rejected")){
            order.setStatus("Accepted by Supplier");
            JOptionPane.showMessageDialog(this, "This order has been accepted");
        }else{
            JOptionPane.showMessageDialog(this, "This order was rejected earlier");
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }

        Order order = (Order)tblRequest.getValueAt(selectedRow, 0);
        if(order.getSupplierAdmin()!=null){
            JOptionPane.showMessageDialog(this, "This order has been picked already");
            return;
        }
        order.setSupplierAdmin(userAccount);
        if(!order.getStatus().contains("Accepted")){
            order.setStatus("Rejected by Supplier");
            
            
            order.getReceiverEnterprise().restoreProducts(order);
            JOptionPane.showMessageDialog(this, "This order has been rejected");
        }else{
            JOptionPane.showMessageDialog(this, "This order was accepted earlier");
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        Order order = (Order)tblRequest.getValueAt(selectedRow, 0);
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        for(Product product:order.getProductList()){
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getDescription();
            if(order.getReceiverEnterprise().getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Distributor.getValue())){
                row[2] = product.getDistributorPrice();
            }else{
                row[2] = product.getSuperMarketPrice();
            }
            
            row[3] = product.getQuantity();
            model.addRow(row);
        }
    }//GEN-LAST:event_btnOrderDetailsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cboxDriver.removeAllItems();
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(cboxDriverType.getSelectedItem().toString().equals(organization.getName())){
                for(UserAccount account: organization.getUserAccountDirectory().getUserAccountList()){
                    cboxDriver.addItem(account.getEmployee().getName());
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        Order order1 = (Order)tblRequest.getValueAt(selectedRow, 0);
        if(order1.getSupplierAdmin()==null){
            JOptionPane.showMessageDialog(this, "this order needs to be accepted first");
            return;
        }
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(cboxDriverType.getSelectedItem().toString().equals(organization.getName())){
                for(UserAccount account: organization.getUserAccountDirectory().getUserAccountList()){
                    if(account.getEmployee().getName().equals(cboxDriver.getSelectedItem().toString())){
                        for(WorkRequest request:ecoSystem.getWorkQueue().getWorkRequestList()){
                            System.out.println(request.getDelivery());
                            if(request.getDelivery()!=null && request.getDelivery().equals(account) && request.getStatus().contains("Assigned to delivery")){
                                JOptionPane.showMessageDialog(this, "Driver is busy");
                                return;
                            }
                        }
                        Order order = (Order)tblRequest.getValueAt(selectedRow, 0);
                        order.setDelivery(account);
                        order.setStatus("Assigned to delivery");
                        JOptionPane.showMessageDialog(this, "Assigned to delivery");
                        break;
                    }
                }
            }
        }
        populateRequests();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateRequests();
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessConatiner.remove(this);
        CardLayout layout = (CardLayout) userProcessConatiner.getLayout();
        layout.previous(userProcessConatiner);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnOrderDetails;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReject;
    private javax.swing.JComboBox<String> cboxDriver;
    private javax.swing.JComboBox<String> cboxDriverType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTable tblRequest;
    // End of variables declaration//GEN-END:variables

    private void populateRequests() {
        DefaultTableModel model = (DefaultTableModel) tblRequest.getModel();
        model.setRowCount(0);
        for(WorkRequest workRequest:ecoSystem.getWorkQueue().getWorkRequestList()){
            if(workRequest.getSupplierEnterprise()!=null && workRequest.getSupplierEnterprise().getName().equals(enterprise.getName())){
                Object[] row = new Object[8];
                row[0] = workRequest;
                row[1] = workRequest.getReceiver();
                row[2] = workRequest.getSenderEnterprise();
                row[3] = workRequest.getReceiverEnterprise();
                row[4] = workRequest.getStatus();
                row[5] = workRequest.getNetworkName();
                row[6] = workRequest.getDelivery();
                row[7] = workRequest.getSupplierAdmin();
                model.addRow(row);
            }
        }
    }
    
    private void populateDriverTypes(){
        cboxDriverType.removeAllItems();
        for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization.getName().equals("Heavy Driver") || organization.getName().equals("Light Driver")){
                cboxDriverType.addItem(organization.getName());
            }
        }
    }
    
    
}
