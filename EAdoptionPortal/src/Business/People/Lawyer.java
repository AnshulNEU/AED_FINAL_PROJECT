/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.People;


import Business.WorkQueue.BirthMotherLawyer;
import Business.WorkQueue.CounsellorsToLawyer;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author nihil
 */
public class Lawyer extends Employees{
    private int workRequestCount;
   private int ratingReviews;
   private boolean isAvailable;
   private LocalTime availableTime;
   private ArrayList<BirthMotherLawyer> birthMotherAlloted;
   private ArrayList<CounsellorsToLawyer> parentsAlloted;

    public Lawyer(int ratingReviews, boolean isAvailable, LocalTime availableTime, ArrayList<BirthMotherLawyer> bMA, ArrayList<CounsellorsToLawyer> pA) {
        super();
        this.ratingReviews = ratingReviews;
        this.isAvailable = isAvailable;
        this.availableTime = availableTime;
        this.birthMotherAlloted = bMA;
        this.parentsAlloted = pA;
    }
    
    public Lawyer(){
        super();
        this.isAvailable = true;
        this.availableTime = LocalTime.MIN;
        this.birthMotherAlloted = new ArrayList<BirthMotherLawyer>();
        this.parentsAlloted = new ArrayList<CounsellorsToLawyer>();
    
    
    }
    public int getWorkRequestCount() {
        return workRequestCount;
    }

    public void setWorkRequestCount(int workRequestCount) {
        this.workRequestCount = workRequestCount;
    }

    public int getRatingReviews() {
        return ratingReviews;
    }

    public void setRatingReviews(int ratingReviews) {
        this.ratingReviews = ratingReviews;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public LocalTime getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(LocalTime availableTime) {
        this.availableTime = availableTime;
    }

    public ArrayList<BirthMotherLawyer> getBirthMotherAlloted() {
        return birthMotherAlloted;
    }

    public void setBirthMotherAlloted(ArrayList<BirthMotherLawyer> birthMotherAlloted) {
        this.birthMotherAlloted = birthMotherAlloted;
    }

    public ArrayList<CounsellorsToLawyer> getParentsAlloted() {
        return parentsAlloted;
    }

    public void setParentsAlloted(ArrayList<CounsellorsToLawyer> parentsAlloted) {
        this.parentsAlloted = parentsAlloted;
    }
}