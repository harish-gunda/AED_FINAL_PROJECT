/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SalesPersonRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.WorkQueue.Order;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author harish
 */
public class CustomerDetails extends javax.swing.JPanel {
    
    Order order;
    JPanel userProcessContainer;
    EcoSystem ecoSystem;
    /**
     * Creates new form CustomerDetails
     */
    public CustomerDetails(JPanel userProcessContainer, Order order, EcoSystem ecoSystem) {
        initComponents();
        
        this.order = order;
        this.userProcessContainer = userProcessContainer;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCard = new javax.swing.JTextField();
        btnCompletePayment = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setText("Name");
        add(jLabel1);
        jLabel1.setBounds(111, 49, 36, 16);

        jLabel2.setText("CardNumber");
        add(jLabel2);
        jLabel2.setBounds(68, 93, 79, 16);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName);
        txtName.setBounds(210, 44, 146, 26);
        add(txtCard);
        txtCard.setBounds(210, 88, 146, 26);

        btnCompletePayment.setText("Complete payment");
        btnCompletePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletePaymentActionPerformed(evt);
            }
        });
        add(btnCompletePayment);
        btnCompletePayment.setBounds(206, 159, 162, 29);

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(17, 9, 93, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/payment.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, -10, 920, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnCompletePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletePaymentActionPerformed
        // TODO add your handling code here:
        if(txtCard.getText().isEmpty() || txtName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "All fields are mandatory");
            return;
        }
        Employee customer = new Employee(txtName.getText(), txtCard.getText());
        ecoSystem.getWorkQueue().getWorkRequestList().add(order);
        JOptionPane.showMessageDialog(this, "Transaction complete");
    }//GEN-LAST:event_btnCompletePaymentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SalesPersonTransactionHome dwjp = (SalesPersonTransactionHome) component;
        dwjp.populateProductList();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompletePayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCard;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
