/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.People.*;
import Business.Role.Role;
import Business.WorkQueue.WorkQ;

/**
 *
 * @author nihil
 */
public class UserAcc {
    
    private String name;
    private String username;
    private String password;
    private Employees employee;
    private BirthMother birthmother;
    private InsuranceManager insuranceManager;
    private Counselor counselor;
    private Banker bankManager;
    private Lawyer lawyer;
    private Parents parent;
    private Role role;
    private WorkQ workQueue;
    private String network;

    public BirthMother getBirthmother() {
        return birthmother;
    }

    public void setBirthmother(BirthMother birthmother) {
        this.birthmother = birthmother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InsuranceManager getInsuranceManager() {
        return insuranceManager;
    }

    public void setInsuranceManager(InsuranceManager insuranceManager) {
        this.insuranceManager = insuranceManager;
    }

    public Counselor getCounselor() {
        return counselor;
    }

    public void setCounselor(Counselor counselor) {
        this.counselor = counselor;
    }
    
    public Lawyer getLawyer() {
        return lawyer;
    }

    public void setLawyer(Lawyer lawyer) {
        this.lawyer = lawyer;
    }

    public Banker getBankManager() {
        return bankManager;
    }

    public void setBankManager(Banker bankManager) {
        this.bankManager = bankManager;
    }

    public Parents getParent() {
        return parent;
    }

    public void setParent(Parents parent) {
        this.parent = parent;
    }

    public UserAcc() {
        workQueue = new WorkQ();
        username =  new String();
        network = new String();
        name  = new String();
        
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employees employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employees getEmployee() {
        return employee;
    }

    public WorkQ getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
   
    
}