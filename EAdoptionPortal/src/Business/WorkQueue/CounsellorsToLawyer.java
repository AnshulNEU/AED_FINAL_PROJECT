/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.People.Parents;

/**
 *
 * @author nikhi
 */
public class CounsellorsToLawyer extends WorkRequests{
    
     private String reqResult;
     private Parents parent;
     
     public CounsellorsToLawyer(String message, Parents parent) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.reqResult = new String();
        this.parent = parent;
    }
    public Parents getParent() {
        return parent;
    }

    public void setParent(Parents parent) {
        this.parent = parent;
    }

    public CounsellorsToLawyer(String requestResult) {
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
