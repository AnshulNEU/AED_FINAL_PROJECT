/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.People.Lawyer;
import Business.People.Orphanage;

/**
 *
 * @author anshulsingh
 */
public class OrphanageToLawyer {
    private String reqResult;
    private Orphanage orphanage;
    private String lawyerFeedback;
    private Lawyer lawyer;

    public OrphanageToLawyer() {
        super();
    }

    public OrphanageToLawyer(Lawyer lawyer) {
        super();
        this.reqResult = new String();
        this.orphanage = orphanage;
        this.lawyerFeedback = new String();
    }

    public String getReqResult() {
        return reqResult;
    }

    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }

    public Orphanage getOrphanage() {
        return orphanage;
    }

    public void setOrphanage(Orphanage orphanage) {
        this.orphanage = orphanage;
    }

    public String getLawyerFeedback() {
        return lawyerFeedback;
    }

    public void setLawyerFeedback(String lawyerFeedback) {
        this.lawyerFeedback = lawyerFeedback;
    }

    public Lawyer getLawyer() {
        return lawyer;
    }

    public void setLawyer(Lawyer lawyer) {
        this.lawyer = lawyer;
    }
    
     public void selectLawyer(){
        
      //TODO: Function to allot the Counsellor to BirthMother  
    }
}
