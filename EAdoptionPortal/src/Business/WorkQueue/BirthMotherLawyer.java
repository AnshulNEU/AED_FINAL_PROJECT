/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.People.BirthMother;
import Business.People.Lawyer;

/**
 *
 * @author anshulsingh
 */
public class BirthMotherLawyer extends WorkRequests{
    private String requestResult;
    private BirthMother mother;
    private String lawyerFeedback;
    private Lawyer lawyer;

    public BirthMotherLawyer() {
        super();
    }

    public BirthMother getMother() {
        return mother;
    }

    public void setMother(BirthMother mother) {
        this.mother = mother;
    }

    public Lawyer getLawyer() {
        return lawyer;
    }

    public void setLawyer(Lawyer lawyer) {
        this.lawyer = lawyer;
    }
    
    public BirthMotherLawyer(BirthMother BM) {
        super();
        this.requestResult = new String();
        this.mother = BM;
        this.lawyerFeedback = new String();
    }

    public BirthMother getBirthMother() {
        return mother;
    }

    public void setBirthMother(BirthMother m) {
        this.mother = m;
    }

    public String getLawyerFeedback() {
        return lawyerFeedback;
    }

    public void setLawyerFeedback(String lawyerFeedback) {
        this.lawyerFeedback = lawyerFeedback;
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }
    public void selectLawyer(){
        
      //TODO: Function to allot the Counsellor to BirthMother  
    }
    @Override
    public String toString() {
        return getBirthMother().getUsername();
    }
}
