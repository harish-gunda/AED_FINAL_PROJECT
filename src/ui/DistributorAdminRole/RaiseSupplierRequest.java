/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DistributorAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import Business.WorkQueue.Product;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.SalesSupervisorRole.SalesSupervisorWorkAreaJPanel;

/**
 *
 * @author harish
 */
public class RaiseSupplierRequest extends javax.swing.JPanel {
    JPanel userProcessConatiner;
    Enterprise enterprise;
    UserAccount userAccount;
    EcoSystem ecoSystem;
    /**
     * Creates new form RaiseSupplierRequest
     */
    public RaiseSupplierRequest(JPanel userProcessConatiner, Enterprise enterprise, UserAccount userAccount,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessConatiner = userProcessConatiner;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        populateRequests();
        populateNetworkCombo();
        cboxSupplier.removeAllItems();
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
        cboxSupplier = new javax.swing.JComboBox<>();
        btnRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboxNetwork = new javax.swing.JComboBox<>();
        btnRequest1 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "SenderEnterprise", "Receiver Enterprise", "Status", "Sender Network"
            }
        ));
        jScrollPane1.setViewportView(tblRequest);

        add(jScrollPane1);
        jScrollPane1.setBounds(284, 64, 454, 176);

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
        jScrollPane2.setBounds(284, 419, 454, 160);

        btnOrderDetails.setText("Order Details");
        btnOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDetailsActionPerformed(evt);
            }
        });
        add(btnOrderDetails);
        btnOrderDetails.setBounds(488, 252, 127, 29);

        cboxSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cboxSupplier);
        cboxSupplier.setBounds(388, 347, 96, 27);

        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        add(btnRequest);
        btnRequest.setBounds(521, 346, 94, 29);

        jLabel1.setText("Supplier: ");
        add(jLabel1);
        jLabel1.setBounds(317, 351, 59, 16);

        jLabel2.setText("Network");
        add(jLabel2);
        jLabel2.setBounds(313, 304, 53, 16);

        cboxNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxNetworkActionPerformed(evt);
            }
        });
        add(cboxNetwork);
        cboxNetwork.setBounds(388, 300, 96, 27);

        btnRequest1.setText("Select Network");
        btnRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequest1ActionPerformed(evt);
            }
        });
        add(btnRequest1);
        btnRequest1.setBounds(496, 299, 138, 29);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh);
        btnRefresh.setBounds(931, 17, 91, 29);

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(6, 17, 93, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/distributor.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1030, 600);
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

    private void cboxNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxNetworkActionPerformed
        // TODO add your handling code here:
//        Network req=null;
//        System.out.println(cboxNetwork.getSelectedItem().toString());
//        for(Network network:ecoSystem.getNetworkList()){
//            if(network.getName().equals(cboxNetwork.getSelectedItem().toString())){
//                req = network;
//            }
//        }
//        for(Enterprise supplierEnterprise:req.getEnterpriseDirectory().getEnterpriseList()){
//            if(supplierEnterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Supplier)){
//                cboxSupplier.addItem(supplierEnterprise.getName());
//            }
//        }
        
    }//GEN-LAST:event_cboxNetworkActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        
        Order order = (Order)tblRequest.getValueAt(selectedRow, 0);
        Network req=null;
        System.out.println(cboxNetwork.getSelectedItem().toString());
        for(Network network:ecoSystem.getNetworkList()){
            if(network.getName().equals(cboxNetwork.getSelectedItem().toString())){
                req = network;
            }
        }
        
        for(Enterprise supplierEnterprise:req.getEnterpriseDirectory().getEnterpriseList()){
            System.out.println(supplierEnterprise.getName());
            System.out.println(cboxSupplier.getSelectedItem());
            if(supplierEnterprise.getName().equals(cboxSupplier.getSelectedItem().toString())){
                order.setSupplierEnterprise(supplierEnterprise);
                JOptionPane.showMessageDialog(this, "Request placed to supplier successfully");
                order.setStatus("Raised request to supplier");
                populateRequests();
                break;
            }
        }
        
        
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequest1ActionPerformed
        // TODO add your handling code here:
        Network req=null;
        System.out.println(cboxNetwork.getSelectedItem().toString());
        for(Network network:ecoSystem.getNetworkList()){
            if(network.getName().equals(cboxNetwork.getSelectedItem().toString())){
                req = network;
            }
        }
        for(Enterprise supplierEnterprise:req.getEnterpriseDirectory().getEnterpriseList()){
            System.out.println(supplierEnterprise.getEnterpriseType().getValue());
            System.out.println(Enterprise.EnterpriseType.Supplier.getValue());
            if(supplierEnterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Supplier.getValue())){
                System.out.println("inside if condition");
                cboxSupplier.addItem(supplierEnterprise.getName());
            }
        }
    }//GEN-LAST:event_btnRequest1ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateRequests();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessConatiner.remove(this);
        Component[] componentArray = userProcessConatiner.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DistributorAdmWorkAreaJPanel dwjp = (DistributorAdmWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessConatiner.getLayout();
        layout.previous(userProcessConatiner);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderDetails;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnRequest1;
    private javax.swing.JComboBox<String> cboxNetwork;
    private javax.swing.JComboBox<String> cboxSupplier;
    private javax.swing.JButton jButton1;
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
            if(workRequest.getReceiverEnterprise()!=null && workRequest.getReceiver()!=null && workRequest.getReceiverEnterprise().getName().equals(enterprise.getName()) && workRequest.getReceiver().equals(userAccount) && (workRequest.getStatus().contains("Accepted by Distributor") || workRequest.getStatus().contains("Raised request to supplier"))){
                Object[] row = new Object[6];
                row[0] = workRequest;
                row[1] = workRequest.getReceiver();
                row[2] = workRequest.getSenderEnterprise();
                row[3] = workRequest.getReceiverEnterprise();
                row[4] = workRequest.getStatus();
                row[5] = workRequest.getNetworkName();
                model.addRow(row);
            }
        }
    }
    
    private void populateNetworkCombo(){
        cboxNetwork.removeAllItems();
        for(Network network:ecoSystem.getNetworkList()){
            cboxNetwork.addItem(network.getName());
        }
    }

}
