/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.People.BirthMother;
import java.util.ArrayList;

/**
 *
 * @author nihil
 */
public class WorkQ {
    
    private ArrayList<BirthMotherLawyer> birthMotherLawyer;
    private ArrayList<ParentsToLawyer> parentsLawyer;
    private ArrayList<BirthMotherCounselor> birthMotherCounselor;
    private ArrayList<ParentsToCounsellor> parentCounselor;
    private ArrayList<CounsellorsToAdmin> counselorAdmin;
    private ArrayList<BirthMotherParent> birthMotherParent;
    private ArrayList<BirthMotherLoan> birthMotherLoan; 
    private ArrayList<HospitalToBank> hospitalAdminBank;
    private ArrayList<BirthMotherInsuranceManager> birthMotherInsurance;
    private ArrayList<OrphanageToCounsellor> orphanageCounselor;
    private ArrayList<OrphanageToLawyer> orphanageLawyer;
    private ArrayList<LawyerToAdmin> lawyerAdmin;
    private ArrayList<CounsellorsToLawyer> counselorLawyer;
    
    public WorkQ() {
        birthMotherCounselor = new ArrayList();
        parentCounselor = new ArrayList();
        counselorAdmin = new ArrayList();
        counselorLawyer = new ArrayList();
        birthMotherParent =  new ArrayList();
        birthMotherLoan = new ArrayList();
        hospitalAdminBank = new ArrayList<>();
        birthMotherInsurance = new ArrayList<>();
        orphanageCounselor= new ArrayList<>();
        birthMotherLawyer = new ArrayList();
        parentsLawyer = new ArrayList();
        orphanageLawyer= new ArrayList<>();
        lawyerAdmin = new ArrayList();
               
    }  

    public ArrayList<BirthMotherInsuranceManager> getBirthMotherInsurance() {
        return birthMotherInsurance;
    }

    public void setBirthMotherInsurance(ArrayList<BirthMotherInsuranceManager> birthMotherInsurance) {
        this.birthMotherInsurance = birthMotherInsurance;
    }
    
    public ArrayList<BirthMotherLoan> getBirthMotherLoan() {
        return birthMotherLoan;
    }

    public void setBirthMotherLoan(ArrayList<BirthMotherLoan> birthMotherLoan) {
        this.birthMotherLoan = birthMotherLoan;
    }

    public ArrayList<BirthMotherParent> getBirthMotherParent() {
        return birthMotherParent;
    }

    public void setBirthMotherParent(ArrayList<BirthMotherParent> birthMotherParent) {
        this.birthMotherParent = birthMotherParent;
    }

    public ArrayList<BirthMotherCounselor> getBirthMotherToCounsellor() {
        return birthMotherCounselor;
    }
    
    public ArrayList<BirthMotherLawyer> getBirthMotherLawyer() {
        return birthMotherLawyer;
    }

    public ArrayList<ParentsToCounsellor> getParentCounselor() {
        return parentCounselor;
    }
    
    public ArrayList<ParentsToLawyer> getParentsLawyer() {
        return parentsLawyer;
    }

    public ArrayList<OrphanageToCounsellor> getOrphanageCounselor() {
        return orphanageCounselor;
    }
    public ArrayList<CounsellorsToLawyer> getCounselorLawyer() {
        return counselorLawyer;
    }
    public void setOrphanageCounselor(ArrayList<OrphanageToCounsellor> orphanageCounselor) {
        this.orphanageCounselor = orphanageCounselor;
    }
    
    public void setOrphanageLawyer(ArrayList<OrphanageToLawyer> orphanageLawyer) {
        this.orphanageLawyer = orphanageLawyer;
    }

    public void setBirthMotherLawyer(ArrayList<BirthMotherLawyer> birthMotherLawyer) {
        this.birthMotherLawyer = birthMotherLawyer;
    }
    
    public void setBirthMotherCounselor(ArrayList<BirthMotherCounselor> birthMotherCounselor) {
        this.birthMotherCounselor = birthMotherCounselor;
    }
    public void addBirthMotherToCounselor(BirthMotherCounselor bMC) {
       birthMotherCounselor.add(bMC);  
    }
    public void addBirthMotherToLawyer(BirthMotherLawyer bML) {
       birthMotherLawyer.add(bML);  
    }
    public void addOrphanageToCounselor(OrphanageToCounsellor oc){
        orphanageCounselor.add(oc);
    }
    public void setParentCounsellor(ArrayList<ParentsToCounsellor> parentToCounselor) {
        this.parentCounselor = parentToCounselor;
    }
    
    public void addOrphanageToLawyer(OrphanageToLawyer ol){
        orphanageLawyer.add(ol);
    }
    public void setParentLawyer(ArrayList<ParentsToLawyer> parentsToLawyer) {
        this.parentsLawyer = parentsToLawyer;
    }

    public void setCounselorAdmin(ArrayList<CounsellorsToAdmin> counselorAdmin) {
        this.counselorAdmin = counselorAdmin;
    }
    
    public void setLawyerAdmin(ArrayList<LawyerToAdmin> lawyerAdmin) {
        this.lawyerAdmin = lawyerAdmin;
    }

    public ArrayList<CounsellorsToAdmin> getCounselorAdmin() {
        return counselorAdmin;
    }
    public ArrayList<LawyerToAdmin> getLawyerAdmin() {
        return lawyerAdmin;
    }
    public ArrayList<HospitalToBank> getHospitalAdminBank() {
        return hospitalAdminBank;
    }

    public void setHospitalAdminBank(ArrayList<HospitalToBank> hospitalAdminBank) {
        this.hospitalAdminBank = hospitalAdminBank;
    }
    
}