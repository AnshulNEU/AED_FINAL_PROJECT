/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.WorkQueue.BirthMotherLoan;
import Business.WorkQueue.BirthMotherCounselor;
import Business.WorkQueue.ParentsToCounsellor;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author anshulsingh
 */
public class Counselor extends Employees {
   private int workRequestCount;
   private int ratingReviews;
   private boolean isAvailable;
   private LocalTime availableTime;
   private ArrayList<BirthMotherCounselor> birthMotherAlloted;
   private ArrayList<ParentsToCounsellor> parentsAlloted;

    public Counselor(int ratingReviews, boolean isAvailable, LocalTime availableTime, ArrayList<BirthMotherCounselor> bMA, ArrayList<ParentsToCounsellor> pA) {
        super();
        this.ratingReviews = ratingReviews;
        this.isAvailable = isAvailable;
        this.availableTime = availableTime;
        this.birthMotherAlloted = bMA;
        this.parentsAlloted = pA;
    }
    
    public Counselor(){
        super();
        this.isAvailable = true;
        this.availableTime = LocalTime.MIN;
        this.birthMotherAlloted = new ArrayList<BirthMotherCounselor>();
        this.parentsAlloted = new ArrayList<ParentsToCounsellor>();
    
    
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

    public ArrayList<BirthMotherCounselor> getBirthMotherAlloted() {
        return birthMotherAlloted;
    }

    public void setBirthMotherAlloted(ArrayList<BirthMotherCounselor> birthMotherAlloted) {
        this.birthMotherAlloted = birthMotherAlloted;
    }

    public ArrayList<ParentsToCounsellor> getParentsAlloted() {
        return parentsAlloted;
    }

    public void setParentsAlloted(ArrayList<ParentsToCounsellor> parentsAlloted) {
        this.parentsAlloted = parentsAlloted;
    }
}