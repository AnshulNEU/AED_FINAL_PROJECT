/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankAccount;

import java.util.ArrayList;

/**
 *
 * @author hrishikeshwarrier
 */
public class LoanDirectory {
        private ArrayList<LoanAccount> loanedList;

    public LoanDirectory() {
        loanedList = new ArrayList();
    }

    public ArrayList<LoanAccount> getLoanAccountList() {
        return loanedList;
    }
    
    
    public LoanAccount addLoan(LoanAccount loan){
        loanedList.add(loan);
        return loan;
    }
}
