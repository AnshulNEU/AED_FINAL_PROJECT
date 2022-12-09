/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.BankAccount.LoanDirectory;
import Business.Insurance.InsuranceDirectory;
import Business.People.BirthMotherDirectory;
import Business.People.EmployeeDirectory;
import Business.People.LawyerDirectory;
import Business.People.OrphanageDirectory;
import Business.People.ParentDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccDirectory;
import Business.WorkQueue.WorkQ;
import java.util.ArrayList;

/**
 *
 * @author anshulsingh
 */
public abstract class Organization {

    private String name;

    private WorkQ workQueue;
    private ParentDirectory parentDirectory;
    private BirthMotherDirectory birthMotherDirectory;
    private EmployeeDirectory employeeDirectory;
    private UserAccDirectory userAccountDirectory;
    private LoanDirectory loanDirectory;
    private LawyerDirectory lawyerDirectory;
    private InsuranceDirectory insuranceAccountDirectory;
    private OrphanageDirectory orphanageDirectory;
   
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        HospitalAdmin("HospitalAdmin Organization"), 
        LawyerAdmin("LawyerAdmin Organization"),
        Counselor("Counselor Organization"), 
        BankManager("BankManager Organization"),
        InsuranceManager("InsuranceManager Organization"),
        FinanceAdmin("FinanceAdmin Organization"),
        BirthMotherOrg("BirthMother Organization"),
        ParentsOrg("Parents Organization"),
        OrphanageAdmin("OrphanageAdmin Organization"),
        Lawyer("Lawyer Organization");
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
      
        workQueue = new WorkQ();
        employeeDirectory = new EmployeeDirectory();
        parentDirectory = new ParentDirectory();
        birthMotherDirectory = new BirthMotherDirectory();
        userAccountDirectory = new UserAccDirectory();
        loanDirectory = new LoanDirectory();
        insuranceAccountDirectory = new InsuranceDirectory();
        orphanageDirectory = new OrphanageDirectory();
        lawyerDirectory = new LawyerDirectory();
        organizationID = counter;
        ++counter;
    }

    public LawyerDirectory getLawyerDirectory() {
        return lawyerDirectory;
    }

    public void setLawyerDirectory(LawyerDirectory lawyerDirectory) {
        this.lawyerDirectory = lawyerDirectory;
    }

    public LoanDirectory getLoanDirectory() {
        return loanDirectory;
    }

    public void setLoanDirectory(LoanDirectory loanDirectory) {
        this.loanDirectory = loanDirectory;
    }

    public ParentDirectory getParentDirectory() {
        return parentDirectory;
    }

    public void setParentDirectory(ParentDirectory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }

    public BirthMotherDirectory getBirthMotherDirectory() {
        return birthMotherDirectory;
    }

    public void setBirthMotherDirectory(BirthMotherDirectory birthMotherDirectory) {
        this.birthMotherDirectory = birthMotherDirectory;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public InsuranceDirectory getInsuranceAccountDirectory() {
        return insuranceAccountDirectory;
    }

    public void setInsuranceAccountDirectory(InsuranceDirectory insuranceAccountDirectory) {
        this.insuranceAccountDirectory = insuranceAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQ getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQ workQueue) {
        this.workQueue = workQueue;
    }

     public OrphanageDirectory getOrphanageDirectory() {
        return orphanageDirectory;
    }

    public void setOrphanageDirectory(OrphanageDirectory orphanageDirectory) {
        this.orphanageDirectory = orphanageDirectory;
    }
    @Override
    public String toString() {
        return name;
    }
    

}
