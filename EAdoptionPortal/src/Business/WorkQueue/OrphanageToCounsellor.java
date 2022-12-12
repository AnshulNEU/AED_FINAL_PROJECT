/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.People.Counselor;
import Business.People.Orphanage;

/**
 *
 * @author nihil
 */
public class OrphanageToCounsellor extends WorkRequests{
    
    private String reqResult;
    private Orphanage orphanage;
    private String counsellorFeedback;
    private Counselor counsellor;

    public OrphanageToCounsellor() {
        super();
    }

    public OrphanageToCounsellor(Orphanage orphanage) {
        super();
        this.reqResult = new String();
        this.orphanage = orphanage;
        this.counsellorFeedback = new String();
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

    public String getCounsellorFeedback() {
        return counsellorFeedback;
    }

    public void setCounsellorFeedback(String counsellorFeedback) {
        this.counsellorFeedback = counsellorFeedback;
    }

    public Counselor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counselor counsellor) {
        this.counsellor = counsellor;
    }
    
     public void selectCounsellor(){
        
      //TODO: Function to allot the Counsellor to BirthMother  
    }
 
}
