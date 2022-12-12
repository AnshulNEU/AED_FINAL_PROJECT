/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author nihil
 */
public class OrphanageDirectory {
     private ArrayList<Orphanage> orphanageDir;

    public OrphanageDirectory() {
        orphanageDir = new ArrayList();
    }

    public ArrayList<Orphanage> getorphanageList() {
        return orphanageDir;
    }
    
    public Orphanage createOrphanage(String name){
        Orphanage orphanage = new Orphanage();
        orphanage.setUsername(name);
        orphanageDir.add(orphanage);
        return orphanage;
    }
    
    public void addOrphanage(Orphanage o){
        this.orphanageDir.add(o);
    }
public ArrayList<Orphanage> getPendingOrphanages() {

    ArrayList<Orphanage> pending = new ArrayList<>();

    for(Orphanage orphanage : orphanageDir){
      if(orphanage.status == Orphanage.Status.PENDING){
        pending.add(orphanage);
      }
    }

    return pending;
  }

  public ArrayList<Orphanage> getApprovedOrphanages() {

    ArrayList<Orphanage> approved = new ArrayList<>();

    for(Orphanage orphanage : orphanageDir){
      if(orphanage.status == Orphanage.Status.APPROVED){
        approved.add(orphanage);
      }
    }

    return approved;
  }
  
  public ArrayList<Orphanage> getAllPendingFirstOrphanages() {

    ArrayList<Orphanage> all = new ArrayList<>();
    all.addAll(getPendingOrphanages());
    all.addAll(getApprovedOrphanages());
    return all;
  }
  

}
