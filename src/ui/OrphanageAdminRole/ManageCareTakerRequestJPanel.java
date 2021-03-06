/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.OrphanageAdminRole;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.OrphanageAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SuppliesWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class ManageCareTakerRequestJPanel extends javax.swing.JPanel {
    
    
    private JPanel userProcessContainer;
//    private OrphanageAdminOrganization orphanageAdminOrganization;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    /**
     * Creates new form ManageCareTakerRequestJPanel
     */
    public ManageCareTakerRequestJPanel(JPanel userJPanel, Enterprise enterprise,EcoSystem ecoSystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userJPanel;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        //this.orphanageAdminOrganization = (OrphanageAdminOrganization)organization;
        populateTable();
        
    }
    
        public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();

        model.setRowCount(0);

        for(WorkRequest request : ecoSystem.getWorkQueue().getWorkRequestList()){
            if(request.getSenderEnterprise()!=null && request.getSenderEnterprise().equals(enterprise)){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getSender().getEmployee().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[3] = ((SuppliesWorkRequest)request).getAmount();
                row[4] = request.getStatus();
                model.addRow(row);
            }
            
        }
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
        workRequestJTable = new javax.swing.JTable();
        AssignTomeButton = new javax.swing.JButton();
        ProcessManagerButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(185, 269, 577, 94);

        AssignTomeButton.setText("Assign To me");
        AssignTomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignTomeButtonActionPerformed(evt);
            }
        });
        add(AssignTomeButton);
        AssignTomeButton.setBounds(751, 424, 121, 29);

        ProcessManagerButton.setText("Process");
        ProcessManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessManagerButtonActionPerformed(evt);
            }
        });
        add(ProcessManagerButton);
        ProcessManagerButton.setBounds(750, 510, 121, 29);

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(751, 465, 121, 29);

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(50, 50, 103, 30);

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(750, 550, 121, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/orphanage.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(20, 10, 1140, 640);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              populateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void AssignTomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignTomeButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getReceiver() == null){
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Already Assigned");
            return;
        }    // TODO add your handling code here:
    }//GEN-LAST:event_AssignTomeButtonActionPerformed

    private void ProcessManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessManagerButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        SuppliesWorkRequest request = (SuppliesWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Completed")){
            JOptionPane.showMessageDialog(null, "Already Completed");
            return;
        }
        request.setStatus("Processing");

        ProcessManagerWorkRequestJPanel processManagerWorkRequestJPanel = new ProcessManagerWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processManagerWorkRequestJPanel", processManagerWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_ProcessManagerButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OrphanageAdminWorkAreaJPanel oawj = (OrphanageAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }

        SuppliesWorkRequest request = (SuppliesWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Completed")||request.getStatus().equals("Rejected")){
            JOptionPane.showMessageDialog(null, "Already Completed");
            return;
        }
        request.setStatus("Rejected");
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignTomeButton;
    private javax.swing.JButton ProcessManagerButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
