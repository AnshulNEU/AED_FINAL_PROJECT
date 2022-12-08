/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAcc;
import javax.swing.JPanel;
import userinterface.LegalAdministrativeRole.LegalAdminWorkAreaJPanel;

/**
 *
 * @author anshulsingh
 */
public class LawyerRoleAdmin extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LegalAdminWorkAreaJPanel(userProcessContainer,business,enterprise, account);
    }
}
