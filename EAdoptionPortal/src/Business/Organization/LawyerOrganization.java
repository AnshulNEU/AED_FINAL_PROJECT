/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.InsuranceManagersRole;
import Business.Role.LawyerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anshulsingh
 */
public class LawyerOrganization extends Organization {
    public LawyerOrganization() {
        super(Organization.Type.Lawyer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LawyerRole());
        return roles;
    }
}
