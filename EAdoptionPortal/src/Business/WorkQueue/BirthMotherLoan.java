/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.BankAccount.LoanAccount;
import Business.People.BirthMother;
import Business.People.Parents;

/**
 *
 * @author nihil
 */
public class BirthMotherLoan extends WorkRequests{
    private BirthMother birthMother;
    private LoanAccount loan;

    public BirthMotherLoan(String message, LoanAccount loan, BirthMother bm) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.loan = loan;
        this.birthMother =bm;
    }

    public BirthMother getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(BirthMother birthMother) {
        this.birthMother = birthMother;
    }
    
    public LoanAccount getLoan() {
        return loan;
    }

    public void setLoan(LoanAccount loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return super.getSender().getName();
    }
    
    
}
