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

/**
 *
 * @author nihil
 */
public abstract class Role {
    
    public enum RoleType{
        FinanceAdmin("FinanceAdmin"),
        Counselor("Counselor"),
        BankManager("BankManager"),
        InsuranceManager("InsuranceManager"),
        HospitalAdmin ("HospitalAdmin"),
        BirthMotherRole("BirthMother"),
        ParentsRole("Parents"),
        LawyerRole("Lawyer");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAcc account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}