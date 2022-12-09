/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CounsellorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anshulsingh
 */
public class CounsellorsOrganization extends Organization{

    public CounsellorsOrganization() {
        super(Organization.Type.Counselor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CounsellorRole());
        return roles;
    }
     
}