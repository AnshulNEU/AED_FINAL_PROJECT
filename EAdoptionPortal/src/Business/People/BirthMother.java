/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.BankAccount.LoanAccount;
import Business.Insurance.InsuranceAccount;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author nihil
 */
public class BirthMother {
   
    private String username;
    private int id;
    private static int count = new Random().nextInt(100);
    private String emailID;
      private String imgPath;
    private String firstName;
    private String lastName;
    
    
    private String password;
    
    private String Hospital;
  
    private String bloodGroup;
    private int typeL = 0;
    

    private String address;
    private String counsellor;
    private ArrayList<Parents> acceptedParents;
    private InsuranceAccount insurance;
    private Parents finalizedParent;
   
    
 
    private int bankBal;
    private int parentAidfund;
    private int netFunds; 

    
    private int loanRequestAmount;
    private int loanAmountApproved;
    private int requiredFund;
    private int insuranceAmt;
    private int ownedFunds;

    private String contactMother;

    public String getContactMother() {
        return contactMother;
    }

    public void setContactMother(String contactMother) {
        this.contactMother = contactMother;
    }
    
    private LoanAccount loanaccount;

    public int getRequiredFund() {
        return requiredFund;
    }

    public int getOwnedFunds() {
        return ownedFunds;
    }

    public int getTypeL() {
        return typeL;
    }

    public void setTypeL(int typeL) {
        this.typeL = typeL;
    }

    public void setOwnedFunds(int ownedFunds) {
        this.ownedFunds = ownedFunds;
    }

    public void setRequiredFund(int requiredFund) {
        this.requiredFund = requiredFund;
    }

    public int getNetFunding(){
        if (requiredFund !=0 && bankBal!=0){
            netFunds = requiredFund - (bankBal + parentAidfund);
        }
        return netFunds;
    }

    public int getLoanRequestAmount() {
        return loanRequestAmount;
    }

    public int getLoanAmountApproved() {
        return loanAmountApproved;
    }


    public void setLoanRequestAmount(int loanRequestAmount) {
        this.loanRequestAmount = loanRequestAmount;
    }

    public void setLoanAmountApproved(int loanAmountApproved) {
        this.loanAmountApproved = loanAmountApproved;
    }

    public void setNetFunds(int netFunds) {
        this.netFunds = netFunds;
    }
    
   
    public int getBankBal() {
        return bankBal;
    }

    public void setBankBal(int bankBal) {
        this.bankBal = bankBal;
    }

    public int getParentAidfund() {
        return parentAidfund;
    }

    public void setParentAidfund(int parentAidfund) {
        this.parentAidfund = parentAidfund;
    }

    public LoanAccount getLoanaccount() {
        return loanaccount;
    }

    public Parents getFinalizedParent() {
        return finalizedParent;
    }

    public void setFinalizedParent(Parents finalizedParent) {
        this.finalizedParent = finalizedParent;
    }

    public void setLoanaccount(LoanAccount loanaccount) {
        this.loanaccount = loanaccount;
    }

    public ArrayList<Parents> getAcceptedParents() {
        return acceptedParents;
    }

    public void setAcceptedParents(ArrayList<Parents> acceptedParents) {
        this.acceptedParents = acceptedParents;
    }


    public String getAddress() {
        return address;
    }

    public String getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(String counsellor) {
        this.counsellor = counsellor;
    }

    public InsuranceAccount getInsurance() {
        return insurance;
    }

    public void setInsurance(InsuranceAccount insurance) {
        this.insurance = insurance;
    }

    public int getInsuranceAmt() {
        return insuranceAmt;
    }

    public void setInsuranceAmt(int insuranceAmt) {
        this.insuranceAmt = insuranceAmt;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    
    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    

    public BirthMother() {
        id = count;
        count++;
        this.Hospital =new String();
        this.emailID =new String();
        this.password =new String();
        this.username =new String();
        this.loanaccount = new LoanAccount();
        this.insurance = new InsuranceAccount();
        acceptedParents = new ArrayList<>();
     this.requiredFund =0;
     this.insuranceAmt =0;
     this.bankBal = 0;
     this.parentAidfund =0;
     this.netFunds = 0;
                
    }


    public int getId() {
        return id;
    }

    public void setUsername(String name) {
        this.username = name;
    }
    
    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return username;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }

  

    public void setAllValues(String username, String firstName, String LastName, String email, String blood, String contact, String address, String imgPath) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = LastName;
        this.emailID = email;
        this.bloodGroup = blood;
        //this.bankBal = fund;
        this.contactMother = contact;
        this.address = address;
        this.imgPath = imgPath;
       
    }
//    public void setValues(String firstName, String LastName, String email, int bankBal, String address) {
//        this.firstName = firstName;
//        this.lastName = LastName;
//        this.emailID = email;
//        this.ownedFunds = bankBal;
//        this.bankBal = bankBal;
//        this.address = address;
//        this.imgPath = imgPath;
//    } 
//    
}
