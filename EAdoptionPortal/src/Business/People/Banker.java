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
public class Banker extends Employees{

   public String BankName;
   public int workRequestct;
   public int maxFunds;
   public String location;
   
   private ArrayList<BirthMotherLoan> acceptedWorkRequests;
   private ArrayList<BirthMotherLoan> rejectedWorkRequests;
   

    public Banker(String BankName, int workRequestcount, int maxFunding, String location) {
        super();
        this.BankName = BankName;
        this.workRequestct = workRequestcount;
        this.maxFunds = maxFunding;
        this.location = location;
    }
    
    public Banker() {
        super();
        this.BankName = new String();
        this.workRequestct = new Integer(100);
        this.maxFunds = new Integer(100);
        this.location = location;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public int getWorkRequestct() {
        return workRequestct;
    }

    public void setWorkRequestct(int workRequestct) {
        this.workRequestct = workRequestct;
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


  
   
   

    
}
