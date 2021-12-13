/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CareTakerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CareTakerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SuppliesWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class CareTakerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CareTakerWorkAreaJPanel
     */

    private JPanel userProcessContainer;
    private CareTakerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    public CareTakerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CareTakerOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        populateRequestTable();
    }
    
    // populate table with fundsWorkRequest
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        System.out.println(userAccount.getWorkQueue().getWorkRequestList());
        for (WorkRequest request : business.getWorkQueue().getWorkRequestList()){
            if(request.getSender().equals(userAccount)){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getReceiver();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestSuppliesJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CareTaker WorkArea");
        add(jLabel1);
        jLabel1.setBounds(280, 42, 246, 29);

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
        jScrollPane1.setBounds(158, 102, 577, 135);

        requestSuppliesJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        requestSuppliesJButton.setText("Request Donation");
        requestSuppliesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestSuppliesJButtonActionPerformed(evt);
            }
        });
        add(requestSuppliesJButton);
        requestSuppliesJButton.setBounds(574, 243, 161, 29);

        refreshTestJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton);
        refreshTestJButton.setBounds(574, 278, 161, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/orphanage.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1020, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void requestSuppliesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestSuppliesJButtonActionPerformed
        // go to fundRequest Page
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestSuppliesJPanel", new RequestSuppliesJPanel(userProcessContainer, userAccount, enterprise,business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestSuppliesJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestSuppliesJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
