/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HeavyDriverRole;

import ui.LightDriverRole.*;
import Business.WorkQueue.Order;
import Business.WorkQueue.Product;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author harish
 */
public class ProcessHeavyRequests extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Order order;
    /**
     * Creates new form ProcessLightRequests
     */
    public ProcessHeavyRequests(JPanel userProcessContainer, Order order) {
        initComponents();
        this.order = order;
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtStatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jButton1.setText("Complete");
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
                .addGap(79, 79, 79)
                .addComponent(txtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(order.getStatus().toLowerCase().contains("success") || order.getStatus().toLowerCase().contains("fail")){
           JOptionPane.showMessageDialog(this, "Cannot complete this order");
           return; 
        }
        if(txtStatus.getText().contains("success")){
            order.setStatus("delivered successfully");
            for(Product product:order.getProductList()){
                boolean check = true;
                for(Product product1:order.getReceiverEnterprise().getProductList()){
                    if(product.getName().equals(product1.getName())){
                        product1.setQuantity(product1.getQuantity()+product.getQuantity());
                        check = false;
                    }
                }
                if(check){
                    order.getReceiverEnterprise().getProductList().add(product);
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Order processed");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
