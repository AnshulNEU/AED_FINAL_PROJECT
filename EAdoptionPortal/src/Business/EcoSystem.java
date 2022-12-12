/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Networking;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author hrishikeshwarrier
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem system;
    private ArrayList<Networking> netList;
    public static EcoSystem getInstance(){
        if(system==null){
            system=new EcoSystem();
        }
        return system;
    }
    
    private EcoSystem(){
        super(null);
        netList=new ArrayList<Networking>();
    }
    
    public Networking createAndAddNetwork(){
        Networking network=new Networking();
        netList.add(network);
        return network;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    
    
    public ArrayList<Networking> getNetworkList() {
        return netList;
    }
    
    public Networking addNetwork()
    {
        Networking network = new Networking();
        netList.add(network);
        return network;
    }

    public void setNetworkList(ArrayList<Networking> netList) {
        this.netList = netList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        return true;
    }
}
