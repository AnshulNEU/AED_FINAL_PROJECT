/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAcc;
import javax.swing.JPanel;
import userinterface.BankManager.BankManagerWorkAreaJPanel;

/**
 *
 * @author nihil
 */
public class BankerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new BankManagerWorkAreaJPanel(userProcessContainer, account, organization, business, enterprise);
    }
    
}
