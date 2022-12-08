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
    
    private String requestResult;
    private Orphanage orphanage;
    private String counsellorFeeback;
    private Counselor counsellor;

    public OrphanageToCounsellor() {
        super();
    }

    public OrphanageToCounsellor(Orphanage orphanage) {
        super();
        this.requestResult = new String();
        this.orphanage = orphanage;
        this.counsellorFeeback = new String();
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public Orphanage getOrphanage() {
        return orphanage;
    }

    public void setOrphanage(Orphanage orphanage) {
        this.orphanage = orphanage;
    }

    public String getCounsellorFeeback() {
        return counsellorFeeback;
    }

    public void setCounsellorFeeback(String counsellorFeeback) {
        this.counsellorFeeback = counsellorFeeback;
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
