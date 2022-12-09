/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author anshulsingh
 */
public class OrganizationalDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationalDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Counselor.getValue())){
            organization = new CounsellorsOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BankManager.getValue())){
            organization = new BankerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FinanceAdmin.getValue())){
            organization = new FinancialAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HospitalAdmin.getValue())){
            organization = new HospitalAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InsuranceManager.getValue())){
            organization = new InsuranceManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BirthMotherOrg.getValue())){
            organization = new BirthMothersOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ParentsOrg.getValue())){
            organization = new ParentalOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.OrphanageAdmin.getValue())){
        organization = new OrphanAdminOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Lawyer.getValue())){
        organization = new LawyerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    public boolean containsType(Type type){
        for (Organization org : organizationList){
            if(org.getName().equals(type.getValue())){
                return true;
            }
        }
        return false;
    }
    
}