/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SalesSupervisorRole;

import Business.EcoSystem;
import ui.SalesPersonRole.*;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import Business.WorkQueue.Product;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harish
 */
public class BuyProductsFromDistributorJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    
    private Enterprise distributorEnterprise;
    private Enterprise superMarketEnterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    Order order;
    WorkRequest workRequest;
    /**
     * Creates new form SalesPersonTransactionHome
     */
    public BuyProductsFromDistributorJPanel(JPanel userProcessContainer, UserAccount account, Enterprise distributorenterprise, Enterprise superMarketEnterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.distributorEnterprise = distributorenterprise;
        this.superMarketEnterprise = superMarketEnterprise;
        this.userAccount = account;
        this.ecoSystem = ecoSystem;
        order = new Order();
        order.setSender(account);
        order.setSenderEnterprise(superMarketEnterprise);
        order.setReceiverEnterprise(distributorenterprise);
        order.setStatus("waiting for distributor to accept");
        populateProductList();
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
        tblOrderProductList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        tblOrderProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Description", "Price", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tblOrderProductList);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Products List");

        btnSearch.setText("Search Product");

        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Description", "Price", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(tblProductList);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Order List");

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton1.setText("Payment Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnBack)
                                .addGap(154, 154, 154)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 133, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnRemove))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnAdd)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemove)
                        .addGap(134, 134, 134))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProductList.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        boolean check = true;
        if(((Product)tblProductList.getValueAt(selectedRow, 0)).getQuantity()==0){
            JOptionPane.showMessageDialog(this, "Item not available");
            return;
        }
        for(Product product:order.getProductList()){
            if(product.getName()== ((Product)tblProductList.getValueAt(selectedRow, 0)).getName()){
                product.addQuantity();
                check = false;
            }
        }
        if(check){
           Product product = new Product(((Product)tblProductList.getValueAt(selectedRow, 0)).getName(),((Product)tblProductList.getValueAt(selectedRow, 0)).getDescription());
           product.setDistributorPrice(((Product)tblProductList.getValueAt(selectedRow, 0)).getDistributorPrice());
           order.getProductList().add(product);
        }
        ((Product)tblProductList.getValueAt(selectedRow, 0)).reduceQuantity();
        populateProductList();
        populateOrder();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrderProductList.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an item");
            return;
        }
        boolean check = true;
        order.getProductList().remove((Product)tblOrderProductList.getValueAt(selectedRow, 0));
        for(Product product:distributorEnterprise.getProductList()){
            if(product.getName()== ((Product)tblProductList.getValueAt(selectedRow, 0)).getName()){
                product.addQuantity();
                check = false;
            }
        }
        populateOrder();
        populateProductList();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(order.getProductList().size()!=0){
            SuperMarketAdminDetails salesPersonTransactionHome= new SuperMarketAdminDetails(userProcessContainer,order, distributorEnterprise, ecoSystem);
            userProcessContainer.add("processWorkRequestJPanel", salesPersonTransactionHome);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SalesPersonWorkAreaJPanel dwjp = (SalesPersonWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrderProductList;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public void populateProductList() {
        DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
        
        model.setRowCount(0);
        for(Product product:distributorEnterprise.getProductList()){
            Object[] row = new Object[5];
            row[0] = product;
            row[1] = product.getName();
            row[2] = product.getDescription();
            row[3] = product.getDistributorPrice();
            row[4] = product.getQuantity();
            model.addRow(row);
        }
    }
    
    public void populateSearchProductList(){
        DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
        model.setRowCount(0);
        for(Product product:distributorEnterprise.getProductList()){
            if(product.getName().equals(txtSearch.getText()) || txtSearch.getText().equals("")){
                Object[] row = new Object[5];
                row[0] = product;
                row[1] = product.getName();
                row[2] = product.getDescription();
                row[3] = product.getDistributorPrice();
                row[4] = product.getQuantity();
                model.addRow(row);
            }
            
        }
    }

    public void populateOrder() {
        DefaultTableModel model = (DefaultTableModel) tblOrderProductList.getModel();
        model.setRowCount(0);
        for(Product product:order.getProductList()){
            Object[] row = new Object[5];
            row[0] = product;
            row[1] = product.getName();
            row[2] = product.getDescription();
            row[3] = product.getDistributorPrice();
            row[4] = product.getQuantity();
            model.addRow(row);
        }
    }
}
