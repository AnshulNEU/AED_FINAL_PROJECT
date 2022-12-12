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
public class BirthMotherDirectory {
    
    private ArrayList<BirthMother> birthMotherDir;

    public BirthMotherDirectory() {
        birthMotherDir = new ArrayList();
    }

    public ArrayList<BirthMother> getBirthMotherDir() {
        return birthMotherDir;
    }
    
    public BirthMother createBirthMother(String name){
        BirthMother birthMother = new BirthMother();
        birthMother.setUsername(name);
        birthMotherDir.add(birthMother);
        return birthMother;
    }
    
    public void addBirthMother(BirthMother BM){
        this.birthMotherDir.add(BM);
    }

  
}