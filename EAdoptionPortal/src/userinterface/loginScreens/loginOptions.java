/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.loginScreens;

import Business.EcoSystem;
import Business.Organization.Organization.Type;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nihil
 */
public class loginOptions extends javax.swing.JPanel {

    /**
     * Creates new form loginOptions
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Type type;
            
    
    public loginOptions(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdmin = new javax.swing.JButton();
        btnMother = new javax.swing.JButton();
        btnFamily = new javax.swing.JButton();
        btnCounselor = new javax.swing.JButton();
        btnFinance = new javax.swing.JButton();
        btnFinance1 = new javax.swing.JButton();
        btnLawyer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 26, 29));

        btnAdmin.setBackground(new java.awt.Color(252, 68, 69));
        btnAdmin.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(237, 245, 225));
        btnAdmin.setText("ADMIN");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnMother.setBackground(new java.awt.Color(252, 68, 69));
        btnMother.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnMother.setForeground(new java.awt.Color(237, 245, 225));
        btnMother.setText("MOTHER");
        btnMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotherActionPerformed(evt);
            }
        });

        btnFamily.setBackground(new java.awt.Color(252, 68, 69));
        btnFamily.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnFamily.setForeground(new java.awt.Color(237, 245, 225));
        btnFamily.setText("PARENTS");
        btnFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamilyActionPerformed(evt);
            }
        });

        btnCounselor.setBackground(new java.awt.Color(252, 68, 69));
        btnCounselor.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnCounselor.setForeground(new java.awt.Color(237, 245, 225));
        btnCounselor.setText("COUNSELOR");
        btnCounselor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCounselorActionPerformed(evt);
            }
        });

        btnFinance.setBackground(new java.awt.Color(252, 68, 69));
        btnFinance.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnFinance.setForeground(new java.awt.Color(237, 245, 225));
        btnFinance.setText("INSURANCE");
        btnFinance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceActionPerformed(evt);
            }
        });

        btnFinance1.setBackground(new java.awt.Color(252, 68, 69));
        btnFinance1.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnFinance1.setForeground(new java.awt.Color(237, 245, 225));
        btnFinance1.setText("BANK");
        btnFinance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinance1ActionPerformed(evt);
            }
        });

        btnLawyer.setBackground(new java.awt.Color(252, 68, 69));
        btnLawyer.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnLawyer.setForeground(new java.awt.Color(237, 245, 225));
        btnLawyer.setText("LAWYER");
        btnLawyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLawyerActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/family_new.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCounselor, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinance1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMother, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinance, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(255, 255, 255)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnMother, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinance, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinance1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnCounselor, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btnLawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(843, 843, 843))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer, system, type.HospitalAdmin);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotherActionPerformed

        loginScreen ls = new loginScreen(userProcessContainer, system, type.BirthMotherOrg);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMotherActionPerformed

    private void btnFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamilyActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer, system, type.ParentsOrg);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFamilyActionPerformed

    private void btnCounselorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCounselorActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer, system, type.Counselor);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCounselorActionPerformed

    private void btnFinanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer,system, type.InsuranceManager);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFinanceActionPerformed

    private void btnFinance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinance1ActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer,system, type.BankManager);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFinance1ActionPerformed

    private void btnLawyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLawyerActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer, system, type.Lawyer);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnLawyerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCounselor;
    private javax.swing.JButton btnFamily;
    private javax.swing.JButton btnFinance;
    private javax.swing.JButton btnFinance1;
    private javax.swing.JButton btnLawyer;
    private javax.swing.JButton btnMother;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
