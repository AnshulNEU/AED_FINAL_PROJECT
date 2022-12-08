/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAcc;
import javax.swing.JPanel;
import userinterface.ParentsRole.ParentsWorkAreaJPanel;

/**
 *
 * @author nihil
 */
public class ParentsRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ParentsWorkAreaJPanel(userProcessContainer, enterprise, account, organization);
    }
    
}
