/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Insurance.InsuranceAccount;
import Business.Insurance.InsuranceDirectory;
import Business.People.BirthMother;
import Business.UserAccount.UserAcc;

/**
 *
 * @author nihil
 */
public class BirthMotherInsuranceManager extends WorkRequests{
    
    private BirthMother birthMother;
    private UserAcc userAcc;
    private InsuranceAccount insurance;
    private InsuranceDirectory insuranceDir;

    public BirthMotherInsuranceManager(BirthMother birthMother, UserAcc userAccount, InsuranceAccount insurance, InsuranceDirectory insur) {
        super();
        this.birthMother = birthMother;
        this.userAcc = userAccount;
        this.insurance = insurance;
    }

    public BirthMother getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(BirthMother birthMother) {
        this.birthMother = birthMother;
    }

    public UserAcc getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(UserAcc userAcc) {
        this.userAcc = userAcc;
    }

    public InsuranceAccount getInsurance() {
        return insurance;
    }

    public void setInsurance(InsuranceAccount insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return birthMother.getFirstName();
    }
    
}
