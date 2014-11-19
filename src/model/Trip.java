/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Paul
 */
public class Trip 
{
    private String tripID;
    private Ferry ferry;
    private Location location;
    
    public Trip()
    {
        
    }
    
    public Trip(String tripID, Ferry ferry, Location location)
    {
        this.tripID = tripID;
        this.ferry = ferry;
        this.location = location;
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }

    public Ferry getFerry() {
        return ferry;
    }

    public void setFerry(Ferry ferry) {
        this.ferry = ferry;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    
}
