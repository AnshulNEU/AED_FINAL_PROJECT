/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankAccount;

import java.util.Random;

/**
 *
 * @author hrishikeshwarrier
 */
public class LoanAccount {
    
    private String firstName;
    private String lastName;
    private String emailID;
    private int fund;
    private String address;
    private int bankAccountNum;
    private int bankBal;
    private String passportNum;
    private String username;
    private int ownedFund;
    private String doctorPath;
    private String counsellor;
    private String hospital;
    private int fundsApproved;

    public int getFundsApproved() {
        return fundsApproved;
    }

    public void setFundsApproved(int fundsApproved) {
        this.fundsApproved = fundsApproved;
    }

    public int getOwnedFund() {
        return ownedFund;
    }

    public void setOwnedFund(int ownedFund) {
        this.ownedFund = ownedFund;
    }

    

    public LoanAccount(String firstName, String emailId) {
        this.firstName = firstName;
        this.emailID = emailId;
        Random rand =  new Random();
        this.bankAccountNum = rand.nextInt(100000000);
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }


    public String getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(String counsellor) {
        this.counsellor = counsellor;
    }
    

    public int getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(int bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public int getBankBal() {
        return bankBal;
    }

    public void setBankBal(int bankBal) {
        this.bankBal = bankBal;
    }
    

    public LoanAccount() {
        this.firstName = new String();
        this.emailID = new String();
        this.lastName = new String();
        this.address = new String();
        this.fund = 0;
        this.passportNum = new String();
        this.doctorPath = new String();
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

    public int getFund() {
        return fund;
    }

    public void setFund(int fund) {
        this.fund = fund;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
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

    
    public void addValues(String emailId, int funds, String address, String passportNumber, String docPath) {
        this.emailID = emailId;
        this.fund = funds;
        this.address = address;
        this.passportNum = passportNumber;
        this.doctorPath = docPath;
        
    }
    
    public void addValues1(String emailId, int funds, String address, String passportNumber, String docPath) {
        this.emailID = emailId;
        this.ownedFund = funds;
        this.address = address;
        this.passportNum = passportNumber;
        this.doctorPath = docPath;
        
    }
    @Override
    public String toString() {
        return firstName;
    }
    
}