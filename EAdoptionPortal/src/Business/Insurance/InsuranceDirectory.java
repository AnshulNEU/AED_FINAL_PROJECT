/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

import java.util.ArrayList;

/**
 *
 * @author anshulsingh
 */
public class InsuranceDirectory {
        private ArrayList<InsuranceAccount> insuranceDir;

    public InsuranceDirectory() {
        insuranceDir = new ArrayList();
    }

    public ArrayList<InsuranceAccount> getInsuranceDir() {
        return insuranceDir;
    }
 
    public InsuranceAccount addInsurance(InsuranceAccount ins){
        insuranceDir.add(ins);
        return ins;
    }
}
