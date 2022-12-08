/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CounsellorsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAcc;
import javax.swing.JPanel;
import userinterface.CounselorRole.CounselorWorkAreaJPanel;

/**
 *
 * @author nihil
 */
public class CounsellorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CounselorWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
    }
    
    
}
