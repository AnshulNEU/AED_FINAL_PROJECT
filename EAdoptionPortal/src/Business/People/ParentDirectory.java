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
public class ParentDirectory {
    
    private ArrayList<Parents> parentsDir;

    public ParentDirectory() {
        parentsDir = new ArrayList();
    }

    public ArrayList<Parents> getParentsDir() {
        return parentsDir;
    }
    
    
    public Parents createParents(String name){
        Parents parents = new Parents();
        parents.setUsername(name);
        parentsDir.add(parents);
        return parents;
    }
    
    public Parents addParents(Parents parent){
        parentsDir.add(parent);
        return parent;
    }
}