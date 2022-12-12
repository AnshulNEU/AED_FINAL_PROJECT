/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.InsuranceManagersRole;
import Business.Role.LawyerRole;
import Business.Role.LawyerRoleAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anshulsingh
 */
public class LawyerAdminOrganization extends Organization {
    public LawyerAdminOrganization() {
        super(Organization.Type.LawyerAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LawyerRoleAdmin());
        return roles;
    }
}
