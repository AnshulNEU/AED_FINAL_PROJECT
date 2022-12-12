/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.People.Parents;

/**
 *
 * @author anshulsingh
 */
public class ParentsToLawyer extends WorkRequests{
    private String reqResult;
    private Parents parent;
    private String lawyerFeedback;

    public ParentsToLawyer(String message, Parents parent) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.reqResult = new String();
        this.parent = parent;
        this.lawyerFeedback = new String();   
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

    public String getLawyerFeedback() {
        return lawyerFeedback;
    }

    public void setLawyerFeeback(String lawyerFeedback) {
        this.lawyerFeedback = lawyerFeedback;
    }
}
