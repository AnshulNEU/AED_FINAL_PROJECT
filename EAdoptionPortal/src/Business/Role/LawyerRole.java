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
import userinterface.CounselorRole.CounselorWorkAreaJPanel;
import userinterface.LawyerRole.LawyerWorkAreaJPanel;

/**
 *
 * @author nihil
 */
public class LawyerRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LawyerWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
    }
}
