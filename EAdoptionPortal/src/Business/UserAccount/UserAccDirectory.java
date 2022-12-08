/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.People.Banker;
import Business.People.BirthMother;
import Business.People.Counselor;
import Business.People.Employees;
import Business.People.InsuranceManager;
import Business.People.Lawyer;
import Business.People.Parents;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nihil
 */
public class UserAccDirectory {
    
    private ArrayList<UserAcc> userAccountList;

    public UserAccDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAcc> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAcc authenticateUser(String username, String password){
        for (UserAcc ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAcc createUserAccount(String username, String password, Employees employee, Role role){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
  
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAcc createUserAccount(String username, String password, Employees employee, Role role, String network){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAcc createCounselorUserAccount(String username, String password, Counselor employee, Role role, String network){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setCounselor(employee);
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAcc createLawyerUserAccount(String username, String password, Lawyer employee, Role role, String network){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setLawyer(employee);
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAcc createBankManagerUserAccount(String username, String password, Banker employee, Role role,String network){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setBankManager(employee);
        userAccount.setRole(role);
         userAccount.setNetwork(network);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public UserAcc createInsuranceManagerUserAccount(String username, String password, InsuranceManager employee, Role role, String network){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setInsuranceManager(employee);
        userAccount.setRole(role);
         userAccount.setNetwork(network);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAcc createUserAccountParents(String username, String password, Parents parent, Role role, String network){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setParent(parent);
        
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAcc createUserAccountMother(String name,String username, String password, BirthMother mother, Role role, String network){
        UserAcc userAccount = new UserAcc();
            userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setBirthmother(mother);
        
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAcc ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    public void deleteUserAccount(UserAcc userAccount)
    {
        userAccountList.remove(userAccount);
    }
}
