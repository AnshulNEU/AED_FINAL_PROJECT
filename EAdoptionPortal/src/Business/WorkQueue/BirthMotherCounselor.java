/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.People.BirthMother;
import Business.People.Counselor;

/**
 *
 * @author nihil
 */
public class BirthMotherCounselor extends WorkRequests{
   
    private String requestResult;
    private BirthMother mother;
    private String counsellorFeeback;
    private Counselor counsellor;

    public BirthMotherCounselor() {
        super();
    }

    public BirthMother getMother() {
        return mother;
    }

    public void setMother(BirthMother mother) {
        this.mother = mother;
    }

    public Counselor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counselor counsellor) {
        this.counsellor = counsellor;
    }
    
    public BirthMotherCounselor(BirthMother BM) {
        super();
        this.requestResult = new String();
        this.mother = BM;
        this.counsellorFeeback = new String();
    }

    public BirthMother getBirthMother() {
        return mother;
    }

    public void setBirthMother(BirthMother m) {
        this.mother = m;
    }

    public String getCounsellorFeeback() {
        return counsellorFeeback;
    }

    public void setCounsellorFeeback(String counsellorFeeback) {
        this.counsellorFeeback = counsellorFeeback;
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }
    public void selectCounsellor(){
        
      //TODO: Function to allot the Counsellor to BirthMother  
    }
    @Override
    public String toString() {
        return getBirthMother().getUsername();
    }
    
}
