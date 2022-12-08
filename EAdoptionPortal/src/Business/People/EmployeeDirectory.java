/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author nihil
 */
public class EmployeeDirectory {
 
    private ArrayList<Employees> employeeList;
    private ArrayList<Counselor> counselorlist;
    private ArrayList<Banker> bankManagerList;
    private ArrayList<InsuranceManager> insuranceManagerList;
    private ArrayList<Lawyer> lawyerList;


    
    

    public EmployeeDirectory() {
        counselorlist = new ArrayList<>();
        bankManagerList = new ArrayList<>();
        insuranceManagerList = new ArrayList<>();
        lawyerList = new ArrayList<>();        
                
        employeeList = new ArrayList();
    }
    public ArrayList<Lawyer> getLawyerList() {
        return lawyerList;
    }

    public void setLawyerList(ArrayList<Lawyer> lawyerList) {
        this.lawyerList = lawyerList;
    }
    public ArrayList<Employees> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employees> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employees createandaddEmployee (String name){
        Employees em = new Employees();
        em.setName(name);
        employeeList.add(em);
        return em;
    }
    
    public Counselor createandaddCounselor (String name){
        Counselor em = new Counselor();
        em.setName(name);
        counselorlist.add(em);
        return em;
    }
    public InsuranceManager createandadInsuranceManager (String name){
        InsuranceManager em = new InsuranceManager();
        em.setName(name);
        insuranceManagerList.add(em);
        return em;
    }

    public Banker createandaddBankManager (String name){
        Banker em = new Banker();
        em.setName(name);
        bankManagerList.add(em);
        return em;
    }

    public ArrayList<Counselor> getCounselorlist() {
        return counselorlist;
    }

    public void setCounselorlist(ArrayList<Counselor> counselorlist) {
        this.counselorlist = counselorlist;
    }

    public ArrayList<Banker> getBankManagerList() {
        return bankManagerList;
    }

    public void setBankManagerList(ArrayList<Banker> bankManagerList) {
        this.bankManagerList = bankManagerList;
    }

    public ArrayList<InsuranceManager> getInsuranceManagerList() {
        return insuranceManagerList;
    }

    public void setInsuranceManagerList(ArrayList<InsuranceManager> insuranceManagerList) {
        this.insuranceManagerList = insuranceManagerList;
    }
    public Lawyer createandaddLawyer (String name){
        Lawyer em = new Lawyer();
        em.setName(name);
        lawyerList.add(em);
        return em;
    } 
    
}
