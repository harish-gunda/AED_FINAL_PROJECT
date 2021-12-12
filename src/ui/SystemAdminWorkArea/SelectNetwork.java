/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author harish
 */
public class SelectNetwork extends javax.swing.JPanel {
    JPanel userProcessContainer;
    EcoSystem ecoSystem;
    /**
     * Creates new form SelectNetwork
     */
    public SelectNetwork(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        populateCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboxNetwork = new javax.swing.JComboBox<>();
        btnSelectNetwork = new javax.swing.JButton();

        cboxNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSelectNetwork.setText("Select Network");
        btnSelectNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectNetworkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(cboxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnSelectNetwork)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectNetwork))
                .addContainerGap(186, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectNetworkActionPerformed
        // TODO add your handling code here:
        for(Network network:ecoSystem.getNetworkList()){
            if(cboxNetwork.getSelectedItem().toString().equals(network.getName())){
                GroceriesAnalyticsReportsJPanel manageEnterpriseAdminJPanel=new GroceriesAnalyticsReportsJPanel(userProcessContainer, ecoSystem, network.getName());
                userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnSelectNetworkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelectNetwork;
    private javax.swing.JComboBox<String> cboxNetwork;
    // End of variables declaration//GEN-END:variables

    private void populateCombo() {
        cboxNetwork.removeAllItems();
        for(Network network:ecoSystem.getNetworkList()){
            cboxNetwork.addItem(network.getName());
        }
    }
}
