/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAcc;
import userinterface.HospitalAdministrativeRole.HospitalAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.InsuranceManger.ViewInsuranceApplicationWorkAreaJPanel;

/**
 *
 * @author nihil
 */
public class InsuranceManagersRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ViewInsuranceApplicationWorkAreaJPanel(userProcessContainer, enterprise, account);
    }

    
    
}
