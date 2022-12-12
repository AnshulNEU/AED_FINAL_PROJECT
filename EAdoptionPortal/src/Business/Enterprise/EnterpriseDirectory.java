/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author anshulsingh
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseDir;
   

    public ArrayList<Enterprise> getEnterpriseDir() {
        return enterpriseDir;
    }

    public void setEnterpriseDir(ArrayList<Enterprise> enterpriseDir) {
        this.enterpriseDir = enterpriseDir;
    }
    
    public EnterpriseDirectory(){
        enterpriseDir=new ArrayList<Enterprise>();
    }
    
   //Creating and initializing Enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseDir.add(enterprise);
            return enterprise;
        }
        if(type==Enterprise.EnterpriseType.FinancialEnterprise){

            enterprise=new FinancialEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseDir.add(enterprise);
            return enterprise;
        }
         if(type==Enterprise.EnterpriseType.OrphanageEnterprise){
            enterprise=new OrphanageEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseDir.add(enterprise);
            return enterprise;
        }
         if(type==Enterprise.EnterpriseType.LegalEnterprise){
            enterprise=new LegalEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseDir.add(enterprise);
            return enterprise;
        }
        
        return null;
    }
    public boolean containsName(String type){
        for (Enterprise org : enterpriseDir){
            if(org.getName().equals(type)){
                return true;
            }
        }
        return false;
    }
    
}
