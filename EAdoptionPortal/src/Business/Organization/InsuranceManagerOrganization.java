/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InsuranceManagersRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anshulsingh
 */
public class InsuranceManagerOrganization extends Organization{

    public InsuranceManagerOrganization() {
        super(Organization.Type.InsuranceManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceManagersRole());
        return roles;
    }
     
   
    
    
}
