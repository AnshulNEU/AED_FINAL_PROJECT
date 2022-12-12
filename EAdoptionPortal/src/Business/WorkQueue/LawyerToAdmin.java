/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.People.BirthMother;
import Business.People.Parents;

/**
 *
 * @author nihil
 */
public class LawyerToAdmin extends WorkRequests{
    private String reqResult;
     private Parents parent;
     private BirthMother mother;
     
     public LawyerToAdmin(String message, Parents parent) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.reqResult = new String();
        this.parent = parent;   
        this.mother = new BirthMother();
    }
    
    public LawyerToAdmin(String message, BirthMother BM) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.reqResult = new String();
        this.mother = BM;   
        this.parent = new Parents();
    }

    public BirthMother getMother() {
        return mother;
    }

    public void setMother(BirthMother mother) {
        this.mother = mother;
    }


    public Parents getParent() {
        return parent;
    }

    public void setParent(Parents parent) {
        this.parent = parent;
    }

    public LawyerToAdmin(String requestResult) {
        this.reqResult = requestResult;
    }

    public String getReqResult() {
        return reqResult;
    }

    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }
     
    @Override
    public String toString() {
        return super.getMessage();
    } 
}
