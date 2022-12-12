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
    
    private ArrayList<UserAcc> userAccList;

    public UserAccDirectory() {
        userAccList = new ArrayList();
    }

    public ArrayList<UserAcc> getUserAccList() {
        return userAccList;
    }
    
    public UserAcc authenticateUser(String username, String password){
        for (UserAcc userAcc: userAccList)
            if (userAcc.getUsername().equals(username) && userAcc.getPassword().equals(password)){
                return userAcc;
            }
        return null;
    }
    
    public UserAcc createUserAccount(String username, String password, Employees employee, Role role){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
  
        userAccount.setRole(role);
        userAccList.add(userAccount);
        return userAccount;
    }
    
    public UserAcc createUserAccount(String username, String password, Employees employee, Role role, String network){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccList.add(userAccount);
        return userAccount;
    }
    
    public UserAcc createCounselorUserAccount(String username, String password, Counselor employee, Role role, String network){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setCounselor(employee);
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccList.add(userAccount);
        return userAccount;
    }
    
    public UserAcc createLawyerUserAccount(String username, String password, Lawyer employee, Role role, String network){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setLawyer(employee);
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccList.add(userAccount);
        return userAccount;
    }
    
    public UserAcc createBankManagerUserAccount(String username, String password, Banker employee, Role role,String network){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setBankManager(employee);
        userAccount.setRole(role);
         userAccount.setNetwork(network);
        userAccList.add(userAccount);
        return userAccount;
    }
    public UserAcc createInsuranceManagerUserAccount(String username, String password, InsuranceManager employee, Role role, String network){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setInsuranceManager(employee);
        userAccount.setRole(role);
         userAccount.setNetwork(network);
        userAccList.add(userAccount);
        return userAccount;
    }

    public UserAcc createUserAccountParents(String username, String password, Parents parent, Role role, String network){
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setParent(parent);
        
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccList.add(userAccount);
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
        userAccList.add(userAccount);
        return userAccount;
    }
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAcc  userAcc: userAccList){
            if (userAcc.getUsername().equals(username))
                return false;
        }
        return true;
    }
    public void deleteUserAccount(UserAcc userAccount)
    {
        userAccList.remove(userAccount);
    }
}
