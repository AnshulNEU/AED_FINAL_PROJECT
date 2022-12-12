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
 
    private ArrayList<Employees> employeeDir;
    private ArrayList<Counselor> counselorDir;
    private ArrayList<Banker> bankManagerDir;
    private ArrayList<InsuranceManager> insuranceManagerDir;
    private ArrayList<Lawyer> lawyerDir;


    
    

    public EmployeeDirectory() {
        counselorDir = new ArrayList<>();
        bankManagerDir = new ArrayList<>();
        insuranceManagerDir = new ArrayList<>();
        lawyerDir = new ArrayList<>();        
                
        employeeDir = new ArrayList();
    }
    public ArrayList<Lawyer> getLawyerDir() {
        return lawyerDir;
    }

    public void setLawyerDir(ArrayList<Lawyer> lawyerDir) {
        this.lawyerDir = lawyerDir;
    }
    public ArrayList<Employees> getEmployeeDir() {
        return employeeDir;
    }

    public void setEmployeeDir(ArrayList<Employees> employeeDir) {
        this.employeeDir = employeeDir;
    }
    
    public Employees createandaddEmployee (String name){
        Employees em = new Employees();
        em.setEmpName(name);
        employeeDir.add(em);
        return em;
    }
    
    public Counselor createandaddCounselor (String name){
        Counselor em = new Counselor();
        em.setEmpName(name);
        counselorDir.add(em);
        return em;
    }
    public InsuranceManager createandadInsuranceManager (String name){
        InsuranceManager em = new InsuranceManager();
        em.setEmpName(name);
        insuranceManagerDir.add(em);
        return em;
    }

    public Banker createandaddBankManager (String name){
        Banker em = new Banker();
        em.setEmpName(name);
        bankManagerDir.add(em);
        return em;
    }

    public ArrayList<Counselor> getCounselorDir() {
        return counselorDir;
    }

    public void setCounselorDir(ArrayList<Counselor> counselorDir) {
        this.counselorDir = counselorDir;
    }

    public ArrayList<Banker> getBankManagerDir() {
        return bankManagerDir;
    }

    public void setBankManagerDir(ArrayList<Banker> bankManagerDir) {
        this.bankManagerDir = bankManagerDir;
    }

    public ArrayList<InsuranceManager> getInsuranceManagerDir() {
        return insuranceManagerDir;
    }

    public void setInsuranceManagerDir(ArrayList<InsuranceManager> insuranceManagerDir) {
        this.insuranceManagerDir = insuranceManagerDir;
    }
    public Lawyer createandaddLawyer (String name){
        Lawyer em = new Lawyer();
        em.setEmpName(name);
        lawyerDir.add(em);
        return em;
    } 
    
}
