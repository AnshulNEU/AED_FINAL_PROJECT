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
   public int workRequestCt;
   public int maxFunds;
   public String location;
   
   private ArrayList<BirthMotherLoan> acceptedWorkRequests;
   private ArrayList<BirthMotherLoan> rejectedWorkRequests;

    public String getInsuranceName() {
        return InsuranceName;
    }

    public void setInsuranceName(String InsuranceName) {
        this.InsuranceName = InsuranceName;
    }

   

    public int getWorkRequestCt() {
        return workRequestCt;
    }

    public void setWorkRequestCt(int workRequestCt) {
        this.workRequestCt = workRequestCt;
    }

    public int getMaxFunds() {
        return maxFunds;
    }

    public void setMaxFunds(int maxFunds) {
        this.maxFunds = maxFunds;
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
