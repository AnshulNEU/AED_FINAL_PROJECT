/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.People.BirthMother;
import Business.People.Parents;

/**
 *
 * @author nihil
 */
public class HospitalToBank extends WorkRequests{
    
     private String reqResult;
     private BirthMother mother;
    
    public HospitalToBank(String message, BirthMother BM) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.reqResult = new String();
        this.mother = BM;   
        
    }

    public BirthMother getMother() {
        return mother;
    }

    public void setMother(BirthMother mother) {
        this.mother = mother;
    }

    public HospitalToBank(String requestResult) {
        this.reqResult = requestResult;
    }

    public String getReqResult() {
        return reqResult;
    }

    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }
     
     
    
}
