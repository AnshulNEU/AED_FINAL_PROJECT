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
    
    private ArrayList<BirthMotherLawyer> birthMotherToLawyer;
    private ArrayList<ParentsToLawyer> parentsToLawyer;
    private ArrayList<BirthMotherCounselor> birthMotherToCounselor;
    private ArrayList<ParentsToCounsellor> parentToCounselor;
    private ArrayList<CounsellorsToAdmin> counselorToAdmin;
    private ArrayList<BirthMotherParent> birthMotherToParent;
    private ArrayList<BirthMotherLoan> birthMotherToLoan; 
    private ArrayList<HospitalToBank> hospitalAdminToBank;
    private ArrayList<BirthMotherInsuranceManager> birthMotherToInsurance;
    private ArrayList<OrphanageToCounsellor> orphanageToCounselor;
    private ArrayList<OrphanageToLawyer> orphanageToLawyer;
    private ArrayList<LawyerToAdmin> lawyerToAdmin;
    
    public WorkQ() {
        birthMotherToCounselor = new ArrayList();
        parentToCounselor = new ArrayList();
        counselorToAdmin = new ArrayList();
        birthMotherToParent =  new ArrayList();
        birthMotherToLoan = new ArrayList();
        hospitalAdminToBank = new ArrayList<>();
        birthMotherToInsurance = new ArrayList<>();
        orphanageToCounselor= new ArrayList<>();
        birthMotherToLawyer = new ArrayList();
        parentsToLawyer = new ArrayList();
        orphanageToLawyer= new ArrayList<>();
        lawyerToAdmin = new ArrayList();
               
    }  

    public ArrayList<BirthMotherInsuranceManager> getBirthMotherToInsurance() {
        return birthMotherToInsurance;
    }

    public void setBirthMotherToInsurance(ArrayList<BirthMotherInsuranceManager> birthMotherToInsurance) {
        this.birthMotherToInsurance = birthMotherToInsurance;
    }
    
    public ArrayList<BirthMotherLoan> getBirthMotherToLoan() {
        return birthMotherToLoan;
    }

    public void setBirthMotherToLoan(ArrayList<BirthMotherLoan> birthMotherToLoan) {
        this.birthMotherToLoan = birthMotherToLoan;
    }

    public ArrayList<BirthMotherParent> getBirthMotherToParent() {
        return birthMotherToParent;
    }

    public void setBirthMotherToParent(ArrayList<BirthMotherParent> birthMotherToParent) {
        this.birthMotherToParent = birthMotherToParent;
    }

    public ArrayList<BirthMotherCounselor> getBirthMotherToCounsellor() {
        return birthMotherToCounselor;
    }
    
    public ArrayList<BirthMotherLawyer> getBirthMotherToLawyer() {
        return birthMotherToLawyer;
    }

    public ArrayList<ParentsToCounsellor> getParentToCounselor() {
        return parentToCounselor;
    }
    
    public ArrayList<ParentsToLawyer> getParentsToLawyer() {
        return parentsToLawyer;
    }

    public ArrayList<OrphanageToCounsellor> getOrphanageToCounselor() {
        return orphanageToCounselor;
    }

    public void setOrphanageToCounselor(ArrayList<OrphanageToCounsellor> orphanageToCounselor) {
        this.orphanageToCounselor = orphanageToCounselor;
    }
    
    public void setOrphanageToLawyer(ArrayList<OrphanageToLawyer> orphanageToLawyer) {
        this.orphanageToLawyer = orphanageToLawyer;
    }

    public void setBirthMotherToLawyer(ArrayList<BirthMotherLawyer> birthMotherToLawyer) {
        this.birthMotherToLawyer = birthMotherToLawyer;
    }
    
    public void setBirthMotherToCounselor(ArrayList<BirthMotherCounselor> birthMotherToCounselor) {
        this.birthMotherToCounselor = birthMotherToCounselor;
    }
    public void addBirthMotherToCounselor(BirthMotherCounselor bMC) {
       birthMotherToCounselor.add(bMC);  
    }
    public void addBirthMotherToLawyer(BirthMotherLawyer bML) {
       birthMotherToLawyer.add(bML);  
    }
    public void addOrphanageToCounselor(OrphanageToCounsellor oc){
        orphanageToCounselor.add(oc);
    }
    public void setParentCounsellor(ArrayList<ParentsToCounsellor> parentToCounselor) {
        this.parentToCounselor = parentToCounselor;
    }
    
    public void addOrphanageToLawyer(OrphanageToLawyer ol){
        orphanageToLawyer.add(ol);
    }
    public void setParentLawyer(ArrayList<ParentsToLawyer> parentsToLawyer) {
        this.parentsToLawyer = parentsToLawyer;
    }

    public void setCounselorToAdmin(ArrayList<CounsellorsToAdmin> counselorToAdmin) {
        this.counselorToAdmin = counselorToAdmin;
    }
    
    public void setLawyerToAdmin(ArrayList<LawyerToAdmin> lawyerToAdmin) {
        this.lawyerToAdmin = lawyerToAdmin;
    }

    public ArrayList<CounsellorsToAdmin> getCounselorToAdmin() {
        return counselorToAdmin;
    }
    public ArrayList<LawyerToAdmin> getLawyerToAdmin() {
        return lawyerToAdmin;
    }
    public ArrayList<HospitalToBank> getHospitalAdminToBank() {
        return hospitalAdminToBank;
    }

    public void setHospitalAdminToBank(ArrayList<HospitalToBank> hospitalAdminToBank) {
        this.hospitalAdminToBank = hospitalAdminToBank;
    }
    
}