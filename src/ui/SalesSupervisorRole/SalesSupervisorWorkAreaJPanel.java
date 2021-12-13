

package ui.SalesSupervisorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class SalesSupervisorWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserAccount userAccount;
    /** Creates new form AdminWorkAreaJPanel */
    public SalesSupervisorWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem ecoSystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        valueLabel.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnManageProducts = new javax.swing.JButton();
        btnBuyProducts = new javax.swing.JButton();
        userJButton1 = new javax.swing.JButton();
        manageEmployeeJButton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Super Market Admin");
        add(jLabel1);
        jLabel1.setBounds(280, 60, 426, 29);

        userJButton.setText("Manage User");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton);
        userJButton.setBounds(360, 340, 230, 29);

        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton);
        manageEmployeeJButton.setBounds(360, 290, 240, 29);

        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton);
        manageOrganizationJButton.setBounds(360, 240, 240, 29);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(290, 110, 120, 30);

        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(440, 120, 130, 16);

        btnManageProducts.setText("Manage product prices");
        btnManageProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductsActionPerformed(evt);
            }
        });
        add(btnManageProducts);
        btnManageProducts.setBounds(357, 440, 230, 29);

        btnBuyProducts.setText("Buy Products from Distributor");
        btnBuyProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyProductsActionPerformed(evt);
            }
        });
        add(btnBuyProducts);
        btnBuyProducts.setBounds(360, 390, 232, 29);

        userJButton1.setText("Raise Delivery request");
        userJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButton1ActionPerformed(evt);
            }
        });
        add(userJButton1);
        userJButton1.setBounds(360, 540, 230, 29);

        manageEmployeeJButton1.setText("Manage Requests");
        manageEmployeeJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButton1ActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton1);
        manageEmployeeJButton1.setBounds(360, 490, 230, 29);

        jButton1.setText("My Requests");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(360, 580, 230, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/supermarket.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(10, 10, 1180, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageSalesSupervisorUserAccountJPanel muajp = new ManageSalesSupervisorUserAccountJPanel(userProcessContainer, enterprise, ecoSystem);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageSalesEmployeeJPanel manageEmployeeJPanel = new ManageSalesEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageSuperMarketOrganizationJPanel manageOrganizationJPanel = new ManageSuperMarketOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void btnManageProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductsActionPerformed
        // TODO add your handling code here:
        ManageProductsJPanel buyProductsFromDistributorJPanel = new ManageProductsJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageEmployeeJPanel", buyProductsFromDistributorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageProductsActionPerformed

    private void btnBuyProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyProductsActionPerformed
        // TODO add your handling code here:
        SelectDistributorJPanel buyProductsFromDistributorJPanel = new SelectDistributorJPanel(userProcessContainer,ecoSystem, userAccount, enterprise);
        userProcessContainer.add("manageEmployeeJPanel", buyProductsFromDistributorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBuyProductsActionPerformed

    private void userJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButton1ActionPerformed
        // TODO add your handling code here:
        RaiseSupplierRequest muajp = new RaiseSupplierRequest(userProcessContainer, enterprise, userAccount,ecoSystem);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButton1ActionPerformed

    private void manageEmployeeJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButton1ActionPerformed

        ManageCustomerRequests manageEmployeeJPanel = new ManageCustomerRequests(userProcessContainer, enterprise, userAccount, ecoSystem);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PreviousOrdersSMA muajp = new PreviousOrdersSMA(userProcessContainer, enterprise, userAccount,ecoSystem);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyProducts;
    private javax.swing.JButton btnManageProducts;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageEmployeeJButton1;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JButton userJButton1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
