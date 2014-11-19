
package model;

import java.io.Serializable;

/**
 *
 * @author Paul
 */
public class TripDTO implements Serializable{
    private String tripID,ferryID;
    private Location location;
    
    public TripDTO(String tripID,String ferryID,Location location) {
        this.tripID = tripID;
        this.ferryID = ferryID;
        this.location = location;
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }

    public String getFerryID() {
        return ferryID;
    }

    public void setFerryID(String ferryID) {
        this.ferryID = ferryID;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    
}
