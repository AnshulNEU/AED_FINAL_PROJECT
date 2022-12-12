/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

import Business.People.BirthMother;



/**
 *
 * @author anshulsingh
 */
public class InsuranceAccount {
    
    private String firstName;
    private String lastName;
    private String emailID;
    private String policyNum;
    private String address;
    private String counsellor;
    private String hospital;
    private int fundsApproved;
    private BirthMother birthmother;

   
    private String username;
    private String doctorPath;


    public InsuranceAccount(String firstName, String lastName, String emailId, String policynumber, String address, String docPath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailId;
        this.policyNum = policynumber;
        this.address = address;
        this.hospital = new String();
        this.fundsApproved = 0;
        
        this.doctorPath = docPath;
    }

    public InsuranceAccount() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(String policyNum) {
        this.policyNum = policyNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(String counsellor) {
        this.counsellor = counsellor;
    } 

    public BirthMother getBirthmother() {
        return birthmother;
    }

    public void setBirthmother(BirthMother birthmother) {
        this.birthmother = birthmother;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getFundsApproved() {
        return fundsApproved;
    }

    public void setFundsApproved(int fundsApproved) {
        
        this.fundsApproved = fundsApproved;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDoctorPath() {
        return doctorPath;
    }

    public void setDoctorPath(String doctorPath) {
        this.doctorPath = doctorPath;
    }
 
    @Override
    public String toString() {
        return username;
    }
    
    
    
}