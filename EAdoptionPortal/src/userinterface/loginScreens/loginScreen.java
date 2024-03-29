/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.loginScreens;

import Business.Enterprise.Enterprise;
import Business.Network.Networking;
import Business.Organization.Organization;
import Business.UserAccount.UserAcc;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Organization.Organization.Type;
/**
 *
 * @author nihil
 */
public class loginScreen extends javax.swing.JPanel {

    /**
     * Creates new form loginMother
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Type type;
  
    
    public loginScreen(JPanel userProcessContainer, EcoSystem system, Type type ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.type = type;
      
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
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(26, 26, 29));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 245, 225));
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 245, 225));
        jLabel2.setText("Password:");

        btnLogin.setBackground(new java.awt.Color(252, 68, 69));
        btnLogin.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(237, 245, 225));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
                // Get user name
                
        String userName = txtUserName.getText();
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        //Step1: Check in the system admin user account directory if you have the user
        UserAcc userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
        
        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        
        if (type.getValue().equals(type.HospitalAdmin.getValue())){
            if(userAccount==null){
                //Step 2: Go inside each network and check each enterprise
                for(Networking network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseDir()){
                        userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                        if(userAccount!=null){
                                   inEnterprise=enterprise;
                                   break;
                        }  
                    }
                    if(inEnterprise!=null){
                    break;}
                }
            }
        } else  if (type.getValue().equals(type.LawyerAdmin.getValue())){
            if(userAccount==null){
                //Step 2: Go inside each network and check each enterprise
                for(Networking network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseDir()){
                        userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                        if(userAccount!=null){
                                   inEnterprise=enterprise;
                                   break;
                        }  
                    }
                    if(inEnterprise!=null){
                    break;}
                }
            }
        }
        
        else if(type.getValue().equals(type.Counselor.getValue())){
          if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
                for(Networking network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseDir()){
                        if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().Hospital)){
                            for(Organization organization:enterprise.getOrganizationalDirectory().getOrganizationList()){
                                if(organization.getName().equals("Counselor Organization")){
                                    userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if(userAccount!=null){
                                        inEnterprise=enterprise;
                                        inOrganization=organization;
                                       
                                        break;
                                    }
                                }
                            }
                        }
                    if(userAccount!=null){
                        break;
                        }
                    }
                    if(userAccount!=null){
                            break;
                            }
                }
            }
        }else if(type.getValue().equals(type.BirthMotherOrg.getValue())){
          if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
                for(Networking network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseDir()){
                        if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().Hospital)){
                            for(Organization organization:enterprise.getOrganizationalDirectory().getOrganizationList()){
                                if(organization.getName().equals("BirthMother Organization")){
                                    userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if(userAccount!=null){
                                        inEnterprise=enterprise;
                                        inOrganization=organization;
                                        break;
                                    }
                                }
                            }
                        }
                        if(userAccount!=null){
                            break;
                            }
                    }
                if(userAccount!=null){
                            break;
                            }
                }
            }
        }else if(type.getValue().equals(type.ParentsOrg.getValue())){
          if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
                for(Networking network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseDir()){
                        if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().Hospital)){
                            for(Organization organization:enterprise.getOrganizationalDirectory().getOrganizationList()){
                                if(organization.getName().equals("Parents Organization")){
                                    userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if(userAccount!=null){
                                        inEnterprise=enterprise;
                                        inOrganization=organization;
                                        break;
                                    }
                                }
                            }
                            
                        }
                        if(userAccount!=null){
                            break;
                            }
                    }
                    if(userAccount!=null){
                            break;
                            }
                }
            }
        }else if(type.getValue().equals(type.BankManager.getValue())){
          if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
                for(Networking network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseDir()){
                        if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().FinancialEnterprise)){
                            for(Organization organization:enterprise.getOrganizationalDirectory().getOrganizationList()){
                                if(organization.getName().equals("BankManager Organization")){
                                    userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if(userAccount!=null){
                                        inEnterprise=enterprise;
                                        inOrganization=organization;
                                        break;
                                    }
                                }
                            }
                            
                        }
                        if(userAccount!=null){
                            break;
                            }
                    }
                    if(userAccount!=null){
                            break;
                            }
                }
            }
        }else if(type.getValue().equals(type.InsuranceManager.getValue())){
          if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
                for(Networking network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseDir()){
                        if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().FinancialEnterprise)){
                            for(Organization organization:enterprise.getOrganizationalDirectory().getOrganizationList()){
                                if(organization.getName().equals("InsuranceManager Organization")){
                                    userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if(userAccount!=null){
                                        inEnterprise=enterprise;
                                        inOrganization=organization;
                                        break;
                                    }
                                }
                            }
                        }
                        if(userAccount!=null){
                            break;
                            }
                    }
                    if(userAccount!=null){
                            break;
                            }
                }
            }
        }else if(type.getValue().equals(type.Lawyer.getValue())){
          if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
                for(Networking network:system.getNetworkList()){
                    //Step 2.a: check against each enterprise
                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseDir()){
                        if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().LegalEnterprise)){
                            for(Organization organization:enterprise.getOrganizationalDirectory().getOrganizationList()){
                                if(organization.getName().equals("Lawyer Organization")){
                                    userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if(userAccount!=null){
                                        inEnterprise=enterprise;
                                        inOrganization=organization;
                                       
                                        break;
                                    }
                                }
                            }
                        }
                    if(userAccount!=null){
                        break;
                        }
                    }
                    if(userAccount!=null){
                            break;
                            }
                }
            }
        }
        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            userProcessContainer.add("workArea",userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inOrganization, inEnterprise, system));
            layout.next(userProcessContainer);
        }
        
        btnLogin.setEnabled(false);
        //logoutJButton.setEnabled(true);
        txtUserName.setEnabled(false);
        txtPassword.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
