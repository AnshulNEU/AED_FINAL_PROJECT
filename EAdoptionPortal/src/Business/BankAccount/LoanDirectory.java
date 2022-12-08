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
        private ArrayList<LoanAccount> loanList;

    public LoanDirectory() {
        loanList = new ArrayList();
    }

    public ArrayList<LoanAccount> getLoanAccountList() {
        return loanList;
    }
    
    
    public LoanAccount addLoan(LoanAccount loan){
        loanList.add(loan);
        return loan;
    }
}
