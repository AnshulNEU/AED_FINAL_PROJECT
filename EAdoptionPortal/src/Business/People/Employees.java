/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.Random;


/**
 *
 * @author nihil
 */
public class Employees {
    
    private String empName;
    private int empId;
    private static int count = new Random().nextInt(100);

    public Employees() {
        empId = count;
        count++;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    
    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return empName;
    }
    
    
}
