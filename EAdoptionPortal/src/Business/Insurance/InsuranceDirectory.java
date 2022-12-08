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
        private ArrayList<InsuranceAccount> insuranceList;

    public InsuranceDirectory() {
        insuranceList = new ArrayList();
    }

    public ArrayList<InsuranceAccount> getInsuranceList() {
        return insuranceList;
    }
 
    public InsuranceAccount addInsurance(InsuranceAccount ins){
        insuranceList.add(ins);
        return ins;
    }
}
