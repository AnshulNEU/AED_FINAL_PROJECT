/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.People.Parents;
import Business.UserAccount.UserAcc;
import java.util.Date;

/**
 *
 * @author anshulsingh
 */
public class ParentsToCounsellor extends WorkRequests{
    private String reqResult;
    private Parents parent;
    private String counsellorFeedback;

    public ParentsToCounsellor(String message, Parents parent) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.reqResult = new String();
        this.parent = parent;
        this.counsellorFeedback = new String();   
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

    public void setParent(Parents p) {
        this.parent = p;
    }

    public String getCounsellorFeedback() {
        return counsellorFeedback;
    }

    public void setCounsellorFeedback(String counsellorFeedback) {
        this.counsellorFeedback = counsellorFeedback;
    }
}
