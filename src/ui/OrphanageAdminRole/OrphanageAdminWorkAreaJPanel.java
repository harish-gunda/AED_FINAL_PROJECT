

package ui.OrphanageAdminRole;

import Business.EcoSystem;
import ui.AdministrativeRole.*;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author dell
 */
public class OrphanageAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserAccount userAccount;
    /** Creates new form AdminWorkAreaJPanel */
    public OrphanageAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise,EcoSystem business,UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
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
        manageCareTakerJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        ManageRequestButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        userJButton.setText("Manage User");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 150, -1));

        manageCareTakerJButton.setText("Manage CareTaker");
        manageCareTakerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCareTakerJButtonActionPerformed(evt);
            }
        });
        add(manageCareTakerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 150, -1));

        manageOrganizationJButton.setText("Manage Orphanage");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));

        ManageRequestButton.setText("Manage Request");
        ManageRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageRequestButtonActionPerformed(evt);
            }
        });
        add(ManageRequestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageOrphanageUserAccountJPanel manageOrphanageUserAccount = new ManageOrphanageUserAccountJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("manageOrphanageUserAccountJPanel", manageOrphanageUserAccount);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageCareTakerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCareTakerJButtonActionPerformed

        ManageCareTakerJPanel manageCareTakerJPanel = new ManageCareTakerJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageCareTakerJPanel", manageCareTakerJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageCareTakerJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrphanageOrganizationJPanel manageOrphanageOrganizationJPanel = new ManageOrphanageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrphanageOrganizationJPanel", manageOrphanageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void ManageRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageRequestButtonActionPerformed
        // TODO add your handling code here:
        ManageCareTakerRequestJPanel manageCareTakerRequestJPanel = new ManageCareTakerRequestJPanel(userProcessContainer, enterprise, ecoSystem, userAccount);
        userProcessContainer.add("manageCareTakerRequestJPanel", manageCareTakerRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageRequestButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageRequestButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageCareTakerJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
