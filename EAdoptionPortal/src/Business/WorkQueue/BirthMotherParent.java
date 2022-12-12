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
public class BirthMotherParent extends WorkRequests{
   
    private String reqResult;
    private BirthMother mother;
 
    private Parents parent;
 
    public BirthMotherParent(BirthMother BM, Parents p) {

        super();
        this.reqResult = new String();
        this.mother = BM;
        this.parent = p;
    }

    public BirthMother getBirthMother() {
        return mother;
    }

    public void setBirthMother(BirthMother m) {
        this.mother = m;
    }

    public String getReqResult() {
        return reqResult;
    }

    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }

    public Parents getParent() {
        return parent;
    }

    public void setParent(Parents parent) {
        this.parent = parent;
    }
 @Override
    public String toString() {
        return mother.getUsername();
    }
   
    
 
}
