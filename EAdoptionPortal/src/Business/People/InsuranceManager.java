/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.WorkQueue.BirthMotherLoan;
import java.util.ArrayList;

/**
 *
 * @author nihil
 */
public class InsuranceManager extends Employees {
    public String InsuranceName;
   public int workRequestcount;
   public int maxFunding;
   public String location;
   
   private ArrayList<BirthMotherLoan> acceptedWorkRequests;
   private ArrayList<BirthMotherLoan> rejectedWorkRequests;

    public String getInsuranceName() {
        return InsuranceName;
    }

    public void setInsuranceName(String InsuranceName) {
        this.InsuranceName = InsuranceName;
    }

   

    public int getWorkRequestcount() {
        return workRequestcount;
    }

    public void setWorkRequestcount(int workRequestcount) {
        this.workRequestcount = workRequestcount;
    }

    public int getMaxFunding() {
        return maxFunding;
    }

    public void setMaxFunding(int maxFunding) {
        this.maxFunding = maxFunding;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<BirthMotherLoan> getAcceptedWorkRequests() {
        return acceptedWorkRequests;
    }

    public void setAcceptedWorkRequests(ArrayList<BirthMotherLoan> acceptedWorkRequests) {
        this.acceptedWorkRequests = acceptedWorkRequests;
    }

    public ArrayList<BirthMotherLoan> getRejectedWorkRequests() {
        return rejectedWorkRequests;
    }

    public void setRejectedWorkRequests(ArrayList<BirthMotherLoan> rejectedWorkRequests) {
        this.rejectedWorkRequests = rejectedWorkRequests;
    }
     
    
}
