package model;

import java.util.ArrayList;

/**
 * Description: This class contains initialized 
 * arraylists with persistance data that 
 * acts as a database for the six use cases that need to be implemented
 */
public class DummyPersistance {
    private ArrayList<Ferry> ferries;
    private ArrayList<Location> locations;
    private ArrayList<Trip> trips;
    private ArrayList<Schedule> schedules;
    
    public DummyPersistance() 
    {
        ferries = new ArrayList<Ferry>();
        ferries.add(new Ferry("F1", 150, null));
        ferries.add(new Ferry("F2", 100, ""));
        locations = new ArrayList<Location>();
    }

    public ArrayList<Ferry> getFerries() {
        return ferries;
    }

    public void setFerries(ArrayList<Ferry> ferries) {
        this.ferries = ferries;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<Trip> getTrips() {
        return trips;
    }

    public void setTrips(ArrayList<Trip> trips) {
        this.trips = trips;
    }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }
    
    
}
